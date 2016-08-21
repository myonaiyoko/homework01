package homework01;

import java.util.HashMap;

public class Eto {
	/**
	 * 年（西暦）から干支を求める
	 * @param int year (求める干支の年)
	 * @return String 干支
	 */
	public static String getEto(int year) {
		if (year < 1 ) {
			return "紀元前は計算できません";
		}

		HashMap<Integer, String> etoList = new HashMap<Integer,String>();
		etoList.put(0,"申");
		etoList.put(1,"酉");
		etoList.put(2,"戌");
		etoList.put(3,"亥");
		etoList.put(4,"子");
		etoList.put(5,"丑");
		etoList.put(6,"寅");
		etoList.put(7,"卯");
		etoList.put(8,"辰");
		etoList.put(9,"巳");
		etoList.put(10,"午");
		etoList.put(11,"未");

		return etoList.get(year % 12);
	}

}
