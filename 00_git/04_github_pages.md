# GitHub Pages

1. (github.com) New Repository

   - Repository의 이름을 `{username}.github.io` 로 만들어야 합니다.

2. (내 컴퓨터) Home 폴더에서 아래의 명령어로 clone

   - `git clone https://github.com/{username}/{username}.github.io.git`

3. (내 컴퓨터) 해당 폴더로 이동

   - `cd {username}.github.io`

4. (Start Bootstrap 사이트) 템플릿

   - https://startbootstrap.com/theme/resume

   - 다운로드 -> 압축 해제

   - 내부에 있는 파일들을 `{username}.github.io` 폴더로 복사!

     ```
     assets/
     css/
     js/
     index.html
     ```

5. (Git Bash) 추가된 파일들을 add, commit, push

   - `git add .`
   - `git commit -m 'Add template'`
   - `git push`

6. (github.com) 깃허브가서 다시 확인

   - `Settings > Pages > GitHub Pages`
     - 안나온다면?!
       1. Repository 이름이 제대로 되었는가?
          - 제 username은 `nwith`
          - `nwith.github.io`
       2. `index.html`이 가장 최상단에 있는가?

---

## GitHub Public Profile

1. (github.com) New Repository
2. (github.com) 본인의 username으로 된 Repository 생성
   - 체크박스 `Add a README file` 체크!
3. `github.com/{username}`
   - https://github.com/nwith



---



1. CLI
   - ls, cd
2. Git
   - git status, add, commit
3. Markdown
4. Git Remote
   - git remote add, git push, git pull, git clone
5. GitHub Pages




