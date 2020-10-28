public class MainProgram{
	public static void main ( String[]args){

	hewan h = new Hewan();
	kucing k = new Kucing();
	sapi s= new Sapi();



	k.bersuara();
	s.bersuara();


==========================================




	Kendaraan ->  abstract
	+description()

	Mobil
	+description()

	Motor 
	+description()

	public abstract class Kendaraan{
		public abstract void description();
	}

	public class Mobil extends Kendaraan{

	}

	public class Motor extends Kendaraan{
		public void description(){

		}
	}
===========================================

Main program 


Kendaraan k = new Kendaraan(); ----> new object kendaraan 
Kendaraan l = new Kendaraan[10]; ----> new array of object kendaraan
list[0] = new Mobil();
list[1] = new Mobil();
list[2] = new Motor();

for (int i = 0; i < 100; i++){
	list[i].description();
}

===============================================
Interface


public interface perusahaan{
	//konstanta 
}

----------------------------
AlatElektronik ---> Interface
+nyalakan() ----> abstract
+matikan() ---->  abstract


TV---> 
+nyalakan() 
+matikan() 
-------------------------
public interface AlatElektronik{

	final phi = 3.14;	//final konstanta 

	void nyalakan();   //public abstract
	void matikan();		//public abstract

	//public void isiDaya(){
		//gak boleh bapak
	} 																																																																																																																						
	------------------------------------------
	public class TV implements AlatElektronik{
	public void nyalakan(){

		}

	public void matikan(){

	}
}
	===========================================

	public class Mobil implements Pajak, Kendaraan{

	}
	public class Mobil extends Kendaraan implements Pajak{
		
	}