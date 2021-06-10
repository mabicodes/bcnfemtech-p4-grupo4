DROP TABLE IF EXISTS games;

CREATE TABLE games (
                       id   BIGSERIAL PRIMARY KEY,
                       category VARCHAR(255) NOT NULL ,
                       discount VARCHAR (255) NOT NULL ,
                       etiqueta VARCHAR (255) NOT NULL ,
                       pegi VARCHAR (255) NOT NULL ,
                       pegicontentdescriptors VARCHAR (255) NOT NULL ,
                       platform VARCHAR (255) NOT NULL ,
                       price VARCHAR (255) NOT NULL ,
                       pricediscount VARCHAR (255) NOT NULL ,
                       publisher VARCHAR (255) NOT NULL ,
                       title VARCHAR (255) NOT NULL ,
                       year VARCHAR (255) NOT NULL

);