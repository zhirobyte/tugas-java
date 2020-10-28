package kendaraan;

public class Motor extends Kendaraan implements Pajak{
	private String warnaBody;

	public Motor(int jumlahRoda, String bahanBakar, int mesin, double harga ){

		super (jumlahRoda, bahanBakar, mesin, harga);
		this.warnaBody = warnaBody;
	}

	public void deskripsi(){
		System.out.println("Motor");
		super.deskripsi();
		System.out.println(" warna body :" +warnaBody);

	}

	public void hitungPajak(){
		System.out.println("pajak:" +persen * harga);
	}
	

}