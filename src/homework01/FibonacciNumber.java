package homework01;
import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

	/**
	 * nまでのフィボナッチ数列を求める
	 * @param n
	 * @return List<Integer> フィボナッチ数列のリスト
	 */
	public static List<Integer> getFibonacciNumberList(int n){
		List<Integer> fList = new ArrayList<Integer>();
		if (n < 2 ) {
			return null;
		}

		fList.add(1);
		fList.add(1);

		int i = 2;
		while (fList.get(i-2) + fList.get(i-1) <= n ) {
			fList.add(fList.get(i-2) + fList.get(i-1));
			i++;
		}

		return fList;

	}
}
