# kotlin-racingcar

## step-2

### 요구 사항
1. 사용자가 입력한 문자열 값에 따라 사칙 연산을 수행할 수 있는 계산기 구현(입력한 순서대로 계산)
   1. 덧셈
   2. 뺄셈
   3. 곱셈
   4. 나눗셈
   5. 입력값이 null이거나 빈 공백 문자일 경우 IllegalArgumentException throw
   6. 사칙연산 기호가 아닌 경우 IllegalArgumentException throw
   7. 사칙 연산을 모두 포함하는 기능 구현
2. 테스트 코드 작성

### Feedback - 1
1. Calculator Class -> object class 로 변경
2. Calculator의 Double.operate() 를 Operaotr로 위임
3. Calculator require 활용
4. Calculator 0 대응
5. Operator의 String.toOperator() 를 Companion object 함수로 변경
6. Calculator 매직넘버 상수로 선언
7. Calculator validateFormula 분리

### Feedback - 2
1. calculate 메서드 파라미터 네이밍 수정
2. Operator의 from 메서드에 어떤 value가 들어왔는지 예외 메시지에 보여주기
3. Operator의 operate 메서드 수정


## step-3

### 요구사항
1. 초간단 자동차 경주 게임을 구현
2. 경주 게임 로직 클래스 구현
3. UI 로직 클래스 구현
   1. InputView
   2. ResultView
4. 테스트 코드 작성

### Feedback - 1
1. getRandomNumber 수정 혹은 삭제
2. randomNumberRange 상수 네이밍 컨벤션 적용
3. InputView.inputValues() 분리
4. RaceManager의 initCarList 분리
5. carList 네이밍 수정
6. 람다 변수 네이밍 수정
7. Car INITIAL_POSITION private 사용
8. InputView의 getNumber - requireNotNull 사용
9. RaceManager "-" 상수로 추출
10. Car의 updateCarPosition 네이밍 변경
11. CarTest - 전진하지 않는 케이스의 테스트 코드 추가
12. RaceManager 테스트하기 쉬운 코드 고민 및 수정