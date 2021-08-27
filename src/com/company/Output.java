package com.company;


import java.io.File;
import java.util.Random;
import java.util.Scanner;
public class Output {

    public static String NameTittle() {
        String[] str = new String[10000];
        int ll=0,i;
        try {
            File Txt = new File("Infile.txt");
            Scanner Input = new Scanner(Txt);
            i=0;
            while(Input.hasNextLine()) {
                str[i] = Input.nextLine();
                i++;
            }
            Random random = new Random();
            ll = random.nextInt(i);
        }catch (Exception e){
            System.out.println("not Found");
        }
        return str[ll];
    }

}
