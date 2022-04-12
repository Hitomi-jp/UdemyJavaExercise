public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,22));
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && hourOfDay >= 0 && hourOfDay < 8) {
            return true;
        } else if (barking && hourOfDay > 22 && hourOfDay < 24) {
            return true;
        }
        return false;
    }
}
