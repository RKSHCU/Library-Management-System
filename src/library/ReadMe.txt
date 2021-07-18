 SMART LIBRARY SYSTEM
 ================================
        
 INSTRUCTIONS
 =============
        
1. Install Jre8.0.

2. Install Oracle 10g. Oracle database password must be "manager".

3. Set path of java runtime enviroment(jre).

4. Run batch file of database in Database Folder that exist inside Project Report Folder.

5. Run JAR File in SETUP & EXE Folder that exist inside Project Report Folder.

=============================================================================================
-- Coding For Oracle (10g) DBMS

* The UserName and Password of Oracle 10g must should be 'Admin' and 'abc12345':

To create a new user in Oracle Database follows these steps:

1. Create user Admin Identified By abc12345; 

2. Grant connect to Admin;

3. Grant resource to admin;

4. Grant DBA to admin;

5. Grant all Privileges to Admin;

6. Grant Unlimited Tablespace to Admin;

============================================================

* You must have to make these tables in Oracle Database:

1. Table For Login: 
create Table Login(Name varchar2(25) NOT NULL, UserName varchar2(15) PRIMARY KEY, Password varchar2(12) NOT NULL, Question number(2), Answer varchar2(15) NOT NULL);

2. Table For Book: 
create Table Book(ID number(6) PRIMARY KEY, Name varchar2(25) NOT NULL, Author varchar2(15) NOT NULL, Price float(15) NOT NULL);

3. Table For Student: 
create Table Student(Roll number(6), Name varchar2(25) NOT NULL, Course number(2), Mobile varchar2(10) NOT NULL, PRIMARY KEY(Roll,course));

4. Table For IssueBook: 
create Table IssueBook(BookID number(6), StudentRoll number(6), StudentCourse number(2), IssueDate date, Foreign key (BookID) references Book(ID), Foreign Key (StudentRoll,StudentCourse) references Student(Roll,Course));

5. Table For ReturnBook: 
create Table ReturnBook(BookID number(6), StudentRoll number(6), StudentCourse number(2), IssueDate varchar2(12), ReturnDate varchar2(12));

==============================================================================================================================================================================================================================















