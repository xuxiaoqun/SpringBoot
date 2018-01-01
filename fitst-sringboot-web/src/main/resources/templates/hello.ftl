<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>This is a hello world</title>
</head>
<body>
<p> We have these animals:
<table width="30%" border="1" cellspacing="0px" >
	<#if dataList??>
		<#list dataList as animal>
			<tr><td>${animal.name!}</td><td>${animal.price!}</td></tr>
		</#list>
	</#if>
</table> 
<br>
<#if fruits??>
<#list fruits>
	<p>We have these fruits:
	<ul>
		<#items as fruit>
			<#if fruit=="苹果"><#break></#if>
			
			<li>${fruit!}
		</#items>
	</ul>
	<#else>we have no fruits
</#list>
</#if>

<p>Fruits: ${fruits?join(", ", "None")}



</body>
</html>