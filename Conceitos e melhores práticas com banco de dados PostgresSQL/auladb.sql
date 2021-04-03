-- Criando uma ROLE.
CREATE ROLE professores NOCREATEDB NOCREATEROLE INHERIT NOLOGIN NOBYPASSRLS CONNECTION LIMIT 10;
-- Alterando e editando a ROLE professores.
ALTER ROLE professores PASSWORD '123';
-- Criando uma ROLE com permissão de login.
CREATE ROLE daniel LOGIN PASSWORD '123';
-- Excluindo a ROLE daniel.
DROP ROLE daniel;
-- Recriando a ROLE daniel com outras configurações.
CREATE ROLE daniel LOGIN PASSWORD '123' IN ROLE professores;
-- Agora professores irá fazer parte da ROLE daniel.
CREATE ROLE daniel LOGIN PASSWORD '123' ROLE professores;

-- Criando a tabela teste
CREATE TABLE teste (nome varchar);
-- Dando todos os previlégios na tabela 'teste' para a ROLE professores.
GRANT ALL ON TABLE teste TO professores;
-- Criando uma ROLE com permissão de login.
CREATE ROLE daniel LOGIN PASSWORD '123';
-- Daniel agora passa a fazer parte da ROLE professores e herda as permissões da mesma.
CREATE ROLE daniel INHERIT LOGIN PASSWORD '123' IN ROLE professores;

-- Revogando as permissões da ROLE daniel.
REVOKE professores FROM daniel;







