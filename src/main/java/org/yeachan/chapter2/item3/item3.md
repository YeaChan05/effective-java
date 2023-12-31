# private 생성자나 열거 타입으로 싱글턴임을 보증하라
싱글턴을 강제하라?

싱글턴
- 애플리케이션 전체에서 하나의 인스턴스만을 사용하는 디자인 패턴
- 보통 클래스 내애서 자기 자신의 인스턴스를 private static 생성자를 이용해 생성하고 이를  public static 메서드를 통해 사용한다
- double checked locking을 사용한다(멀티 스레드 환경에서 인스턴스 보장을 위함)
- 물론 애플리케이션 전체에서 하나기 때문에 테스트가 어렵다..


그럼 어떻게 구현하는가?
1. final 필드
   - public final 필드를 이용해 클라이언트가 접근한다
   - 리플랙션을 사용하면 싱글톤이 깨지기 때문에 사전조치가 필요하다
2. 정적 팩토리 메서드
   - API를 변경하지 않고도 **싱글톤으로 쓸지 안쓸지 변경할 수 있다**
   - 필요에 의해 제네릭 싱글톤 팩토리로 만들 수도 있다 (Supplier를 통한 메서드 참조)

직렬화
- 위 방봅 모두 직렬화를 사용한다면 역직렬화 할 때 같은 타입의 여러개가 생길 수 있다(직렬화 후 역직렬화 할때 생성자를 다시 호출하기 때문)
- 그 문제를 해결하려면 모든 인스턴스 필드에 `transient를` 추가하고 `readResolve()`를 다음과 같이 구현한다
   ```
  private Object readResolve(){
      return INSTANCE;
  }
  ```
- Enum을 사용하는게 가장 이상적인듯
- 하지만 이 방법은 Enum말고 다른 **상위 클래스를 상속해야 한다면 사용할 수 없다**(인터페이스는 가능)


현실적인 이야기...
- Spring 안에서 Bean이 싱글톤이란 말은 애플리케이션 범위가 아닌 applicationContext 내의 범위이다(물론 이마저도 Scope을 조정하면 바꿀수도..)