CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    email VARCHAR (100),
    password VARCHAR (100),
    profile_image VARCHAR (250)
);

CREATE TABLE categories (
    category_id SERIAL PRIMARY KEY,
    name VARCHAR (100),
    description VARCHAR (250),
    user_id INT UNIQUE,
    FOREIGN KEY (user_id) REFERENCES users (user_id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE expenses (
    expense_id SERIAL PRIMARY KEY,
    amount INT,
    description VARCHAR (250),
    date TIMESTAMP,
    user_id INT UNIQUE ,
    category_id INT UNIQUE,
    FOREIGN KEY (user_id) REFERENCES users (user_id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (category_id) REFERENCES categories (category_id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE otps (
    opt_id SERIAL PRIMARY KEY,
    opt_code VARCHAR (100),
    issued_at TIMESTAMP,
    expiration TIMESTAMP,
    verify BOOLEAN,
    user_id INT UNIQUE,
    FOREIGN KEY (user_id) REFERENCES users (user_id) ON UPDATE CASCADE ON DELETE CASCADE
);