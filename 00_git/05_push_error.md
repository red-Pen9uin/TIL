## 오늘 할 내용

- `pull & push`: 상황을 만들어서 + pull 또는 push가 안되는 상황



## 시나리오 - 강의장 & 집 

1. 강의장 컴퓨터 -> 강의장 폴더
2. 집 컴퓨터 -> 집 폴더



# 오류 메시지들

```bash
error: src refspec master does not match any
error: failed to push some refs to 
```

> commit이 없는 경우! branch가 없는 경우!



### Push가 안돼요!

```bash
$ git push origin master
To https://github.com/nwith/TIL-test.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/nwith/TIL-test.git'
hint: Updates were rejected because the remote contains work that you do
# 업데이트가 거절되었다. 왜냐하면 remote가 니가 local에 들고 있지 않은 commit을 들고 있다.
hint: not have locally. This is usually caused by another repository
pushing
# 이 상황은 보통 같은 주소로 다른 repository를 push할 때 발생할 수 있다.
hint: to the same ref. You may want to first integrate the remote changes
# push하기 전에 remote(GitHub)의 변경 사항을 먼저 반영해야할 수도 있다.
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
```

- 거절이 된 상황
  - Local(내 컴퓨터)의 commit들과 Remote(GitHub)의 commit들이 일치가 되지 않아서, 순서, 있어야 하는 것들이 없어서
- 그렇다면, Push가 안되면 Pull을 먼저!
  - 아래와 같은 Commit message를 작성하는 화면이 나옴!

```
Merge branch 'master' of https://github.com/nwith/TIL-test
# Please enter a commit message to explain why this merge is necessary,
# especially if it merges an updated upstream into a topic branch.
#
# Lines starting with '#' will be ignored, and an empty message aborts
# the commit.
```

- Vim 에디터의 조작
  - esc
  - shift 누른 상태에서, z 두번 (또는 `:` -> `q` -> 엔터)

```
$ git pull
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 2 (delta 0), reused 2 (delta 0), pack-reused 0
Unpacking objects: 100% (2/2), 239 bytes | 29.00 KiB/s, done.
From https://github.com/nwith/TIL-test
   4428db6..c3e52f7  master     -> origin/master
Merge made by the 'recursive' strategy.
 c.md | 0
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 c.md
```







