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

insert into login_usuarios values (123, 'Super Administrador', '123', 'administrador')

ALTER TABLE api2semestre.apontamentos ADD COLUMN avaliador_gestor int;
ALTER TABLE api2semestre.apontamentos ADD COLUMN avaliador_administrador int;
ALTER TABLE api2semestre.apontamentos DROP FOREIGN KEY apontamentos_ibfk_2;
ALTER TABLE api2semestre.apontamentos DROP COLUMN avaliador_matricula;

CREATE TABLE parametrizacao(
    verba INT,
    horas DECIMAL(5,4),
    porcentagem INT,
    descricao VARCHAR (191),
    PRIMARY KEY (verba)
);

insert into parametrizacao values (3016, 1, 30, 'SOBREAVISO - Horas apontadas em SobreAviso');
insert into parametrizacao values (1601, 1, 75, 'HORA EXTRA DIURNO - As duas primeiras extras trabalhadas são calculadas com 75% (06:00 - 22:00)');
insert into parametrizacao values (1602, 1, 100, 'HORA EXTRA DIURNO - As demais horas trabalhadas são calculadas com 100% (06:00 - 22:00)');
insert into parametrizacao values (3000, 1.1429, 75, 'HORA EXTRA NOTURNO - As duas primeiras extras em horario noturno trabalhadas são calculadas com 75% (22:00 - 06:00)');
insert into parametrizacao values (3001, 1.1429, 100, 'HORA EXTRA NOTURNO - As demais horas extras em horario noturno são calculadas com 100% (22:00 - 06:00)');
insert into parametrizacao values (1809, 1.1429, 30, 'ADICIONAL NOTURNO - Horas apontadas em Adicional noturno (22:00 - 06:00)');