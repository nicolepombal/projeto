-- Active: 1717605886232@@mysql-f5d0f87-greenflow-2024.b.aivencloud.com@19659@defaultdb

CREATE TABLE tb_usuario_psc_energiaazul(
  cod_usuario SERIAL PRIMARY KEY,
  login VARCHAR(200) NOT NULL,
  senha VARCHAR(200) NOT NULL,
  tipo INT,
  nome  VARCHAR(200) NOT NULL,
  email VARCHAR(200) NOT NULL,
  cpf VARCHAR(11) NOT NULL,
  sexo char(1) NOT NULL,
  idade VARCHAR(2) NOT NULL
  );

  DROP TABLE tb_usuario_psc_energiaazul;
--cadastrar um usuário
INSERT INTO tb_usuario_psc_energiaazul
(login, senha, tipo, nome, email, cpf, sexo, idade) VALUES
('admin', 'admin', 1, 'administrador', 'adimi@gmail.com', '12345678901', 'M', '18'),
('comum', 'comum', 2, 'usuario', 'usuario@gmail.com', '09876543210', 'F', '19');


SELECT  *
FROM tb_usuario_psc_energiaazul;

CREATE TABLE tb_evento_psc_energiaazul(
  cod_evento SERIAL PRIMARY KEY,
  nome_evento VARCHAR(200) NOT NULL,
  descricao VARCHAR(1000) NOT NULL,
  data DATE
  
);
DROP TABLE tb_evento_energiaazul


INSERT INTO  tb_evento_psc_energiaazul
  (nome_evento, descricao, data)
  VALUES
(
  'TomarBanho',
  'Tempo ao tomar banho',
  CURRENT_TIMESTAMP,
  CURRENT_TIMESTAMP
),
(
  'LavarLouça',
  'Tempo ao lavar à louça',
  CURRENT_TIMESTAMP,
  CURRENT_TIMESTAMP
),
(
  'EscovarDentes',
  'Tempo ao escovar os dentes'
  CURRENT_TIMESTAMP,
  CURRENT_TIMESTAMP
);

SELECT * FROM tb_evento_psc_energiaazul