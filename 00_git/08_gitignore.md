# 08. gitignore

- git으로 관리하고 싶지 않은 파일을 관리하는 파일, ==우리가 git으로 관리하고 싶지 않은 내용을 무시할 수 있게 하는 기능==
- 위치 - `.git` 폴더(우리가 git init을 입력한 위치)와 같은 위치에 `.gitignore` 파일

- Unix 시스템 상에서는 `.` 으로 시작하는 파일은 `숨김 파일`

- 사용법

  ```bash
  data.csv # 특정 파일
  secret/ # 특정 폴더
  *.png # 특정 확장자 *.log
  !profile.png # 모든 png는 빼지만, profile.png는 포함해라!
  ```

- 유의 사항

  - gitignore에 나열된 파일은, 처음부터 git으로 관리된 적이 없어야 적용받습니다!
  - 그래서 처음부터 작성해서 무시할 수 있도록 해야함!

  - 그렇다면 이미 git으로 관리되고 있는 파일들을 어떻게 제외할 수 있을까?
    1. `.gitignore`에 파일명 작성
    2. `git rm --cached 파일명`
       - git에서 더 이상 관리하지 않겠다!
       - WD에서 삭제를 해서 더 이상 관리하지 않겠다!

- gitignore 생성해주는 서비스
  - https://www.toptal.com/developers/gitignore
  - https://github.com/github/gitignore