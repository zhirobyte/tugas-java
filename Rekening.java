package Nasabah;
import java.util.*;

public class Rekening{
	protected String noRek;
	protected double saldo ;
	protected double tambahSaldo;
	Scanner scan = new Scanner(s);
/////
	System.out.println("masukkan nomer rekening :");
	System.out.println("masukkan tambah saldo:");

	public String getnoRek(){
		return noRek;
	}
	public void setsaldo(double saldo){
		this.saldo = saldo;
	}
	public String getsaldo(){
		return saldo;
	}

}