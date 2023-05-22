<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="with=device-width, initial-scale=1.0", charset=UTF-8>
	<title>Opprett oppdragsgiver</title>
	<link rel="stylesheet" href="opprettoppdragsgiver.css">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;600;700&display=swap" rel="stylesheet">
	<style><%@include file="/WEB-INF/css/opprettoppdragsgiver.css"%></style>
</head>
<body>
	<section class="header">
		<nav>
			<a href="front"><img src="https://www.hvl.no/globalassets/hvl-internett/bilde/logo/hvl_logo_neg.png"></a>
			<div class="nav-links">
				<ul>
					<li><a href="front">HJEM</a></li>
					<li><a href="minProfil">MIN PROFIL</a></li>
					<li><a href="mineprosjekt">MINE PROSJEKTFORSLAG</a></li>
				</ul>
			</div>
		</nav>
		
		<div class="text-box">
			<h1>Opprett ditt prosjektforslag</h1>
			 <nav>
			<div class="naviger-reg">
				<ul>
					<li id="prosjekt"><a href="opprettoppdragsgiver">STEG 1: OPPDRAGSGIVER</a></li>
					<li><a href="opprettprosjekt">STEG 2: PROSJEKTET</a></li>
					<li><a href="pdf">STEG 3: FORHÅNDSVISNING</a></li>
				</ul>
			</div>
		</nav>
			 
		</div> 
		
		</section>
		
		<section class="resten">
		<form:form action="opprettoppdragsgiver" method="post" modelAttribute="client">
		<div id="checkboxes">
		
			 <h1>2. Informasjon om oppdragsgiver</h1>
			 
			 <div class="del1">
	  			<form:label path="companyName"> Firmanavn/prosjekttilbyder: </form:label>  
	  			<div id="space"> 
					<form:input type="text" path="companyName" name="companyName" placeholder="Firmanavn/prosjekttilbyder" size="15"/> 
				</div>
				<form:label path="name"> Kontaktperson: </form:label> 
				<div id="space">	
				  
					<form:input type="text" path="name" placeholder="Kontaktperson" size="15"/>   
				</div>	
				
				<form:label path="phoneNr"> Tlfnr: </form:label> 
				<div id="space">
				
					<form:input type="text" path="phoneNr" placeholder="Tlfnr" size="15"/> 
				</div> 
				
				<%--
				<form:label path="lokasjon"> Geografisk lokasjon: </form:label> 
				<div id="space">			  
					<form:select path="lokasjon" items="${loclList}" />
				</div>
				--%>
	
			</div>
		
			
			<div class="del2">
				<label path="email"> Mailadresse: </label> 
				<div id="space">
				
					<form:input type="text" path="email" placeholder="Mailadresse" size="15"/> 
				</div> 
				
				<label> Kortfattet beskrivelse av firma/prosjekttilbyder: </label>  
				<div id="beskrivelse">  
					
					
					<textarea type="text" rows="10" cols="60" name="beskrivelse" placeholder="Beskrivelse"></textarea>
				</div>  
				 
				<label path="maxNumberOfProjectsSemester"> Max Projects Per Semester: </label> 
				<div id="space">
				
					<form:input type="text" path="maxNumberOfProjectsSemester" placeholder="Max Projects Per Semester" size="15"/> 
				</div>
				
				<label path="clientType"> Client type: </label> 
				<div id="space">
				
					<form:input type="text" path="clientType" placeholder="Client type" size="15"/> 
				</div>	
			</div>
			
		<div>
			<form:button id="button">Neste side</form:button>
		</div>
		
	</form:form>
	</section>
	

</body>

</html>