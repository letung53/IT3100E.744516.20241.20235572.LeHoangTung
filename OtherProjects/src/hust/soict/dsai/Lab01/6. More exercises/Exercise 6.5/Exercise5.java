import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5{
    public static void main(String[]args){
        List<Integer> numbers = new ArrayList<>();
        double sum = 0;
        double sumUserInput = 0;
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);
        numbers.add(5);
        numbers.add(70);

        String userOption;
        do {
            userOption = JOptionPane.showInputDialog(null,
                    "<html>"+ "Type 0 to show constant array" +".<br>" + "Type 1 to input your own array"+".</html>", "OPTIONS",
                    JOptionPane.INFORMATION_MESSAGE);
            if (!userOption.equals("0") && !userOption.equals("1")) {
                JOptionPane.showMessageDialog(null, "Invalid option. Please type 0 or 1.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!userOption.equals("0") && !userOption.equals("1"));

        if (userOption.equals("0")){
            JOptionPane.showMessageDialog(null, "INPUT ARRAY: "+ numbers,
            "INPUT", JOptionPane.INFORMATION_MESSAGE);
            Collections.sort(numbers);
            for (double number : numbers){
                sum += number;
            }
            double average = sum / numbers.size();
            JOptionPane.showMessageDialog(null, "<html>"+ "Sorted array:" +".<br>" + numbers+ ".<br>"+"Sum of array: "+sum+".<br>"+"Average: "+average +".</html>",
                    "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
        }
        if (userOption.equals("1")){
            JOptionPane.showMessageDialog(null, "RETURNING TO TERMINAL FOR USER INPUT",
                    "Program", JOptionPane.INFORMATION_MESSAGE);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter numbers separated by spaces:");
            String input = scanner.nextLine();
            String[] numberStrings = input.split(" ");
            List<Integer> numbersUserInput = new ArrayList<>();
            for (String numberString : numberStrings) {
                try {
                    int number1 = Integer.parseInt(numberString); 
                    numbersUserInput.add(number1); 
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number: " + numberString);
                }
            }
            JOptionPane.showMessageDialog(null, "INPUT ARRAY: "+ numbersUserInput,
            "INPUT", JOptionPane.INFORMATION_MESSAGE);
            Collections.sort(numbersUserInput);
            for (double number : numbersUserInput){
                sumUserInput += number;
            }
            double averageUserInput = sumUserInput / numbersUserInput.size();
            JOptionPane.showMessageDialog(null, "<html>"+ "Sorted array:" +".<br>" + numbersUserInput+ ".<br>"+"Sum of array: "+sumUserInput+".<br>"+"Average: "+averageUserInput +".</html>",
                    "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
            scanner.close();
        }
    }
}
