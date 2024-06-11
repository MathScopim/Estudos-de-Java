import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] cars = {"Honda", "Fiat", "Ford", "Tesla"};
        cars[3] = "Corsa";
        System.out.println(Arrays.toString(cars));
        System.out.println(cars.length);
        System.out.println(cars[3]);


    }
}
