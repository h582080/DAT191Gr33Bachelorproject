CREATE TABLE external
 (
   externalId int (20) NOT NULL
   name varchar(100) NOT NULL,
   companyNavn varchar(100) NOT NULL,
   phoneNr int (30) NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY (externalId)
);

CREATE TABLE internal
(
   internalId int (20) NOT NULL
   name varchar(100) NOT NULL,
   phoneNr int (30) NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY (internalId)
   
);

CREATE TABLE student
(
   studentId int (20) NOT NULL
   name varchar(100) NOT NULL,
   phoneNr int (30) NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY (studentId)
   
);

CREATE TABLE client
(
   maxNumberOfProjectsSemester int (1) NOT NULL,
   clientType varchar (10) NOT NULL
 
);

CREATE TABLE user
(
  userId int (20) NOT NULL,
  username varchar (20) NOT NULL,
  role varchar(20) NOT NULL,
  name varchar(100) NOT NULL,
  phoneNr int (20) NOT NULL,
  email varchar (100) NOT NULL,
  PRIMARY KEY (userId)
 
);

CREATE TABLE projectdescription
(
  projectId int (20) NOT NULL,
  projectTitel varchar(100) NOT NULL,
  companyInfo varchar () NOT NULL,
  projectDescription varchar () NOT NULL,
  tools varchar () NOT NULL,
  language varchar () NOT NULL,
  programminglanguage varchar () NOT NULL,
  projectType varchar () NOT NULL,
  webAddress varchar () NOT NULL
  contactPerson varchar (100) NOT NULL,
  status varchar (20) NOT NULL,
  semester varchar (100) NOT NULL,
  dateOfApproval DATE NOT NULL,
  PRIMARY KEY (projectId)
  
);

CREATE TABLE projectcollection
(
   collectionId int (20) NOT NULL,
   template int (2) NOT NULL,
   collectionTitel varchar (100) NOT NULL,
   semester varchar (100) NOT NULL,
   PRIMARY KEY (collectionId)
   
);

CREATE table subjectmanager
(
   subjectmanagerId int (20) NOT NULL,
   name varchar (100) NOT NULL,
   email varchar(100) NOT NULL,
   PRIMARY KEY ()subjectmanagerId)   
);

