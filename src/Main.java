
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] products = {
                "Молоко", "Хлеб", "Сыр", "Яйца", "Гречка", "Мука", "Макароны"
        };
        int index;
       
        ArrayList<String> basket = new ArrayList<>();
        String product;
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        while (true) {
            System.out.println("Выберите операцию: 1 - Добавить, 2 - Показать, 3 - Удалить");
            String input = scanner.nextLine();
            int operation = Integer.parseInt(input);
            if (operation == 1) {
                System.out.println("Какую покупку хотите добавить?");
                input = scanner.nextLine();
                basket.add(input);
                System.out.println("Итого в списке покупок: " + basket.size());
            } else if (operation == 2) {


                for (int k = 0; k < basket.size(); k++) {
                    index = k + 1;
                    System.out.println(index + "  " + basket.toArray()[k]);

                }

            } else if (operation == 3) {
                System.out.println("Список покупок: ");
                for (int j = 0; j < basket.toArray().length; j++) {
                    index = j + 1;
                    System.out.println(index + "  " + basket.toArray()[j]);

                }
                System.out.println("Какую хотите удалить? Введите номер или название");
                input = scanner.nextLine();

                try {
                    int numProduct = Integer.parseInt(input);
                    product = basket.toArray()[numProduct - 1].toString();

                    basket.remove(basket.toArray()[numProduct - 1]);
                    System.out.println("Покупка " + product + " удалена, список покупок: ");
                    for (int q = 0; q < basket.size(); q++) {
                        index = q + 1;
                        System.out.println(index + "  " + basket.toArray()[q]);

                    }
                } catch (NumberFormatException exception) {
                    basket.remove(input);
                    System.out.println("Покупка " + input + " удалена, список покупок: ");
                    for (int n = 0; n < basket.size(); n++) {
                        index = n + 1;
                        System.out.println(index + "  " + basket.toArray()[n]);

                    }


                }

            } else {
                break;
            }

        }

    }
}

