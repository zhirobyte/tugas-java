public class EDuit{
	private double saldo;
	private String noSeri;

	public EDuit(){}

	public EDuit ( double saldo, String noSeri){
		this.saldo = saldo;
		this.noSeri = noSeri;
	}
	public void perNoSeri(String noSeri){
		this.noSeri = noSeri;

	}

	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	}
