package homework;

public class Main {
    public static void main(String[] args) {
        MyDate myDate1= new MyDate(02,"janury",2023);
        MyDate myDate2= new MyDate(02,"janury",2023);
        MyDate myDate3= new MyDate(03,"janury",2023);

        System.out.println("equals via == "+(myDate1==myDate2));
        System.out.println("equals via overrided equals "+myDate1.equals(myDate2));
        System.out.println("myDate1 equals myDate3 "+myDate1.equals(myDate3));
        //equals via == false
        //equals via overrided equals false
        //myDate1 equals myDate3 false

        ///equals via == false
        //equals via overrided equals true
        //myDate1 equals myDate3 false

    }
}
