# Módulo 13: Calsse Pessoa

Este projeto consiste em um sistema simples para representar **Pessoas Físicas** e **Pessoas Jurídicas** utilizando a linguagem Java. Ele utiliza herança e polimorfismo para demonstrar o conceito de classes abstratas e suas implementações.

## Estrutura do Projeto

O projeto é composto por três classes principais:

1. **Pessoa** (classe abstrata):
   - Representa uma pessoa genérica com atributos **nome** e **sobrenome**.
   - Contém métodos de acesso (getters e setters) para manipulação desses atributos.
   
2. **PessoaFisica** (subclasse de Pessoa):
   - Representa uma pessoa física, com um atributo adicional **CPF**.
   - Implementa o método `toString` para exibir os dados de uma pessoa física de forma legível.

3. **PessoaJuridica** (subclasse de Pessoa):
   - Representa uma pessoa jurídica (empresa), com um atributo adicional **CNPJ**.
   - Também implementa o método `toString` para exibir os dados de uma pessoa jurídica de forma legível.

4. **Application**:
   - Classe de execução do programa que cria instâncias de **PessoaFisica** e **PessoaJuridica**, imprimindo as informações de cada uma no console.

## Funcionalidades

- **Cadastro de Pessoas Físicas**: Permite cadastrar uma pessoa física, incluindo nome, sobrenome e CPF.
- **Cadastro de Pessoas Jurídicas**: Permite cadastrar uma pessoa jurídica, incluindo nome, sobrenome e CNPJ.
- **Exibição dos Dados**: As informações de cada pessoa (física ou jurídica) são exibidas de forma organizada utilizando o método `toString`.
