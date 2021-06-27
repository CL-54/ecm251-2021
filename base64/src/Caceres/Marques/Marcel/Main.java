package Caceres.Marques.Marcel;


import java.util.Base64;

public class Main {

    public static void main(String[] args) {

        String textoOriginal = "Q09ESUZJQ0FDQU9CQVNFNjQ";

        System.out.println("Texto original: " + textoOriginal);

        String textoSerializado = Base64.getEncoder().encodeToString(textoOriginal.getBytes());

        System.out.println("Texto em Base64: " + textoSerializado);

        String textoDeserializado = new String(Base64.getDecoder().decode(textoSerializado));

        System.out.println("Texto deserializado: "+ textoDeserializado);

    }
}
