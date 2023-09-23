package funcionalidadesInternas;

public abstract class Conta implements Iconta  {
	
	protected static int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIA = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIA ++;
	}

	@Override
	public void sacar(double valor) {
		if(saldo < valor) {
			System.out.println("Saldo inválido para saque");
		}
		saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public void transferir(Conta contadestino, double valor) {
		this.sacar(valor);
		contadestino.depositar(valor);	
	};
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}




	protected void imprimeInfosComuns() {
		System.out.println((String.format("Agencia: %d", this.agencia)));
		System.out.println((String.format("Numero: %d", this.numero)));
		System.out.println((String.format("Saldo: %.2f", this.saldo)));
	};
	

}
