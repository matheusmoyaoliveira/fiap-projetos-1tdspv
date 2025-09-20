CREATE TABLE T_SAK_DEPTO (
    cd_depto   NUMBER(4) PRIMARY KEY,
    nm_depto   VARCHAR2(60),
    sg_depto   CHAR(3)
);

CREATE TABLE T_SAK_FUNCIONARIO (
    cd_func        NUMBER(5) PRIMARY KEY,
    cd_depto       NUMBER(4),
    nm_funcionario VARCHAR2(60),
    vl_salario     NUMBER(10,2),
    dt_admissao    DATE,
    CONSTRAINT FK_SAK_FUNC_DEPTO FOREIGN KEY (cd_depto)
        REFERENCES T_SAK_DEPTO(cd_depto)
);

-- Exercicio 1
CREATE SEQUENCE SQ_SAK_DEPTO
START WITH 1
INCREMENT BY 1;

-- Exercicio 2
INSERT INTO T_SAK_DEPTO (cd_depto, nm_depto, sg_depto)
VALUES (SQ_SAK_DEPTO.NEXTVAL, 'Marketing Digital', 'MD');

-- Exercicio 3
CREATE SEQUENCE SQ_SAK_FUNC START WITH 1 INCREMENT BY 1;

-- Exercicio 4

INSERT INTO T_SAK_FUNCIONARIO (cd_func, cd_depto, nm_funcionario, vl_salario, dt_admissao)
VALUES (SQ_SAK_FUNC.NEXTVAL, SQ_SAK_DEPTO.CURRVAL, 'Ana Pereira', 5500, SYSDATE);

INSERT INTO T_SAK_FUNCIONARIO (cd_func, cd_depto, nm_funcionario, vl_salario, dt_admissao)
VALUES (SQ_SAK_FUNC.NEXTVAL, SQ_SAK_DEPTO.CURRVAL, 'Lucas Andrade', 6000, SYSDATE);

INSERT INTO T_SAK_FUNCIONARIO (cd_func, cd_depto, nm_funcionario, vl_salario, dt_admissao)
VALUES (SQ_SAK_FUNC.NEXTVAL, SQ_SAK_DEPTO.CURRVAL, 'Beatriz Oliveira', 4800, SYSDATE);

COMMIT;

-- Exercicio 5

SELECT SQ_SAK_FUNC.NEXTVAL FROM dual;

SELECT SQ_SAK_FUNC.CURRVAL FROM dual;

