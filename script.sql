-- Active: 1714081969022@@mysql-f5d0f87-greenflow-2024.b.aivencloud.com@19659@defaultdb

CREATE TABLE tb_usuario_psc_energiaazul(
  cod_usuario SERIAL PRIMARY KEY,
  login VARCHAR(200) NOT NULL,
  senha VARCHAR(200) NOT NULL
);
--cadastrar um usuário
INSERT INTO tb_usuario_psc_energiaazul
(login, senha) VALUES
('comum', 'comum');

SELECT  *
FROM tb_usuario_psc_energiaazul;

UPDATE tb_usuario_psc_energiaazul SET
login='Admin',senha='Admin'
WHERE cod_usuario = 1;

DELETE FROM tb_usuario_psc_energiaazul
WHERE cod_usuario = 2;

UPDATE tb_usuario_psc_energiaazul SET
senha='' WHERE cod_usuario = 1;