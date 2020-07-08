package com.company.vishalgodia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first number : ");
        String number1 = scanner.next();
        System.out.print("Enter the second number : ");
        String number2 = scanner.next();
        int[] convertNumber1 = new int[number1.length()];
        int[] convertNumber2 = new int[number2.length()];
        for(int i = 0; i < number1.length(); i++ ) {
            convertNumber1[i] = (Integer.parseInt(String.valueOf(number1.charAt(i))));
        }for(int i = 0; i < number2.length(); i++){
            convertNumber2[i] = (Integer.parseInt(String.valueOf(number2.charAt(i))));
        }int p = 0 , q = number1.length() - 1;
        while(p <= q){
            int temp = convertNumber1[p];
            convertNumber1[p] = convertNumber1[q];
            convertNumber1[q] = temp;
        } q = number2.length() - 1;
        while(p <= q){
            int temp = convertNumber1[p];
            convertNumber1[p] = convertNumber1[q];
            convertNumber1[q] = temp;
        }
        if(number1.length() == number2.length()){
            for(int i = 0; i < number1.length(); i++){
                if((convertNumber1[i] + convertNumber2[i]) > 9){
                    int number = convertNumber1[i] + convertNumber2[i];
                    if( i != 0) {
                        convertNumber1[i + 1] += (number / 10);
                        number %= 10;
                        convertNumber1[i] = number;
                    }else{
                        convertNumber1[i] += convertNumber2[i];
                    }
                }else{
                    convertNumber1[i] += convertNumber2[i];
                }
            }for(int i = number1.length() - 1; i >= 0 ; i--){
                System.out.print(convertNumber1[i]);
            }
        }else if(number2.length() > number1.length()){
            for(int i = 0; i < number1.length() - 1; i++){
                if((convertNumber2[i] + convertNumber1[i]) > 9){
                    int number = convertNumber2[i] + convertNumber1[i];
                    if(i != 0) {
                        convertNumber2[i + 1] += (number / 10);
                        number %= 10;
                        convertNumber2[i] = number;
                    }else{
                        convertNumber1[i] += convertNumber2[i];
                    }

                }else{
                    convertNumber2[i] += convertNumber1[i];
                }
            }
            for(int i = number2.length() - 1; i >= 0; i++){
                System.out.print(convertNumber2[i]);
            }
        }else{
            for(int i = 0; i < number2.length() ; i--){
                if((convertNumber1[i] + convertNumber2[i]) > 9){
                    int number = convertNumber1[i] + convertNumber2[i];
                    if( i != 0) {
                        convertNumber1[i + 1] += (number / 10);
                        number %= 10;
                        convertNumber1[i] = number;
                    }else{
                        convertNumber1[i] += convertNumber2[i];
                    }
                }else{
                    convertNumber1[i] += convertNumber2[i];
                }
            }for(int i = number2.length() - 1 ; i >= 0; i--){
                System.out.print(convertNumber1[i]);
            }
        }
        scanner.close();
    }
}
