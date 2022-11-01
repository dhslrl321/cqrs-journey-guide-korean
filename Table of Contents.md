<div align="center">

#### [Repository Main 바로가기](https://github.com/dhslrl321/cqrs-journey-guide-korean/)

</div>

# 목차

CQRS Journey 의 목차입니다.

크게 3파트로 나뉘어져 있습니다.

- **Part0** : preface
- **Part1** : CQRS Journey
- **Part2** : CQRS References
- **Part3** : Tales from the trenches
- **terms** : 책에서 나오는 용어에 대한 번역자의 추가적인 설명

<br />

# 0. 서론

### **Preface** [Preface](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part00-preface)

1. [왜 우리가 이것을 만드는가](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part00-preface/01.왜%20우리는%20이것을%20만들게%20되었는가.md)
2. [Index Overview](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part00-preface/02.Index%20Overview.md)

<br />

# 1. CQRS Journey

### **Journey 1.** [Conference Management System](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part01-journey/journey01)

1. [우리의 도메인](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey01/01.우리의%20도메인.md)
2. [누가 우리와 함께 여정을 떠날 것인가](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey01/02.누가%20우리와%20함께%20여정을%20떠날%20것인가.md)
3. [The Contoso Conference Management System](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey01/03.The%20Contoso%20Conference%20Management%20System.md)

### **Journey 2.** [도메인 분석](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part01-journey/journey02)

1. [시작하며](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey02/00.%20시작하며.md)
2. [이번 챕터에서 사용되는 용어들](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey02/01.%20이번%20챕터에서%20사용되는%20정의들.md)
3. [Contoso Management System 에서 사용되는 Bounded Context](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey02/02.%20Contoso%20에서%20사용되는%20Bounded%20Context.md)
4. [Contoso Management System 에서 사용되는 Context Map](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey02/03.%20Context%20Map.md)

### **Journey 3.** [Orders 와 Registration 의 Bounded Context](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part01-journey/journey03)

1. [Bounded Context 에 대한 설명](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey03/01.%20Bounded%20Context%20에%20대한%20설명.md)
2. [도메인 정의](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey03/02.%20도메인%20정의.md)
3. [order 를 생성하기 위한 요구사항](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey03/03.%20order%20을%20생성하기%20위한%20요구사항.md)
4. [Patterns and Concepts](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey03/04.%20구현을%20위한%20다양한%20접근법.md)
5. [Implementation Details - 1. high level architecture](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey03/05.%20구현%20-%20high%20level%20architecture.md)
6. [Implementation Details - 2. write model](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey03/06.%20구현%20-%20write%20model.md)
7. Using the Windows Azure Service Bus
8. [Impact On Testing](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey03/08.%20테스트에%20미치는%20영향.md)

### **Journey 4.** [Orders 와 Registrations Bounded Context 에 대한 고도화](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part01-journey/journey04)

1. [Bounded Context 의 변화](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey04/01.%20Bounded%20Context%20의%20변화.md)
2. [Patterns and Concepts](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey04/02.%20Patterns%20and%20Concepts.md)
3. [Implementation Details - 1. access code & countdown timer](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey04/03.%20Implementation%20details%20-%201.md)
4. [Implementation Details - 2. read side & refactoring](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey04/04.%20Implementation%20details%20-%202.md)
5. [Impact on testing](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part01-journey/journey04/05.%20Impact%20on%20Testing.md)
6. A journey into code comprehension: A tale of pain, relief,and learning

### **Journey 5.** V1 릴리즈 준비

