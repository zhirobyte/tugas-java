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
	{ 
	//Quiz #3 point: 1----------------------------------------------------------- 
		Scanner in =new Scanner (System.in);
		System.out.println("[]-----------------------------------[]");
			System.out.print("Masukkan Angka Pertama:");
			int A =in.nextInt();
			System.out.print("Masukkan Angka kedua  :");
			int B =in.nextInt();
			System.out.print("Masukkan Angka ketiga :");
			int C =in.nextInt();
		System.out.println("[]-----------------------------------[]");	
		if (A>=B && A>=C)
		{
			System.out.println("Angka terbesar yang anda input adalah:" +A); 
		}
		else if (B>=A && B>=C)
		{
				System.out.println("Angka terbesar yang anda input adalah:" +B);
		}
		else if (C>=A && C>=B)
		{
			System.out.println("Angka terbesar yang anda input adalah:" +C);
		}
		else if (A > B && A>C)
		{
			System.out.println("Angka terbesar yang anda input adalah:" +A);
		}
		else if (B>A && B>C)
		{
			System.out.println("Angka terbesar yang anda input adalah:" +B);
		}
		else if (C>A && C>B)
		{
			System.out.println("Angka terbesar yang anda input adalah:" +C);

		}
		
	}
	
	
}
			
