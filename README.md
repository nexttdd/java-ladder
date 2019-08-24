# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)

## 기능요구사항 정리
1. 참여할 사람 이름 입력
2. 사다리 높이 입력
3. 사다리생성
4. 연결다리 만들기
5. 사다리출력하기

## 도메인
- 사다리
- 라인
- 연결다리 (OK)

## 서비스
- 연결다리 생성 서비스 : 한명일때(처음), 2명일때(처음, 끝), 3명 이상일때 (처음, 중간, 끝)
   *우선, 하나 / 왼쪽 / 오른쪽 / 가운데 생성 method 구현
   
- 사다리게임 메인 서비스

## VIEW
- inputView
- outputView

---------------------------------
## step2 
- names 객체 추가
> key : 참여자 이름, value : position

- 최종 index 구하는 기능 추가
> 처음 시작 index를 받아서 사다리 탐색, 최종 position 결과 출력
> Ladder에 시작index를 알려주면, 결과index를 반환하도록!!



- 사다리 left, right 가 처음과 끝인줄 설명을 들어야 알겠어. 명확하지 않음
