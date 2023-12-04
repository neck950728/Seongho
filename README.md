<br>

---

<div align="center">
   <img src="https://github.com/neck950728/Seongho/assets/151998896/d733903a-743f-410b-b6d4-ca47721e5b16" width="18%">
</div>

---

<br><br>

><p><strong>분류</strong> - 팀 프로젝트</p>
><p><strong>제목</strong> - 성호 페인트</p>
><p><strong>주제</strong> - 페인트 제조 회사 그룹웨어</p>
><p><strong>기획 및 제작</strong> - 김찬혁, 김민진(나), 김성호, 김호진, 장재혁</p>
><p><strong>제작 기간</strong> - 2023.10.06 ~ 2023.11.19</p>

<br><br>

## :open_file_folder: 목차
<ul>
   <li><a href="#project-introduction">프로젝트 소개</a></li>
   <li><a href="#development-configuration">개발 환경</a></li>
   <li><a href="#team-role">팀원 역할</a></li>
   <li><a href="#screen-configuration">화면 구성</a></li>
   <li id="function"><a href="#function">기능</a></li>
   <details>
      <summary>접기/펼치기</summary>
      
      1. 접속
         1.1. 로그인
         1.2. 메인
      2. 인사 관리
         2.1. 근태 관리
         2.2. 내 인사 정보
         2.3. 내 연차 현황
      3. 전자결재
         3.1. 결재 리스트
         3.2. 기안서 작성
         3.3. 반려
         3.4. 승인
         3.5. 통합 관리
      4. 예약
         4.1. 차량 예약
         4.2. 차량 예약 캘린더
         4.3. 대여 현황
         4.4. 차량 관리
      5. 영업
         5.1. 거래처 관리
         5.2. 거래 내역
      6. 일정 관리
      7. 자산
         7.1. 기기 관리
         7.2. 품목 관리
      8. 구매 관리
      9. 관리자
         9.1. 공지사항
         9.2. 코드 관리
         9.3. 문서 양식함
         9.4. 인사 등록/조회
         9.5. 발령 등록/조회
         9.6. 전사 근태/연차 현황
   </details>
</ul>

<br><br>

## 🚀 <a id="project-introduction">프로젝트 시작 계기</a>
저희는 한 달이 조금 넘는 기간 내에 어느 정도 체계적이고 정교한 서비스를<br>
개발한다는 것은 무리가 있을 것이라 판단하여, 완성도에 집중하기보다는<br>
현재까지 학습한 내용을 최대한 효율적으로 다뤄볼 수 있고<br>
다양한 기능을 접해볼 수 있는 주제가 무엇이 있을까?🤔라는 고민 끝에<br>
```'그룹웨어'```라는 주제의 프로젝트를 진행하게 되었습니다.<br>

그중에서도 '페인트 제조 회사'를 대상으로 하게 된 이유는<br>
단순하며, 해당 분야에 대한 별도의 지식 없이도 모두가 쉽게 이해하고 다룰 수 있어,<br>
개발하는 데에만 집중할 수 있을 것이라 생각했기 때문입니다.<br>

```
🤝'그룹웨어'란?
조직 내에서 협업과 정보 공유를 위해 필요한
다양한 비즈니스 서비스(전자결재, 일정 관리, 사내 게시판 등)를
하나의 플랫폼에서 지원하는 기업의 솔루션을 의미합니다.
```

<br><br>

