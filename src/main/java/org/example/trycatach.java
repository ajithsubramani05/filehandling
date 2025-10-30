package org.example;

public class trycatach {
    static void main(String[] args) {
        int m=0;
        int n=10;
        try{
            int ans=n/m;
            System.out.println("Answer: "+ans);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by 0!");
        }
    }
}
