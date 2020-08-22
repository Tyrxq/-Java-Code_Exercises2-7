public class Main {
    public static void main(String[] args) {
        //MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
       boolean result = BarkingDog.shouldWakeUp(true,-1);
       result = LeapYear.isLeapYear(2020);
       result = DecimalComparator.areEqualByThreeDecimalPlaces(2.321,2.3212);
       result = EqualSumChecker.hasEqualSum(1,1,5);
       result = TeenNumberChecker.hasTeen(3,19,21);
       boolean result2 = TeenNumberChecker.isTeen(13);
       System.out.println(result);
        System.out.println(result2);
    }
}
