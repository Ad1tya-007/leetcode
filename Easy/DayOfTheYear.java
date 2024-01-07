package Easy;

public class DayOfTheYear {

    static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int ans = 0;

        if (month != 1) {
            for (int i = 0; i < month - 1; i++) {
                ans += days[i];
            }
            if (month > 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    ans += 1;
                }
            }
        }

        ans += day;

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("1900-06-30"));
        System.out.println(dayOfYear("2019-02-10"));
        System.out.println(dayOfYear("2016-02-29"));
    }
}
