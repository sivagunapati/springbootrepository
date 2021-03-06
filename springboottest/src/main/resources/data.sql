insert into BUSINESS_PROBLEM (PROBLEMID, PROBLEMNAME, PROBLEMTYPE) values (1, 'WorkerSafety', 'XXX');
insert into BUSINESS_PROBLEM (PROBLEMID, PROBLEMNAME, PROBLEMTYPE) values (2, 'MachinesData', 'XXX');
insert into BUSINESS_PROBLEM (PROBLEMID, PROBLEMNAME, PROBLEMTYPE) values (3, 'Pepper', 'XXX');
insert into BUSINESS_PROBLEM (PROBLEMID, PROBLEMNAME, PROBLEMTYPE) values (4, 'Smartbin', 'XXX');
insert into CUSTOMER (CUSTID, CUSTOMERNAME, ACTIVE, EMAILADDRESS, MOBILENUMBER, PHONENUMBER, STATE, COUNTRY, LANGUAGE, PROBLEMID) values (1, 'FORD', 1, 'test1@ford.com', '9898989898', '9898989898', 'XYZ', 'US', 'ENGLISH', 1);
insert into CUSTOMER (CUSTID, CUSTOMERNAME, ACTIVE, EMAILADDRESS, MOBILENUMBER, PHONENUMBER, STATE, COUNTRY, LANGUAGE, PROBLEMID) values (2, 'COX', 1, 'test2@cox.com', '7878787878', '7878787878', 'ABC', 'UK', 'ENGLISH', 2);
insert into CUSTOMER (CUSTID, CUSTOMERNAME, ACTIVE, EMAILADDRESS, MOBILENUMBER, PHONENUMBER, STATE, COUNTRY, LANGUAGE, PROBLEMID) values (3, 'APPLE', 1, 'test3@apple.com', '6868686868', '6868686868', 'XYZ', 'US', 'ENGLISH', 3);
insert into CUSTOMER (CUSTID, CUSTOMERNAME, ACTIVE, EMAILADDRESS, MOBILENUMBER, PHONENUMBER, STATE, COUNTRY, LANGUAGE, PROBLEMID) values (4, 'SAMSUNG', 1, 'test3@apple.com', '6868686868', '6868686868', 'XYZ', 'US', 'ENGLISH', 4);
insert into CUSTOMER (CUSTID, CUSTOMERNAME, ACTIVE, EMAILADDRESS, MOBILENUMBER, PHONENUMBER, STATE, COUNTRY, LANGUAGE, PROBLEMID) values (5, 'RELIANCE', 1, 'test3@apple.com', '6868686868', '6868686868', 'XYZ', 'US', 'ENGLISH', 1);
insert into FEATURES (FEATUREID, FEATUREDESCRIPTION, FEATURETYPE) values (1, 'ML', 'ML');
insert into FEATURES (FEATUREID, FEATUREDESCRIPTION, FEATURETYPE) values (2, 'Storage','DB');
insert into FEATURES (FEATUREID, FEATUREDESCRIPTION, FEATURETYPE) values (3, 'UI', 'FE');
insert into FEATURES (FEATUREID, FEATUREDESCRIPTION, FEATURETYPE) values (4, 'APM', 'APP');
insert into FEATURES (FEATUREID, FEATUREDESCRIPTION, FEATURETYPE) values (5, 'Edge Apps', 'APP');
insert into FEATURES (FEATUREID, FEATUREDESCRIPTION, FEATURETYPE) values (6, 'Timeseries', 'DB');
insert into FEATURES (FEATUREID, FEATUREDESCRIPTION, FEATURETYPE) values (7, 'AI', 'ML');
insert into FEATURES (FEATUREID, FEATUREDESCRIPTION, FEATURETYPE) values (8, 'Microservices', 'APP');
insert into PROBLEM_FEATURE (FEATURE_ID, BUSINESSPROBLEM_ID) values (1, 1);
insert into PROBLEM_FEATURE (FEATURE_ID, BUSINESSPROBLEM_ID) values (2, 1);
insert into PROBLEM_FEATURE (FEATURE_ID, BUSINESSPROBLEM_ID) values (3, 1);
insert into PROBLEM_FEATURE (FEATURE_ID, BUSINESSPROBLEM_ID) values (4, 2);
insert into PROBLEM_FEATURE (FEATURE_ID, BUSINESSPROBLEM_ID) values (5, 2);
insert into PROBLEM_FEATURE (FEATURE_ID, BUSINESSPROBLEM_ID) values (6, 2);	
insert into PROBLEM_FEATURE (FEATURE_ID, BUSINESSPROBLEM_ID) values (7, 3);
insert into PROBLEM_FEATURE (FEATURE_ID, BUSINESSPROBLEM_ID) values (8, 4);
insert into AWS_CLOUD ("AWSFEATURE", "AWSFEATUREDESCRIPTION", "FEATURETYPE") values ('AWS-ML', 'XXX', 'ML');
insert into AWS_CLOUD ("AWSFEATURE", "AWSFEATUREDESCRIPTION", "FEATURETYPE") values ('AWS-STORE', 'XXX', 'DB');
insert into AWS_CLOUD ("AWSFEATURE", "AWSFEATUREDESCRIPTION", "FEATURETYPE") values ('AWS-UI', 'XXX', 'FE');		
insert into PREDIX_CLOUD ("PREDIXFEATURE", "PREDIXFEATUREDESCRIPTION", "FEATURETYPE") values ('PREDIX-ML', 'XXX', 'ML');
insert into PREDIX_CLOUD ("PREDIXFEATURE", "PREDIXFEATUREDESCRIPTION", "FEATURETYPE") values ('PREDIX-STORE', 'XXX', 'DB');
insert into PREDIX_CLOUD ("PREDIXFEATURE", "PREDIXFEATUREDESCRIPTION", "FEATURETYPE") values ('PREDIX-UI', 'XXX', 'FE');	
	
			
	