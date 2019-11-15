import java.util.Scanner;

public class PredictionProject {
    public static void main(String args[]) {
        //todo Ask for day/month/year
        //todo use this to find the variables
        //todo H = day of the week, Q = day of the month, M = the month, k = year of the century (year mod 100),
        //todo J = Zero based century (year/100)
        //todo h = (q+[13(m+1)/5]+k+[k/4]+[j/4]-2j)mod 7
        int h, q, m, k, j, year;
        String Day;
        Scanner Keyboard;
        String Month;
        int NumberOfDays;
        Keyboard = new Scanner(System.in);
        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.\n");

        System.out.println("Day of the month?");
        q = Keyboard.nextInt();
        System.out.println("The month as a number?");
        m = Keyboard.nextInt();
        System.out.println("The year?");
        year = Keyboard.nextInt();

        k = year % 100;
        j = year / 100;
        h = (q + ((13 * (m + 1)) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7;

        Day = days(h);
        System.out.println(m + "/" + q + "/" + year + " is a " + Day);
        System.out.println(MonthDays(m,year));
        

    }
    public static String MonthDays(int m,int year) {
        String Month;
        String NumberOfDays;
        switch (m) {
            case 1:
            case 13:
                Month = "January has 31 days";
                break;
            case 2:
            case 14:
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        Month = "February has 28 days";
                    } else if (!(year % 100 == 0)) {
                        if (year % 400 == 0) {
                            Month = "February has 29 daus";
                        } else {
                            Month = "February has 29 days";
                        }
                    } else {
                        Month = "February has 29 days";
                    }

                } else {
                    Month = "February has 28 days";
                }
                break;
            case 3:
                Month = "March has 31 days";
                break;
            case 4:
                Month = "April has 30 days";
                break;
            case 5:
                Month = "May has 31 days";

                break;
            case 6:
                Month = "June has 30 days";

                break;
            case 7:
                Month = "July has 31 days";

                break;
            case 8:
                Month = "August has 31 days";

                break;
            case 9:
                Month = "September has 30 days";

                break;
            case 10:
                Month = "October has 31 days";

                break;
            case 11:
                Month = "November has 30 days";

                break;
            case 12:
                Month = "December has 31 days";

                break;
            default:
                Month = "Invalid Month has 0 days try again.";

        }

        return Month;


    }




// # that's on . luv ;D XDDD swag what's up homie watch we whip watch me nae neighhhhh im a horse what it do baybeeeeeee -Moira Taylor
        public static String days(int h){
        String WeekDay;
            switch (h) {
                case 1:
                    WeekDay = "Sunday";
                    break;
                case 2:
                    WeekDay = "Monday";
                    break;
                case 3:
                    WeekDay = "Tuesday";
                    break;
                case 4:
                    WeekDay = "Wednesday";
                    break;
                case 5:
                    WeekDay = "Thursday";
                    break;
                case 6:
                    WeekDay = "Friday";
                    break;
                default:
                    WeekDay = "Saturday";
                    break;

            }
            return WeekDay;
    }
}
