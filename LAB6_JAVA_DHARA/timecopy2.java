// L6A2 : Define Time class with constructor to initialize hour and minute. Also define addition
// method to add two time objects

import java.util.Scanner;

class timecls2 {

    int hour, minute, second;

    timecls2(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void addtime(timecls2 t2) {
        int newhour, newmin, newsec;

        newhour = this.hour + t2.hour;
        newmin = this.minute + t2.minute;
        newsec = this.second + t2.second;

        if (newsec >= 60) {
            newmin += newsec / 60;
            newsec = newsec % 60;
        }

        if (newmin >= 60) {
            newhour += newmin / 60;
            newmin = newmin % 60;
        }

        System.out.println(newhour + ":" + newmin + ":" + newsec);
    }

}

public class timecopy2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour for time 1 : ");
        int hr1 = sc.nextInt();
        System.out.print("Enter minute for time 1 : ");
        int min1 = sc.nextInt();
        System.out.print("Enter second for time 1 : ");
        int sec1 = sc.nextInt();

        System.out.print("Enter hour for time 2 : ");
        int hr2 = sc.nextInt();
        System.out.print("Enter minute for time 2 : ");
        int min2 = sc.nextInt();
        System.out.print("Enter second for time 2 : ");
        int sec2 = sc.nextInt();

        timecls2 t1 = new timecls2(hr1, min1, sec1);
        timecls2 t2 = new timecls2(hr2, min2, sec2);

        t1.addtime(t2);

    }
}
