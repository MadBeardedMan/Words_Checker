import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
                " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure " +
                "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit " +
                "anim id est laborum.";
        WordsChecker checker = new WordsChecker(text);
        while (true) {

            System.out.println("Введите слово для поиска. " +
                    "Для выхода наберите end.");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                scanner.close();
                break;
            }
            String answer = checker.hasWord(input) ? "Да, данное слово содержится в тексте." : "Нет, такого слова нет в тексте.";
            System.out.println(answer);
        }
    }
}