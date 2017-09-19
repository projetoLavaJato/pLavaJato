create database lavaJatoProjeto ;
drop database lavaJatoProjeto; 
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
    idCliente int(5),
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