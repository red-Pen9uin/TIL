![image-20210716111724585](C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716111724585.png)

영화에 관련된 정보나 프로그램을 제공해주는 Open API.

이것으로 박스오피스 순위를 한번 출력해볼 것.



![image-20210716111931408](C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716111931408.png)

1. REST 방식

- 기본 요청 URL : http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml (또는 .json)
- 요청 parameter : 3번항의 요청 인터페이스 정보를 참조하여 GET 방식으로 호출

2. SOAP 방식

- 요청 URL : http://www.kobis.or.kr/kobisopenapi/webservice/soap/boxoffice
- WSDL URL : http://www.kobis.or.kr/kobisopenapi/webservice/soap/boxoffice?wsdl
- Operation : searchDailyBoxOfficeList



방식과 인터페이스를 제공해준다.

오픈 API는 보통 이런식으로 사용 방법 등을 명시해준다.

우린 결과를 json 형태로, 호출은 지정된 방식인 GET 방식을 이용할 것임

- Query String을 이용해서 서버쪽 프로그램에 데이터를 전달해야 한다
  - http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=value&key=value&key=value
  - 이렇게 사용할 것이라는 뜻
  - ?key=value&targetDt=yyyymmdd
  - 



- 기본 요청 URL 형식: 우리가 return받을 응답의 형식
- 요청 parameter: 우리가 전달해야하는 데이터
  - Query String을 이용해 데이터를 제공해야
  - ?key=value&key=value&key=value



3. 인터페이스

- 요청 인터페이스

|  요청 변수   |      값      |                             설명                             |
| :----------: | :----------: | :----------------------------------------------------------: |
|     key      | 문자열(필수) |                 발급받은키 값을 입력합니다.                  |
|   targetDt   | 문자열(필수) |     조회하고자 하는 날짜를 yyyymmdd 형식으로 입력합니다.     |
| itemPerPage  |    문자열    | 결과 ROW 의 개수를 지정합니다.(default : “10”, 최대 : “10“)  |
| multiMovieYn |    문자열    | 다양성 영화/상업영화를 구분지어 조회할 수 있습니다. “Y” : 다양성 영화 “N” : 상업영화 (default : 전체) |
| repNationCd  |    문자열    | 한국/외국 영화별로 조회할 수 있습니다. “K: : 한국영화 “F” : 외국영화 (default : 전체) |
|  wideAreaCd  |    문자열    | 상영지역별로 조회할 수 있으며, 지역코드는 공통코드 조회 서비스에서 “0105000000” 로서 조회된 지역코드입니다. (default : 전체) |

- 라이센스키 - 시스템이 허용하는 만큼 인가된 사용자에게 이용을 허락하기 위함
- 날짜 - 알려줘야 그날의 박스오피스 결과를 알 수 있음
- 



- 응답 구조

|   응답 필드   |   값   |                             설명                             |
| :-----------: | :----: | :----------------------------------------------------------: |
| boxofficeType | 문자열 |                박스오피스 종류를 출력합니다.                 |
|   showRange   | 문자열 |              박스오피스 조회 일자를 출력합니다.              |
|     rnum      | 문자열 |                      순번을 출력합니다.                      |
|     rank      | 문자열 |           해당일자의 박스오피스 순위를 출력합니다.           |
|   rankInten   | 문자열 |             전일대비 순위의 증감분을 출력합니다.             |
| rankOldAndNew | 문자열 | 랭킹에 신규진입여부를 출력합니다. “OLD” : 기존 , “NEW” : 신규 |
|    movieCd    | 문자열 |                영화의 대표코드를 출력합니다.                 |
|    movieNm    | 문자열 |                  영화명(국문)을 출력합니다.                  |
|    openDt     | 문자열 |                 영화의 개봉일을 출력합니다.                  |
|   salesAmt    | 문자열 |                해당일의 매출액을 출력합니다.                 |
|  salesShare   | 문자열 | 해당일자 상영작의 매출총액 대비 해당 영화의 매출비율을 출력합니다. |
|  salesInten   | 문자열 |            전일 대비 매출액 증감분을 출력합니다.             |
|  salesChange  | 문자열 |           전일 대비 매출액 증감 비율을 출력합니다.           |
|   salesAcc    | 문자열 |                   누적매출액을 출력합니다.                   |
|    audiCnt    | 문자열 |                해당일의 관객수를 출력합니다.                 |
|   audiInten   | 문자열 |            전일 대비 관객수 증감분을 출력합니다.             |
|  audiChange   | 문자열 |           전일 대비 관객수 증감 비율을 출력합니다.           |
|    audiAcc    | 문자열 |                   누적관객수를 출력합니다.                   |
|    scrnCnt    | 문자열 |           해당일자에 상영한 스크린수를 출력합니다.           |
|    showCnt    | 문자열 |             해당일자에 상영된 횟수를 출력합니다.             |



4. 응답 예시

| XML  | [http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.**xml**?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101](http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101) |
| :--: | ------------------------------------------------------------ |
| JSON | [http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.**json**?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101](http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101) |





---

![image-20210716114006696](C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716114006696.png)





|                            발급키                            |  관리명   | 서비스 사용 URL |     발급일시     | 사용제한  |                           키 삭제                            |                             차트                             |
| :----------------------------------------------------------: | :-------: | :-------------: | :--------------: | :-------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
| [592015fba1fd7548df13f9181edfcfb6](http://www.kobis.or.kr/kobisopenapi/homepg/apikey/ckUser/saveApikeyForm.do?apiKey=592015fba1fd7548df13f9181edfcfb6) | AJAX 연습 |    localhost    | 2021-07-16 11:40 | 일 3000회 | [![삭제](http://www.kobis.or.kr/kobisopenapi/web/images/common/btn_chart_delete.png)](http://www.kobis.or.kr/kobisopenapi/homepg/apikey/ckUser/findApikeyList.do#;) | [![챠트](http://www.kobis.or.kr/kobisopenapi/web/images/common/btn_chart_off.png)](http://www.kobis.or.kr/kobisopenapi/homepg/apikey/ckUser/findApikeyList.do#;) |



- http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=592015fba1fd7548df13f9181edfcfb6&targetDt=20210715

592015fba1fd7548df13f9181edfcfb6



![image-20210716114409706](C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716114409706.png)

- 이런식으로 json이 떨어지게 된다



![image-20210716130529917](C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716130529917.png)

- JSON Formatter를 사용하면 좀더 편하게 볼 수 있다.



<img src="C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716130622402.png" alt="image-20210716130622402" style="zoom:50%;" />

- 안에 JSON

<img src="C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716130705164.png" alt="image-20210716130705164" style="zoom: 50%;" />

<img src="C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716130838974.png" alt="image-20210716130838974" style="zoom: 33%;" />

- 안에 또 JSON
- 여러 데이터를 담고있는 JSON Array를 갖고있음

<img src="C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716130921875.png" alt="image-20210716130921875" style="zoom: 33%;" />

<img src="C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716130748049.png" alt="image-20210716130748049" style="zoom: 33%;" />

- 그리고 그 안에 다시 JSON을 가지고있다
  - ==중첩구조==
- 이제 이걸 프로그램 내에서 데이터를 받아와 처리해볼 것!

---



- 





![image-20210716142330751](C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716142330751.png)![image-20210716142332572](C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716142332572.png)

이제 이 화면을 가져올것임

![image-20210716142631406](C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716142631406.png)

쓸모없는 것은 지우고

![image-20210716142824782](C:\Users\redpe\AppData\Roaming\Typora\typora-user-images\image-20210716142824782.png)

지우고 붙이고 지우고 붙이고

