-- Criação da tabela cliente
CREATE TABLE cliente (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    endereco VARCHAR(255),
    telefone VARCHAR(20),
    rg VARCHAR(20),
    email VARCHAR(255),
    cpf VARCHAR(20) UNIQUE
);

-- Criação da tabela vendedor
CREATE TABLE vendedor (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    endereco VARCHAR(255),
    rg VARCHAR(20),
    email VARCHAR(255),
    cpf VARCHAR(20) UNIQUE,
    conta VARCHAR(20),
    agencia VARCHAR(20),
    cc VARCHAR(20)
);

-- Inserção de dados na tabela cliente
INSERT INTO cliente (nome, endereco, telefone, rg, email, cpf) VALUES 
('João B Silva', 'Rua A, 123', '1234567890', '1234567', 'joao@example.com', '12345678901'),
('Franco T Welss', 'Rua B, 456', '9876543210', '9876543', 'franco@example.com', '98765432109'),
('Alice J Zeus', 'Rua C, 789', '5555555555', '5555555', 'alice@example.com', '55555555555');

-- Inserção de dados na tabela vendedor
INSERT INTO vendedor (nome, endereco, rg, email, cpf, conta, agencia, cc) VALUES
('Janice S Costa', 'Rua D, 789', '8888888', 'janice@example.com', '88888888888', '12345-6', '1234', '789012345'),
('Rildo K Neves', 'Rua E, 101', '7777777', 'rildo@example.com', '77777777777', '54321-6', '4321', '123456789');

-- Consulta para verificar os dados na tabela cliente
SELECT * FROM cliente;

-- Consulta para verificar os dados na tabela vendedor
SELECT * FROM vendedor;