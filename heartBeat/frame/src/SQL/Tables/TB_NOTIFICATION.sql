CREATE TABLE TB_NOTIFICATION
(
    NOTIID INTEGER PRIMARY KEY,
    USERID INTEGER NOT NULL,
    CONTENT NVARCHAR2(255) NOT NULL,
    CREATEDON DATE NOT NULL,
    ISSEEN INTEGER NOT NULL
);

CREATE SEQUENCE AUTO_INCREMENT_SEQUENCE_NOTIFICATION
START WITH 1
INCREMENT BY 1;

CREATE OR REPLACE TRIGGER TRIGGER_AUTOINCRE_TB_NOTIFICATION_NOTIID
BEFORE INSERT ON
TB_NOTIFICATION
REFERENCING NEW AS NEW
    FOR EACH ROW BEGIN SELECT
    AUTO_INCREMENT_SEQUENCE_NOTIFICATION.NEXTVAL INTO :NEW.NOTIID
    FROM DUAL;
END;

--FOREIGN KEY OF TABLE TB_NOTIFICATION
alter table TB_NOTIFICATION
add constraint FK_NOTIFICATION_USERID foreign key (UserId)
references TB_USER(UserId);

CREATE OR REPLACE TRIGGER TRIGGER_DEFAULT_VALUE_NOTIFICATION BEFORE 
    INSERT ON TB_NOTIFICATION
    REFERENCING
        NEW AS new
    FOR EACH ROW
BEGIN
    SELECT
        current_date
    INTO :new.createdon
    FROM
        dual; 
    :NEW.ISSEEN := 0;
END;

--INSERT INTO TB_NOTIFICATION (USERID, CONTENT) VALUES (1,'Đã tạo tài khoản thành công')

