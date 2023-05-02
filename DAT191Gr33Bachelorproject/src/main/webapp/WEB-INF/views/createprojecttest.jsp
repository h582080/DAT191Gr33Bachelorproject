<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test for project creation form</title>
</head>
<body>
 <h1>Skriv inn din prosjekt beskrivelse</h1>
   <form:form action="createprojecttest" method="post" modelAttribute="projectdescription">
            <form:label path="projectTitel"> Prosjekt tittel: </form:label>
            <form:input path="projectTitel"/> </br>
            
            <form:label path="companyInfo"> Bedrift informasjon: </form:label>
            <form:input path="companyInfo"/> </br>
            
            <form:label path="projectDescription"> Beskrivelse av prosjektet: </form:label>
            <form:input path="projectDescription"/> </br>
            
            <form:label path="tools"> Redskap som kan bli brukt: </form:label>
            <form:input path="tools"/> </br>
            
            <form:label path="language"> Språk som må/kan bli brukt: </form:label>
            <form:input path="language"/> </br>
            
            <form:label path="programminglanguage"> Programmeringsspråk som må/kan bli brukt: </form:label>
            <form:input path="programminglanguage"/> </br>
            
            <form:label path="projectType"> Prosjekt type: </form:label>
            <form:radiobutton path="projectType" value="Ekstern"/> Ekstern
            <form:radiobutton path="projectType" value="Intern"/> Intern
            <form:radiobutton path="projectType" value="Student"/> Student </br>
            
            <form:label path="theme"> Prosjekt tema</form:label>
            <form:input path="theme"/> </br>
            
            <form:label path="webAddress"> Webaddresse til prosjektet</form:label>
            <form:input path="webAddress"/> </br>
            
            <form:label path="contactPerson"> Kontakt person: </form:label>
            <form:input path="contactPerson"/> </br>
            
            <form:button>Send inn</form:button>
             
 </form:form>

</body>
</html>