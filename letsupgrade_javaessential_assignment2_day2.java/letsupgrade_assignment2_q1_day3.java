package com.percentage_grade;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//Take 5 subjects marks each subject 100 marks;
        //calculate the percentage;
        //based on the percentage print the grade and the percentage
        Scanner sc=new Scanner(System.in);
        float maths_marks,science_marks,english_marks,hindi_marks,social_marks;
        float percentage;
        float total_marks;
        int highest_mark=500;

        System.out.println("each subject marks");
        System.out.println("maths:");
        maths_marks=sc.nextFloat();
        System.out.println("science:");
        science_marks= sc.nextFloat();
        System.out.println("english:");
        english_marks=sc.nextFloat();
        System.out.println("hindi:");
        hindi_marks=sc.nextFloat();
        System.out.println("social:");
        social_marks=sc.nextFloat();

        total_marks= maths_marks + science_marks+english_marks+hindi_marks+social_marks;
        System.out.println("total_marks:"+total_marks);
        percentage= (total_marks/highest_mark) * 100;
        System.out.println("percentage:"+percentage);

        if(percentage>=90 && percentage<=100){
            System.out.println("Your Grade is A");
        }
        else if(percentage>=80 && percentage<90){
            System.out.println("Your Grade is B");
        }
        else if(percentage>=70 && percentage<80){
            System.out.println("Your Grade is C");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("Your Grade is D");
        }
        else{
            System.out.println("your Grade is F");
        }
    }
}
