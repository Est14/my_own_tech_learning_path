DELETE FROM authors WHERE author_id = 100 LIMIT 1;   -- Con esto eliminamos un author 


UPDATE clients
SET active = 0
WHERE client_id = 80

UPDATE clients
SET active = 0
WHERE client_id IN (80, 1, 45, 26) -- Esto si queremos cambiar varios al tiempo
LIMIT 4;   -- Siempre poner un limit 

TRUNCATE clients -- Borra el contenido de la tabla clients

UPDATE authors 
SET nationality = 'GBR' 
WHERE nationality = 'ENG';