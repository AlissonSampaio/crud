CREATE TABLE funcionario (
	codigoid BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	codigo VARCHAR(30) NOT NULL,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;