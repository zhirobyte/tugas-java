public class Handphone{

	public void cekSaldo(EDuit ed){

	System.out.println("Saldo Anda menjadi : Rp." + ed.getSaldo());
	}

	public void isiSaldo(EDuit edp){
	ed.setSaldo(ed.getSaldo() + uang);
	System.out.println("Saldo Anda menjadi : Rp." + ed.getSaldo());
	}
}