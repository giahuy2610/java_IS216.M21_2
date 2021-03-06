----Create table Category
CREATE TABLE TB_CATEGORY
(
    CATEGORYID INTEGER PRIMARY KEY,
    CATEGORYNAME NVARCHAR2(255) NOT NULL UNIQUE
);

--Trigger tăng CATEGORYID tự động
CREATE SEQUENCE AUTO_INCREMENT_SEQUENCE_CATEGORY
START WITH 1
INCREMENT BY 1;

CREATE OR REPLACE TRIGGER TRIGGER_AUTOINCRE_TB_CATEGORY_CATEGORYID
BEFORE INSERT ON
TB_CATEGORY
REFERENCING NEW AS NEW
    FOR EACH ROW BEGIN SELECT
    AUTO_INCREMENT_SEQUENCE_CATEGORY.NEXTVAL INTO :NEW.CATEGORYID
    FROM DUAL;
END;
--Insert dữ liệu cho bảng
INSERT INTO TB_CATEGORY (CATEGORYNAME) VALUES ('Thực phẩm');
INSERT INTO TB_CATEGORY (CATEGORYNAME) VALUES ('Vật dụng');
INSERT INTO TB_CATEGORY (CATEGORYNAME) VALUES ('Y tế');
INSERT INTO TB_CATEGORY (CATEGORYNAME) VALUES ('Giáo dục');
INSERT INTO TB_CATEGORY (CATEGORYNAME) VALUES ('Bữa ăn');
INSERT INTO TB_CATEGORY (CATEGORYNAME) VALUES ('Khác');
commit;