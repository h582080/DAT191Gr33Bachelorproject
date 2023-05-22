<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="with=device-width, initial-scale=1.0" charset="UTF-8">
	<title>Min profil</title>
	<link rel="stylesheet" href="minProfil.css">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;600;700&display=swap" rel="stylesheet">
	<style><%@include file="/WEB-INF/css/minProfil.css"%></style>
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
			<img src="img/pb.png" class="profile-pic">
			<h3>Ole Pettersen</h3>
			<p>Student ved HVL</p>
			
			<div class="card">
				<input type="text" name="" placeholder="OlePettersen99">
				<input type="text" name="" placeholder="OleP@gmail.com">
				<input type="text" name="" placeholder="72536281">
				<input type="text" name="" placeholder="*********">
			
				<div class=btn>
					<button>AVBRYT</button>
					<button>LAGRE ENDRINGER</button>
				</div>
			</div>
		</div>
	
	</section>
	
	<section class="kontakt">
		<h1>Kontakt</h1>
		<p>Dersom det er ønskelig å få mer informasjon eller behøver svar på spørsmål blabla bla bla for å snjafjadjnJKDejndksal
		<br>olaSJlnlASKDJNekl hwdjaaekdjefnrbfkafnfbvjkel kontakt oss på tlf: 92773829</p>
	
	</section>

</body>

</html>