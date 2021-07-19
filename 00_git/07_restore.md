# 07. 취소하기

- `restore & reset`: ==취소하기==



1. `git add` 취소하기

   - `f.md`이 추가(Staging Area에 등록)되어 있는 상황

   ```bash
   $ git status
   On branch master
   Your branch is ahead of 'origin/master' by 1 commit.
     (use "git push" to publish your local commits)
   
   Changes to be committed:
     (use "git restore --staged <file>..." to unstage)
           new file:   f.md
   ```

   - `git restore --staged 파일명`: 파일명 뿐만 아니라 폴더 명도 됩니다.
     - `git restore -S 파일명`
   - 구버전
     - `git reset HEAD 파일명`: 지금도 동작하기는 합니다!

   

2. `git commit` 취소(삭제)하기

   - `git reset {옵션} {위치}`
     - 상대적 위치 (필수)
       - 현재 위치 == `HEAD`
       - 1 commit 전 == `HEAD~1` (`HEAD~` 로 표현 가능)
       - 2 commit 전 == `HEAD~2`
     - 절대적 위치 == hash (ex. `bb4b839`)
       - `git reset bb4b839`
     - 옵션 (선택) 3가지
       - `--mixed`(기본값)
         - commit 했었던 파일과, 현재 WD내용을 합쳐줌
         - commit 했던 내용은 그대로 남습니다.
       - `--soft`
         - commit 했었던 파일을, Staging에 넣어줌
         - commit 했던 내용, 그대로 남습니다.
       - `--hard`(주의!)
         - commit 했었던 파일을, 모조리 날리고 이전 commit의 상태로 갑니다.
         - commit 했던 내용 사라짐!

   

3. 작업한 내용 취소(삭제)하기

   - 아직 WD에 있는 것들을 되돌리기(== `ctrl + z`)
     -  되돌리게되면 원래대로 돌아갈 수 없음! (주의!)
   - `git restore 파일명`
   - 구버전
     - `git checkout -- 파일명`
   - 제약사항
     - 이미 git으로 관리한적 있는 파일들만 가능!
       - 원본 무엇인지를 안다 == 원본과 지금 작업중인 내용의 차이를 알고있다!
       - 그렇기 때문에 되돌리는 것이 가능!

   

4. `git push` 취소(?)하기

   - git push는 결국 공개적으로 commit 한 사실을 널리 알리는 것!

   - 그런데 이것을 되돌린다?

     - 쉽게 되지 않는다!

   - 1. 강제(force)로 덮어 씌우기 (권장하지 않음!)

        - 쉬운 만큼 빠릅니다!

        ```bash
        $ git push
        To https://github.com/nwith/TIL-test.git
         ! [rejected]        master -> master (non-fast-forward)
        error: failed to push some refs to 'https://github.com/nwith/TIL-test.git'
        hint: Updates were rejected because the tip of your current branch is behind
        hint: its remote counterpart. Integrate the remote changes (e.g.
        hint: 'git pull ...') before pushing again.
        hint: See the 'Note about fast-forwards' in 'git push --help' for details.
        ```

        - `git push -f`: 강제로 push

     2. 되돌린 사실을 알리는 것 (revert) (권장!)

        - revert도 commit이다!
        - `git revert {위치}`
          - 상대적 위치
            - HEAD, HEAD~, HEAD~2
          - 절대적 위치
            - `hash`





