create table vendas(
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(80) NOT NULL,
    quantidade INTEGER NOT NULL,
    valor double NOT NULL,
	FK_cliente integer not null,
    foreign key(FK_cliente) references cliente(id)) ;
    
Select * from vendas