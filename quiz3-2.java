/**
*----------tugas Quiz3 bu Ahlijati---------
*	Code program dibuat tanggal 26/10/19
*	Saturday at 16.43 pm
*	Authors: Faiz Hanafi 
*	Computer Science
*------------------------------------------
*/
import java.util.Scanner;
public class Quiz3
{
	public static void main (String [] Args)
	{ Scanner in =new Scanner (System.in);
		System.out.println("[]-----------------------------------[]");
		
	//	Quiz #3 Point : 2 -------------------------------------------------------------
		System.out.println("");
		System.out.println("");
		System.out.println("-- Masukkan angka yang anda inginkan --");
		System.out.println("");
		System.out.print("          input here :");
		int num =in.nextInt();
		
		if (num == 7)
		{
			System.out.println(" Angka Tujuh Adalah Hari- Minggu");
		}
		
		else if (num == 6)
		{
			System.out.println(" Angka Enam Adalah Hari- Sabtu");
		}
		
		else if (num == 5)
		{
			System.out.println(" Angka Lima Adalah Hari- Jumat");
		}
		
		else if (num == 4)
		{
			System.out.println(" Angka Empat Adalah Hari- Kamis");
		}
		
		else if (num == 3)
		{
			System.out.println(" Angka Tiga Adalah Hari- Rabu");
		}
		
		else if (num == 2)
		{
			System.out.println(" Angka Dua Adalah Hari- Selasa");
		}
		
		else if (num == 1)
		{
			System.out.println(" Angka Satu Adalah Hari- Senin");
		}
		else 
		{
			System.out.println(" Maaf angka yang anda masukkan tidak dapat dijangkau oleh sistem ");
			System.out.println(" Silahkan masukkan angka Range : [1] - [7]");
		}
		
		System.out.println("------------------------------------");
		
	}
	
	
}
			
