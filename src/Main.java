
public class Main {

	public static void main(String[] args) {
		Cliente kayke = new Cliente();
		kayke.setNome("Kayke");
		
		Conta cc = new ContaCorrente(kayke);
		Conta poupanca = new ContaPoupanca(kayke);

		cc.depositar(100);
		cc.emprestimo(300);
		cc.sacar(200);
		
		cc.imprimirExtrato();
	}

}
