/* Run this sql script using
mysql -sN ...... <thisfilename.sql
/* here wie create the storedprocedure testcase_...  They are usefull to make positiv or negativ testcases*/
delimiter //
create procedure testcase_expected_sqlexception (IN sqlstatement TEXT, IN testname varchar(50))
/* This testcase will pass if the sqlstatement fails with an sqlexception 
   Usage: call testcase_expected_sqlexception('select name,test,iii from testtable','select wrong column iii'); */
  BEGIN
     DECLARE CONTINUE HANDLER FOR SQLEXCEPTION SET @x2 = 'PASSED';
     set @x2:='FAILED';
     set @SQL:=sqlstatement;
     prepare stmt from @SQL;
     execute stmt;
     deallocate prepare stmt;
     select 'testcase_expected_sqlexception',testname, @x2 as result;
  END;
//
create procedure testcase_expected_nosqlexception (IN sqlstatement TEXT, IN testname varchar(50))
/* This testcase will pass if sqlstatement is executed without an sqlexception 
   Usage: call testcase_expected_nosqlexception('delete from testtable where name="xyz"','Delete record with name xyz'); */
  BEGIN
     DECLARE CONTINUE HANDLER FOR SQLEXCEPTION SET @x2 = 'FAILED';
     set @x2:='PASSED';
     set @SQL:=sqlstatement;
     prepare stmt from @SQL;
     execute stmt;
     deallocate prepare stmt;
     select 'testcase_expected_nosqlexception',testname, @x2 as result;
  END;
//
create procedure testcase_expected_nrows (IN sqlstatement TEXT, IN expected_rows int(10), IN testname varchar(50))
/* This testcase will pass if sqlstatement is selecting the count(*) into @rows and @rows is equal to expected_rows parameter 
   Usage: call testcase_expected_nrows('select count(*) into @rows where name="xyz"',1,'Expect 1 row with name xyz'); */
  BEGIN
     DECLARE CONTINUE HANDLER FOR SQLEXCEPTION SET @x2 = 'FAILED';
     set @x2:='PASSED';
     set @SQL:=sqlstatement;
     set @rows:=NULL;
     prepare stmt from @SQL;
     execute stmt;
     deallocate prepare stmt;
     if not @rows=expected_rows then
       set @x2:='FAILED';
     else
       set @x2:='PASSED';
     end if;
     select 'testcase_expected_nrows',testname, @x2 as result;
  END;
//
DELIMITER ;


/* Here we do the setup commands */
INSERT INTO address_tbl (PLZ, Street, Streetnumber, Country, Place) VALUES ('8154', 'Gartenstrasse', '35b', 'Switzerland','Oberglatt');
INSERT INTO customeraccount_tbl (Lastname, Firstname, Username, Password, address_FK) VALUES ('Oppliger', 'Sven', 'dekrasse123','cool', 1);

/* Here start the testcases */

/* positive tests */
/* negative tests */
/* expected rows tests */

/* here we cleanup the db*/


/*  and drop the stored procedures testcase_....*/
drop procedure testcase_expected_sqlexception ;
drop procedure testcase_expected_nosqlexception ;
drop procedure testcase_expected_nrows ;

