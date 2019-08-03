# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)

## 클래스 구조 및 테스트 케이스 작성
* Persons
  * 문자열을 잘 나눴는지
  * 꽝, 당첨 내역 확인
* Person
  * 플레이어 이름이 5글자 넘을때 예외처리
* Line
  * 라인이 겹치는 경우
  * 라인이 안겹치는 경우
* Ladder
 * 사다리 한줄 생성
 * InputView
 * ResultView
 * ConsoleMain
 * 최종결과 확인해서 라인별로 반복한 값을 리턴시킴