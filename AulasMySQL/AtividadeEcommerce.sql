-- create database db_ecommerce;

use db_ecommerce;

create table tbUsuario
(
	id bigint(5) auto_increment,
    nomeUsuario varchar(55) not null,
    senha varchar(55) not null,
    primary key (id)
 );
 
 create table tbCategorias
(
	id bigint(5) auto_increment,
    tipoCategoria varchar(55) not null,
    primary key (id)
 );
 
 create table tbProdutos
(
	id bigint(5) auto_increment,
    nomeProduto varchar(255) not null,
    precoProduto decimal(10,2) not null,
    codigoProduto bigint(5) not null,
    quantidade decimal(10,2) not null,
    descricao varchar(255),
    marcar varchar(255) not null,
    peso decimal (10,2),
    ativo boolean not null,
	primary key (id)
 );
 
insert into tbProdutos (nomeProduto, precoProduto, codigoProduto, quantidade, descricao, marcar, peso, ativo) values ("Sabonete em pedra", 9.90, 1545, 20, "Sabonete para o rosto", "Protex", "10g", true);
insert into tbProdutos (nomeProduto, precoProduto, codigoProduto, quantidade, descricao, marcar, peso, ativo) values ("Shampoo", 19.90, 145, 10, "Shampoo Restaurador", "Dove", "250ml", true);
insert into tbProdutos (nomeProduto, precoProduto, codigoProduto, quantidade, descricao, marcar, peso, ativo) values ("Condicionador", 49.90, 965, 30, "Para cabelos quebradiços", "Aquaflora", "100ml", true);
insert into tbProdutos (nomeProduto, precoProduto, codigoProduto, quantidade, descricao, marcar, peso, ativo) values ("Creme para pentear", 99.90, 1462, 40, "Para cabelos secos", "Oka", "100g", true);
insert into tbProdutos (nomeProduto, precoProduto, codigoProduto, quantidade, descricao, marcar, peso, ativo) values ("Creme para Barbear", 59.90, 18, 70, "Para barba", "Natura", "90g", true);
insert into tbProdutos (nomeProduto, precoProduto, codigoProduto, quantidade, descricao, marcar, peso, ativo) values ("Perfume Suave", 229.90, 6525, 90, "Suave/Doce", "Boticario", "60ml", true);
insert into tbProdutos (nomeProduto, precoProduto, codigoProduto, quantidade, descricao, marcar, peso, ativo) values ("Base Matte ", 29.90, 54, 250, "COR 001", "Dailus", "50g", true);
insert into tbProdutos (nomeProduto, precoProduto, codigoProduto, quantidade, descricao, marcar, peso, ativo) values ("Mascara de cilios", 119.90, 645, 220, "Alongadora", "Maybeline", "15g", true);
insert into tbProdutos (nomeProduto, precoProduto, codigoProduto, quantidade, descricao, marcar, peso, ativo) values ("Pó compacto", 99.90, 45, 55, "Pó compacto COR 003", "Avon", "25g", true);
insert into tbProdutos (nomeProduto, precoProduto, codigoProduto, quantidade, descricao, marcar, peso, ativo) values ("Perfume Madeirado", 599.90, 145, 5, "Madeirado/doce", "Eudora", "100ml", true);

select * from tbProdutos;

select * from tbProdutos where precoProduto > 500;
select * from tbProdutos where precoProduto < 500;

update tbProdutos set precoProduto = 699.90 where id = 6;





 