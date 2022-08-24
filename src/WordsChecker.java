import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] txtArray = text.split("\\P{IsAlphabetic}+");
        Set<String> txtSet = new HashSet<>();
        Collections.addAll(txtSet, txtArray);
        return txtSet.contains(word);
    }
}