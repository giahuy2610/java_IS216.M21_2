----Create table Role
CREATE TABLE TB_ROLE
(
    ROLEID INTEGER PRIMARY KEY,
    ROLENAME NVARCHAR2(255) NOT NULL
);
--Trigger tăng ROLEID tự động
CREATE SEQUENCE AUTO_INCREMENT_SEQUENCE_ROLE
START WITH 1
INCREMENT BY 1;

CREATE OR REPLACE TRIGGER TRIGGER_AUTOINCRE_TB_ROLE_ROLEID
BEFORE INSERT ON
TB_ROLE
REFERENCING NEW AS NEW
    FOR EACH ROW BEGIN SELECT
    AUTO_INCREMENT_SEQUENCE_ROLE.NEXTVAL INTO :NEW.ROLEID
    FROM DUAL;
END;
--insert dữ liệu cho bảng
INSERT INTO TB_ROLE (ROLENAME) VALUES ('Người dùng');
INSERT INTO TB_ROLE (ROLENAME) VALUES ('Quản trị viên');
commit;