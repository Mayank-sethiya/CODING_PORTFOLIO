import java.util.*;
public class DaysWeeksYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of days ");
        int Days = sc.nextInt();
        int years=Days/365;
        int month=(Days%365)/30;
        int weeks=((Days%365)%30)/7;
        int Day=Days-((years*365)+(month*30)+(weeks*7));
        System.out.println("THE NUMBER OF DAYS IS CONVERTED INTO YEARS ,MONTH,WEEK,DAYS");
        System.out.println(years+" years "+month+" months "+weeks+" weeks "+Day+" days");
    }
}
