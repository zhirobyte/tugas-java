package kendaraan;

public class Mobil extends Kendaraan implements pajak{
	private int jumlahPintu;

	public Mobil(int jumlahRoda, int mesin, String bahanBakar, double harga);{
		super(jumlahRoda, bahanBakar, mesin, harga);

		this.jumlahPintu = jumlahPintu;
	} 

	public void deskripsi(){
		System.out.println("Mobil");
		super.deskripsi();
		System.out.println("jumlah pintu :" +jumlahPintu);

	}

	public void hitungPajak(){
		System.out.println("pajak :" persen * harga * jumlahRoda);
	}

}