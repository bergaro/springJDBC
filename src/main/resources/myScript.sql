SELECT O.* FROM Orders AS O
INNER JOIN Customers AS C ON C.id = O.customer_id
WHERE LOWER(C.name) = LOWER(:name);