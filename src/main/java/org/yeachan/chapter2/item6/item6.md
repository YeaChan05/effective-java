# 불필요한 객체 생성을 피하라

매번 객체를 생성하기보다는 객체 하나를 재사용하는편이 나은 경우가 있다(ex)불변 객체 item17)

성능적으로도 더 좋고 스타일리쉬(?)하다

어떻게 할까
1. 문자열의 경우 new를 사용하지 않고 리터럴을 직접 사용(JVM 리터럴 재사용때문)
2. 정적 팩토리 메서드 사용
3. 생성 비용이 큰 경우에는 캐시해두고 재사용할것을 고려해보자
4. 어뎁터는 인터페이스를 통해서 뒤에 있는 객체로 연결해주는 객체라 여러개 만들 필요가 없다
5. 오토박싱(프리미티브 타입과 박스 타입을 섞어 사용 가능)