CREATE TABLE IF NOT EXISTS USERS (
    email VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS ANIMAL (
    id_animal  int  NOT NULL auto_increment,
    type VARCHAR(50) NOT NULL,
    breed    VARCHAR(50) NOT NULL,
    sex        VARCHAR(1) NOT NULL,
    weight DECIMAL (8,2) NOT NULL,
    lot   int NOT NULL,
    id_sector  int  NOT NULL,
    id_farm    int NOT NULL,
    CONSTRAINT animal_pk PRIMARY KEY (id_animal)
);


CREATE TABLE IF NOT EXISTS EMPLOYEE (
    id_employee  int  NOT NULL auto_increment,
    name VARCHAR(50) NOT NULL,
    last_name    VARCHAR(50) NOT NULL,
    salary int,
    category VARCHAR(50),
    CONSTRAINT employee_pk PRIMARY KEY (id_employee)
);


CREATE TABLE IF NOT EXISTS FARM(
    id_farm  int  NOT NULL auto_increment,
    name VARCHAR(50) NOT NULL,
    location    VARCHAR(50) NOT NULL,
    farm_size int,
    total_sectors VARCHAR(50),
    CONSTRAINT farm_pk PRIMARY KEY (id_farm)
);


CREATE TABLE IF NOT EXISTS SECTOR(
    id_sector int NOT NULL auto_increment,
    name VARCHAR(50) NOT NULL,
    type_animals VARCHAR(50),
    location    VARCHAR(50) NOT NULL,
    id_farm int,
    id_employee int,
    CONSTRAINT sector_pk PRIMARY KEY (id_sector)
);


CREATE TABLE IF NOT EXISTS PROVIDER (
    id_provider  int  NOT NULL auto_increment,
    name VARCHAR(50) NOT NULL,
    CIF    VARCHAR(50),
    NIF VARCHAR(50),
    category VARCHAR(50),
    id_contact int,
    country VARCHAR(20),
    CONSTRAINT provider_pk PRIMARY KEY (id_provider)
);


CREATE TABLE IF NOT EXISTS CONTACT (
    id_contact  int  NOT NULL auto_increment,
    name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    telephone INT,
    email VARCHAR(50),
    address VARCHAR(50),
    country VARCHAR(20),
    CIF    VARCHAR(50),
    NIF VARCHAR(50),
    category VARCHAR(50),
    CONSTRAINT contact_pk PRIMARY KEY (id_contact)
);


CREATE TABLE IF NOT EXISTS PRODUCT (
    id_product int  NOT NULL auto_increment,
    category VARCHAR(50),
    type VARCHAR(50),
    id_provider int,
    CONSTRAINT product_pk PRIMARY KEY (id_product)
);


CREATE TABLE IF NOT EXISTS BUYER (
    id_buyer  int  NOT NULL auto_increment,
    name VARCHAR(50) NOT NULL,
    CIF    VARCHAR(50),
    NIF VARCHAR(50),
    category VARCHAR(50),
    id_contact int,
    country VARCHAR(20),
    CONSTRAINT buyer_pk PRIMARY KEY (id_buyer)
);

CREATE TABLE IF NOT EXISTS SALE(
    id_sale int NOT NULL auto_increment,
    id_animal int,
    id_buyer int,
    quantity int,
    price int,
    CONSTRAINT sale_pk PRIMARY KEY (id_sale)
);