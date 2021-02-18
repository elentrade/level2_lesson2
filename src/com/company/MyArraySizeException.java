package com.company;

public  class MyArraySizeException extends IndexOutOfBoundsException{

MyArraySizeException(){

}
public void printMessage(){
    System.out.println("Your array range isn`t 4x4");
}
}
