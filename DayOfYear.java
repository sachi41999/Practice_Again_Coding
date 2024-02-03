import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String date=sc.nextLine();
        DayOfYear doy=new DayOfYear();
        System.out.println(doy.dayOfYear(date));
        sc.close();
    }


    public int dayOfYear(String date) {
        int year[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(leapYear(date)){
            year[1]=29;
        }
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8));
        int count=0;
        while(month-1>0){
            day+=year[count];
            month--;
            count++;
        }
    return day;
    }

    public boolean leapYear(String date){
        int year=Integer.parseInt(date.substring(0,4));
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
        else{
            return false;
        }
    }

}
