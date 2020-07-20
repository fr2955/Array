package com.frankricker.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;

public class Array {

    private int[] internalArray = new int[10];


    public Array(){

    }


    public int[] getInternalArray() {
        return internalArray;
    }

    public void setInternalArray(int[] internalArray) {
        this.internalArray = internalArray;
    }

    public void keyIn(){
        Scanner scanner = new Scanner(System.in);
        for(int x = 0; x < 10; x++){
            System.out.printf("Enter value for int array position %1d: ", x);
            this.internalArray[x] = scanner.nextInt();
        }
    }

    public void print(){
         System.out.println(Arrays.toString(this.internalArray));
    }

    public OptionalDouble average(){
        return Arrays.stream(this.internalArray).average();
    }

    public int sum(){
        return Arrays.stream(this.internalArray).sum();
    }
    public OptionalInt smallestValue(){
        return Arrays.stream(this.internalArray).min();
    }

    public OptionalInt largestValue(){
        return Arrays.stream(this.internalArray).max();
    }
    public void arrayInfo(){
        System.out.println("The average value is: " + this.average().toString());
        System.out.println("The minimum value is: " +  this.smallestValue().toString());
        System.out.println("The largest value is: " + this.largestValue().toString());
        System.out.println("The sum is: " + this.sum());

    }
    public void arrayInfoByLoop(){
        int placeHolder;
        System.out.print("\nThe values of the array are : (");

        for(int x = 0; x < 9; x++){
            System.out.print(this.internalArray[x]+ ", ");
        }
        System.out.print(this.internalArray[9]);
        System.out.print(")\n\n");

        System.out.print("The average value is : ");

        int sum = 0;

        for(int x = 0; x < 10; x++){
            sum = sum + this.internalArray[x];
        }
        System.out.print((sum/10) + "\n\n");

        System.out.print("The sum is: " + sum + "\n\n");

        System.out.print("The smallest value is: ");
        placeHolder = this.internalArray[0];
        for(int x = 0; x < 10; x++){
            if(placeHolder > this.internalArray[x]){
                placeHolder = this.internalArray[x];
            }
        }
        System.out.print(placeHolder + "\n\n");

        System.out.print("The smallest value is: ");
        placeHolder = this.internalArray[0];
        for(int x = 0; x < 10; x++){
            if(placeHolder < this.internalArray[x]){
                placeHolder = this.internalArray[x];
            }
        }
        System.out.print(placeHolder + "\n\n");

    }

}
