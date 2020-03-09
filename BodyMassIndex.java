/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindex;
import java.util.Scanner;

/* 
    Saul Gordillo,
    CSC-210,
    Homework 1 - Body Mass Index
*/

public class BodyMassIndex {
    
    public static double resultEnglish = 0.0;
    public static double resultMetric = 0.0;
    
    public static void setBodyMassIndexMetric(double mass, double height){
        resultMetric = mass/Math.pow(height, 2);
    }
    
    public static void setBodyMassIndexEnglish(double mass,double height){
        resultEnglish = (mass/Math.pow(height,2))*703;
    }
  
    public static double getBodyMassIndexMetric(){
        return resultMetric;
    }
    
    public static double getBodyMassIndexEnglish(){
        return resultEnglish;
    }
    
    
    public static void main(String[] args) {
        System.out.println("****************************************");
        System.out.println("Welcome to Saul's BMI Calculator");
        System.out.println("****************************************");
        System.out.println("Choose Metric System or English System");
        
        Scanner conditionalObj = new Scanner(System.in);
        System.out.println("A = English B = Metric");
        String answer = conditionalObj.nextLine();
        
        
        if("A".equals(answer)){
            Scanner englishMass= new Scanner(System.in);
            Scanner englishHeight = new Scanner(System.in);
            
            System.out.println("Enter weight in pounds");
            String inputMass = englishMass.nextLine();
            System.out.println("Enter height in inches");
            String inputHeight = englishHeight.nextLine();
            System.out.println("****************************************");
            
            double mass = Double.parseDouble(inputMass);
            double height = Double.parseDouble(inputHeight);
            
            setBodyMassIndexEnglish(mass,height);
            System.out.println("Your BMI is: " + getBodyMassIndexEnglish());
       
        }else if("B".equals(answer)){
            Scanner metricMass= new Scanner(System.in);
            Scanner metricHeight = new Scanner(System.in);
            
            System.out.println("Enter weight in kg");
            String inputMass = metricMass.nextLine();
            System.out.println("Enter height in meters");
            String inputHeight = metricHeight.nextLine();
            System.out.println("****************************************");
            
            double mass = Double.parseDouble(inputMass);
            double height = Double.parseDouble(inputHeight);
            
            setBodyMassIndexMetric(mass,height);
            System.out.println("Your BMI is: " + getBodyMassIndexMetric());
            
        }else{
            System.out.println("*Incorrect Input*");
        }
        
        
    }
    
}
