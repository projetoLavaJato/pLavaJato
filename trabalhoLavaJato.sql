create database lavaJatoProjeto ;

use lavaJatoProjeto;

-- -------------------------------------------------------------
-- creates
-- -------------------------------------------------------------

-- criação da tabela de cliente

create table Cliente(
	idCliente int(5) not null auto_increment,
    cpfCliente int(11) not null unique,
    nomeCliente varchar(45) not null,
    emailCliente varchar(45) not null unique,
    enderecoCliente varchar(80) not null,
    primary key (idCliente)
)engine = innodb;

-- criação da tabela de telefone dos clientes

create table TelefoneCliente(
	idCliente int(5) not null,
    telefoneCliente int(9) not null default 0,
    primary key (idCliente, telefoneCliente),
    constraint fkTelefoneCliente 
    foreign key fk_telefoneCliente(idCliente)
    references Cliente(idCliente)
    on delete cascade
    on update cascade
)engine = innodb;

-- criação da tabela de veículos 

create table Veiculo(
	idVeiculo int not null auto_increment,
    placa varchar(7) not null unique,
    marca varchar (20),
    modelo varchar (20),
    idClinte int(5),
    primary key (idVeiculo),
    constraint fkVeiculoCliente
    foreign key fk_veiculo(idCliente)
    references Cliente(idCliente)
    on update cascade
    on delete set null
)engine = innodb;

-- criação da tabela de funcionários

create table Funcionario(
	idFuncionario int(3) not null auto_increment,
    tipo tinyint not null,
    salario double not null,
    nome varchar(45),
    endereco varchar(45),
    primary key (idFuncionario),
    constraint unNomeEndereco
    unique (nome, endereco)
)engine = innodb;

-- criação da tabela telefone de funcionário

create table TelefoneFuncionario(
	idFuncionario int(3) not null,
    telefoneFuncionario int(9) not null default 0,
    primary key (idFuncionario, telefoneFuncionario),
    constraint fkTelefoneFuncionario
    foreign key fk_telefoneFuncionario(idFuncionario)
    references Funcionario(idFuncionario)
    on delete cascade
    on update cascade
)engine = innodb;

-- criação da tabela dos tipos de serviços

create table TipoServico(
	idTipoServico int not null auto_increment,
    valor double not null,
    nome varchar(45) not null,
    descricao varchar(200),
    primary key (idTipoServico)
)engine = innodb;

-- criação da tabela de notas dos Serviços

create table NotaServico(
	idNotaServico int not null auto_increment,
    tempoInicial time(0),
    tempoFinal time(0),
    dataRealizacao date not null,
    idVeiculo int not null,
    idFuncionario int(3),
    primary key (idNotaServico),
    constraint fkNotaFuncionario
    foreign key fk_notaFuncionario(idFuncionario)
    references Funcionario(idFuncionario),
    constraint fkNotaVeiculo
    foreign key fk_notaVeiculo(idVeiculo)
    references Veiculo(idVeiculo)
)engine = innodb;

-- criação da tabela relação entre a nota e o serviço

create table tipoServicoNota(
	idNotaServico int not null,
    idTipoServico int not null,
    primary key (idNotaServico, idTipoServico),
    constraint fkNota
    foreign key fk_nota(idNotaServico)
    references NotaServico(idNotaServico),
    constraint fkTipo
    foreign key fk_tipo(idTipoServico)
    references TipoServico(idTipoServico)
)engine = innodb;
-- ---------------------------------------------------------------------
-- inserte
-- ---------------------------------------------------------------------

-- insert cliente

insert into Cliente(cpfCliente, nomeCliente, emailCliente, enderecoCliente)
values(00000099099, 'joão', 'jhd@gmail.com', ' Rua severiano ribeiro');

-- insert do telefone do cliente

/*
	A tabela de telefones do cliente se relaciona com a tabela do cliente
    a parti da chave estrangeira idCliente, essa coluna é auto-incrementável 
    na tabela Cliente, já na tabela telefone cliente, mesmo sendo parte da chave
    primária, não é.alter
    na parte da aplicação, utilizando o método getGenerateKeys() o id gerado é obtido
    sendo passado para chave primaria da tabela telefone.
*/

insert into Telefone(idCliente, telefoneCliente)
values(00000,999999999);

-- insert na tabela veículo

insert into Veiculo(placa, marca, modelo, idCliente)
values('pcx0746','gm','onix',00000);

-- insert na tabela funcionário

insert into Funcionario(tipo, salario, nome, endereco)
values(1, 2800.00, 'robson', 'rua bom menino');

-- insert na tabela telefone de funcionário

insert into TelefoneFuncionário(idFuncionario, telefoneClinete)
values(000,999999999);

-- insert na tabela tipo de serviço

insert into TipoServico(valor, nome, descricao)
values(40.00, 'valagem a seco', 'lavagem de carro sem utilização de água');

-- insert na tabela nota de serviço

insert into NotaServico(tempoIncial, tempoFinal, dataRealizacao, idVeiculo, idFuncionario)
values(current_time(),current_time(),date_format(curdate(),'%d%m%y'), (select idVeiculo from Veiculo where placa = 'xxxxxxx'),
(select idFuncionario from Funcionario where nome = 'fulano'));

-- insert na tabela serviço nota

insert into TipoServicoNota(idTipoServico, idNotaServico)
values(01,01);

-- select 

select * from Veiculo;

select * from Cliente;

select * from Funcionário;

select * from TelefoneFuncionario;

select * from TelefoneCliente;

select * from NotaServico;

select * from TipoServico;