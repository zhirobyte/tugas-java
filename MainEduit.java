public class MainEduit{

	public static void main (String[] args){
		EDuit tapCash =  new EDuit();
		Handphone Hp = new Handphone();


		hp.duitSaldo (tapCash, 1000000);

		Dashboard ds = new Dashboard();

		//masuk tj ngetap kartu 
		ds.tap(tapCash);

		//cek saldo lewat hp 
		hp.cekSaldo(tapCash);

		//pengemudi cek pendapatan saat ini
		// jumlah pendapatan dan jumlah tap

	}
}