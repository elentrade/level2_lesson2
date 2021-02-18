package com.company;

public class MyArrayDataException extends NumberFormatException{
int i;
int j;
    MyArrayDataException(int i, int j){
this.i = i;
this.j = j;
    }
public void printMessage(){
    System.out.println("Data format in adress: ["+i+"]["+j+"] can`t be transformed to Integer");
}
}
