------------------------------------------------------
-- CRIAÇÃO DAS TABELAS
------------------------------------------------------

CREATE TABLE T_SAK_ESTADO (
    cd_estado    NUMBER(2) PRIMARY KEY,
    nm_estado    VARCHAR2(20),
    sg_estado    CHAR(2)
);

CREATE TABLE T_SAK_CIDADE (
    cd_cidade    NUMBER(3) PRIMARY KEY,
    cd_estado    NUMBER(2) NOT NULL,
    nm_cidade    VARCHAR2(50),
    CONSTRAINT FK_SAK_ESTADO_CIDADE FOREIGN KEY (cd_estado)
        REFERENCES T_SAK_ESTADO(cd_estado)
);

CREATE TABLE T_SAK_BAIRRO (
    cd_bairro    NUMBER(4) PRIMARY KEY,
    cd_cidade    NUMBER(3) NOT NULL,
    nm_bairro    VARCHAR2(50),
    CONSTRAINT FK_SAK_CIDADE_BAIRRO FOREIGN KEY (cd_cidade)
        REFERENCES T_SAK_CIDADE(cd_cidade)
);

CREATE TABLE T_SAK_ENDERECO (
    cd_end_correio   NUMBER PRIMARY KEY,
    cd_bairro        NUMBER(4) NOT NULL,
    nr_cep           NUMBER(10),
    ds_logradouro    VARCHAR2(100),
    CONSTRAINT FK_SAK_BAIRRO_ENDERECO FOREIGN KEY (cd_bairro)
        REFERENCES T_SAK_BAIRRO(cd_bairro)
);

CREATE TABLE T_SAK_DEPTO (
    cd_depto    NUMBER(4) PRIMARY KEY,
    nm_depto    VARCHAR2(60),
    sg_depto    CHAR(3)
);

CREATE TABLE T_SAK_FUNCIONARIO (
    cd_func         NUMBER(5) PRIMARY KEY,
    cd_depto        NUMBER(4) NOT NULL,
    nm_funcionario  VARCHAR2(60),
    dt_nascimento   DATE,
    ds_estado_civil VARCHAR2(20),
    vl_salario      NUMBER(10,2),
    dt_admissao     DATE,
    CONSTRAINT FK_SAK_DEPTO_FUNC FOREIGN KEY (cd_depto)
        REFERENCES T_SAK_DEPTO(cd_depto)
);

CREATE TABLE T_SAK_FUNCIONARIO_ENDERECO (
    cd_func         NUMBER(5),
    cd_end_correio  NUMBER,
    cd_tipo_endereco NUMBER(2),
    nr_endereco     NUMBER(6),
    ds_complemento  VARCHAR2(42),
    nr_logradouro   NUMBER(6),
    CONSTRAINT PK_SAK_FUNCIONARIO_END PRIMARY KEY (cd_func, cd_end_correio),
    CONSTRAINT FK_SAK_FUNC_END_FUNC FOREIGN KEY (cd_func)
        REFERENCES T_SAK_FUNCIONARIO(cd_func),
    CONSTRAINT FK_SAK_FUNC_END_END FOREIGN KEY (cd_end_correio)
        REFERENCES T_SAK_ENDERECO(cd_end_correio)
);

CREATE TABLE T_SAK_FUNCIONARIO_TELEFONE (
    cd_func     NUMBER(5),
    nr_telefone VARCHAR2(20),
    CONSTRAINT FK_SAK_FUNC_TEL FOREIGN KEY (cd_func)
        REFERENCES T_SAK_FUNCIONARIO(cd_func)
);

------------------------------------------------------
-- EXERCÍCIO 1 - POPULAR ENDEREÇOS
------------------------------------------------------

-- Estados
INSERT INTO T_SAK_ESTADO VALUES (1, 'São Paulo', 'SP');
INSERT INTO T_SAK_ESTADO VALUES (2, 'Rio de Janeiro', 'RJ');

-- Cidades
INSERT INTO T_SAK_CIDADE VALUES (1, 1, 'São Paulo');
INSERT INTO T_SAK_CIDADE VALUES (2, 2, 'Rio de Janeiro');

-- Bairros
INSERT INTO T_SAK_BAIRRO VALUES (1, 1, 'Bela Vista');
INSERT INTO T_SAK_BAIRRO VALUES (2, 2, 'Copacabana');

