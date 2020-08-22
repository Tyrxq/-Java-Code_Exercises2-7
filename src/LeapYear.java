public class LeapYear {

//  public static boolean isLeapYear(int year){
//   boolean check = year >=1 && year <= 9999 ?true:false;
//   if ((check && year % 4 ==0 && year % 100 != 0)||(check && year % 400 == 0)){
//       return true;
//    }
//   else{
//       return false;
//     }
//
//  }

//    public static boolean isLeapYear(int year){
//        boolean check = year >=1 && year <= 9999 ?true:false;
//        if (check && year % 4 ==0 && year % 100 != 0){
//            return true;
//        }
//        else if(check && year % 400 == 0) {
//            return true;
//        }
//        else{
//            return false;
//        }
//
//    }
   public static boolean isLeapYear(int year){
       boolean check = year >=1 && year <= 9999 ?true:false;
       return ((check && year % 4 ==0 && year % 100 != 0)||(check && year % 400 == 0))?true:false;
   }
}
