public class Ink{

	private int jumlah;

	public Ink(){
	this.jumlah = 0;

	}

	//methode refill
	public void refill ( int jumlah){
	this.jumlah += jumlah;
	}


	//methode use
	public void use ( int jumlah){
	this.jumlah -= jumlah;
	}

	//methode infotinta
	public void  infoInk( String namaMasukan){
	System.out.println(namaMasukan+ ":jumlah tinta anda sebanyak" +infoInk )
	}
}