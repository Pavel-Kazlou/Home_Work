package home_work_1;

public class BinaryString {

    private byte number;

    public byte getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    public static String toBinaryString(byte number) {
        byte b;
        String result = "";
        while (number != 0) {
            b = (byte) (number % 2);
            result = b + result;
            number = (byte) (number / 2);
        }
        System.out.print(result);
        return result;
    }
    public static void main(String [] args) {
        toBinaryString((byte) 42);
    }
}
