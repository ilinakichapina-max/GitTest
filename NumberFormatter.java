public class NumberFormatter {
    public static void main(String[] args) {
        // Исходные данные в виде строковых констант
        String input = "12345678";
        String separator = ",";

        // Регулярное выражение для вставки разделителей
        String regex = "(?<=\\d)(?=(\\d{3})+(?!\\d))";
        
        // Замена найденных позиций на разделитель
        String result = input.replaceAll(regex, separator);
        
        System.out.println(result);
    }
}