## :gear: <a id="development-configuration">개발 환경</a>
<img src="https://img.shields.io/badge/Framework-000000?style=for-the-badge"> <img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/MyBatis-004088?style=for-the-badge&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZlcnNpb249IjEuMCIgd2lkdGg9IjEwOC4wMDAwMDBwdCIgaGVpZ2h0PSI4OC4wMDAwMDBwdCIgdmlld0JveD0iMCAwIDEwOC4wMDAwMDAgODguMDAwMDAwIiBwcmVzZXJ2ZUFzcGVjdFJhdGlvPSJ4TWlkWU1pZCBtZWV0Ij4KCjxnIHRyYW5zZm9ybT0idHJhbnNsYXRlKDAuMDAwMDAwLDg4LjAwMDAwMCkgc2NhbGUoMC4xMDAwMDAsLTAuMTAwMDAwKSIgZmlsbD0id2hpdGUiIHN0cm9rZT0ibm9uZSI+CjxwYXRoIGQ9Ik0zNTQgNzk1IGMtOSAtMjMgMTUgLTQ1IDQ3IC00NSAxNSAwIDMxIC01IDM1IC0xMSA1IC05IC0xIC0xMCAtMjEgLTUgLTE3IDQgLTQ5IDAgLTgzIC0xMCBsLTU1IC0xOCAtMjMgMjkgYy0yOSAzNyAtNTIgMjQgLTMzIC0xOCAxNiAtMzQgMzIgLTM5IDczIC0yMiA0NCAxOSAxMTAgMTkgMTI1IDIgNiAtOCAxNCAtMjkgMTggLTQ3IGw2IC0zMyAtNDkgNiBjLTI3IDQgLTYxIDEwIC03NSAxMyAtMjUgNiAtMjYgNCAtMjUgLTMzIGwxIC0zOCAtNTcgLTMgYy0zMiAtMiAtNTggLTcgLTU4IC0xMyAwIC0yMiAyOSAtNzggNTkgLTExMSAxNyAtMjAgMzEgLTQzIDMxIC01MSAwIC0yMCAtNDggLTU2IC0xMzAgLTk3IGwtNjUgLTMzIDQ4IC00MyBjNjEgLTU1IDE1MyAtMTAwIDI0MiAtMTE5IDg3IC0xOCAxMzQgLTE4IDIwNiAtMSAxNDAgMzIgMjI1IDEyMiAyODUgMzAwIDEzIDM4IDMyIDc1IDQxIDgyIDE0IDEwIDE1IDEzIDQgMTQgLTExIDAgLTEwIDMgMyAxMyAxNiAxMiAxNyAxNSAzIDIwIC04IDMgLTMwIDM1IC00NyA3MiAtNDIgODggLTg4IDEyMCAtMTc0IDEyMCAtNDQgMCAtNzQgLTcgLTEwOCAtMjQgLTU3IC0yOSAtNzggLTIzIC03OCAyMiAwIDQzIC0xNSA1NyAtNjIgNTcgLTI3IDAgLTQwIDUgLTQ4IDIwIC0xMyAyNCAtMjggMjYgLTM2IDV6IG00NDYgLTIxNSBjMTIgLTggMTEgLTEwIC03IC0xMCAtNDIgMCAtMzIgLTU5IDEwIC02MSAxMiAwIDE2IC0zIDkgLTYgLTIzIC05IC02MyA3IC03MSAzMCAtMTYgNDMgMjAgNzIgNTkgNDd6IG0zMCAtMzAgYzAgLTUgLTQgLTEwIC05IC0xMCAtNiAwIC0xMyA1IC0xNiAxMCAtMyA2IDEgMTAgOSAxMCA5IDAgMTYgLTQgMTYgLTEweiIvPgo8L2c+Cjwvc3ZnPg=="> <img src="https://img.shields.io/badge/Tiles-0000CC?style=for-the-badge&logo=data:image/svg+xml;base64,PHN2ZyBpZD0iTGF5ZXJfMSIgZGF0YS1uYW1lPSJMYXllciAxIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAxMjIuODggMTIyLjg4Ij48ZGVmcz48c3R5bGU+LmNscy0xe2ZpbGw6d2hpdGU7fTwvc3R5bGU+PC9kZWZzPjx0aXRsZT50aWxlczwvdGl0bGU+PHBhdGggY2xhc3M9ImNscy0xIiBkPSJNMi4wNSw1OS4zOSwyOC42NywzMi43Nyw1Ny4zNCw2MS40NCwyOC42Nyw5MC4xMSwwLDYxLjQ0bDIuMDUtMlptMTE4Ljc4LDQuMUw5NC4yMSw5MC4xMSw2NS41NCw2MS40NCw5NC4yMSwzMi43N2wyOC42NywyOC42Ny0yLDIuMDVabS0yLTIuMDVMOTQuMjEsODYsNjkuNjQsNjEuNDQsOTQuMjEsMzYuODdsMjQuNTcsMjQuNTdabS04NC0zNC44Mkw2MS40NCwwLDkwLjExLDI4LjY3LDYxLjQ0LDU3LjM0LDMyLjc3LDI4LjY3bDItMi4wNVpNODguMDYsOTYuMjYsNjEuNDQsMTIyLjg4LDMyLjc3LDk0LjIxLDYxLjQ0LDY1LjU0LDkwLjExLDk0LjIxbC0yLDIuMDVaTTQuMSw2MS40NCwyOC42NywzNi44Nyw1My4yNCw2MS40NCwyOC42Nyw4Niw0LjEsNjEuNDRaIi8+PC9zdmc+"> <img src="https://img.shields.io/badge/Bootstrap-%238511FA.svg?style=for-the-badge&logo=bootstrap&logoColor=white">

