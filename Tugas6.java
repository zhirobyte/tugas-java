import java.util.Scanner;
public class Tugas6 {
	public static void main (String [] args){
	
	Scanner scanner= new Scanner(System.in);
		System.out.print("Masuktkan No.Nota :");
			String nomor = scanner.nextLine();
	Scanner jumlah = new Scanner (System.in);
		System.out.print("Jumlah Kertas (Rim):");
			int kertas =jumlah.nextInt();
		System.out.print("Jumlah Pulpen (Box):");
			int pulpen =jumlah.nextInt();
		System.out.print("Jumlah amplop (box):");
			int amplop =jumlah.nextInt();
		System.out.print("Rincian Pembelian Nota:");
			
			int k1 = kertas;
			int p1 = pulpen;
			int a1 = amplop;
			int j1 = k1 * 35000;
			int j2 = p1 * 20000;
			int j3 = a1 * 17500;
			int t1 = j1 + j2 + j3 +800;
			
		System.out.println("++----------------------------------------------------------------------++");
		System.out.println("| NO. |   Barang yang dibeli |  Jumlah  |   Harga Satuan   |   SubTotal  |");  
		System.out.println("|-----|----------------------|----------|------------------|-------------|");
		System.out.println("|  1. |         Kertas       |"+"    "     +k1  +"    |"+" " + "  35000   "+"|"+"  "   +j1   +"|");	
		System.out.println("|  1. |         Pulpen       |"+"    "   +p1  +"    |"+" " + "  20000   "+"|" +" "   +j2   +"|");
		System.out.println("|  1. |         Amplop      |"+"    "  +a1  +"     |"+" " + "  17500   "+"|" +" "   +j3   +"|");
		System.out.println("++----|-----------------------------------------------------------------++");
		System.out.println("");
		System.out.println("");
		System.out.println("++----------------------------------------------------------------------++");
		System.out.println("| Total Pembayaran         =" +t1 );
		
		System.out.print("| Masukkan Uang Pembayaran =");
		int bayar = jumlah.nextInt();
			int t2 = bayar;
			int  t3 = t2 - t1 ;
			int PPN = 800;
		System.out.println("| Uang  Kembalian          =" +t3);
		System.out.println("++----------------------------------------------------------------------++");
		System.out.println("                 --------------Terima Kasih---------------               ");
		System.out.println("");
		System.out.println(""); 
		System.out.println("   	   	           --------Sampai Jumpa------");
		System.out.println("                        Harga sudah termasuk PPN: "+PPN);
		System.out.println("");
		System.out.println(" 			        ");
		System.out.println("				[###]::::::[###]  E  ");
		System.out.println("				[###]::::::[###]  S  ");
		System.out.println("				|:::=::]:::]|::|  Q  ");
		System.out.println("				|:::=::]:::[|::|  M  ");
		System.out.println("				|:-::::=:[:::]:|  A  ");
		System.out.println("				[###]:]:-::[:::|  R  ");
		System.out.println("				[###]-]::=::=::|  T  ");		
		System.out.println(" 			        ");
		

	
	}
}