-- Endereços
INSERT INTO T_SAK_ENDERECO VALUES (1, 1, 01311000, 'Av. Paulista, 1000');
INSERT INTO T_SAK_ENDERECO VALUES (2, 2, 22070001, 'Av. Atlântica, 500');

------------------------------------------------------
-- EXERCÍCIO 2 - TENTAR EXCLUIR UM ENDEREÇO
------------------------------------------------------

DELETE FROM T_SAK_ENDERECO WHERE cd_end_correio = 2;

------------------------------------------------------
-- EXERCÍCIO 3 - CADASTRAR FUNCIONÁRIOS
------------------------------------------------------

-- Departamentos
INSERT INTO T_SAK_DEPTO VALUES (1, 'Tecnologia', 'TEC');
INSERT INTO T_SAK_DEPTO VALUES (2, 'Recursos Humanos', 'RH');

-- Funcionários
INSERT INTO T_SAK_FUNCIONARIO 
VALUES (1, 1, 'João Silva', TO_DATE('1990-05-10','YYYY-MM-DD'), 'Solteiro', 5000, TO_DATE('2020-01-01','YYYY-MM-DD'));

INSERT INTO T_SAK_FUNCIONARIO 
VALUES (2, 2, 'Maria Souza', TO_DATE('1985-03-15','YYYY-MM-DD'), 'Casada', 7000, TO_DATE('2019-02-01','YYYY-MM-DD'));

INSERT INTO T_SAK_FUNCIONARIO 
VALUES (3, 1, 'Carlos Lima', TO_DATE('1992-08-22','YYYY-MM-DD'), 'Solteiro', 4500, TO_DATE('2021-06-01','YYYY-MM-DD'));

-- Associando funcionários a endereços
INSERT INTO T_SAK_FUNCIONARIO_ENDERECO VALUES (1, 1, 1, 123, 'Apto 12', 1000);
INSERT INTO T_SAK_FUNCIONARIO_ENDERECO VALUES (2, 1, 1, 456, 'Casa', 500);
INSERT INTO T_SAK_FUNCIONARIO_ENDERECO VALUES (3, 1, 1, 789, 'Bloco B', 200);

------------------------------------------------------
-- EXERCÍCIO 4 - AUMENTO DE 47,23%
------------------------------------------------------

UPDATE T_SAK_FUNCIONARIO
SET vl_salario = vl_salario * 1.4723;

------------------------------------------------------
-- EXERCÍCIO 5 - DATA DE TÉRMINO DO PROJETO
-- (Criando a tabela projeto antes)
------------------------------------------------------

CREATE TABLE T_SAK_PROJETO (
    cd_projeto   NUMBER PRIMARY KEY,
    nm_projeto   VARCHAR2(100),
    dt_inicio    DATE,
    dt_termino   DATE
);

-- Inserindo um projeto
INSERT INTO T_SAK_PROJETO VALUES (1, 'Sistema de Vendas', SYSDATE, NULL);

-- Atualizando data de término
UPDATE T_SAK_PROJETO
SET dt_termino = SYSDATE
WHERE cd_projeto = 1;

------------------------------------------------------
-- EXERCÍCIO 6 - CRIAR FUNCIONÁRIO DE TESTE
------------------------------------------------------

INSERT INTO T_SAK_FUNCIONARIO 
VALUES (99, 1, 'TESTE DA APLICAÇÃO', TO_DATE('2000-01-01','YYYY-MM-DD'), 'Solteiro', 1000, SYSDATE);

------------------------------------------------------
-- EXERCÍCIO 7 - ATUALIZAR SALÁRIO DO TESTE
------------------------------------------------------

UPDATE T_SAK_FUNCIONARIO
SET vl_salario = (SELECT AVG(vl_salario) FROM T_SAK_FUNCIONARIO)
WHERE nm_funcionario = 'TESTE DA APLICAÇÃO';

------------------------------------------------------
-- EXERCÍCIO 8 - CRIAR TELEFONE
------------------------------------------------------

INSERT INTO T_SAK_FUNCIONARIO_TELEFONE VALUES (1, '11988887777');

------------------------------------------------------
-- EXERCÍCIO 9 - EXCLUIR TELEFONE
------------------------------------------------------

DELETE FROM T_SAK_FUNCIONARIO_TELEFONE
WHERE cd_func = 1 AND nr_telefone = '11988887777';
