## 메소드에서 인스턴스 변수 사용

### 객체의 행동
- 클래스에서는 객체가 아는 것과 하는 것을 기술한다.
- 아는 것은 인스턴스 변수이다.
- 하는것은 메소드라고 부른다.

### 캡슐화
- 내부와 외부를 구분하여 객체의 자율성을 보장한다.
- 외부에 데이터를 노출시키지 않고 데이터를 변경하는 함수로만 접근할수 있도록하여
올바른 방법으로 데이터를 변경한다.

### 인스턴스 변수, 로컬 변수
- 인스턴스 변수는 클래스 내에서 선언된다
- 지역변수는 메소드 내에서 선언되고 사용하기 전에 반드시 초기화 해야한다.

### 비교
- 두개의 원시값을 비교할 때는 == 연산자를 사용한다.
- 비트들을 비교한는것
- 객체 비교에는 equals() 메소드 사용