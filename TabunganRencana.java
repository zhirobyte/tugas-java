package Nasabah;
public class TabunganRencana extends Nasabah implements rekening{
	private int periode;
	
	public TabunganRencana(int tabunganRencana, double kurangSaldo, double hitungBiayaAdmin);
	super(hitungBiayaAdmin,tambahSaldo,kurangSaldo,);


		this.periode = periode;
	} 

	public void tabunganRencana(){
		System.out.println("masukkan no rekemning dan periode"+periode);
	}
	public void kurangSaldo(){
		System.out.println("uang/bulan Rp."+kurangSaldo);
		super.kurangSaldo();
	}
	public void info(){
		System.out.println("info anda"+info);
	}

	public void hitungBiayaAdmin(){
		System.out.println("Biaya admin :" kurangSaldo / 2 * 7500)
}
