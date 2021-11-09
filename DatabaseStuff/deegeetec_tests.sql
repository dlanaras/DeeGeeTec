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
INSERT INTO address_tbl (PLZ, Street, Streetnumber, Country, Place) VALUES ('815423', 'Garten', '35b', 'Switzerland','Oberglatt');

INSERT INTO account_tbl (Lastname, Firstname, Username, Email, Password, address_IDFK) VALUES ('Oppliger', 'Sven', 'dekrasse123','test@gmail.com','cool', 1);
INSERT INTO account_tbl (Lastname, Firstname, Username, Email, Password, address_IDFK) VALUES ('Oppliger2', 'Sven2', 'dekrasse1234','test@gmail.com1','cool', 1);
INSERT INTO account_tbl (Lastname, Firstname, Username, Email, Password, address_IDFK) VALUES ('Oppliger3', 'Sven3', 'dekrasse12345','test@gmail.com2','cool', 1);
INSERT INTO employeeaccount_tbl (employeenumber, account_IDFK) VALUES ('45678', 1);
INSERT INTO employeeaccount_tbl (employeenumber, account_IDFK) VALUES ('4567348', 2);
INSERT INTO chef_tbl (employee_ID, chef_ID) VALUES (1, 2);
INSERT INTO customeraccount_tbl (VIP, account_IDFK) VALUES (1, 3);
INSERT INTO items_tbl (itemname, price) VALUES ('Klopapier', 14.35);
INSERT INTO items_tbl (itemname, price) VALUES ('Handtücher', 2.35);
INSERT INTO wishlist_tbl (account_IDFK) VALUES (2);
INSERT INTO itemsperwishlist_tbl (items_IDFK, wishlist_IDFK) VALUES (1, 1);
INSERT INTO order_tbl (orderdate, cancelled, account_IDFK) VALUES ('2021-11-08', 0, 2);
INSERT INTO order_tbl (orderdate, cancelled, account_IDFK) VALUES ('2021-11-09', 1, 3);
INSERT INTO shipmentdetails_tbl (order_IDFK, address_IDFK) VALUES (1, 1);
INSERT INTO orderdetails_tbl (items_IDFK, order_IDFK, amount) VALUES (1, 1, 3);


/* Here start the testcases */

/* positive tests (Expected NO SQL Exception) */
/* Tests if the Account Information is updateable */
CALL testcase_expected_nosqlexception('UPDATE account_tbl SET Lastname = "Lanaras", Firstname = "Dimitrios", Username = "HolyPotato", Email = "funny", Password = "LeCool" WHERE account_ID = 1','Updating Account Information');

/* Tests if the Address of the account is updateable */
CALL testcase_expected_nosqlexception('UPDATE account_tbl SET address_IDFK = 2 WHERE account_ID = 2','Updating Account Address FK Information');

/* Tests if the Address is updateable */
CALL testcase_expected_nosqlexception('UPDATE address_tbl SET PLZ = "321", Street = "godstreet 1", Streetnumber = "23a", Country = "Germany", Place = "Berlin" WHERE address_ID = 2','Updating Address Information');

/* Tests if the Employeeaccount is updateable */
CALL testcase_expected_nosqlexception('UPDATE employeeaccount_tbl SET account_IDFK = 3, employeenumber = "3e45k" WHERE mitarbeiteraccount_ID = 1','Updating Employee account Information');

/* Tests if the wishlist items can be updated */
CALL testcase_expected_nosqlexception('UPDATE itemsperwishlist_tbl SET items_IDFK = 2 WHERE wishlist_IDFK = 1','Update Item in wishlist');

/* Tests if we can add new items to the wishlist */
CALL testcase_expected_nosqlexception('INSERT INTO itemsperwishlist_tbl (wishlist_IDFK, items_IDFK) VALUES (1, 1)','Add Item to wishlist');

/* Tests if we can add new items to the order */
CALL testcase_expected_nosqlexception('INSERT INTO orderdetails_tbl (items_IDFK, order_IDFK, amount) VALUES (2, 1, 4)','Add item to order');

/* Tests if we can delete a chef */
CALL testcase_expected_nosqlexception('DELETE FROM chef_tbl','Delete chef of employee');

/* Tests if we can cancel a order */
CALL testcase_expected_nosqlexception('UPDATE order_tbl SET cancelled = 1 WHERE order_ID = 1','Cancel a order');

/* negative tests (Expected a SQL Exception) */
/* Tests if a customeraccount can be deleted */
CALL testcase_expected_sqlexception('DELETE customeraccount_tbl WHERE account_IDFK = 3','Delete customeraccount');

/* Tests if a employeeaccount can be deleted */
CALL testcase_expected_sqlexception('DELETE employeeaccount_tbl WHERE account_IDFK = 2','Delete employeeaccount');

/* Tests if a order can be deleted */
CALL testcase_expected_sqlexception('DELETE order_tbl WHERE account_IDFK = 2','Delete order');

/* Tests if a wishlist can be deleted */
CALL testcase_expected_sqlexception('DELETE wishlist_tbl WHERE wishlist_ID = 1','Delete wishlist');

/* expected rows tests */

/* View cancelled orders should be 2 as we created a cancelled order and made one cancelled */
CALL testcase_expected_nrows('SELECT * from cancelledorders_v',2,'select rows from cancelled orders view');

/* View active orders should be 0 as we dont have any active orders in this state */
CALL testcase_expected_nrows('SELECT * from activeorders_v',0,'select rows from active orders');

/* here we cleanup the db*/
Delete FROM orderdetails_tbl;
Delete FROM shipmentdetails_tbl;
Delete FROM chef_tbl;
Delete FROM employeeaccount_tbl;
Delete FROM customeraccount_tbl;
Delete FROM order_tbl;
Delete FROM itemsperwishlist_tbl;
Delete FROM wishlist_tbl;
Delete FROM account_tbl;
Delete FROM address_tbl;
Delete FROM items_tbl;







/*  and drop the stored procedures testcase_....*/
drop procedure testcase_expected_sqlexception ;
drop procedure testcase_expected_nosqlexception ;
drop procedure testcase_expected_nrows ;

