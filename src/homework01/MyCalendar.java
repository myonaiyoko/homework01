package homework01;

import java.util.Calendar;

public class MyCalendar {

	public static void outputCalendar(int year, int month){

		month --;
		System.out.println("日      月      火      水     木      金     土");

		String[] days = new String[37];

		int weekOfFirstDay = getWeekOfFirstDay(year,month);
		for (int i=0;i < weekOfFirstDay;i++) {
			days[i] = "  ";
		}

		int day = 1;
		for (int i = 1; i< 37; i++){
			if (days[i] != "  ") {
				if (day < 10) {
					days[i] = " " + String.valueOf(day);
				}else {
					days[i] = String.valueOf(day);
				}
					day++;
			}
		}

		int lastDay = getLastDayOfMonth(year, month);
		for(int i = 1;i < lastDay + weekOfFirstDay; i++) {
			if (i%7 == 0){
				System.out.print(days[i]);
			}else{
				System.out.print(days[i] + "  ");
			}
			if (days[i] == String.valueOf(lastDay)){
				break;
			}
			if (i%7 == 0){
				System.out.println("");
			}
		}
	}

	/**
	 * 年と月から末日を返す
	 * @param year
	 * @param month
	 * @return int 末日
	 */
	private static int getLastDayOfMonth(int year,int month){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH,month);

		return c.getActualMaximum(Calendar.DATE);
	}

	/**
	 * 年と月から1日の曜日を返す
	 * @param year
	 * @param month int 曜日
	 * @return
	 */
	private static int getWeekOfFirstDay(int year,int month){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, 1);

		return c.get(Calendar.DAY_OF_WEEK);
	}
}
