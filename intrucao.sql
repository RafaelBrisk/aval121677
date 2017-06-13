CREATE database provapratica;
create table produto(
id serial primary key,
nome varchar(255),
valor numeric(10, 4),
data_vencimento varchar(255)
);