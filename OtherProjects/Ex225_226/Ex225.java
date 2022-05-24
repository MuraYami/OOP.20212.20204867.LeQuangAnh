package Ex225_226;
import javax.swing.JOptionPane;

public class Ex225 {
    public static void main(String[] args) {
        String sNum1, sNum2;
        
        sNum1 = JOptionPane.showInputDialog(null, 
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        sNum2 = JOptionPane.showInputDialog(null, 
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        double dNum1 = Double.parseDouble(sNum1);
        double dNum2 = Double.parseDouble(sNum2);

        JOptionPane.showMessageDialog(null, "sum: " + ( dNum1 + dNum2));
        JOptionPane.showMessageDialog(null, "difference: " + ( dNum1 - dNum2));
        JOptionPane.showMessageDialog(null, "product: " + ( dNum1 * dNum2));
        JOptionPane.showMessageDialog(null, "quotient: " + ( dNum1 / dNum2));
    }
}