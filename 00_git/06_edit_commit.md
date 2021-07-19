# 06. 최근 commit 수정하기

1. `git commit --amend`

2. Vim!

   ```bash
   e.md 추가
   
   # Please enter the commit message for your changes. Lines starting
   # with '#' will be ignored, and an empty message aborts the commit.
   #
   # Date:      Tue Jul 6 11:18:41 2021 +0900
   #
   # On branch master
   # Your branch is ahead of 'origin/master' by 1 commit.
   #   (use "git push" to publish your local commits)
   #
   # Changes to be committed:
   #       new file:   e.md
   #
   ```

   - `i`: 편집 모드
   - commit 메시지 자유롭게 수정
   - `esc`: 편집 모드 종료
   - `:` > `wq` > enter! : 저장(`w`)하고, 종료(`q`)!

3. 수정 완료!

   ```
   $ git commit --amend
   [master 20bcd5f] e.md 추가
    Date: Tue Jul 6 11:18:41 2021 +0900
    1 file changed, 0 insertions(+), 0 deletions(-)
    create mode 100644 e.md
   ```

   

