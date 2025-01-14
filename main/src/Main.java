public class Main {
    public static void main(String[] args) {

        ContaBancaria usuario1 = new ContaBancaria(false, 0.0);
        usuario1.setNumConta(1111);
        usuario1.setProprietario("Samuel Monteiro Ferreira");
        usuario1.abrirConta("CC");


        ContaBancaria usuario2 = new ContaBancaria(false,0.0);
        usuario2.setNumConta(12345);
        usuario2.setProprietario("Maria Clara Marques de Oliveira");
        usuario2.abrirConta("CP");
        usuario2.depositar(500.0);
        usuario2.sacar(100.0);

        usuario1.sacar(50.0);
        usuario1.encerrarConta();


        usuario1.estadoAtual();
        usuario2.estadoAtual();
    }
}