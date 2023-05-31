create table cliente(
                        id bigint not null auto_increment,
                        nome varchar(60) not null,
                        cpf varchar(15) not null,
                      
                        endereco varchar(255) not null,
                        cidade varchar(100) not null,
                        estado varchar(30) not null,

  						telefone varchar(20) not null,
                        email varchar(255) not null,
                        data_do_cadastro datetime not null,
                        
                        primary key (id)
                        
)engine=InnoDB default charset=utf8mb4;
