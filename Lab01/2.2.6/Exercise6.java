import javax.swing.JOptionPane;
public class Exercise6 {
    public static void main(String[] args){
        boolean continuesolving  = true;
        while (continuesolving == true){    
            String optionsmessage = "<html>"+"Type 1 for solving first-degree equation"+
        ".<br>"+ "Type 2 for solving a system of first-degree equations" + 
        ".<br>" + "Type 3 for solving second-degree equation"+".</html>";
            String options;
            options = JOptionPane.showInputDialog(null,
            optionsmessage, "Please input your problem",
            JOptionPane.INFORMATION_MESSAGE);
            double option = Double.parseDouble(options);



            if (option == 1){
                continuesolving = false;
                String coeffA = JOptionPane.showInputDialog(null,
            "a = ", "You are solving 0 = ax+b",
            JOptionPane.INFORMATION_MESSAGE);
                String coeffB = JOptionPane.showInputDialog(null,
            "b = ", "You are solving 0 = ax+b",
                JOptionPane.INFORMATION_MESSAGE);
                double coeffAnum = Double.parseDouble(coeffA);
                double coeffBnum = Double.parseDouble(coeffB);
                if (coeffAnum !=0){
                    double result = -(coeffAnum/coeffBnum);
                    JOptionPane.showMessageDialog(null, "Your result is x = " + result,
                    "ANSWER", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }else {
                    JOptionPane.showMessageDialog(null, "a = 0, NO ANSWER, PLEASE RETURN",
                    "ANSWER", JOptionPane.INFORMATION_MESSAGE);
                    continuesolving = true;
            
                    }
                }
            if (option == 2){
                continuesolving = false;
                double a11 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "a11 = ", "FIRST EQUATION a11*x1 + a12*x2 = b1",
                JOptionPane.INFORMATION_MESSAGE));
                double a12 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "a12 = ", "FIRST EQUATION a11*x1 + a12*x2 = b1",
                JOptionPane.INFORMATION_MESSAGE));
                double b1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "b1 = ", "FIRST EQUATION a11*x1 + a12*x2 = b1",
                JOptionPane.INFORMATION_MESSAGE));
                double a21 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "a21 = ", "SECOND EQUATION a21*x1 + a22*x2 = b2",
                JOptionPane.INFORMATION_MESSAGE));
                double a22 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "a22 = ", "SECOND EQUATION a11*x1 + a12*x2 = b2",
                JOptionPane.INFORMATION_MESSAGE));
                double b2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "b2 = ", "SECOND EQUATION a21*x1 + a22*x2 = b2",
                JOptionPane.INFORMATION_MESSAGE));

                double D = a11 * a22 - a12 * a21;
                double D1 = b1 * a22 - b2 * a12;
                double D2 = a11 * b2 - a21 * b1;

                if (D != 0){
                    double x1 = D1/D;
                    double x2 = D2/D;
                    JOptionPane.showMessageDialog(null,"<html>"+ "Your result is x1 = "+ x1+ " and x2 = "+x2 ,
                    "ANSWER", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);}
                if (D == 0){
                    if (D1 == 0 && D2 == 0){
                        JOptionPane.showMessageDialog(null,"The system of equations have infinitely many solutions." ,
                        "ANSWER", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(null,"The system of equations have no solutions." ,
                        "ANSWER", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);}
                    }}
            if (option == 3){
                continuesolving = false;
                double a =  Double.parseDouble(JOptionPane.showInputDialog(null,
                "a = ", "SECOND ORDER EQUATION a*x^2+b*x+c = 0",
                JOptionPane.INFORMATION_MESSAGE));
                double b =  Double.parseDouble(JOptionPane.showInputDialog(null,
                "a = ", "SECOND ORDER EQUATION a*x^2+b*x+c = 0",
                JOptionPane.INFORMATION_MESSAGE));
                double c =  Double.parseDouble(JOptionPane.showInputDialog(null,
                "a = ", "SECOND ORDER EQUATION a*x^2+b*x+c = 0",
                JOptionPane.INFORMATION_MESSAGE));
                double delta = Math.pow(b, 2) - 4*a*c ;
                if (a==0){
                    JOptionPane.showMessageDialog(null, "YOUR INPUT: a = 0. Therefore, x = -(c/b) = " + -(c/b),
                    "ANSWER", JOptionPane.INFORMATION_MESSAGE);}
                else{
                    if (delta < 0){
                        JOptionPane.showMessageDialog(null, "YOUR INPUT: Delta < 0 .\nTherefore, no solution is possible in the real number space.",
                    "ANSWER", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);}
                    if (delta == 0){
                        JOptionPane.showMessageDialog(null, "YOUR INPUT: Delta = 0 .\nTherefore, only one root is feasible, x = " + -(b/(2*a)) ,
                        "ANSWER", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);}
                    else{
                        JOptionPane.showMessageDialog(null, "YOUR INPUT: Delta = 0 .\nTherefore, there are two roots, x1 = " + ((-b)+Math.sqrt(delta))/(2*a) + "and x2 = " + ((-b)-Math.sqrt(delta))/(2*a),
                        "ANSWER", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);}
                    }}}}}
    
    