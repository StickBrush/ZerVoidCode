package org.zervoid.code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.io.FileWriter;

public class ZeroToJava{
    private static class NotZeroException extends Exception{}

    public static void main(String[] args) throws FileNotFoundException, IOException, NotZeroException{
        boolean exit=false;
        BufferedReader read;
        read = new BufferedReader(new FileReader("code.zero"));
        BufferedWriter write;
        if(read.readLine()!=null)
            throw new NotZeroException();
        else{
            write=new BufferedWriter(new FileWriter("ZerVoid.java"));
            write.write("import java.util.Scanner;");
            write.newLine();
            write.write("public class ZeroCode{");
            write.newLine();
            write.write("public static void main(String[] args){");
            write.newLine();
            write.write("Integer[] integers=new Integer[1024];");
            write.newLine();
            write.write("String[] strings=new String[1024];");
            write.newLine();
            write.write("Scanner s=new Scanner(System.in);");
            write.newLine();
            Random RNG=new Random();
            Integer ChaosRulette;
            while(!exit){
                ChaosRulette=RNG.nextInt(8);
                switch (ChaosRulette) {
                    case 0:
                        write.write("integers["+RNG.nextInt(1024)+"]="+RNG.nextInt()+";");
                        break;
                    case 1:
                        write.write("integers["+RNG.nextInt(1024)+"]=s.newInt();");
                        break;
                    case 2:
                        write.write("integers["+RNG.nextInt(1024)+"]=integers["+RNG.nextInt(1024)+"];");
                        break;
                    case 3:
                        write.write("System.out.println(integers["+RNG.nextInt(1024)+"]);");
                        break;
                    case 4:
                        write.write("strings["+RNG.nextInt(1024)+"]=s.newLine();");
                        break;
                    case 5:
                        write.write("strings["+RNG.nextInt(1024)+"]=strings["+RNG.nextInt(1024)+"];");
                        break;
                    case 6:
                        write.write("System.out.println(strings["+RNG.nextInt(1024)+"]);");
                        break;
                    case 7:
                        exit=true;
                        break;
                }
                write.newLine();
            }
            write.write("}");
            write.newLine();
            write.write("}");
            write.newLine();
            read.close();
            write.close();
        }
    }

}