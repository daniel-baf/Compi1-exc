package Backend;

import Backend.Utilities.NumberToken;
import Resources.Lexer;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

/**
 *
 * @author jefemayoneso
 */
public class VowelAnalyzer {

    private int[] wordsCounterWithVowels;
    private ArrayList<NumberToken> numberInfo;

    public VowelAnalyzer() {
        this.wordsCounterWithVowels = new int[6];
        this.numberInfo = new ArrayList<>();
    }

    public boolean getWords(Reader reader) {
        try {
            Lexer lexer = new Lexer(reader);
            int output = lexer.yylex();
            while (output != Lexer.YYEOF) {
                lexer.yylex();
            }

            // get numbers info
            this.wordsCounterWithVowels = lexer.getVowelNumbers();
            this.numberInfo = lexer.getNumberInfo();
            return true;
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
    }

    // GETTER AND SETTER
    public int[] getWordsCounterWithVowels() {
        return wordsCounterWithVowels;
    }

    public ArrayList<NumberToken> getNumberInfo() {
        return numberInfo;
    }
}
