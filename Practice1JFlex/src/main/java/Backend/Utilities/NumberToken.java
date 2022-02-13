package Backend.Utilities;

/**
 *
 * @author jefemayoneso
 */
public class NumberToken {

    private int line;
    private int column;
    private int value;

    public NumberToken() {
    }

    public NumberToken(int line, int column, int value) {
        this.line = line;
        this.column = column;
        this.value = value;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
