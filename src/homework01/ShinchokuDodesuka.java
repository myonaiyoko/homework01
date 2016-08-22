package homework01;

import java.util.Random;

public class ShinchokuDodesuka {

	/**
	 * "進捗","どう","です","か？"の４単語をランダムに発生させ、結合し、末尾が"進捗どうですか？"と並ぶまで繰り返す。
	 * @return String (末尾が"進捗どうですか？"文字列)
	 */
	public static String getShinchokuDodesuka() {
		String returnValue = new String();
		String[] strShinchoku = new String[4];
		strShinchoku[0] = "進捗";
		strShinchoku[1] = "どう";
		strShinchoku[2] = "です";
		strShinchoku[3] = "か？";

		Random rnd = new Random();
		returnValue = "";

		while(returnValue.endsWith("進捗どうですか？") == false){
			returnValue  += strShinchoku[rnd.nextInt(4)];
		}
		return returnValue;
	}

}