1. [The Contoso Conference Management System V1 Release](#)
2. [Patterns and Concepts](#)
3. [Implemetation Details - 1](#)
4. [Implemetation Details - 2](#)
5. [Impact on Testing](#)
6. [요약 정리](#)

### **Journey 6.** Versioning 하기

### **Journey 7.** Resilience한 시스템에 성능을 최적화하기

### **Journey 8,** “Lessons Learned”

<br />

# 2. CQRS Reference

### **Reference 1.** [CQRS in Context](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part02-references/reference01)

1. [domain-driven-design 이란 무엇인가](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference01/01.%20domain-driven-design%20이란%20무엇인가.md)
2. [ddd 의 컨셉과 용어](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference01/02.%20ddd%20의%20컨셉과%20용어%20.md)
3. [Bounded Contexts](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference01/03.%20Bounded%20Contexts.md)
4. [CQRS and DDD](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference01/04.%20CQRS%20and%20DDD.md)

### **Reference 2.** [CQRS, Command Query Responsibility Segregation Pattern 의 소개](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part02-references/reference02)

1. [CQRS 란 무엇인가](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference02/01.%20CQRS%20가%20무엇인가.md)
2. [CQRS 와 domain-driven-design](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference02/02.%20CQRS%20와%20domain-driven-design.md)
3. [Command 와 Events 그리고 Messages](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference02/03.%20command%20와%20events%20그리고%20messages.md)
4. [왜 CQRS 를 사용해야 할까](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference02/04.%20왜%20CQRS%20를%20사용해야%20할까.md)
5. [언제 CQRS 를 사용해야 할까](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference02/05.%20언제%20CQRS%20를%20사용해야할까.md)
6. [언제 CQRS 를 사용해야 할까](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference02/06.%20언제%20CQRS%20를%20사용하지%20말아야%20할까.md)

### **Reference 3.** [Event Sourcing 에 대한 소개](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part02-references/reference03)

1. [Event Sourcing 이란 무엇인가](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference03/01.%20Event%20Sourcing%20이란%20무엇인가.md)
2. [왜 이벤트 소싱을 사용해야 할까?](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference03/02.%20Why%20should%20I%20use%20event%20sourcing.md)
3. [이벤트 소싱의 고민거리](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference03/03.%20Event%20Sourcing%20concerns.md)
4. [CQRS와 ES](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference03/04.%20CQRS%20%EC%99%80%20ES.md)
5. [이벤트 스토어, Event Store](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference03/05.%20Event%20Store.md)

### **Reference 4.** [CQRS 와 Event Sourcing 의 Deep Dive](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part02-references/reference04)

1. [소개](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/01.%20Introduction.md)
2. [애그리거트에서 domain model 정의하기](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/02.%20defining%20aggregates%20in%20the%20domain%20model.md)
3. [Command 와 CommandHandler](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/03.%20Command%20와%20command%20handlers.md)
4. [Event 와 EventHandler](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/04.%20Event%20와%20Event%20handlers.md)
5. [Eventual Consistency](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/05.%20Eventual%20Consistency.md)
6. [Eventual Consistency과 CQRS](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/06.%20최종적%20일관성과%20CQRS.md)
7. [Optimizing read sied](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/07.%20Optimizing%20the%20read-side.md)
8. [Optimizing write side](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/08.%20Optimizing%20the%20write%20side.md)
9. [Messaging 과 CQRS](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/09.%20Messaging%20과%20CQRS.md)
10. [Task Based UI](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/10.%20Task%20Based%20UI.md)
11. [Windows Azure 의 장점](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference04/11.%20Windows%20Azure%20의%20장점.md)

### **Reference 5.** [Bounded Context 사이의 통신](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part02-references/reference05)

1. [소개](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference05/01.%20Introduction.md)
2. [Context Map 과 anti-corruption layer](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference05/02.%20Context%20Map%20과%20anti-corruption%20layer.md)
3. [레거시 시스템과의 통합](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference05/03.%20레거시%20시스템과의%20통합.md)

### **Reference 6.** [Saga on Sagas](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part02-references/reference06)

1. [용어 정리](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference06/01.%20용어%20정리.md)
2. [Process manager](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part02-references/reference06/02.%20Process%20manager.md)

### **Reference 7.** RI 에 사용된 기술들

### **부록 1.** Release Note

### **부록 2.** Migration

<br />

# 3. Tales from the trenches

### Tales. [CQRS/ES 를 사용한 여러 기업 사례](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/part03-tale)

1. [Twilio](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part03-tale/01.%20twilio.md)
2. [Lokad Hub](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part03-tale/02.%20lokad%20hub.md)
3. [DDD/CQRS for large financial company](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part03-tale/03.%20ddd%20cqrs%20for%20large%20financial%20company.md)
4. [Digital Marketing](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part03-tale/04.%20digital%20marketing.md)
5. [TOPAZ technologies](https://github.com/dhslrl321/cqrs-journey-guide-korean/blob/master/part03-tale/05.%20TOPAZ%20technologies.md)

# 4. [Terms](https://github.com/dhslrl321/cqrs-journey-guide-korean/tree/master/terms)
