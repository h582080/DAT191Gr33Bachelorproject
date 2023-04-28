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
  companyInfo varchar NOT NULL,
  projectDescription varchar NOT NULL,
  tools varchar NOT NULL,
  language varchar NOT NULL,
  programminglanguage varchar NOT NULL,
  projectType varchar NOT NULL,
  webAddress varchar NOT NULL,
  contactPerson varchar (100) NOT NULL,
  status varchar (20) NOT NULL,
  semester varchar (100) NOT NULL,
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

