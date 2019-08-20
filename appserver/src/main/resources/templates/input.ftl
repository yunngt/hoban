<html xml:lang="ko" lang="ko">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>fever</title>
<head>
    <link type="text/css" href="/semantic/semantic.css" rel="stylesheet" />
    <script>
        function searching() {
            if(document.getElementById("title").value.trim() == ""){
                alert("제목을 입력하세요.");
            }else{
                document.location = '/search?workId=' + document.getElementById("title").value;
            }
        }
    </script>
</head>

<body>
<#include "header.ftl">
<br/>
	<div class="ui form">
		<br/>
		<div class="ui input">
		  <input type="text" placeholder="제목">
		</div>
		<button class="ui button" > 저장
		</button>	


		<br/>
		<br/>
		<div class="six wide field">
		    <textarea placeholder="본문"></textarea>
		</div>
	</div>
</body>

</html>