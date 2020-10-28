import java.util.Scanner;
public class Tugas7
{
	public static void main (String [] args)
	{ 	int A = 16000;
		int B = 15000;
		int C = 3000;
		
		
		System.out.println("[]================================================[] ");
		System.out.println("[]  ^^^       WARUNG MAKAN SEDERHANA         ^^^  [] ");
		System.out.println("[] ^^^^^       ESQ BUSSINESS SCHOOL         ^^^^^ [] ");
		System.out.println("[]------------------------------------------------[] ");
		System.out.println("[]                SELAMAT DATANG :)               [] ");
		System.out.println("[] Nama menu:                                     [] ");
		System.out.println("[] 1.Ayam bakar  = Rp.16.000                      [] ");
		System.out.println("[] 2.Ayam goreng = Rp.15.000                      [] ");
		System.out.println("[] 3.Es Teh      = Rp.3.000                       [] ");
		System.out.println("[] 4.Jus Melon   = Rp.5.000                       [] ");
		System.out.println("[]------------------------------------------------[] ");
		Scanner in= new Scanner(System.in);
		System.out.print("| Masukkan Jumlah Ayam Bakar :" );
		int ab =in.nextInt();
		System.out.print("| Masukkan Jumlah Ayam Goreng:" );
		int ag =in.nextInt();
		System.out.print("| Masukkan Jumlah Es Teh     :" );
		int et =in.nextInt();
		System.out.println("[]------------------------------------------------[] ");
		System.out.println("[]------------------------------------------------[] ");
		
		{
		if ( ab >= 3 && ag>= 5)
			System.out.println("|| Selamat! Anda mendapat Bonus + Teh Manis & Jus Melon"); 
		else if ( ab >=3 )
			System.out.println("|| Selamat! Anda mendapat Bonus + Teh Manis"); 
		else if ( ag >=5 )
			System.out.println("|| Selamat! Anda mendapat Bonus + Jus Melon"); 
		}
		System.out.println("|| Jumlah Total Harga      :Rp."+(A * ab + B * ag + C * et));
		System.out.println("[]------------------------------------------------[] ");
		System.out.println("[]----   TERIMA KASIH ATAS KUNJUNGAN ANDA     ----[] ");
		System.out.println("[]------------------------------------------------[] ");
		System.out.println("[]================================================[] ");
		
		
	
	}
}