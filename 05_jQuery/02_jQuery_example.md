# jQuery_Example.html

```html
<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="UTF-8">
      <title>Title</title>
      <!--jQuery CDN-->
      <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
      
      <!-- Bootstrap CDN(Content Delivery Network)-->
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
      
      <script src="js/0714_jQuery_Example.js"></script>
  </head>
  <body class="container">
      <div>
        <ul>
          <li id="apple">사과</li>
          <li id="pineapple">파인애플</li>
          <li class="myList">참외</li>
        </ul>
        <!-- 사용자 입력양식을 사용할꺼예요 -->
        <!-- 사용자로부터 데이터를 입력받아서 서버쪽 프로그램을 실행 -->
        <!-- 사용자 입력양식만 만들면 이 데이터가 서버쪽 프로그램에 전달되나요? - 아뇨!  -->
        <!-- 그래서 Form tag를 사용해요! -->
        <form action="#" method="GET">
            <input type="text" id="uId" size="20">
        </form>
        <ol>
            <li class="myList">고양이</li>
            <li class="myList">호랑이</li>
            <li class="myList">강아지</li>
        </ol>
      </div>
      <button type="button"
              class="btn btn-primary"
              onclick="myFunc()">클릭클릭!!</button>
  </body>
</html>
```



# jQuery_Example.js

```javascript
function myFunc() {
    // 1. console에 "사과"를 출력하세요!
     console.log($('#apple').text())
    
    // 2. console에 "참외"를 출력하세요!
     console.log($('ul > li[class]').text());
    
    // 3. uId라는 id의 값을 찾아서 출력하세요!
     console.log($('[type=text]').attr('id'))
     $('[type=text]').attr('id','hahaha')
    
    // 4. 입력상자를 찾아서 사용자가 입력한 값을 alert으로 출력하세요!
     alert($('[type=text]').val());
     $('[type=text]').val('최길동');
    
	// 5. console에 내용을 출력하세요!
    console.log($('ol > li:first').text());
    console.log($('ol > li:last').text());
    console.log($('ol > li:eq(1)').text()); //eq를 이용해 순번을 정해줄 수 있음, 0-index
}
```

