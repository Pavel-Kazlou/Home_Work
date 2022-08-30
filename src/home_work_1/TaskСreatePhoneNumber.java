package home_work_1;

public class TaskСreatePhoneNumber {

    public String createPhoneNumber(int[] number) {
        String phoneNumber = "";
        for (int i = 0; i < number.length; i++) {
            phoneNumber = phoneNumber + number[i];
        }
        return "(" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10);
    }
}