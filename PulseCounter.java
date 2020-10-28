public class PulseCounter{
	private int satuanPulsa{
		private int satuanPulsa;

		public PulseCounter(){
			satuanPulsa = 100;

		}

		public int hitungPulsa(Clock c1, Clock C2){
			int detikAkhir = c2.convert2detik();
			int detikAwal = c1.convert2detik();
			
			int pulsa = (detikAkhir - detikAwal) * 
		}
	}
}