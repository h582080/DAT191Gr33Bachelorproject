<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>HVL Prosjektchat</title>
   <link rel="stylesheet" href="chat.css">
   <meta name="viewport" content="with=device-width, initial-scale=1.0" charset="UTF-8">
   <style><%@include file="/WEB-INF/css/chat.css"%></style>
   
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
		
			 
			 
	</section>


    <div class="chat-container" id="chatContainer">
        <div class="message">Velkommen til chat! Skriv inn meldingen din og trykk "Send" for å sende melding.</div>
    </div>

    <div class="user-input">
        <input type="text" placeholder="Skriv din melding" id="messageInput">
        <button onclick="sendMessage()">Send</button>
    </div>

    <script>
        function sendMessage() {
            var messageInput = document.getElementById('messageInput');
            var message = messageInput.value;

            if (message.trim() !== '') {
                var chatContainer = document.getElementById('chatContainer');
                var newMessage = document.createElement('div');
                newMessage.className = 'message';
                newMessage.textContent = message;

                chatContainer.appendChild(newMessage);

                messageInput.value = '';
                messageInput.focus();
            }
        }
    </script>
</body>
</html>




