package Caceres.Marques.Marcel;

import java.util.Scanner;

class Real {
    // Relevant states
    public static final int INITIAL = 0;
    public static final int ERROR = 3;
    public static final int FINAL = 4;
    public static final int q1 = 1;
    public static final int q2 = 2;
    public static final int q5 = 5;
    public static final int q6 = 6;
    // Symbol constants
    public static final int DIGIT = 0;
    public static final int SIGNAL = 1;
    public static final int PONTO = 2;
    public static final int eE = 3;
    public static final int OTHER = 4;
    private int[][] table = { { 1, 1, 3, 3, 3 }, { 1, 3, 2, 5, 3 }, { 2, 3, 3, 5, 3 },
            { 4, 6, 3, 3, 3 }, { 4, 3, 3, 3, 3 },{4, 3, 3, 4, 3},{ 3, 3, 3, 3, 3 } };
    private int currentState;
    public Real() {
    }
    // Recognize (or not) if the string is a number
// returns the number or throws an NumberFormatException , otherwise
    public int recoreal(String s) throws NumberFormatException {
        int pos = 0;
        int number = 0;
        int signal = 1;
        int Ee = 0;
        currentState = INITIAL;
        while (pos < s.length()) {
            char c = s.charAt(pos);
            int symbol = getSymbol(c);
            currentState = table[currentState][symbol];
            if (currentState == ERROR) {
                throw new NumberFormatException(s + " não é um número!");
            }
            if (symbol == DIGIT) {
                number = number * 10 + c - '0';
            }
            if (symbol == SIGNAL) {
//Variable c carries the signal symbol
                signal = signal * (c == '+' ? 1 : -1);
            }
            if (symbol == PONTO){
                 =  + '.' + c;
            }
            // ()
            pos++;
        }
        if (currentState != FINAL) {
            throw new NumberFormatException(s + " não é um número!");
        }
        number = signal * number;
        return number;
    }
    private int getSymbol(char c) {
        if (Character.isDigit(c)) {
            return DIGIT;
        } else if (c == '‐' || c == '+') {
            return SIGNAL;
        } else if (c == '.'){
            return PONTO;
        }else if (c == 'e' || c == 'E'){
            return eE;
        } else {
            return OTHER;
        }
    }
}
