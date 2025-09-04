CREATE TABLE T_RHSTU_MEDICO_CONTATO (
  cd_medico   NUMBER,
  id_contato  NUMBER(3),
  tp_contato  VARCHAR2(30),
  ds_contato  VARCHAR2(40),
  st_contato  VARCHAR2(1)
);

ALTER TABLE T_RHSTU_MEDICO_CONTATO
  MODIFY (cd_medico  NOT NULL,
          id_contato NOT NULL,
          tp_contato NOT NULL,
          ds_contato NOT NULL,
          st_contato NOT NULL);
          
ALTER TABLE T_RHSTU_MEDICO_CONTATO
  ADD CONSTRAINT PK_RHSTU_MEDICO_CONTATO
  PRIMARY KEY (cd_medico, id_contato);
  
ALTER TABLE T_RHSTU_MEDICO_CONTATO
  ADD CONSTRAINT CK_RHSTU_MC_TP
  CHECK (tp_contato IN ('Telefone Fixo',
                        'Telefone Celular',
                        'email',
                        'Telefone Contato'));
                        
ALTER TABLE T_RHSTU_MEDICO_CONTATO
  ADD CONSTRAINT CK_RHSTU_MC_ST
  CHECK (st_contato IN ('A','I'));
  
ALTER TABLE T_RHSTU_MEDICO_CONTATO
  ADD CONSTRAINT FK_RHSTU_MC_MED
  FOREIGN KEY (cd_medico)
  REFERENCES T_RHSTU_MEDICO (cd_medico);
  
ALTER TABLE T_RHSTU_MEDICO_CONTATO
  MODIFY (tp_contato VARCHAR2(50));
  
ALTER TABLE T_RHSTU_MEDICO_CONTATO
  ADD (dt_cadastro DATE);
  
UPDATE T_RHSTU_MEDICO_CONTATO
   SET dt_cadastro = COALESCE(dt_cadastro, SYSDATE);
COMMIT;
  
ALTER TABLE T_RHSTU_MEDICO_CONTATO
  MODIFY (dt_cadastro DATE NOT NULL);
  
ALTER TABLE T_RHSTU_MEDICO_CONTATO
  DROP COLUMN dt_cadastro;
  
INSERT INTO t_rhstu_medico (cd_medico, nm_medico, nr_crm, ds_especialidade)
VALUES (1, 'Dra. Ana Lima', 123456, 'Clínica Geral');

COMMIT;

INSERT INTO t_rhstu_medico_contato
  (cd_medico, id_contato, tp_contato, ds_contato, st_contato)
VALUES
  (1, 1, 'Telefone Celular', '(11) 98888-7777', 'A');

COMMIT;