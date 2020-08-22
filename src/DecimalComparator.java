public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
       //When casting the data type have to be in front
        return (int)(num1 * 1000d) == (int)(num2 * 1000d) ?true:false;
    }
}