<img src="https://img.shields.io/badge/IDE-%23121011?style=for-the-badge"> <img src="https://img.shields.io/badge/Spring Tool Suite4-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/Visual%20Studio%20Code-0078D7.svg?style=for-the-badge&logo=visual-studio-code"> <img src="https://img.shields.io/badge/DBeaver-4D2B1A?style=for-the-badge&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZlcnNpb249IjEuMCIgd2lkdGg9IjEyOC4wMDAwMDBwdCIgaGVpZ2h0PSIxMjguMDAwMDAwcHQiIHZpZXdCb3g9IjAgMCAxMjguMDAwMDAwIDEyOC4wMDAwMDAiIHByZXNlcnZlQXNwZWN0UmF0aW89InhNaWRZTWlkIG1lZXQiPgoKPGcgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMC4wMDAwMDAsMTI4LjAwMDAwMCkgc2NhbGUoMC4xMDAwMDAsLTAuMTAwMDAwKSIgZmlsbD0id2hpdGUiIHN0cm9rZT0ibm9uZSI+CjxwYXRoIGQ9Ik02OTkgMTA5MiBjLTI0IC0xNiAtNTYgLTQzIC03MCAtNjAgLTE4IC0yMSAtMzcgLTMyIC02MCAtMzQgLTMzIC0zIC0zNCAtNCAtMzIgLTQzIDEgLTIyIDQgLTU0IDggLTcwIDUgLTI1IC0yIC00OSAtMzggLTExOSBsLTQ0IC04OCA1IDU0IGM2IDc2IC0xNCAyMjAgLTM3IDI2NiAtNDYgOTAgLTE4MyA5MiAtMjM2IDIgLTE3IC0zMCAtMjAgLTUyIC0yMCAtMTUwIDAgLTEwNiAzIC0xMjMgMzcgLTIxNyA2MSAtMTc0IDE3MiAtMzU1IDI1OCAtNDIzIDY3IC01MyAxMTYgLTcwIDIwNyAtNzAgNTAgMCA4NSA0IDg5IDExIDQgOCAyMiA5IDUzIDQgNjIgLTEwIDExNyAtOCAxNDEgNSAyMiAxMiAyNyA0NSA5IDU2IC04IDUgLTkgMjYgLTMgNzMgNSAzNiA5IDExNiA5IDE3NiAwIDkwIC00IDEyMyAtMjQgMTgyIGwtMjQgNzIgMjcgNjEgYzI5IDY1IDM3IDE1MSAxNyAxODkgLTYgMTEgLTExIDMyIC0xMSA0NyAwIDI2IC0xIDI2IC00NyAyMCAtMjcgLTMgLTYyIC04IC04MCAtMTIgLTIwIC00IC00MyAwIC02NCAxMCAtNTUgMjcgLTY0IDIyIC01OSAtMzMgMSAtMTUgLTExIC0zNyAtMzMgLTYwIC03NSAtNzkgLTg4IC0xMjggLTM5IC0xNDkgMjYgLTExIDI1IC0xMSAtMTQgLTggbC00MiA0IC0yNiAtNjcgYy00MSAtMTAxIC01NiAtMTY5IC01NiAtMjUyIDAgLTc4IDIwIC0xNjUgNDcgLTIwOSBsMTYgLTI1IC0yMSAxOSBjLTEyIDExIC0zNCA0NCAtNDkgNzUgLTM3IDc4IC00MiAxNzIgLTE1IDI4MCAyMyA4OSA3MCAyMDMgODIgMTk2IDMgLTIgNyAxNSA3IDM4IDAgNTMgMzMgMTIzIDg1IDE4MiA0NyA1MyA4MyA3NCAxNDcgODUgbDQ2IDggLTUxIDEgYy0zOSAxIC02MCAtNSAtOTUgLTI3eiBtMjI5IC0zMTUgYy03IC0yMCAtMTcgLTM2IC0yMiAtMzYgLTUgMSAtMTIgLTUgLTE2IC0xMiAtMTIgLTE5IC00MCAtMiAtNDAgMjUgMCAxOSA3IDI2IDI5IDMxIDE2IDMgMzUgMTMgNDIgMjEgMTggMjIgMjEgMTEgNyAtMjl6Ii8+CjwvZz4KPC9zdmc+">

