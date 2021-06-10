DROP TABLE IF EXISTS games;

CREATE TABLE games (
                       id   BIGSERIAL PRIMARY KEY,
                       category VARCHAR(255) NOT NULL ,
                       title VARCHAR (255) NOT NULL ,
                       year VARCHAR (255) NOT NULL

);