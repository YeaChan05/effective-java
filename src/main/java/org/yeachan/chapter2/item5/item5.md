# 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라

클래스는 리소스를 하나 이상 의존하게 된다

뭐 이런 방법들이 있겠지만...

1. [정적 유티리티 사용](src/main/java/org/yeachan/chapter2/item5/usecase1)
2. [싱글턴 사용](src/main/java/org/yeachan/chapter2/item5/usecase2)

but.. 리소스를 바꿔 끼울때 유연하지가 않다

그래서

[의존성 주입](src/main/java/org/yeachan/chapter2/item5/usecase3)을 사용하자

의존성 주입을 사용하면 리소스를 편하게 바꿔 낄 수 있게 된다

뭐 또다른 방법도 있겠지

Supplier를 활용할수도?


의존성이 장황해지는 경우 쥬스, 대거, 스프링등을 잘 활용