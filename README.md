#Criação de uma API JAVA utilizando bibliotecas SPRINGBOOT e um banco de dados MySQL;

#Após a importação da biblioteca SpringBoot, foram criados 4 pacotes:
Pacote controller, pacote Dao, pacote DTO e pacote Model;

#No pacote model, foi criada uma classe chamada de BaseConta, com as conexões do banco de Dados Mysql;

#No pacote Dao, foi criada uma interface para fazer o CRUD da classe BaseConta;

#No pacote BaseController, foi criada uma classe para implementação dos métodos gets e posts;

#No pacote DTO, foram criadas duas Classes: BaseContaDTO e OperacaoSaldoDTO;

# o primeiro método GET, serve para consultar todas as contas existentes;

#O segundo método GET, serve para consultar apenas uma conta por vez, utilizando seu número como chave primária;

#O terceiro método GET, serve para consultar o saldo de uma conta expecifica utilizando o seu número como chave primária;

#O primeiro método POST, serve para cadastrar uma nova conta no banco de dados, e foi utilizada a extensão REST CLIENT para efetuar os testes no Visual Studio;

#Foi criada uma classe chamada BaseContaDto, para que o método POST CadastrarConta seja utilizado;

#O segundo método POST, serve para depositar valores em quaisquer das contas existentes;

 #O terceiro Método POST, serve para efetuar saques que sejam iguais ou menores que o saldo existente, e no caso do valor ser maior, foi utilizada uma condicional IF ELSE  para não permitir a operação;

#A classe OperacaoSaldoDto, foi criada para que os métodos POST Depositar e Sacar sejam utilizados;

#Por fim, foram criado três arquivos HTTP no Visual Studio, usando a extensão REST CLIENT, fpara testar os métodos POSTS;
