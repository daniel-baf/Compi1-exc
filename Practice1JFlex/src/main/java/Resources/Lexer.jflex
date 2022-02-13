/* SECTION 1: user code */
package Resources;
import Backend.Utilities.NumberToken;
import java.util.ArrayList;


/* SECTION 2: config */

%%

%class Lexer
%unicode
%line
%column
%int
%public

L= [a-zA-Z]+
D=[0-9]+
spaces=[ ,\t,\r,\n]+

%{
    private int oneVowel = 0;
    private int twoVowel = 0;
    private int threeVowel = 0;
    private int fourVowel = 0;
    private int fiveVowel = 0;
    private int noVowell = 0;
    private ArrayList<NumberToken> listNumbersInfo = new ArrayList<>();

    private void countWords(String lexWord) {
        switch(lexWord.length() - lexWord.replaceAll("[aeiouAEIOU]", "").length()) {
            case 1:
                oneVowel++;
                break;
            case 2:
                twoVowel++;
                break;
            case 3:
                threeVowel++;
                break;
            case 4:
                fourVowel++;
                break;
            case 5:
                fiveVowel++;
                break;
            default:
                noVowell++;
                break;
        }
    }

    private void saveNumbInfo(int line, int column, int value) {
        this.listNumbersInfo.add(new NumberToken(line, column, value));
    }

    // GETTERS AND SETTERS
    public int[] getVowelNumbers() {
        return new int[] {oneVowel,twoVowel,threeVowel,fourVowel,fiveVowel,noVowell};
    }

    public ArrayList<NumberToken> getNumberInfo() {
        return this.listNumbersInfo;
    }
%}

%%

/* SECTION 3: lexical rules */
{D}     {saveNumbInfo(yyline,yycolumn,Integer.valueOf(yytext()));}
{L}+    {countWords(yytext());}
[^]     {}