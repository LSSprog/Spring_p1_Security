CREATE TABLE users_tbl (
    user_id             BIGSERIAL,
    username_fld        VARCHAR(255) NOT NULL,
    password_fld        VARCHAR(255) NOT NULL,
    email               VARCHAR(255) UNIQUE,
    score_id            INT NOT NULL,
    PRIMARY KEY (user_id),
    FOREIGN KEY (score_id) REFERENCES score_tbl (score_id)
);

INSERT INTO users_tbl (username_fld, password_fld, email)
VALUES
('user01', '$2y$12$fWxrQC1.HHNbskj.5/b91OXr5CCjLOw9eLFn6eQzpIhW.Gq4oYSZ6', 'user01@bk.ru'),
('user02', '$2y$12$JqliPzSfOBCjk7jBFFyPXOFuezYCiSNDmwgaNUQLPQVzoN.6JhqOm', 'user02@bk.ru');

CREATE TABLE score_tbl (
    score_id            INT NOT NULL,
    score_fld           INT NOT NULL,
    PRIMARY KEY (score_id)
);

INSERT INTO score_tbl (score_id, score_fld)
VALUES
(1, 50)
(2, 100);
