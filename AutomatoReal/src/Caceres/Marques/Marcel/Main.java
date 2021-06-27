package Caceres.Marques.Marcel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


        public static void main(String[] args)
        {
            BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
            String in;
            try{
                System.out.println("Digite um número real:");
                in = ler.readLine();
                fa(in);
            }
            catch(IOException e)
            {
                System.err.println(e.toString());
            }
        }
        public static boolean isNum(char foo)
        {
            return (foo >= '0' && foo <= '9');
        }
        public static void fa(String in)
        {
            int state = 0;
            for(int i = 0; i<in.length(); i++)
            {
                char foo = in.charAt(i);

                switch(state){
                    case 0:
                        if(isNum(foo))
                            state = 1;
                        else if(foo == '+' || foo == '-')
                            state = 1;
                        else
                            state = -1;
                        break;

                    case 1:
                        if(isNum(foo))
                            state = 1;
                        else if(foo == '.')
                            state = 7;
                        else if(foo == 'e' || foo == 'E')
                            state = 4;
                        else
                            state = -1;
                        break;

                    case 3:
                        if(isNum(foo))
                            state = 3;
                        else if(foo == 'e' || foo == 'E')
                            state = 4;
                        else
                            state = -1;
                        break;

                    case 4:
                        if(isNum(foo))
                            state = 5;
                        else if(foo == '+' || foo == '-')
                            state = 6;
                        else
                            state = -1;
                        break;

                    case 5:
                        if(isNum(foo))
                            state = 5;
                        else
                            state = -1;
                        break;

                    case 6:
                        if(isNum(foo))
                            state = 5;
                        else
                            state = -1;
                        break;

                    case 7:
                        if(isNum(foo))
                            state = 3;
                        else
                            state = -1;
                }
                if(state == -1)
                    break;
                System.out.println("Estado: "+state+" "+foo);
            }
            if(state==1||state==3||state==5)
                System.out.println("É um número real.");
            else
                System.out.println("Não é um número real.");

        }






}



