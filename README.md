## 미션 1 - PointTest에서 Point에 대한 exception 테스트를 추가한다.
* x, y 값이 0 미만, 24 초과에 대한 에러 테스트를 추가한다.
* 구글에서 "junit expected exception"로 검색해 문제를 해결한다.

---
## 미션 2 - 각 도형은 중복된 Point를 입력할 수 없어야 한다.
* 중복된 Point를 입력하는 경우 DuplicatePointException을 throw한다.
  * DuplicatePointException은 Runtime Exception으로 구현한다.
* 중복 Point에 대한 단위 테스트를 추가한다.

---
## 미션 3 - Point의 갯수가 1개 이하 또는 5개 이상이 경우 일치하는 도형이 없어야 한다.
* 일치하는 도형이 없을 경우 현재는 IllegalArgumentException이 발생하고 있는데 IllegalArgumentException 대신 NotFoundFigureTypeException을 throw하도록 변경한다.
  * NotFoundFigureTypeException은 Compiletime Exception으로 구현한다.
* 일치하는 도형이 없을 경우에 대한 단위 테스트를 추가한다.

---
## 미션 4 - 사용자가 Point를 잘못 입력하는 경우 에러 메시지를 보여주고 다시 입력하도록 한다.
* 잘못 입력하는 경우 발생할 수 있는 Exception은 다음과 같다.
  * IllegalArgumentException, DuplicatePointException, NotFoundFigureTypeException
