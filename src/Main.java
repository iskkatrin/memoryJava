import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int value = 33;
        changeValue(value);
        System.out.println("Измененное значение переменной: " + value);

        Integer value1 = 33;
        changeValue(value1);
        System.out.println("Измененное значение переменной: " + value1);

        Integer[] value2 = {3, 4};
        changeValue(value2);
        for (Integer num : value2) {
            System.out.println(num);
        }


    }

    public static void changeValueCat(int value) {
        value = 22;
    }

    public static void changeValue(Integer value1) {
        value1 = 22;
    }

    public static void changeValue(Integer[] value2) {
        value2 = new Integer[]{1, 2};
    }



}



