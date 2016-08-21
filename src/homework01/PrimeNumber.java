package homework01;
import java.util.ArrayList;
import java.util.List;

/**
 * nからmまでの素数を求める
 * @param n 開始
 * @param m 終了
 * @return List<Integer> 素数のリスト
 */
public class PrimeNumber {
	public static List<Integer> getPrimeNumberList(int n, int m){
		List<Integer> primeNumberList = new ArrayList<Integer>();

		for (int i = n; i <= m; i++) {
			if (i == 1) {
				continue;
			}
			if (i == 2){
				primeNumberList.add(i);
				continue;
			}
			boolean addFlag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					addFlag = false;
					break;
				}
			}
			if (addFlag == true) {
				primeNumberList.add(i);
			}
		}
		return primeNumberList;
	}

}
