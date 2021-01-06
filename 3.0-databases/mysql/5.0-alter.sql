ALTER TABLE  transactions 
MODIFY COLUMN  `type` enum(
'sell', 'lend', 'return') 
NOT NULL AFTER client_id; 

ALTER TABLE table_name
DROP COLUMN column_name;  -- Eliminar columna de una tabla.