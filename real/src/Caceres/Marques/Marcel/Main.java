package Caceres.Marques.Marcel;

public class Main {

    public static void main(String[] args) {
        Recognizer rec = new Recognizer();
        try {
            int i = rec.recognize("123");
            System.out.println(i);
            i = rec.recognize("‐123");
            System.out.println(i);
//Uncomment the lines below to see its effect...
            i = rec.recognize("123A");
            i = rec.recognize("NCC1701");

        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}