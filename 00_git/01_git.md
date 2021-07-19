# 01. Git

- `git init`: 해당 폴더를 Repository로 만들겠다.(== git으로 관리하겠다!)

  - 앞으로 해당 폴더의 역사(commit, history)는 git이 관리한다!
  - (github.com) `New Repository` -> Repository 생성

- `rm -rf .git`: .git 디렉토리 강제 제거

- `git status`: git으로 관리되고 있는 폴더(== Repository, 저장소)의 상태를 보여줌

  - 현재 브랜치, 현재 Working Directory, 현재 Staging Area

- `git add`: git으로 관리할 파일들을 추가

  - 특정 파일 및 폴더를 Staging Area로 올립니다.
  - Staging Area: commit을 남길 파일 및 폴더를 준비하는 곳!
  - `git add A.txt`: `A.txt` 파일을 Index (Staging Area)에 등록 (폴더 단위도 가능)
  - `git add .`: 현재 폴더(`.`)를 Index에 등록. 폴더를 등록하면 내부의 모든 파일이 등록됨.

- `git commit`: Index에 있는 파일들을 가지고 commit(history, 역사, 기록)을 남김

  - Staging Area에 있는 파일 및 폴더의 스냅샷(기록)을 남긴다!
  - `git commit -m '메시지'`: 기록을 남기면서, `메시지`를 남김 (필수)

- `git log`: 남겨온 commit들을 확인

  - `git log --oneline --graph`: 그래프 + 한줄로 기록을 조회
  - commit hash: 자동 생성(사람으로 치면 주민등록번호, 고유한 값)
  - commit 작성자 정보(이메일, 이름), 작성 시간, 작성 메시지

- `git config`: git 프로그램의 설정을 담당

  ```bash
  git config --global user.email '이메일'
  git config --global user.name '이름'
  ```

  - `git config --global --list`: 현재 git 프로그램에 설정된 값들을 확인

