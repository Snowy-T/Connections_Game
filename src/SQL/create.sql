CREATE TABLE userdata(
    uid SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password varchar(50) NOT NULL,
    numberOfGamesPlayed int,
	numberOfGamesWon int
);

CREATE TABLE category(
    cid SERIAL PRIMARY KEY,
    cname VARCHAR(50) NOT NULL
);

CREATE TABLE word(
    wid SERIAL PRIMARY KEY,
    cid INT NOT NULL,
    wname VARCHAR(50) NOT NULL,

    FOREIGN KEY (cid) REFERENCES category(cid)
)
