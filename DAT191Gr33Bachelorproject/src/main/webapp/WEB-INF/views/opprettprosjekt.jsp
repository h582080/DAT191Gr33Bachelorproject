<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="with=device-width, initial-scale=1.0", charset=UTF-8>
	<title>Opprett prosjekt</title>
	<link rel="stylesheet" href="opprettprosjekt.css">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;600;700&display=swap" rel="stylesheet">
	<style><%@include file="/WEB-INF/css/opprettprosjekt.css"%></style>
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
					<li id="prosjekt"><a href="opprettprosjekt">STEG 1: PROSJEKTET</a></li>
					<li><a href="opprettoppdragsgiver">STEG 2: OPPDRAGSGIVER</a></li>
					<li><a href="pdf">STEG 3: FORHÅNDSVISNING</a></li>
				</ul>
			</div>
		</nav>
			 
			 
		</div>
			 
	</section>
			 
	<section class="resten">
			<form:form action="opprettprosjekt" method="post" modelAttribute="projectdescription">
			 <div id="checkboxes">
			 <h1>1. Informasjon om prosjektet</h1>			 
			 <div class="del1">
			 
			 <form:label path="projectTitel"> Prosjekt tittel: </form:label> 
			 <div id="space">					
					<form:input path="projectTitel" type="text" name="projectTitel" placeholder="Prosjekt tittel" size="15" /> 
			 </div> 
			 
             <form:label path="companyInfo"> Informasjon om bedriften: </form:label> 
			 <div id="space">					
					<form:input path="companyInfo" type="text" name="companyInfo" placeholder="Bedrift informasjon" size="15"/> 
			 </div>
			 
			 <form:label path="projectDescription"> Beskrivelsen av prosjektet: </form:label> 
			 <div id="space">					
					<form:input path="projectDescription" type="text" name="projectDescription" placeholder="Prosjekt beskrivelse" size="15"/> 
			 </div>
			 
			 <form:label path="tools"> Redskap som må/kan bli brukt i prosjektet: </form:label> 
			 <div id="space">					
					<form:input path="tools" type="text" name="tools" placeholder="Redskap" size="15"/> 
			 </div>
			 
			 <form:label path="language"> Hvilket språk som må/kan bli brukt: </form:label> 
			 <div id="space">					
					<form:input path="language" type="text" name="language" placeholder="Språk" size="15"/> 
			 </div>
			 
			 <form:label path="programmingLanguage"> Programmeringsspråk som må/kan bli brukt i prosjektet: </form:label> 
			 <div id="space">					
					<form:input path="programmingLanguage" type="text" name="programmingLanguage" placeholder="Programemringsspråk" size="15"/> 
			 </div>
			 
			  <form:label path="projectType"> Prosjekt type: </form:label>
			  <div id="space">
                    <form:radiobutton path="projectType" value="Ekstern"/> Ekstern
                    <form:radiobutton path="projectType" value="Intern"/> Intern
                    <form:radiobutton path="projectType" value="Student"/> Student </br>
              </div>
              
              <form:label path="theme"> Prosjekt tema </form:label> 
			  <div id="space">					
					<form:input path="theme" type="text" name="theme" placeholder="Prosjekt tema" size="15"/> 
			  </div>
			  
			  <form:label path="webAddress"> Web addresse til bedriften/mere informasjon om prosjektet: </form:label> 
			  <div id="space">					
					<form:input path="webAddress" type="text" name="webAddress" placeholder="Webaddresse" size="15"/> 
			  </div>
			  
			  <form:label path="contactPerson"> Kontakt person: </form:label> 
			  <div id="space">					
					<form:input path="contactPerson" type="text" name="contactPerson" placeholder="Kontakt person" size="15"/> 
			  </div>	
			  <div>
				<form:button id="button">Neste side</form:button>			 
			  </div>
			  </form:form>	
			  </section>	
 				
		
</body>

</html>