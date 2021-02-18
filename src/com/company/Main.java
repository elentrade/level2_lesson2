package com.company;

public class Main {
public static void sumArrayUnits(String[][] arr) throws MyArraySizeException, MyArrayDataException{
    int s = arr.length;
    if(arr.length!=4){
        throw new MyArraySizeException();
    }
    else {
        int count_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i].length!=4){
                    throw new MyArraySizeException();
                }
                try{
                    count_sum = count_sum + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
                }
                }
        System.out.println("Sum all units of array is " + count_sum);
            }

            }








    public static void main(String[] args) {

	String [][] array = new String[][] {{"1",  "2", "50","300"},{"2", "5", "320", "500"},{"5", "u","1820", "200"},{"1", "53", "180", "20"}};
    try {
        sumArrayUnits(array);
    }
	catch (MyArraySizeException e1){
        e1.printMessage();

    }
    catch (MyArrayDataException e2) {
        e2.printMessage();
    }
    }


}
