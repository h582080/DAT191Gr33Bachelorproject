CREATE TABLE external
 (
   externalId SERIAL,
   name varchar (100) NOT NULL,
   companyName varchar (100) NOT NULL,
   phoneNr int NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY (externalId)
);

CREATE TABLE internal
(
   internalId SERIAL,
   name varchar(100) NOT NULL,
   phoneNr int NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY (internalId)
   
);

CREATE TABLE student
(
   studentId SERIAL,
   name varchar(100) NOT NULL,
   phoneNr int NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY (studentId)
   
);

CREATE TABLE client
(
   clientId SERIAL,
   name varchar (30) NOT NULL,
   companyName varchar (30),
   phoneNr int NOT NULL,
   email varchar (30) NOT NULL,
   maxNumberOfProjectsSemester int NOT NULL,
   clientType varchar (10) NOT NULL,
   PRIMARY KEY (clientId)
);

CREATE TABLE users
(
  userId SERIAL,
  username varchar (20) NOT NULL,
  role varchar(20) NOT NULL,
  name varchar(100) NOT NULL,
  phoneNr int NOT NULL,
  email varchar (100) NOT NULL,
  PRIMARY KEY (userId)
 
);

CREATE TABLE projectdescription
(
  projectId SERIAL,
  projectTitel varchar(100) NOT NULL,
  companyInfo(300) varchar NOT NULL,
  projectDescription(2000) varchar NOT NULL,
  tools(300) varchar NOT NULL,
  language(300) varchar NOT NULL,
  programminglanguage(300) varchar NOT NULL,
  projectType(200) varchar NOT NULL,
  theme varchar(300) NOT NULL,
  webAddress varchar(100) NOT NULL,
  contactPerson varchar (100) NOT NULL,
  status varchar (20),
  semester varchar (100),
  dateOfApproval varchar (30),
  PRIMARY KEY (projectId)  
);

CREATE TABLE projectcollection
(
   collectionId SERIAL,
   template int NOT NULL,
   collectionTitle varchar (100) NOT NULL,
   semester varchar (100) NOT NULL,
   PRIMARY KEY (collectionId)
   
);

CREATE table subjectmanager
(
   subjectmanagerId int NOT NULL,
   name varchar (100) NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY (subjectmanagerId)   
);

