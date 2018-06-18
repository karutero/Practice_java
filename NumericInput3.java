import java.util.Scanner;

class NumericInput3{
	public static void main(String[] args){
		Scanner sin = new java.util.Scanner(System.in);

		int m, n, ans;
		System.out.println("このプログラムは二つの数字を足し算するプログラムです");
		System.out.println("数字2つを入力してください");
		m = sin.nextInt();
		n = sin.nextInt();
		ans = m + n;
		System.out.println(m + "+" + n + "=" + ans); 
	}
}
