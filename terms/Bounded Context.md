<div align="center">

#### [목차 바로가기](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/Table%20of%20Contents.md)

</div>

---

# Bounded Context

![image](https://user-images.githubusercontent.com/48385288/179528218-2126f4a9-5439-4a3f-8789-594a3af82d28.png)

- 같은 용어라도 하위 도메인마다 의미가 다르고 같은 대상이라도 지칭하는 용어가 다를 수 있기 때문에 한 개의 모델로 모든 하위 도메인을 표현하려는 시도는 올바른 방법이 아니며 표현할 수도 없다.
- 하위 도메인마다 사용하는 용어가 다르기 때문에 올바른 도메인 모델을 개발하려면 하위 도메인마다 모델을 만들어야 한다.
- 모델은 특정한 컨텍스트(문맥)하에서 완전한 의미를 갖는데, 이렇게 구분되는 경계를 갖는 컨텍스트를 DDD에서 BOUNDED CONTEXT라고 한다.

> 도메인 주도 설계 시작하기 - 최범균

---
