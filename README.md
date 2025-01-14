# Sistema-Bancario

Este projeto é uma simulação de um sistema bancário desenvolvido em Java, que permite a criação e manipulação de contas bancárias com funcionalidades básicas, como abertura e fechamento de contas, depósitos, saques e pagamento de mensalidades.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

1. **Abrir Conta**:
    - Possui dois tipos de conta: Conta Corrente (CC) e Conta Poupança (CP).
    - Conta Corrente inicia com saldo de R$50,00.
    - Conta Poupança inicia com saldo de R$150,00.

2. **Encerrar Conta**:
    - Só pode ser encerrada se o saldo for igual a zero.
    - Não permite encerrar contas com saldo positivo ou débito.

3. **Depositar**:
    - Permite adicionar um valor ao saldo da conta ativa.

4. **Sacar**:
    - Permite retirar um valor do saldo disponível, desde que seja suficiente.

5. **Pagar Mensalidade**:
    - Conta Corrente: R$12,00.
    - Conta Poupança: R$20,00.

6. **Exibir Estado Atual**:
    - Mostra informações detalhadas sobre a conta, como número, tipo, proprietário, saldo e status.

## Estrutura do Código

A classe principal do sistema é `ContaBancaria`, que contém:

- **Atributos**:
    - `numConta`: Número da conta.
    - `tipo`: Tipo da conta (CC ou CP).
    - `proprietario`: Nome do proprietário da conta.
    - `saldo`: Saldo atual da conta.
    - `status`: Indica se a conta está ativa ou encerrada.

- **Métodos**:
    - `abrirConta(String t)`: Abre uma conta com o tipo especificado.
    - `encerrarConta()`: Encerra a conta se não houver saldo ou débitos.
    - `depositar(double valor)`: Realiza depósitos na conta.
    - `sacar(double valor)`: Realiza saques se o saldo for suficiente.
    - `pagarMensal()`: Deduz a mensalidade com base no tipo de conta.
    - `estadoAtual()`: Exibe os detalhes da conta no console.

- **Método Construtor**:
    - Inicializa a conta com saldo zero e status inativo.