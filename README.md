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

### Feedback
1. Calculator Class -> object class 로 변경
2. Calculator의 Double.operate() 를 Operaotr로 위임
3. Calculator require 활용
4. Calculator 0 대응
5. Operator의 String.toOperator() 를 Companion object 함수로 변경
6. Calculator 매직넘버 상수로 선언
7. Calculator validateFormula 분리