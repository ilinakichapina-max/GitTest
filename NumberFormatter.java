import java.util.Scanner;

public class NumberFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число: ");
        String input = scanner.nextLine();
        
        String separator = ","; // Разделитель
        
        // Регулярное выражение для вставки разделителей
        String regex = "(?<=\\d)(?=(\\d{3})+(?!\\d))";
        
        // Замена найденных позиций на разделитель
        String result = input.replaceAll(regex, separator);
        
        System.out.println(result);
        
        scanner.close();
    }
}