<img src="https://img.shields.io/badge/Language-%23121011?style=for-the-badge"> <img src ="https://img.shields.io/badge/HTML-E34F26.svg?&style=for-the-badge&logo=html5&logoColor=white"> <img src ="https://img.shields.io/badge/CSS-1572B6.svg?&style=for-the-badge&logo=css3&logoColor=white"> <img src ="https://img.shields.io/badge/JavaScript-F7DF1E.svg?&style=for-the-badge&logo=javascript&logoColor=black"> <img src="https://img.shields.io/badge/Java-FF8224?style=for-the-badge&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCA1MCA1MCIgd2lkdGg9IjUwcHgiIGhlaWdodD0iNTBweCI+DQogIDxwYXRoIGQ9Ik0gMjguMTg3NSAwIEMgMzAuOTM3NSA2LjM2MzI4MSAxOC4zMjgxMjUgMTAuMjkyOTY5IDE3LjE1NjI1IDE1LjU5Mzc1IEMgMTYuMDgyMDMxIDIwLjQ2NDg0NCAyNC42NDg0MzggMjYuMTI1IDI0LjY1NjI1IDI2LjEyNSBDIDIzLjM1NTQ2OSAyNC4xMDkzNzUgMjIuMzk4NDM4IDIyLjQ0OTIxOSAyMS4wOTM3NSAxOS4zMTI1IEMgMTguODg2NzE5IDE0LjAwNzgxMyAzNC41MzUxNTYgOS4yMDcwMzEgMjguMTg3NSAwIFogTSAzNi41NjI1IDguODEyNSBDIDM2LjU2MjUgOC44MTI1IDI1LjUgOS41MjM0MzggMjQuOTM3NSAxNi41OTM3NSBDIDI0LjY4NzUgMTkuNzQyMTg4IDI3Ljg0NzY1NiAyMS4zOTg0MzggMjcuOTM3NSAyMy42ODc1IEMgMjguMDExNzE5IDI1LjU1ODU5NCAyNi4wNjI1IDI3LjEyNSAyNi4wNjI1IDI3LjEyNSBDIDI2LjA2MjUgMjcuMTI1IDI5LjYwOTM3NSAyNi40NDkyMTkgMzAuNzE4NzUgMjMuNTkzNzUgQyAzMS45NDkyMTkgMjAuNDI1NzgxIDI4LjMyMDMxMyAxOC4yODUxNTYgMjguNjg3NSAxNS43NSBDIDI5LjAzOTA2MyAxMy4zMjQyMTkgMzYuNTYyNSA4LjgxMjUgMzYuNTYyNSA4LjgxMjUgWiBNIDE5LjE4NzUgMjUuMTU2MjUgQyAxOS4xODc1IDI1LjE1NjI1IDkuMDYyNSAyNS4wMTE3MTkgOS4wNjI1IDI3Ljg3NSBDIDkuMDYyNSAzMC44NjcxODggMjIuMzE2NDA2IDMxLjA4OTg0NCAzMS43ODEyNSAyOS4yNSBDIDMxLjc4MTI1IDI5LjI1IDM0LjI5Njg3NSAyNy41MTk1MzEgMzQuOTY4NzUgMjYuODc1IEMgMjguNzY1NjI1IDI4LjE0MDYyNSAxNC42MjUgMjguMjgxMjUgMTQuNjI1IDI3LjE4NzUgQyAxNC42MjUgMjYuMTc5Njg4IDE5LjE4NzUgMjUuMTU2MjUgMTkuMTg3NSAyNS4xNTYyNSBaIE0gMzguNjU2MjUgMjUuMTU2MjUgQyAzNy42NjQwNjMgMjUuMjM0Mzc1IDM2LjU5Mzc1IDI1LjYxNzE4OCAzNS42MjUgMjYuMzEyNSBDIDM3LjkwNjI1IDI1LjgyMDMxMyAzOS44NDM3NSAyNy4yMzQzNzUgMzkuODQzNzUgMjguODQzNzUgQyAzOS44NDM3NSAzMi40Njg3NSAzNC41OTM3NSAzNS44NzUgMzQuNTkzNzUgMzUuODc1IEMgMzQuNTkzNzUgMzUuODc1IDQyLjcxODc1IDM0Ljk1MzEyNSA0Mi43MTg3NSAyOSBDIDQyLjcxODc1IDI2LjI5Njg3NSA0MC44Mzk4NDQgMjQuOTg0Mzc1IDM4LjY1NjI1IDI1LjE1NjI1IFogTSAxNi43NSAzMC43MTg3NSBDIDE1LjE5NTMxMyAzMC43MTg3NSAxMi44NzUgMzEuOTM3NSAxMi44NzUgMzMuMDkzNzUgQyAxMi44NzUgMzUuNDE3OTY5IDI0LjU2MjUgMzcuMjA3MDMxIDMzLjIxODc1IDMzLjgxMjUgTCAzMC4yMTg3NSAzMS45Njg3NSBDIDI0LjM1MTU2MyAzMy44NDc2NTYgMTMuNTQ2ODc1IDMzLjIzNDM3NSAxNi43NSAzMC43MTg3NSBaIE0gMTguMTg3NSAzNS45Mzc1IEMgMTYuMDU4NTk0IDM1LjkzNzUgMTQuNjU2MjUgMzcuMjIyNjU2IDE0LjY1NjI1IDM4LjE4NzUgQyAxNC42NTYyNSA0MS4xNzE4NzUgMjcuMzcxMDk0IDQxLjQ3MjY1NiAzMi40MDYyNSAzOC40Mzc1IEwgMjkuMjE4NzUgMzYuNDA2MjUgQyAyNS40NTcwMzEgMzcuOTk2MDk0IDE2LjAxNTYyNSAzOC4yMzgyODEgMTguMTg3NSAzNS45Mzc1IFogTSAxMS4wOTM3NSAzOC42MjUgQyA3LjYyNSAzOC41NTQ2ODggNS4zNzUgNDAuMTEzMjgxIDUuMzc1IDQxLjQwNjI1IEMgNS4zNzUgNDguMjgxMjUgNDAuODc1IDQ3Ljk2NDg0NCA0MC44NzUgNDAuOTM3NSBDIDQwLjg3NSAzOS43Njk1MzEgMzkuNTI3MzQ0IDM5LjIwMzEyNSAzOS4wMzEyNSAzOC45Mzc1IEMgNDEuOTMzNTk0IDQ1LjY1NjI1IDkuOTY4NzUgNDUuMTIxMDk0IDkuOTY4NzUgNDEuMTU2MjUgQyA5Ljk2ODc1IDQwLjI1MzkwNiAxMi4zMjAzMTMgMzkuMzkwNjI1IDE0LjUgMzkuODEyNSBMIDEyLjY1NjI1IDM4Ljc1IEMgMTIuMTEzMjgxIDM4LjY2Nzk2OSAxMS41ODk4NDQgMzguNjM2NzE5IDExLjA5Mzc1IDM4LjYyNSBaIE0gNDQuNjI1IDQzLjI1IEMgMzkuMjI2NTYzIDQ4LjM2NzE4OCAyNS41NDY4NzUgNTAuMjIyNjU2IDExLjc4MTI1IDQ3LjA2MjUgQyAyNS41NDI5NjkgNTIuNjk1MzEzIDQ0LjU1ODU5NCA0OS41MzUxNTYgNDQuNjI1IDQzLjI1IFoiIGZpbGw9IiNGRkZGRkYiLz4NCjwvc3ZnPg==">

