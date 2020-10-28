public class Tugas5 {
	public static void main (String [] args){
		
		//EXERCISE MOD QUIZ 2 
		double assesment = 85;
		double uas = 78;
		double tugas = 95;
	    double nilaiakhir= assesment *30/100  + uas *50/100   + tugas *20/100 ;
		System.out.println ("=======================================");
		System.out.println ("===   Diketahui Nilai Tony Stark    ===");
		System.out.println ("===        ++++++++++++++           ===");
		System.out.println ("=======================================");
		System.out.println ("==== Nilai assesment = 85 /30%     ====");
		System.out.println ("==== Nilai UAS       = 78 /50%     ====");
		System.out.println ("==== Tugas           = 95 /20%     ====");
		System.out.println ("=======================================");
		System.out.println ("=======================================");
		System.out.println ("Nilai Akhir : Assesment/30% + UAS/50% + Tugas/20%  ======");
		System.out.println ("Berapakah Nilai Akhir dari Tony Stark?             ======");
		System.out.println ("                                                   ======");
		System.out.println ("                                                   ======");
		System.out.println ("==== Nilai Assesment:"+assesment *30/100); 
		System.out.println ("==== Nilai UAS      :"+uas *50/100);
		System.out.println ("==== Nilai Tugas    :"+tugas *20/100);
		System.out.println ("==== -------------------- +");
		System.out.println ("==== Nilai Akhir    :" + nilaiakhir);
		
		String hasil;
		hasil = (nilaiakhir > 60) ? " Selamat! Anda dinyatakan LULUS" : "Maaf Nilai anda masih kurang mencukupi";
		System.out.println(hasil);
		
		//end of program exercise 2
		System.out.println ("=======================================");
		System.out.println ("=======================================");
		System.out.println ("=======================================");
		System.out.println ("=======================================");
		/*--------------------------------------------------------
		// first line of Tugas 5 
		*/
		double n1 = 10;
		double n2 = 15;
		double h1 = (n1 + n2) * (n2 + n1);
		double h2 = (n1 % 4) * n2;
	    boolean b1 = (h1 >= h2);
		boolean b2 =	(h2 >= h1);
		boolean b3 = (h1 % 4) == (++h2 % 5); 
		boolean b4 =	(b1 || b3) && (b2 || b3);
		boolean b5 = b2 || (b3 && (b2 || b1));
		System.out.println ("=======================================");
		System.out.println ("===   Diketahui Nilai Program       ===");
		System.out.println ("===        ++++++++++++++           ===");
		System.out.println ("=======================================");
		System.out.println ("==== Nilai n1 = 10                 ");
		System.out.println ("==== Nilai n2 = 15 	            ");
		System.out.println ("==== 						    	");
		System.out.println ("=======================================");
		System.out.println ("=======================================");
		System.out.println ("==== Nilai h1 adalah:"+h1               ); 
		System.out.println ("==== Nilai h2 adalah:"+h2               );
		System.out.println ("==== Nilai b1 adalah:"+b1               );
		System.out.println ("==== Nilai b2 adalah:"+b2               );
		System.out.println ("==== Nilai b3 adalah:"+b3 				 );	
		System.out.println ("==== Nilai b4 adalah:"+b4 				 );
		System.out.println ("==== Nilai b5 adalah:"+b5               );
		System.out.println ("==== ----------------------------------");		
		System.out.println ("==== ----------------------------------");
		System.out.println ("==== ----------------------------------");
		
	}
}