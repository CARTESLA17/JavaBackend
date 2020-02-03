INSERT INTO TEST (description, creation_timestamp, modification_timestamp, version_number)
VALUES ('Test with data base H2.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO tipo_persona (id, descripcion,creation_timestamp, modification_timestamp, version_number)
VALUES (1,'Fisica', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO tipo_persona (id, descripcion,creation_timestamp, modification_timestamp, version_number)
VALUES (2,'Juridica', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO titular (tipo_Persona,nombre, apellido, dni, CUIT,creation_timestamp, modification_timestamp, version_number)
VALUES (1,'Pepito', 'Perez',2233,1234,CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO titular (tipo_Persona,razon_Social, year, CUIT,creation_timestamp, modification_timestamp, version_number)
VALUES (2,'Galletas tod', 1998,1235,CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO titular (tipo_Persona,razon_Social, year, CUIT,creation_timestamp, modification_timestamp, version_number)
VALUES (2,'Panecitos', 2004, 1111,CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO titular (tipo_Persona,razon_Social, year, CUIT,creation_timestamp, modification_timestamp, version_number)
VALUES (2,'Chocolates', 2007, 5544,CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO tipo_movimiento (id, descripcion, version_number,creation_timestamp, modification_timestamp)
VALUES (1,'DEBITO', 1,CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

INSERT INTO tipo_movimiento (id, descripcion, version_number,creation_timestamp, modification_timestamp)
VALUES (2,'CREDITO', 1,CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

INSERT INTO moneda(id,descripcion,creation_timestamp, modification_timestamp, version_number) 
VALUES (1,'PESOS',CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO moneda(id,descripcion,creation_timestamp, modification_timestamp, version_number)
VALUES (2,'DOLARES',CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO moneda(id,descripcion,creation_timestamp, modification_timestamp, version_number)
VALUES (3,'EUROS',CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO cuenta(moneda, saldo, titular, creation_timestamp, modification_timestamp, version_number)
VALUES (1, 10.00, 1,CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO cuenta(moneda, saldo, titular, creation_timestamp, modification_timestamp, version_number)
VALUES (2, 345.00, 2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

INSERT INTO cuenta(moneda, saldo, titular, creation_timestamp, modification_timestamp, version_number)
VALUES (3, 200.00, 4, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),1);