<img src="https://img.shields.io/badge/DB-%23121011?style=for-the-badge"> <img src="https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white">

<img src="https://img.shields.io/badge/Server-%23121011?style=for-the-badge"> <img src="https://img.shields.io/badge/Apache%20Tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black">

<img src="https://img.shields.io/badge/OS-%23121011?style=for-the-badge"> <img src="https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white">

<img src="https://img.shields.io/badge/Hosting-%23121011?style=for-the-badge"> <img src="https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white">

<img src="https://img.shields.io/badge/Other-%23121011?style=for-the-badge"> <img src="https://img.shields.io/badge/Docker-%230DB7ED.svg?style=for-the-badge&logo=docker&logoColor=white"> <img src="https://img.shields.io/badge/GitHub-%23121011.svg?style=for-the-badge&logo=github&logoColor=white">

|:hammer: Library & API|
|:---:|
```Lombok```, ```jQuery```, ```Jackson Databind```, ```Gson```, ```Javax Mail``` <br> ```WebSocket```, ```Commons FileUpload```, ```SweetAlert```, ```Fullcalendar``` <br> ```Daum Postcode```, ```JXLS```, ```iText7```, ```zTree```, ```Chart API```

<br><br>

## :muscle: <a id="team-role">팀원 역할</a>
><p><strong>팀장</strong> : 김찬혁</p>
> - 메인, 전자결재, 공지사항, 코드 관리, 문서 양식함, 알림

