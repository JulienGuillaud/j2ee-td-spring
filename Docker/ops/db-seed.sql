-- ext
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
-- Create postgre databases
--- Auth server user
CREATE USER "j2ee_td_spring";
ALTER USER j2ee_td_spring WITH PASSWORD 'j2ee_td_spring';
CREATE DATABASE "j2ee_td_spring" ENCODING 'UTF8' LC_COLLATE = 'en-US' LC_CTYPE = 'en-US' TEMPLATE template0;
GRANT ALL PRIVILEGES ON DATABASE j2ee_td_spring TO "j2ee_td_spring";