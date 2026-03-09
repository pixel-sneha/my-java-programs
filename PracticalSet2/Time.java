import java.util.Scanner;

public class Time {
    private int hours;
    private int minutes;

    public void setTime(int h, int m) {
        int total = h * 60 + m;
        if (total < 0) total = 0;
        this.hours = total / 60;
        this.minutes = total % 60;
    }

    public void displayTime() {
        System.out.printf("%d:%02d%n", hours, minutes);
    }

    public void addTime(Time t1, Time t2) {
        int total = t1.hours * 60 + t1.minutes + t2.hours * 60 + t2.minutes;
        this.hours = total / 60;
        this.minutes = total % 60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        Time t2 = new Time();
        Time sum = new Time();

        System.out.print("Enter hours for first time: ");
        int h1 = sc.nextInt();
        System.out.print("Enter minutes for first time: ");
        int m1 = sc.nextInt();
        t1.setTime(h1, m1);

        System.out.print("Enter hours for second time: ");
        int h2 = sc.nextInt();
        System.out.print("Enter minutes for second time: ");
        int m2 = sc.nextInt();
        t2.setTime(h2, m2);

        System.out.print("First time: ");
        t1.displayTime();
        System.out.print("Second time: ");
        t2.displayTime();
        sum.addTime(t1, t2);
        System.out.print("Sum: ");
        sum.displayTime();
        sc.close();
    }
}