<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="with=device-width, initial-scale=1.0", charset=UTF-8>
	<title>ForhÃ¥ndsvisning</title>
	<link rel="stylesheet" href="pdf.css">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;600;700&display=swap" rel="stylesheet">
	<style><%@include file="/WEB-INF/css/pdf.css"%></style>
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
					<li><a href="opprettoppdragsgiver">STEG 1: OPPDRAGSGIVER</a></li>
					<li><a href="opprettprosjekt">STEG 2: PROSJEKTFORSLAG</a></li>
					<li id="prosjekt"><a href="pdf">STEG 3: FORHÅNDSVISNING</a></li>
				</ul>
			</div>
		</nav>
			 
		</div> 
		
		</section>
		
		
		<section class="resten">
		<div id="checkboxes">
			 <h1>3. Forhåndsvisning</h1>
  		</div>
  			
		<div id="preview"><embed src="files/prosjektbes.pdf" width="800px" height="600px"/></div>
		
		<a href="fullfort"><div id="button">Opprett prosjektforslag</div></a>
		
		</section>
	

</body>

</html>