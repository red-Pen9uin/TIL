# 00. Basic CLI

- `ls`: 목록 조회 (list)

  ```bash
  a.txt  b/  c.txt  d.txt  e.txt
  ```

  - `ls -al`: 상세 목록 조회

  ```bash
  $ ls -al
  total 25
  drwxr-xr-x 1 campusseven01 197121  0 Jul  5 11:34 ./
  drwxr-xr-x 1 campusseven01 197121  0 Jul  5 11:44 ../
  drwxr-xr-x 1 campusseven01 197121  0 Jul  5 11:44 .git/
  -rw-r--r-- 1 campusseven01 197121  0 Jul  5 10:26 a.txt
  drwxr-xr-x 1 campusseven01 197121  0 Jul  5 10:29 b/
  -rw-r--r-- 1 campusseven01 197121  0 Jul  5 10:28 c.txt
  -rw-r--r-- 1 campusseven01 197121  0 Jul  5 11:32 d.txt
  -rw-r--r-- 1 campusseven01 197121 22 Jul  5 11:42 e.txt
  ```

- `cd`: 폴더 변경 (change directory)
  - `cd`: `~` 폴더(Home 폴더)로 이동
  - `cd 폴더명`:`폴더명`으로 이동
    - `cd 폴더명/폴더명/폴더명`: 여러개의 폴더 한번에 이동
  - `cd ..`: 상위 폴더로 이동
  
- `mkdir`: 폴더 생성 (make directory)
  - `mkdir A`: `A`라는 이름의 폴더 생성
  
- `touch`: 빈 파일 생성
  - `touch a.txt`: `a.txt` 파일 생성 (빈 파일)
  
- `cp`: 파일/폴더 복사
  - `cp A B`: `A` 라는 파일/폴더를 복사하여 `B`를 생성
  
- `mv`: 파일/폴더 이동
  - `mv A.txt B/A.txt`: `A.txt` 파일을 `B` 폴더 안으로 이동
  - `mv A.txt C.txt`: `A.txt` 파일의 이름을 `C.txt`로 변경
  
- `rm`: 파일 삭제 (remove), 폴더도 삭제 가능

  - 만약에 폴더 안에 폴더가 있으면? > `rm -r` 내부의 폴더도 같이 삭제
  - `rm -r` + force: `rm -r -f` or `rm -rf` : 내부의 폴더도 삭제하면서 강제로 삭제

- Tab: 자동완성

- 방향키 위, 아래: 명령어 기록 (History)

