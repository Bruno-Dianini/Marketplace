CREATE TABLE funcionario( 

    numat BIGINT NOT NULL, 
    nome VARCHAR(255) NOT NULL, 
    salario DECIMAL,
    sexo CHAR,
    ndepto INTEGER,
    nsuper BIGINT,
    PRIMARY KEY (numat) 

); 


INSERT INTO funcionario VALUES (1234, 'João B Silva', 30000.0, 'M', 5, 3334); 
INSERT INTO funcionario VALUES (3334, 'Franco T Welss', 40000.0, 'M', 5, 8886);
INSERT INTO funcionario VALUES (9998, 'Alice J Zeus', 25000.0, 'F', 4, 9876);
INSERT INTO funcionario VALUES (9876, 'Janice S Costa', 43000.0, 'F', 4, 8886);
INSERT INTO funcionario VALUES (6668, 'Rildo K Neves', 38000.0, 'M', 5, 3334);
INSERT INTO funcionario VALUES (4534, 'Joice A Santos', 25000.0, 'F', 5, 3334);
INSERT INTO funcionario VALUES (9879, 'Amo B Jahvi', 25000.0, 'M', 4, 9876);
INSERT INTO funcionario VALUES (8886, 'Jaime E Boulos', 55000.0, 'M', 1, NULL);

SELECT * FROM funcionario;

SELECT * FROM funcionario WHERE (salario > 40000.00); 