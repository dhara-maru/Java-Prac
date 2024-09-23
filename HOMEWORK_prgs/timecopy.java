
import java.util.Scanner;

class timecls {

    int hour, minute, second;

    timecls(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public timecls(timecls t1) {
        this.hour = t1.hour;
        this.minute = t1.minute;
        this.second = t1.second;
    }

    public void addtime() {
        int newhour, newmin, newsec;

        newhour = this.hour + this.hour;
        newmin = this.minute + this.minute;
        newsec = this.second + this.second;

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

public class timecopy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour for time 1 : ");
        int hr1 = sc.nextInt();
        System.out.print("Enter minute for time 1 : ");
        int min1 = sc.nextInt();
        System.out.print("Enter second for time 1 : ");
        int sec1 = sc.nextInt();

        timecls t1 = new timecls(hr1, min1, sec1);
        timecls t2 = new timecls(t1);

        t1.addtime();

    }
}
