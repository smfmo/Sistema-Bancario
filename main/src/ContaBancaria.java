public class ContaBancaria {
    //atributos
    public int numConta;
    protected String tipo;
    private String proprietario;
    private Double saldo;
    private Boolean status;

    //método Construtor
    public ContaBancaria(Boolean status, Double saldo) {
        this.setStatus(false); // a conta vai estar fechada
        this.setSaldo(0.0); //a conta bancária do cliente vai começar zerada

    }

    //métodos GETTERS E SETTERS
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    //métodos
    public void estadoAtual(){
        System.out.println("---------------------------------------------");
        System.out.println("conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("proprietário da conta: " + this.getProprietario());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("----------------------------------------------");
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50.0);
        } else if (t.equals("CP") ) {
            this.setSaldo(150.0);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void encerrarConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com saldo! para encerrá-la, a conta precisa estar zerada");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(double valor){
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getProprietario());
        }else {
            System.out.println("Impossível depositar! Conta inexistente");
        }
    }

    public void sacar(double valor){
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getProprietario());
            }else {
                System.out.println("saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossível sacar! Conta inexistente");
        }
    }
    public void pagarMensal(){
        Double valor = 0.0;

        if (this.getTipo().equals("CC")) {
            valor = 12.0;
        } else if (this.getTipo().equals("CP")) {
            valor = 20.0;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("pagamento da mensalidade efetuado com sucesso!");
        }else{
            System.out.println("Impossivel pagar! Conta inexistente");
        }
    }
}
