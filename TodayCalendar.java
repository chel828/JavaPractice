// ログポースにログが溜まるまでのカレンダー
// 【 参考：https://joytas.net/programming/java/calendarapp 】

import java.util.Calendar;

public class TodayCalendar {

	public void log() {

		System.out.println("ここまで一緒に遊んでくれて、ありがとう♪");
		System.out.println("ログが溜まるまで、ゆっくりしていってね！");
		System.out.println("因みに、ログが溜まる日は、この日だよ ↓↓（*：today | ♪：Xday）★");

		Calendar cal = Calendar.getInstance(); // カレンダーを取得。

		int year = cal.get(Calendar.YEAR); // 年
		int month = cal.get(Calendar.MONTH) + 1; // 月(0~11+1)
		int today = cal.get(Calendar.DATE); // 日(1~31)

		cal.set(Calendar.DATE, 1);

		int beforeBlank = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int daysCount = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.printf("%16d/%d%n", year, month); // 表示。

		String[] weeks = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" }; // 曜日の入った配列を作成。

		for (String s : weeks) { // 拡張forで出力。

			System.out.printf("%4s", s);

		}

		System.out.println();

		for (int i = 0; i < beforeBlank + daysCount; i++) {

			String str = ""; // 初期値

			if (i >= beforeBlank) {

				int date = i + 1 - beforeBlank;

				str = String.valueOf(date);

				if (date == today) {// 今日に*マークを付ける。

					str = "*" + str;

				} else if (date == today + 3) {// ログがたまる日に♪マークを付ける。

					str = "♪" + str;

				}

			}

			System.out.printf("%4s", str);

			if ((i + 1) % 7 == 0) {

				System.out.println();

			}

		}

		System.out.println("");
		System.out.println("－－ログが溜まるまで、あと3日！！－－");

	}
}