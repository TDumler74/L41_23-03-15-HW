package homework1;

import java.util.Objects;

public class MyDate {
   int day;
   String month;
   int year;

   public MyDate(int day, String month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public void setDay(int day){
      this.day=day;
   }
   public int getDay(){
      return day;
   }
   public void setMonth(String month){
      this.month=month;
   }
   public String getMonth(){
      return month;
   }
   public void setYear(int year){
      this.year=year;
   }
   public int getYear(){
      return year;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof MyDate) ) return false;
      MyDate myDate = (MyDate) o;
      return day == myDate.day && year == myDate.year && Objects.equals(month, myDate.month);
   }
   //equals via == false
   //equals via overrided equals true
   //myDate1 equals myDate3 false

   @Override
   public int hashCode() {
      return Objects.hash(day, month, year);
   }
}
