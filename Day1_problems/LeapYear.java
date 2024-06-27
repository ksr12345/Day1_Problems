public class LeapYear {
    public static void main(String[] args){
        int a = 2024;
        if (a >= 1582){
            if (a%4 == 0){
                System.out.println(a +" is a leap year.");
            }else {
                System.out.println(a +" is not a leap year.");
            }
        } else{
            System.out.println("Year Should be greater than or equal to 1582.");
        }
    }
}
