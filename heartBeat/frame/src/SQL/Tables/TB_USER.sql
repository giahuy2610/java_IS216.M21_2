----Create table User
CREATE TABLE TB_USER
(
    USERID INTEGER PRIMARY KEY,
    FIRSTNAME NVARCHAR2(40) NOT NULL,
    LASTNAME NVARCHAR2(40) NOT NULL,
    GENDER INTEGER NOT NULL,
    PHONE CHAR(10) NOT NULL UNIQUE,
    DATEOFBIRTH DATE NOT NULL,
    EMAIL VARCHAR2(255) UNIQUE NOT NULL ,
    SCORE INTEGER NOT NULL,
    AVATAR VARCHAR2(255),
    CREATEDON DATE NOT NULL,
    PASSWORD VARCHAR2(255) NOT NULL,
    ROLEID INTEGER NOT NULL,
    ISDELETED INTEGER NOT NULL
);

--create sequence
CREATE SEQUENCE AUTO_INCREMENT_SEQUENCE_USER
START WITH 1
INCREMENT BY 1;

CREATE OR REPLACE TRIGGER TRIGGER_AUTOINCRE_TB_USER_USERID
BEFORE INSERT ON
TB_USER
REFERENCING NEW AS NEW
    FOR EACH ROW BEGIN SELECT
    AUTO_INCREMENT_SEQUENCE_USER.NEXTVAL INTO :NEW.USERID
    FROM DUAL;
END;

--FOREIGN KEY OF TABLE TB_USER
alter table TB_USER 
add constraint FK_USER_ROLE foreign key (RoleId)
references TB_ROLE(Roleid);
--INSERT DỮ LIỆU MẪU CHO BẢNG
INSERT INTO TB_USER (FIRSTNAME,LASTNAME,GENDER,PHONE,DATEOFBIRTH,EMAIL,SCORE,AVATAR,CREATEDON,PASSWORD,ROLEID,ISDELETED) VALUES  ('Nguyễn Văn', 'Nam', 1, '0375436543', TO_DATE('23/10/1998', 'dd/mm/yyyy'), 'nguyenvannam@gmail.com', 100, NULL, sysdate, '123456789', 2, 0);
INSERT INTO TB_USER (FIRSTNAME,LASTNAME,GENDER,PHONE,DATEOFBIRTH,EMAIL,SCORE,AVATAR,CREATEDON,PASSWORD,ROLEID,ISDELETED) VALUES  ('Vũ Văn ', 'Hướng', 1, '0586750123', TO_DATE('05/08/1996', 'dd/mm/yyyy'), 'vuvanhuong@gmail.com', 140, NULL, sysdate, '123455432', 1, 0);
INSERT INTO TB_USER (FIRSTNAME,LASTNAME,GENDER,PHONE,DATEOFBIRTH,EMAIL,SCORE,AVATAR,CREATEDON,PASSWORD,ROLEID,ISDELETED) VALUES  ('Phạm Thị ', 'Xuân', 2, '0786542104', TO_DATE('15/06/1992', 'dd/mm/yyyy'), 'phamthixuan@gmail.com', 120, NULL, sysdate, '11223344', 1, 0);
INSERT INTO TB_USER (FIRSTNAME,LASTNAME,GENDER,PHONE,DATEOFBIRTH,EMAIL,SCORE,AVATAR,CREATEDON,PASSWORD,ROLEID,ISDELETED) VALUES  ('Nguyễn Trần Minh', 'Tú', 2, '0395040233', TO_DATE('12/03/2000', 'dd/mm/yyyy'), 'nguyentranminhtu@gmail.com', 80, NULL, sysdate, '20202021', 1, 0);
INSERT INTO TB_USER (FIRSTNAME,LASTNAME,GENDER,PHONE,DATEOFBIRTH,EMAIL,SCORE,AVATAR,CREATEDON,PASSWORD,ROLEID,ISDELETED) VALUES  ('Dương Thị Thu', 'Trang', 2, '0776343252', TO_DATE('11/02/2002', 'dd/mm/yyyy'), 'dtthutrang@gmail.com', 200, NULL, sysdate, '20212022', 1, 0);
INSERT INTO TB_USER (FIRSTNAME,LASTNAME,GENDER,PHONE,DATEOFBIRTH,EMAIL,SCORE,AVATAR,CREATEDON,PASSWORD,ROLEID,ISDELETED) VALUES  ('Trần Vũ Nhật ', 'Anh', 1, '0375889789', TO_DATE('25/12/1999', 'dd/mm/yyyy'), 'tranvnhatanh@gmail.com', 180, NULL, sysdate, 'anh123456', 1, 0);
INSERT INTO TB_USER (FIRSTNAME,LASTNAME,GENDER,PHONE,DATEOFBIRTH,EMAIL,SCORE,AVATAR,CREATEDON,PASSWORD,ROLEID,ISDELETED) VALUES  ('Nguyễn Hoàng ', 'Anh', 1, '0345768253', TO_DATE('31/03/1995', 'dd/mm/yyyy'), 'nguyenhoanganh@gmail.com', 150, NULL, sysdate, 'hoanganh@', 1, 0);
INSERT INTO TB_USER (FIRSTNAME,LASTNAME,GENDER,PHONE,DATEOFBIRTH,EMAIL,SCORE,AVATAR,CREATEDON,PASSWORD,ROLEID,ISDELETED) VALUES  ('Trần Cẩm', 'Thu', 2, '0342392222', TO_DATE('09/09/1997', 'dd/mm/yyyy'), 'trancamthu@gmail.com', 95, NULL, sysdate, 'camthu123@', 2, 0);
INSERT INTO TB_USER (FIRSTNAME,LASTNAME,GENDER,PHONE,DATEOFBIRTH,EMAIL,SCORE,AVATAR,CREATEDON,PASSWORD,ROLEID,ISDELETED) VALUES  ('Trương Chí', 'Cương', 1, '0933545218', TO_DATE('19/02/2001', 'dd/mm/yyyy'), 'truongchicuong@gmail.com', 105, NULL, sysdate, 'chicuong2022@', 2, 0);
INSERT INTO TB_USER (FIRSTNAME,LASTNAME,GENDER,PHONE,DATEOFBIRTH,EMAIL,SCORE,AVATAR,CREATEDON,PASSWORD,ROLEID,ISDELETED) VALUES  ('Nguyễn Đức ', 'Đại', 1, '0847523389', TO_DATE('25/10/1992', 'dd/mm/yyyy'), 'nguyenducdai@gmail.com', 125, NULL, sysdate, '135792468', 1, 0);
commit;
--Trigger thiết lập các giá trị mặc định cho dữ liệu bảng TB_USER
CREATE OR REPLACE TRIGGER TRIGGER_DEFAULT_VALUE_USER BEFORE 
    INSERT ON tb_user
    REFERENCING
        NEW AS new
    FOR EACH ROW
BEGIN
    SELECT
        current_date
    INTO :new.createdon
    FROM
        dual;

    :new.score := 0;
    :new.avatar := NULL;
    :new.isdeleted := 0;
END;
/
--trigger ngày sinh
CREATE OR REPLACE TRIGGER trigger_birth BEFORE
    INSERT OR UPDATE ON tb_user
    REFERENCING
        NEW AS new
    FOR EACH ROW
BEGIN
    IF ( :new.dateofbirth >= :new.createdon ) THEN
        dbms_output.put_line('Loi, ngay sinh phai nho hon ngay tao tai khoan!');
        raise_application_error(-2000, 'Ngay sinh sai');
    END IF;
END;