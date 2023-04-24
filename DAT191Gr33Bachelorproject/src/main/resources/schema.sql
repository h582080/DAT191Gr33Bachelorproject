CREATE TABLE external
 (
   externalId int NOT NULL,
   name varchar (100) NOT NULL,
   companyName varchar (100) NOT NULL,
   phoneNr int NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY (externalId)
);

CREATE TABLE internal
(
   internalId int NOT NULL,
   name varchar(100) NOT NULL,
   phoneNr int NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY (internalId)
   
);

CREATE TABLE student
(
   studentId int NOT NULL,
   name varchar(100) NOT NULL,
   phoneNr int NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY (studentId)
   
);

CREATE TABLE client
(
   clientId int NOT NULL,
   maxNumberOfProjectsSemester int NOT NULL,
   clientType varchar (10) NOT NULL,
   PRIMARY KEY (clientId)
 
);

CREATE TABLE users
(
  userId int NOT NULL,
  username varchar (20) NOT NULL,
  role varchar(20) NOT NULL,
  name varchar(100) NOT NULL,
  phoneNr int NOT NULL,
  email varchar (100) NOT NULL,
  PRIMARY KEY (userId)
 
);

CREATE TABLE projectdescription
(
  projectId int NOT NULL,
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
  dateOfApproval DATE NOT NULL,
  PRIMARY KEY (projectId)
  
);

CREATE TABLE projectcollection
(
   collectionId int NOT NULL,
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

