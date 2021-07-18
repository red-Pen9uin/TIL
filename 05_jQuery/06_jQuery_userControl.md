[TOC]



# *Event, Event Handler*

- *JavaScript* 입장에서는 매시간시간마다 **사용자 이벤트**가 지속적으로 발생 
  - 상당히 많은 *Event*들이 동시에 발생. 
  - 이런 발생된 *Event*를 처리하려면 가장 쉬운 방법은 **Event 속성**을 이용 
- *Event* 속성이름은 ***==on + Event명==***으로 결정된다
  - 예) *onclick*

- *Event* 명은 *JavaScript* 내에서 결정되어있음
  - *click, dbclick, mousemove, change, ...              	  : ==Event name==*
  - *onclick, ondbclick, onmousemove, onchange, ...  : ==Event attribute==*



#  *JavaScript Event 모델*

- ***Event Deligation Model*.** 
- *Event*가 발생한 주체(*source*) : ***button, select, textfield***
- *Event*가 발생하면 이 ***Event*를 감지**해서 ***JavaScript* 함수를 호출**해서 처리하게 된다
  - 이때 호출되는 *JavaScript* 함수를 이벤트 처리 함수, ***Event Handler***라고 부른다
- 모든 *Event*는 *Event*가 발생했을 때 Browser가 ***Event*의 세부정보를 담고있는 객체**(*Event* 객체)를 하나 자동으로 생성
- 결국은 *Event Source*가 발생된 *Event*를 처리하지 않고 ***Event Handler*를 이용해서 *Event*를 처리**



# jQuery_userControl.html

- `<select onchange="myOnchange()">`, `<button onclick="choose_hobby()">`라고 주는 것으로, Event Handler를 명시
- 모든 html 문서 내의 택스트를 `<span>` 혹은 `<div>, <p>` 등의 태그를 사용해 묶어주어 jQuery를 이용한 처리가 수월하게 한다.
  - **절대 태그 없이 텍스트를 입력하는 것을 피할 것!**

```html
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
        <!-- jQuery CDN(Content Delivery Network)-->
        <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
        <!-- Bootstrap CDN(Content Delivery Network)-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

        <script src="js/0714_jQuery_userControl.js"></script>
    </head>
    <body class="container">
        <div>
            <select onchange="myOnchange()">
                <option>김길동</option>
                <option>홍길동</option>
                <option>강길동</option>
            </select>
            <br>
            <span>선택된 사람은:</span><input type="text" id="myText">

            <br><br><br>
            <input type="checkbox" > <span>게임</span><br>
            <input type="checkbox"> <span>기타</span><br>
            <input type="checkbox"> <span>운동</span><br>
            <input type="checkbox"> <span>독서</span><br>
            <input type="checkbox"> <span>노래</span><br>

            <button type="button" class="btn btn-primary"
                    onclick="choose_hobby()">취미를 선택하세요!</button>

        </div>

    </body>
</html>
```



# jQuery_userControl.js

- 주로 `<select onchange="myOnchange()">`, `<button onclick="choose_hobby()">`에서 명시한 Event Handler를 작성하게 된다.
- JavaScript와 jQuery가 동시에 사용되지만 영역만 잘 구분지을 것.
  - $(~~) 형태는 jQuery, 그 외엔 JavaScript의 문법을 따른다!
- jQuery에서 `:`를 통해 특정 상태 등을 정의해줄 수 있다.
  - 여기에서 사용할 수 있는 키워드들은 따로 있는 편
  - 우리가 원하는 것을 수행할 수 있는 걸 잘 골라보도록 하자.
  - ex) `selected`, `checked`, ...

```javascript
$('select > option:selected').text()
$('[type=checkbox]:checked + span').text()
```



```javascript
function myOnchange() {
    //alert('변경되요!')
    $("#myText").val($('select > option:selected').text())
}

function choose_hobby() {
    //현재 체크된 체크박스와 관련된 내용을 가져와서 console에 출력
    console.log($('[type=checkbox]:checked + span').text())
}
```

