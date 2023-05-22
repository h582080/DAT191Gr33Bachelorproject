<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="with=device-width, initial-scale=1.0" charset="UTF-8">
	<title>Tidligere prosjekt</title>
	<link rel="stylesheet" href="tidligereprosjekt.css">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;600;700&display=swap" rel="stylesheet">
	<style><%@include file="/WEB-INF/css/tidligereProsjekt.css"%></style>
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
			<h1>Mine prosjektforslag</h1>
			  
			 <nav>
			<div class="naviger-reg">
				<ul>
					<li><a href="mineProsjekt">Mine pågående prosjektforslag</a></li>
					<li id="prosjekt"><a href="tidligereprosjekt">Mine tidligere prosjektforslag</a></li>
				
				</ul>
			</div>
		</nav>
			 
			 
	</section>
	
	<section class="resten">
		
		
		<div class="tabell">
		<table>
			 <thead>
			 	<tr>
			 				<th>Prosjekttittel</th>
			 				<th>Status</th>
			 				<th>Gjenopprett</th>
			 			</tr>
			 		
			 </thead>
			 <tbody>
			 			
			 			<tr>
			 				<td>Prosjekttittel 1</td>
			 				<td class="godkjent">Godkjent</td>
			 				<td><a href=""><img src="img/restore.png"></a>
			 				</td>
			 			</tr>
			 			<tr>
			 				<td>Prosjekttittel 2</td>
			 				<td class="godkjent">Godkjent</td>
			 				<td><a href=""><img src="img/restore.png"></a>
			 				</td>
			 			</tr>
			 			
			 			<tr>
			 				<td>Prosjekttittel 3</td>
			 				<td class="ikke">Ikke godkjent</td>
			 				<td><a href=""><img src="img/restore.png"></a>
			 				</td>
			 			</tr>
			 		
			 		</tbody>
		</table>
			 
		</div>
	
	
	</section>
	
	<section class="kontakt">
		<h1>Kontakt</h1>
		<p>Dersom det er ønskelig å få mer informasjon eller behøver svar på spørsmål blabla bla bla for å snjafjadjnJKDejndksal
		<br>olaSJlnlASKDJNekldøn hwdjaaekdjefnrbfkafnfbvjkel kontakt oss på tlf: 92773829</p>
	
	</section>

</body>