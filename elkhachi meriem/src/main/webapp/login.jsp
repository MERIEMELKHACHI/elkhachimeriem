<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Acuiel </title>
</head>
<body>
 
<form action="inscrire" method="post" name="inscri">
<table>
<tr>
<td>login:</td>
<td><input type="email" name="email"></td>
</tr>

<tr>
<td>pass:</td>
<td><input type="password" name="pass"></td>
</tr>

 
<tr>
<td colspan="2"> <input type="submit" value="inscri" name="btn"></td>
</tr>
</table>


</form>

<form action="inscrire" method="post" name="auto">
<table>
<tr>
<td>login:</td>
<td><input type="email" name="email"></td>
</tr>

<tr>
<td>pass:</td>
<td><input type="password" name="pass"></td>
</tr>

 
<tr>
<td colspan="2"> <input type="submit" value="auto" name="btn"></td>
</tr>
</table>


</form>
</body>
</html>