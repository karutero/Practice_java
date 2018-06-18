import java.util.Scanner;

class StringInput{
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("名前を入力してください");
		String name = scanner.next();
		System.out.println("こんにちは"+ name + "さん");
	}
}
