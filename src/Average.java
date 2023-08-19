import javax.swing.JOptionPane;

public class Average {
    public static void main(String[] args) {
        String firstNumber,
                secondNumber,
                thirdNumber,
                fourthNumber,
                fifthNumber;

        double number1,
                number2,
                number3,
                number4,
                number5,
                sum,
                average;

        firstNumber = JOptionPane.showInputDialog(null, "Enter first number in the range 1 - 100");
        secondNumber = JOptionPane.showInputDialog(null, "Enter second number in the range 1 - 100");
        thirdNumber = JOptionPane.showInputDialog(null, "Enter third number in the range 1 - 100");
        fourthNumber = JOptionPane.showInputDialog(null, "Enter fourth number in the range 1 - 100");
        fifthNumber = JOptionPane.showInputDialog(null, "Enter fifth number in the range 1 - 100");

        number1 = Double.parseDouble(firstNumber);
        number2 = Double.parseDouble(secondNumber);
        number3 = Double.parseDouble(thirdNumber);
        number4 = Double.parseDouble(fourthNumber);
        number5 = Double.parseDouble(fifthNumber);

        sum = number1 + number2 + number3 + number4 + number5;
        average = sum / 5;

        JOptionPane.showMessageDialog(null, "The average of " + firstNumber
                + " " + secondNumber + " " + thirdNumber + " " + fourthNumber + " " + fifthNumber
                + " is " + average, "Result", JOptionPane.PLAIN_MESSAGE);
    }
}
