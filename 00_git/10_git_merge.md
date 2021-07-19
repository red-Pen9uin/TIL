# 10. Git Merge

1. Fast-Forward Merge

   ```bash
   $ git merge login
   Updating f9730fc..cf67390
   Fast-forward
    login.md | 0
    1 file changed, 0 insertions(+), 0 deletions(-)
    create mode 100644 login.md
   ```

2. 3-way Merge (Merge commit)

   ```
   $ git merge signup
   Merge made by the 'recursive' strategy.
    signup.md | 0
    1 file changed, 0 insertions(+), 0 deletions(-)
    create mode 100644 signup.md
   ```

3. Merge Conflict

   ```
   $ git merge hotfix
   Auto-merging a.md
   CONFLICT (content): Merge conflict in a.md
   Automatic merge failed; fix conflicts and then commit the result.
   ```











