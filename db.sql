CREATE DATABASE api2semestre;

CREATE USER 'api2semestre'@'localhost' IDENTIFIED BY 'api2semestre';

GRANT ALL PRIVILEGES ON api2semestre.* TO 'api2semestre'@'localhost' WITH GRANT OPTION;

FLUSH PRIVILEGES;

USE api2semestre;

CREATE TABLE login_usuarios (
    matricula INT,
    nome VARCHAR(191),
    senha VARCHAR(191),
    categoria VARCHAR(191),
    PRIMARY KEY (matricula)
);

CREATE TABLE apontamentos(
    idapontamentos INT AUTO_INCREMENT,
    categoria VARCHAR(191),
    data_hora_inicio VARCHAR(191),
    data_hora_fim VARCHAR(191),
    justificativa TEXT,
    cliente VARCHAR(191),
    projeto VARCHAR(191),
    solicitante VARCHAR(191),
    cr VARCHAR(191),
    id_usuario INT,
    avaliador_matricula INT,
    avaliacao_status VARCHAR(191) DEFAULT 'PENDENTE',
    avaliacao_justificativa TEXT,
    PRIMARY KEY (idapontamentos),
    FOREIGN KEY (id_usuario) REFERENCES login_usuarios(matricula),
    FOREIGN KEY (avaliador_matricula) REFERENCES login_usuarios(matricula)
);

CREATE TABLE centroresultado(
    codigoCR VARCHAR(191),
    nomeCR VARCHAR(191),
    siglaCR VARCHAR(191),
    PRIMARY KEY (codigoCR)
);

CREATE TABLE cliente(
    cnpj VARCHAR(191),
    razao_social VARCHAR(191),
    PRIMARY KEY (cnpj)
);

insert into login_usuarios values (123, 'Super Administrador', '123', 'administrador');