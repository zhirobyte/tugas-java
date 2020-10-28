package Nasabah;

public class Nasabah{ 
	protected String nama;
	protected int rekening;
	protected int rekeningAktif;
	protected int ambilUang;
	protected double setorTunai;

	public Nasabah( String nama, int rekening, int rekeningAktif, int ambilUang, double setorTunai){
		this.nama = nama;
		this.rekening = rekening;
		this.rekeningAktif =rekeningAktif;

	

	public void description(){
		System.out.println("Masukkan Nama nasabah:" +nama);
		System.out.println("pilih rekening       :" +rekening);
		System.out.println("Masukkan Nama nasabah:" +rekeningAktif);

	public abstract class Nasabah{
		public abstract void nasabah();
	}
		public abstract class Nasabah{
		public abstract void pilihRekeningAktif();
	}
	public abstract class Nasabah{
		public abstract void lihatinfoRekening();
	}
	public abstract class Nasabah{
		public abstract void ambilUang();
	}
	public abstract class Nasabah{
		public abstract void setorTunai();
	}


	


		

		
	}
}