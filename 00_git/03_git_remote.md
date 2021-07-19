# Git Remote

- `git remote`: Remote Repositoy 주소를 등록 (GitHub Repo 주소)

  - `git remote add origin (주소)`: Remote Repo의 `주소`를 origin이라는 별칭으로 등록
- `git remote remove <name>`: Remote 삭제
- `git remote rename <old-name> <new-name>`: Remote 이름바꾸기
- `git push (별칭) (브랜치이름)`: `별칭`으로 `브랜치`의 commit들을 push (올리기, 내 컴퓨터 -> 깃허브 동기화)
  - `git push origin master`: origin으로 master 브랜치를 전송
- `git pull (별칭) (브랜치이름)`: `별칭`으로부터 `브랜치`의 commit들을 pull (내려받기, 깃허브 -> 내 컴퓨터 동기화)
- `git clone (주소)`: Remote 주소로부터 Repository clone 한다(== 내려받는다!)

