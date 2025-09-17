import java.util.Objects;
import java.util.Scanner;

public class TranslatorUI {
    private final Dictionary dictionary;
    private final Scanner scanner;

    public TranslatorUI(Dictionary dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary, "Словарь не может быть null");
        this.scanner = new Scanner(System.in);
    }

    public void run(String dictionaryFile) {
        try {
            System.out.println("Программа-переводчик");
            System.out.println("====================");
            System.out.println("Загружаем словарь из файла: " + dictionaryFile);

            dictionary.load(dictionaryFile);

            System.out.println("Словарь успешно загружен! Найдено записей: " + dictionary.size());
            System.out.println();
            System.out.println("Введите текст для перевода (или 'exit' для выхода):");

            runInteractiveLoop();

        } catch (FileReadException | InvalidFileFormatException e) {
            System.err.println("Ошибка: " + e.getMessage());
            System.exit(1);
        } finally {
            scanner.close();
        }
    }

    private void runInteractiveLoop() {
        while (true) {
            System.out.print("> ");

            if (!scanner.hasNextLine()) {
                break;
            }

            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input.trim())) {
                System.out.println("До свидания!");
                break;
            }

            if (input.trim().isEmpty()) {
                System.out.println("Введите непустой текст для перевода.");
            } else {
                String translation = dictionary.translate(input);
                System.out.println("Перевод: " + translation);
            }

            System.out.println();
        }
    }
}