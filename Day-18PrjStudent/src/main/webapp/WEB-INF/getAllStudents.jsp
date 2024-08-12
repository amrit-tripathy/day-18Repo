<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

	<p id="data">${studlist}</p>
	
	<button onclick="add()" >submit</button>
    <!--  <table>
         <tbody id="tbody">
            <tr>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </tbody> 
        
    </table>-->

    <script>
        function add(){
            let data = document.getElementById('data').textContent;
            console.log(data);
            console.log(data[0].getDept);
            
            
            
        }
    </script>
</body>
</html>