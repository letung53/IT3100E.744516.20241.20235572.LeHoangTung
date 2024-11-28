import javax.swing.JOptionPane;

public class Exercise4Test {
    public static void main(String[]args){
        int year = 0;
        String monthset = "JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecemberJan.Feb.Mar.Apr.May.June.July.Aug.Sept.Oct.Nov.Dec.123456789101112";
        boolean validInput =  false;
        
        while (validInput == false){
            try {
                String yearInput = JOptionPane.showInputDialog(null,
                "Year:", "Please input Year",
                JOptionPane.INFORMATION_MESSAGE);

                year = Integer.parseInt(yearInput);

                if (year < 0){
                    throw new IllegalArgumentException("You typed an invalid year, year must be above 0!");
                }

                String monthInput = JOptionPane.showInputDialog(null,
                "Month:", "Please input Month",
                JOptionPane.INFORMATION_MESSAGE);

                if (monthInput == null || monthInput.trim().isEmpty()) {
                    throw new IllegalArgumentException("You must input a valid month!");
                }
                if (!monthset.contains(monthInput)){
                    throw new IllegalArgumentException("You typed an invalid month!");
                }
                validInput = true;

                
                switch (monthInput) {
                    case "January":
                    case "March":
                    case "May":
                    case "July":
                    case "August":
                    case "October":
                    case "December":
                    case "1":
                    case "3": 
                    case "5": 
                    case "7": 
                    case "8": 
                    case "10": 
                    case "12": 
                    case "Jan":
                    case "Mar":
                    case "Jul":
                    case "Aug":
                    case "Oct":
                    case "Dec":
                    case "Jan.":
                    case "Mar.":
                    case "May.":
                    case "Jul.":
                    case "Aug.":
                    case "Oct.":
                    case "Dec.":

                    JOptionPane.showMessageDialog(null, "The month you typed has 31 days!");
                        break;
            
                    case "April":
                    case "June":
                    case "September":
                    case "November":
                    case "4":  
                    case "6": 
                    case "9":  
                    case "11":
                    case "Apr":
                    case "Jun":
                    case "Sep":
                    case "Nov":
                    case "Apr.":
                    case "Jun.":
                    case "Sept.":
                    case "Nov.":
                    JOptionPane.showMessageDialog(null, "The month you typed has 30 days!");
                        break;
                    
                    case "2":
                    case "February":
                    case "Feb":
                    case "Feb.":
                    if ((year % 4 == 0 && year%100 >0) || (year%400 == 0)){
                        JOptionPane.showMessageDialog(null, "You typed in a leap year, so the month you typed (February) has 29 days!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "You typed in a normal year, so the month you typed (February) has 28 days!");
                    }
            }}
            catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input!");
        }   catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
            
    }
        
}
}}