package org.example;

import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
       try {
           File obj = new File("myfile.txt.");
           if (obj.createNewFile()) {
               System.out.println("File Created!" + obj.getName());
           } else {
               System.out.println("File already exists.  ");
           }
       }
    catch(IOException e){
            System.out.println("An error has occurred.");
        }
    }
}

