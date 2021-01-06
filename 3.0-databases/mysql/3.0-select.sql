SELECT `name` from clients;   -- Trae los nombres de los clientes
SELECT * from clients;  -- Al pasarle el wildcard * trae todo de la tabla clients
SELECT name, email, active from clients; -- Podemos pedir mas de un dato a la vez
SELECT name, email from clients limit 10; -- Nos trae solo 10 datos en cualquier orden
SELECT name, email from clients where gender = 'M' -- Con where ahora puedo poner condiciones especificas
SELECT * FROM clients  WHERE `name` like '%Mar%' -- like es una funcion de cercania es decir va a buscar algo que contenga 'Mar'


SELECT `name`, email, year(now()) - year(birthdate)
FROM clients
WHERE `name` like '%Mar%';           -- Un Query mas complejo

SELECT * FROM books WHERE author_id BETWEEN 1 AND 5;

SELECT b.book_id AS ID, b.title AS TITLE, a.author_id AS ID, a.name AS Author
FROM books AS b    -- Esta es la tabla pivot la data que este aqui es la que se trae.
INNER JOIN authors AS a
ON a.author_id = b.author_id
WHERE a.author_id BETWEEN 1 AND 5;

SELECT b.book_id AS ID, b.title AS TITLE, a.author_id AS ID, a.name AS Author
FROM books AS b    -- Esta es la tabla pivot la data que este aqui es la que se trae.
INNER JOIN authors AS a
ON b.author_id = a.author_id
WHERE a.author_id BETWEEN 1 AND 5;

ALTER TABLE books
ADD FOREIGN KEY (author_id) REFERENCES authors(author_id);

SELECT c.name AS Client, b.title Book, a.name AS Author, t.type
FROM transactions AS t
JOIN books AS b
ON b.book_id = t.book_id
JOIN clients AS c
ON c.client_id = t.client_id
JOIN authors AS a
ON b.author_id = a.author_id
WHERE c.gender = 'F'
AND t.type = 'sell';

SELECT c.name AS Client, b.title Book, a.name AS Author, t.type
FROM transactions AS t
JOIN books AS b
ON b.book_id = t.book_id
JOIN clients AS c
ON c.client_id = t.client_id
JOIN authors AS a
ON b.author_id = a.author_id
WHERE c.gender = 'F'
AND t.type IN ('sell', 'lend');

SELECT a.author_id, a.name,  a.nationality, b.title
FROM authors as a 
JOIN books as b 
ON b.author_id = a.author_id
WHERE a.author_id BETWEEN 1 AND 5
ORDER BY a.author_id desc;

SELECT a.author_id, a.name,  a.nationality, b.title
FROM authors as a 
LEFT JOIN books as b 
ON b.author_id = a.author_id
WHERE a.author_id BETWEEN 1 AND 5
ORDER BY a.author_id desc;

SELECT a.author_id, a.name,  a.nationality, COUNT(b.title)
FROM authors as a 
LEFT JOIN books as b 
ON b.author_id = a.author_id
WHERE a.author_id BETWEEN 1 AND 5
GROUP BY (a.author_id)
ORDER BY a.author_id asc;