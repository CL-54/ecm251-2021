package Caceres.Marques.Marcel;

public class Recognizer {
    // Relevant states
    public static final int INITIAL = 0;
    public static final int FINAL = 1;
    public static final int ERROR = 3;
    // Symbol constants
    public static final int DIGIT = 0;
    public static final int SIGNAL = 1;
    public static final int OTHER = 2;
    private int[][] table = { { 1, 2, 3 }, { 1, 3, 3 }, { 1, 3, 3 },
            { 3, 3, 3 } };
    private int currentState;
// Constructor (empty)
public Recognizer() {
}
    // Recognize (or not) if the string is a number
// returns the number or throws an NumberFormatException , otherwise
    public int recognize(String s) throws NumberFormatException {
        int pos = 0;
        int number = 0;
        int signal = 1;
        currentState = INITIAL;
        while (pos < s.length()) {
            char c = s.charAt(pos);
            int symbol = getSymbol(c);
            currentState = table[currentState][symbol];
            if (currentState == ERROR) {
                throw new NumberFormatException(s + " is not a number!");
            }
            if (symbol == DIGIT) {
                number = number * 10 + c - '0';
            }
            if (symbol == SIGNAL) {
//Variable c carries the signal symbol
                signal = signal * (c == '+' ? 1 : -1);
            }
            pos++;
        }
        if (currentState != FINAL) {
            throw new NumberFormatException(s + " is not a number!");
        }
        number = signal * number;
        return number;
    }
    private int getSymbol(char c) {
        if (Character.isDigit(c)) {
            return DIGIT;
        } else if (c == '‐' || c == '+') {
            return SIGNAL;
        } else {
            return OTHER;
        }
    }
}


