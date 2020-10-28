package Nasabah;
public class Valas extends Nasabah implements rekening{
	private String mataUang;
	private double rateKonversi;

	public Valas(int kurangSaldo, double hitungBiayaAdmin, double tambahSaldo, int Valas);
	super(hitungBiayaAdmin,tambahSaldo,kurangSaldo,valas);


		this.mataUang = mataUang;
		this.rateKonversi = rateKonversi; 
	} 

	public void valas(){
		System.out.println("masukkan valas"+valas);
		super.valas();
	}

	public void tambahSaldo(){
		System.out.println("Rp."+tambahSaldo);
		super.tambahSaldo();
	}
	public void kurangSaldo(){
		System.out.println("uang/bulan Rp."+kurangSaldo);
		super.kurangSaldo();
	}
	public void info(){
		System.out.println("info anda"+info);
	}

	public void hitungBiayaAdmin(){
		System.out.println("Biaya admin :"  kurangSaldo*)
}




