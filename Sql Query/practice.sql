SELECT  orderNumber, orderLineNumber,
quantityOrdered * priceEach
FROM  orderdetails
ORDER BY quantityOrdered * priceEach 	DESC;

SELECT 
orderNumber, SUM(quantityOrdered * priceEach) AS total
FROM 
orderdetails
GROUP BY orderNumber;

select * from orderdetails where orderNumber=10101;

SELECT
month(orderDate) AS month3, COUNT(orderNumber) as counter
FROM
orders
WHERE year(orderDate)=2004
GROUP BY month3

SELECT
status, COUNT(*)
FROM
orders
GROUP BY status
HAVING STATUS IN ('Shipped' , 'Cancelled');
    
    
   
 SELECT 
    status, COUNT(*)
FROM
    orders
GROUP BY status
HAVING status IN ('Shipped' , 'Cancelled');
