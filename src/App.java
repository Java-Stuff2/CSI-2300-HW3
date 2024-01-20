import java.util.Scanner;
/*Assignment 3 - A simple command line application for metric converter
 *User 
 * 
 */

public class App {
    public static void main(String[] args) {
        double numBer;//
        int select;//intializes the select variable to int data type. The variable is used for selection made by user
        System.out.println("Welcome to metric converter 1.0!");
        Scanner input = new Scanner(System.in);//
        System.out.println("Please select an option. For example, type: 1 (on the console)");
        System.out.println("1: Grams to Ounces    2:Kilograms to Pounds");
        System.out.println("3: Meters to Feet     4:Centimeters to Inches");
        System.out.println("-1: Exit");//The selection menu for the user 
        select = input.nextInt();//Records user's input
        if (select == -1){
            System.out.println("Thank you for using Metric Converter. Have a great day!");
        }
        double gto, kmtp, mtf, cmtin;//variables for the metric conversion
    
        /*While loop is used for the selection menu to loop over and over again until user selects -1
         * If loop used for if user selects options 1, 2, 3, 4 then it prompts user to input a number (number can be a decimal)
         */
        while (select != -1) {
            if (select == 1 || select == 2 || select == 3 || select == 4) {
                Scanner inPut = new Scanner(System.in);
                System.out.println("Input number: ");
                numBer = inPut.nextDouble();//records user's input
                switch (select) {
                    /*case 1 is grams to ounces (gto)
                     * case 2 is kilometers to pounds (kmtp)
                     * case 3 is meters to feet (mtf)
                     * case 4 is centimeters to inches (cmtin)
                     */
                    case 1:
                        gto = numBer * 0.035274;//
                        System.out.println(numBer + " grams is " + gto + " ounces.");
                        break;
                    case 2:
                        kmtp = numBer * 2.20462;
                        System.out.println(numBer + " kilograms is " + kmtp + " pounds.");
                        break;
                    case 3:
                        mtf = numBer * 3.28084;
                        System.out.println(numBer + " meters is " + mtf + " feet.");
                        break;
                    case 4:
                        cmtin = numBer * 0.393701;
                        System.out.println(numBer + " centimeters is " + cmtin + " inches.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid option.");
            }
            
            System.out.println("Please select an option. For example, 1");
            System.out.println("1: Grams to Ounces    2:Kilograms to Pounds");
            System.out.println("3: Meters to Feet     4:Centimeters to Inches");
            System.out.println("-1: Exit");
            select = input.nextInt();
            if(select == -1){
                System.out.println("Thank you for using Metric Converter 1.0. Have a great day!");
            }
        }
    }
}
