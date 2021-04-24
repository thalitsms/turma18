use db_estoque;

create table tb_funcionarios
(
id bigint(5) auto_increment,
nome varchar(30) not null,
cargo varchar(20) not null,
departamento varchar (10) not null,
salario decimal (10,10),
primary key (id)
);

select * from tb_funcionarios;

insert into tb_funcionarios (nome, cargo, departamento, salario) values ("Thalita Mayra dos Santos", "Desenvolvedora JR", "TI", 6500);
insert into tb_funcionarios (nome, cargo, departamento, salario) values ("Larissa dos Santos", "Consultora", "Projetos", 2.500);
insert into tb_funcionarios (nome, cargo, departamento, salario) values ("Lorena Oliveira", "Recepcionista", "TI", 2.800);
insert into tb_funcionarios (nome, cargo, departamento, salario) values ("Juliana Carvalho", "Auxiliar Limpeza", "RH", 2.500);
insert into tb_funcionarios (nome, cargo, departamento, salario) values ("Maria Joaquina", "Lider de Projetos", "TI", 10.500);

update tb_funcionarios set salario = 2500 where id = 2;
update tb_funcionarios set salario = 2800 where id = 3;
update tb_funcionarios set salario = 2500 where id = 4;
update tb_funcionarios set salario = 12500 where id = 5;


select * from tb_funcionarios where salario > 2000;
select * from tb_funcionarios where salario < 2000;
 
update tb_funcionarios set salario = 1800 where id = 3;

select * from tb_funcionarios where salario < 2000;


