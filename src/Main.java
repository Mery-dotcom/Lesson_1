import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String MyFavoriteMovie;
        final int NUM = 23;
        String Word = "Ghost";
        MyFavoriteMovie = NUM + Word;
        System.out.println("MyFavoriteMovie: " + MyFavoriteMovie);
        System.out.println("NUM: " + NUM);
        System.out.println("Word: " + Word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }
        if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}