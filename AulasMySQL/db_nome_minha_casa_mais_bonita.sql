-- create database db_nome_minha_casa_mais_bonita;
use db_nome_minha_casa_mais_bonita;

create table tbUsuario
(
	id bigint(5) auto_increment,
    nomeUsuario varchar(55) not null,
    primeiroNome varchar(55) not null,
    segundoNome varchar(55) not null,
    senha varchar(55) not null,
    primary key (id)
 );
 
 create table tbCategorias
(
	id bigint(5) auto_increment,
    tipoCategoria varchar(55) not null,
    descricao varchar(255) not null,
	ativo boolean not null,
    primary key (id)
 );
 
 create table tbProdutos
(
	id bigint(5) auto_increment,
    nomeProduto varchar(255) not null,
    precoProduto decimal(10,2) not null,
    quantidade decimal(10,2) not null,
    marca varchar(255) not null,
    ativo boolean not null,
	primary key (id)
 );
 
 alter table tbProdutos add constraint fk_tbCategorias foreign key (id) references tbcategorias (id);
 
 select * from tbProdutos;
 
 

 