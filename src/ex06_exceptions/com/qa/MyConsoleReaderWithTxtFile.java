package ex06_exceptions.com.qa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleReaderWithTxtFile {


    public void readInputPrint() {
        StringBuffer sb = new StringBuffer();

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\workspace_intellij\\qa\\src\\ex06_exceptions\\com\\qa\\text.txt"))) {
            System.out.println("Enter a line of text or 'stop'");
            String line = br.readLine();

            try {
                while (!line.equals("stop")) {

                    sb.append(line + "\n");
                    //System.out.println("Enter a line of text or 'stop'");
                    line = br.readLine();
                }  } catch (NullPointerException io) {
                System.out.println("Exception Nullpointer -> " + io.getMessage());
                //io.printStackTrace();
            }

        } catch (IOException io) {
            System.out.println("Exception io " + io.getMessage());
            io.printStackTrace();
        }
        System.out.println(sb);

    }


    public static void main(String[] args) {
        MyConsoleReaderWithTxtFile mcr = new MyConsoleReaderWithTxtFile();
        mcr.readInputPrint();
    }
}
