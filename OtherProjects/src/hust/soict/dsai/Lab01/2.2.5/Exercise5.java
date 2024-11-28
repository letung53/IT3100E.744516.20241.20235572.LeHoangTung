import javax.swing.JOptionPane;
public class Exercise5 {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first double-type number:", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second double-type number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1-num2;
        double product = num1*num2;
        
        String strQuotent;
        if (num2 != 0) {
            strQuotent = "The quotient is: " + String.valueOf(num1/num2);
        } else {
            strQuotent = "The quotient is: The divisor is 0, so there is no quotient";
        }
        String strProduct = "The product is: " + String.valueOf(product);
        String strDifference = "The difference is: " + String.valueOf(difference);
        String strSum = "The sum is: " + String.valueOf(sum);

        String result = "<html>"+strQuotent+ ".<br>"+ strProduct + ".<br>" + strDifference+".<br>"+ strSum +".</html>";

        JOptionPane.showMessageDialog(null, result, "Basic calculator", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}