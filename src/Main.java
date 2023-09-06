import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(condition(18, 43));
        System.out.println(condition(41, 26));
        System.out.println(condition(16, 20));
        System.out.println(condition(37, 23));
        System.out.println(condition(16, 30));
        System.out.println(condition(generateRandomAge(),15));

    }

    public static String condition(int age, int temperature) {
        generateRandomAge();
        if (age >= 20 && age <= 45 &&
                temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(0,100);
        return age;
    }


}