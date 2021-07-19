# 09. Git Branch

- `branch`: ==왜 필요하고, 어떻게 쓰는지==

- master 브랜치 위에서 모든 것을 했습니다.

- `git-branch` 폴더 생성 -> GitHub에 올리지는 않습니다.

- `git branch`
  - 현재 Repository의 모든 branch의 목록을 보여줌
  
- `git branch {브랜치명}`
  - 브랜치명으로 새로운 브랜치 생성

- `git switch {브랜치명}`
  - 브랜치명으로 이동
  - 구버전
    - `git checkout {브랜치명}`
  
- 현재 내가 있는 브랜치 이름 확인
  1. `git branch`
  2. `git status`
  3. git bash 끝에 보여짐!
  
- `git log` 그래프와 함께 보기
  - `git log --oneline --graph --all`:
    - 한줄로 보기 + 그래프 보기 + 모든 브랜치

- `git branch -d {브랜치명}`: 브랜치 삭제!

  ```bash
  $ git branch -d sub # 병합되지 않은 상태에서 삭제 불가능
  error: The branch 'sub' is not fully merged.
  If you are sure you want to delete it, run 'git branch -D sub'. # -D
  ```



