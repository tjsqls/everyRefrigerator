DROP TABLE user_tb;
DROP TABLE product_tb;
DROP TABLE product_gift_tb;
DROP TABLE giftHistory_tb;
DROP TABLE exchangeHistory_tb;

CREATE TABLE user_tb(
id VARCHAR(12)PRIMARY KEY,
password VARCHAR(20),
name VARCHAR(20),
dateOfBirth VARCHAR(20),
phoneNumber VARCHAR(11),
email VARCHAR(50)
);

CREATE TABLE product_tb(
id NUMBER PRIMARY KEY,
userId VARCHAR(12),
name VARCHAR(20),
price NUMBER,
image VARCHAR(50),
firstCategory VARCHAR(10),
middleCategory VARCHAR(10),
lastCategory VARCHAR(10),
exchangeState VARCHAR(1)
);

CREATE TABLE product_gift_tb(
productId NUMBER,
giftId NUMBER,
CONSTRAINT productGiftid PRIMARY KEY (productId, giftId)
);

CREATE TABLE giftHistory_tb(
id NUMBER PRIMARY KEY,
sendUserId VARCHAR(12),
receivedUserId VARCHAR(12),
cardImage VARCHAR(50),
letter VARCHAR(500),
receivedCheck VARCHAR(1),
giftDate VARCHAR(20)
);



CREATE TABLE exchangeHistory_tb(
id NUMBER PRIMARY KEY,
requestUserId VARCHAR(12),
responseUserId VARCHAR(12),
requestProductId NUMBER,
responseProductId NUMBER,
exchangeDate VARCHAR(20)
);

commit;