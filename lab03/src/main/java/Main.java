public class Main {
    public static void main(String[] args) {
        String dictionaryFile = args.length > 0 ? args[0] : "dictionary.txt";

        Dictionary dictionary = new SortedDictionary();
        TranslatorUI ui = new TranslatorUI(dictionary);

        ui.run(dictionaryFile);
    }
}