package yepyeni2;

public class Veri {
	int adim;
	int [] dizi;
	int boyut;
	public Veri (int a) {
		boyut = a;
		adim = -1;
		dizi = new int [boyut];
		
	}
	void elemanEkle (int b) {
		if (adim == boyut) {
			System.out.println("Eleman Eklenemedi !");
		}
		else {
			++adim;
			dizi [adim] = b;
		}
	}
	void  peek() {
		System.out.println("--------------------->" + dizi[adim]);
	}
	void pop() {
		adim--;
	}
	void yazdir() {
		int a = 0;
		while (a != adim+1) {
			System.out.println("----------------->" + dizi[a]);
			a++;
		}
	}
}
