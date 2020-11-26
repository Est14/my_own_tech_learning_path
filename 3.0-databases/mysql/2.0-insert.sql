INSERT INTO authors(`name`, nationality)
VALUES('Juan rulfo', 'MEX');

INSERT INTO authors(name, nationality)
VALUES('Gabriel García Marquez', 'COL');

INSERT INTO authors(name, nationality)
VALUES('Juan Gabriel Vasquez', 'COL');

Another way

INSERT INTO authors(name, nationality)
VALUES('Julio Cortazar', 'ARG'),
('Isable Allende', 'CHI'),
('Octavio Paz', 'MEX'),
('Juan Carlos Onetti', 'URU');

INSERT INTO users (name, email, birthdate, gender, active)
VALUES ('Adrian Fernandez','Adrian.55818851J@random.names','1970-04-09','M',1),
('Maria Luisa Marin','Maria Luisa.83726282A@random.names','1957-07-30','F',1);

Actualiza:
INSERT INTO users (name, email, birthdate, gender, active)
VALUES ('Adrian Fernandez','Adrian.55818851J@random.names','1970-04-09','M',0)
ON DUPLICATE KEY UPDATE active = VALUES(active);


INSERT INTO users (name, email, birthdate, gender, active, create_at)
VALUES ('Pedro Sanchez','Pedro.78522059J@random.names','1992-01-31','M',1,'2018-04-09 16:51:30'),
('Pablo Saavedra','Pablo.93733268B@random.names','1960-07-21','M',1,'2018-04-09 16:51:30'),
('Marta Carrillo','Marta.55741882W@random.names','1981-06-15','F',1,'2018-04-09 16:51:30');

INSERT INTO `books` (book_id, author_id, tile, `year`, `language`, cover_url, price, sellable, pcopies, `description`)
VALUES (1,1,'The Startup Playbook',2013,'en',NULL,10.00,1,5,'Advice from the experts'),
(2,1,'The Startup Playbook',2014,'es',NULL,10.00,1,5,'Consejo de los expertos, traducido por Platzi'),
(3,3,'Estudio en escarlata',1887,'es',NULL,5.00,1,10,'La primera novela de Sherlock Holmes'),
(4,6,'Wallander: Asesinos sin rostro',1991,'es',NULL,15.00,1,3,''),
(5,6,'Wallander: Los perros de Riga',1992,'es',NULL,15.00,1,3,''),
(6,6,'Wallander: La leona blanca',1993,'es',NULL,15.00,1,3,''),
(7,6,'Wallander: El hombre sonriente',1994,'es',NULL,15.00,1,3,''),
(8,6,'Wallander: La falsa pista',1995,'es',NULL,15.00,1,3,'');