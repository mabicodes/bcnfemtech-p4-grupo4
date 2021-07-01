DROP TABLE IF EXISTS games;

CREATE TABLE games (
                       id   BIGSERIAL PRIMARY KEY,
                       title VARCHAR (255) NOT NULL ,
                       platform VARCHAR (255) NOT NULL ,
                       price NUMERIC NOT NULL,
                       year NUMERIC NOT NULL,
                       category VARCHAR(255) NOT NULL,
                       photo VARCHAR(64) NOT NULL

);