><p><strong>팀원</strong> : 김민진</p>
> - 로그인, 내 근태/인사 관리, 인사 등록/조회, 발령 등록/조회, 전사 근태/연차 현황

><p><strong>팀원</strong> : 김성호</p>
> - 예약 관리, 부서별 일정 관리, 차량 관리, 거래처 관리

><p><strong>팀원</strong> : 김호진</p>
> - 기기 관리, 품목 관리, 공장/창고 관리

><p><strong>팀원</strong> : 장재혁</p>
> - 구매 관리

<br><br>

## :tv: <a id="screen-configuration">화면 구성</a>
|메인|근태 관리|
|---|---|
|<img src="https://github.com/neck950728/Seongho/assets/151998896/383e18b3-2850-4a88-8a84-c584e43a9328" width="387.5">|<img src="https://github.com/neck950728/Seongho/assets/151998896/4446232b-bd17-4a05-917c-692e64969995" width="387.5">|

|인사 관리|전자결재|
|---|---|
|<img src="https://github.com/neck950728/Seongho/assets/151998896/52c50b59-150d-44c7-9baf-a1e4be4c9c89" width="387.5">|<img src="https://github.com/neck950728/Seongho/assets/151998896/ace57772-5d64-425d-a49e-a325797f74ad" width="387.5">|

|예약|영업 관리|
|---|---|
|<img src="https://github.com/neck950728/Seongho/assets/151998896/cde78457-9f79-452d-b903-72d58c51765d" width="387.5">|<img src="https://github.com/neck950728/Seongho/assets/151998896/63b5ea66-a8ef-4ae4-a5ce-cd1b839cfff4" width="387.5">|

|일정 관리|자산 관리|
|---|---|
|<img src="https://github.com/neck950728/Seongho/assets/151998896/90162963-110f-4c23-a76b-ced424cddd97" width="387.5">|<img src="https://github.com/neck950728/Seongho/assets/151998896/4385529a-e4bc-400c-a0e6-566191eee908" width="387.5">|

|구매 관리|공지사항|
|---|---|
<img src="https://github.com/neck950728/Seongho/assets/151998896/984f2058-4577-448e-aa9d-50d1d71f3ee5" width="387.5">|<img src="https://github.com/neck950728/Seongho/assets/151998896/6e8b0841-bf44-4c57-8778-6d1c30b410cd" width="387.5">|

|코드/문서 양식 관리|인사 등록/조회|
|---|---|
<img src="https://github.com/neck950728/Seongho/assets/151998896/3da6053e-c48e-4eeb-8e70-74dee5fa195a" width="387.5">|<img src="https://github.com/neck950728/Seongho/assets/151998896/707f2455-7ff7-4ebe-83e1-7de0dd4f8bda" width="387.5">|

|발령 등록/조회|근태/연차 현황|
|---|---|
<img src="https://github.com/neck950728/Seongho/assets/151998896/4cb065bc-3f46-4f1f-9f84-2181884e51a3" width="387.5">|<img src="https://github.com/neck950728/Seongho/assets/151998896/27dfe162-edc2-4b18-8af7-77fccfbf0c75" width="387.5">|
