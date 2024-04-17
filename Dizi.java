package yepyeni2;

public class Dizi {

	public static void main(String[] args) {
		Veri dizim = new Veri(10);
		dizim.elemanEkle(15);
		dizim.elemanEkle(16);
		dizim.elemanEkle(78);
		dizim.elemanEkle(65);
		dizim.elemanEkle(45);
		dizim.elemanEkle(26);
		dizim.pop();
		dizim.yazdir();
		dizim.peek();

	}

}
