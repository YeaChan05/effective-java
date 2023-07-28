# 생성자 대신 정적 팩터리 메서드를 고려하라

전통적인 인스턴스 생산 수단은 public 생성자이다

하지만 클래스는 정적 팩터리 메서드(static factory method)를 제공할 수 있다

정적 팩터리 메서드 장점

1. 이름을 가질 수 있다
   - 이름을 잘 지으면 객체의 특징을 쉽게 묘사할 수 있다
   - 하나의 시그니처로 생성자를 하나 만들 수 있다
2. 호출될 때마다 인스턴스를 새로 생성하지는 않아도 된다
   - [불변 값  클래스](../../chapter4/item17)는 이덕분에 인스턴스를 매번
     생성할 필요가 없어졌다
   - 따라서 같은 객체가 자주 요청되는 상황이라면 성능을 상당히 끌어올려
     준다(생성비용이 큰 경우에는 더더욱)
   - 인스턴스의 생존여부 통제도 가능해진다!

     - 이런 클래스를 인스턴스 통제 클래스라고 한다
     - 이를통해 [싱글턴](../../chapter2/item3),
       [인스턴스화 불가](../../chapter2/item4)로 만들 수 있다
     - [불변 값  클래스](../../chapter4/item17)에서 동치인 인스턴스가 단
       하나뿐임을 보장할 수 있다(ex)a==b일 때만 a.equals(b)가 성립)
     - 이는 플라이웨이트의 근간이 되며, 열거 타입(item34)은 인스턴스가 하나만
       만들어짐을 보장

     ```
     //정적 팩토리 메서드로 시그니처 제약을 해결
         public static Foo withAddress(String address){
             Foo foo=new Foo();
             foo.address=address;
             return foo;
         }
     ```
3. 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다.
   - 엄청난 유연성을 응용해 구현 클래스를 공개하지 않고도 그 객체를 반환이 가능해
     API를 작게 유지할 수 있다(item20)
   - 8버전 이전에는 인터페이스에 정적 메서드 선언이 안되었는데 8버전 이후로 동반
     클래스를 만들어서 써왔다
   - 프로그래머는 명시한 인터페이스대로 동작함을 알기에 굳이 구현 클래스를 자세히
     알아볼 필요가 없다(더 나아가 인터페이스만으로도 다룰 수 있다(item64))
   - 인터페이스로도 정적 메서드가 사용 가능해짐에 따라 인스턴스화 불가 동반
     클래스를 둘 필요가 없어 보이지만, package-private 클래스에 두어야 하는
     경우도 있으니까...
4. 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다
   - 반환타입의 하위 타입이기만 하면 반환할 수 있다는
     말이다(ex)EnumSet(item36))

5. 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도
   된다
   -JDBC의 경우 DriverManager.registerDriver()가 프로바이더 등록 API DriverManager.getConnection()이 서비스 API 그리고 Driver가 서비스 프로바이더 인터페이스 역할을 한다(물론 JDBC가 ServiceLoader를 사용하는건 아니다)

단점도 있다
1. 상속을 하려면 public이나 protected 생성자가 필요하니 정적 팩토리 메서드만으로 제공하면 하위 클래스를 만들 수 없다
   - Collections가 대표적인 예
   - 이거는 장점 아닌가?
2. 프로그래머가 정적 팩토리 메서드를 찾는게 어렵다
   - 생성자마냥 잘 드러나지는 않으니까 Javadoc으로 잘 써야한다


명명 방식
- from: 매개변수를 하나씩 받아서 해당 타입의 인스턴스를 반환하는 **형변환 메서드**
- of: 여러 매개변수를 받아 적합한 타입의 인스턴스를 반환하는 **집계 메서드**
- valueOf: from과 of의 더 자세한 버전
- instance 혹은 getInstance:(매개변수를 받는다면) 매개변수로 명시한 인스턴스를 반환하지만, **같은 인스턴스인지는 보장하지 않는다**
- create 혹은 newInstance: instance 혹은 getInstance와 같지만, 매번 새로운 인스턴스를 생성해 반환함을 보장한다
- getType: getInstance와 같으나, 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드를 정의할 때 쓴다
  - ex) FilesStore fs=Files.getFileStore(path);
- newType: newInstance와 같으나, 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드를 정의할 때 쓴다
  - ex) BufferedReader br=Files.newBufferedReader(path);
- type: getType과 newType의 간결한 버전
  - List<Complaint> litany=Collection.list(legacyLitany);