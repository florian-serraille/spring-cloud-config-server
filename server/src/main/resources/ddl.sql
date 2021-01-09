CREATE TABLE PROPERTIES
(
    ID          INT AUTO_INCREMENT PRIMARY KEY,
    APPLICATION VARCHAR(255),
    PROFILE     VARCHAR(255),
    LABEL       VARCHAR(255),
    KEY         VARCHAR(255),
    VALUE       VARCHAR(255)
);

INSERT INTO PROPERTIES
VALUES (null, 'client', 'default', 'master', 'message', 'Hello from config server - jdbc backend');

INSERT INTO PROPERTIES
VALUES (null, 'client', 'prod', 'master', 'message', 'Hello from prod config server - jdbc backend');