package homework01;

import java.util.List;

public class MainClass {
	/**
	 * 各クラス・メソッド実行用
	 * @param args
	 */
	public static void main (String args[]) {

		//(1)干支を求める
		System.out.println("(1)干支を求める");
		System.out.println(Eto.getEto(1982));
		System.out.println("");

		//(2)素数を探す
		System.out.println("(2)素数を探す");
		List<Integer> primeNumberList = PrimeNumber.getPrimeNumberList(1, 100);
		for (Integer item : primeNumberList) {
			System.out.println(item.toString() );
		}
		System.out.println("");

		//(3)フィボナッチ数列を求める
		System.out.println("(3)フィボナッチ数列を求める");
		List<Integer> fList = FibonacciNumber.getFibonacciNumberList(21);
		for (Integer item : fList) {
			System.out.println(item.toString());

		}
	}

}