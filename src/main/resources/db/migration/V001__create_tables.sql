-- Tabela users
CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Tabela transactions
CREATE TABLE transactions (
    id BIGSERIAL PRIMARY KEY,
    type VARCHAR(255) NOT NULL,
    amount DECIMAL NOT NULL,
    description VARCHAR(255),
    date TIMESTAMP NOT NULL,
    user_id BIGINT,
    CONSTRAINT fk_user
        FOREIGN KEY(user_id)
            REFERENCES users(id)
);