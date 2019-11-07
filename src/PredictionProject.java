import java.util.Scanner;

public class PredictionProject {
    public static void main(String args[]) {
        //todo Ask for day/month/year
        //todo use this to find the variables
        //todo H = day of the week, Q = day of the month, M = the month, k = year of the century (year mod 100),
        //todo J = Zero based century (year/100)
        //todo h = (q+[13(m+1)/5]+k+[k/4]+[j/4]-2j)mod 7
        int h,q,m,k,j,year;
        String Day;
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        System.out.println("Day of the month?");
        q = Keyboard.nextInt();
        System.out.println("The month as a number?");
        m = Keyboard.nextInt();
        System.out.println("The year?");
        year = Keyboard.nextInt();
        k = year%100;
        j = year/100;
        h = (q+((13*(m+1))/5)+k+(k/4)+(j/4)-2*j)%7;

    }
}
