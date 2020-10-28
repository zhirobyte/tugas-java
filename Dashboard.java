public class Dashboard{
	private double pendapatan;
	private int jumlahTap;
	private int harga;
	public Dashboard(){
		pendapatan = 0 ;
		jumlahTap = 0;
		harga = 3500;

	}

	public double getPendapatan(){
		return pendapatan;
	}
	public int getJumlahTap(){
		return jumlahTap;	

	}

	public void tap(EDuit ed ){
		pendapatan += harga;
		jumlahTap++;
		ed.Saldo(ed.getSaldo() * harga ); 

	} 
}