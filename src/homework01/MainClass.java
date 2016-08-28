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
		System.out.println("");

		//(4)進捗どうですか？
		System.out.println("(4)進捗どうですか？");
		System.out.println(ShinchokuDodesuka.getShinchokuDodesuka());
		System.out.println("");

		//(5)カレンダー出力
		System.out.println("(5) カレンダー出力");
		MyCalendar.outputCalendar(2016, 8);
		System.out.println("");

		//(6)フォルダツリー表示
		System.out.println("(6)フォルダツリー表示");
		FolderTree.outputTree("D:\\test");
		System.out.println("");

		//(7)テキスト検索
		System.out.println("(7)テキスト検索");
		SearchText.outputMatches("D:\\test\\test.txt","test");
		System.out.println("");

		//(8)テキストエンコード変換
		System.out.println("((8)テキストエンコード変換");
		TextEncodeUTF8.encodeUTF8("D:\\test\\test.txt");
		System.out.println("");
	}

}
