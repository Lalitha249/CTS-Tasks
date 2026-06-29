CREATE TABLE customers(customer_id NUMBER,age NUMBER,balance NUMBER,
isVIP VARCHAR2(5));
INSERT INTO customers VALUES(101,65,20000,'TRUE');
INSERT INTO customers VALUES(102,40,5000,'FALSE');
INSERT INTO customers VALUES(103,70,15000,'TRUE');

BEGIN
  FOR customer IN (
     SELECT customer_id, age
     FROM customers
  )
  LOOP
     IF customer.age > 60 THEN
        DBMS_OUTPUT.PUT_LINE(customer.customer_id);
     END IF;
  END LOOP;
END;
/
