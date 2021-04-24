-- create database db_estoque; criar o banco de dados

-- use db_estoque; -- criar tabelas

-- create table tb_marcas
-- (id bigint(5) auto_increment, -- o banco de dados seta sozinho
--    nome varchar(20) not null, -- não aceita dados em branco
--    ativo boolean,
--    primary key (id) -- a coluna que será a primary key); 


-- select * from tb_marcas -- selecionar dados

-- insert into tb_marcas (nome, ativo) values ("Nike", true) -- popular tabela

-- update tb_marcas set nome = "NIKE" where id = 1;  -- atualizar dados

-- select * from tb_marcas where id < 2; dados especifico

-- select nome from tb_marcas;

-- delete from tb_marcas where id = 1;

-- select * from tb_marcas where nome like "%Ad%"; -- encontrar dados com letras
-- select * from tb_marcas where ativo = true; 

-- create table tb_produtos
-- (
-- id bigint auto_increment,
--   nome varchar (30) not null,
-- preco decimal(10,2), -- antes e depois da virgula
-- marca_id bigint not null, -- não pode ter um produto sem marca
-- primary key (id),
-- foreign key (marca_id) references tb_marcas (id)
-- )

-- insert into tb_produtos (nome, preco, marca_id) values ("Camisa", 59.90, 1) inserir produtos
-- select * from tb_produtos where nome like "%ca%"
-- insert into tb_produtos (nome, preco, marca_id) values ("Tenis", 99.90, 2)

