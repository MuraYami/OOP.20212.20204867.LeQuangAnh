package Ex225_226;
import javax.swing.JOptionPane;
import java.lang.Math; 

public class Ex226 {
    public static void main(String args[]) {

        //ax + b = 0
        String str1, str2;
        
        str1 = JOptionPane.showInputDialog(null, 
                "Please input a: ", "The first-degree equation with one variable", 
                JOptionPane.INFORMATION_MESSAGE);
        str2 = JOptionPane.showInputDialog(null, 
                "Please input b: ", "The first-degree equation with one variable", 
                JOptionPane.INFORMATION_MESSAGE);
        
        double a = Double.parseDouble(str1);
        double b = Double.parseDouble(str2);
        double x;
        if (a == 0 ) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "This equation always true with any x");
            } else {
                JOptionPane.showMessageDialog(null, "This equation have no root ");
            }
        } else {
            x = - b / a;
            JOptionPane.showMessageDialog(null, "Root of equation: " + (x));
        }

        //System of equation
        String sa11, sa12, sa21, sa22, sb1, sb2;

        sa11 = JOptionPane.showInputDialog(null, 
                "Please input a11: ", "The system of first-degree equation with two variable", 
                JOptionPane.INFORMATION_MESSAGE);
        sa12 = JOptionPane.showInputDialog(null, 
                "Please input a12: ", "The system of first-degree equation with two variable", 
                JOptionPane.INFORMATION_MESSAGE);
        sb1 = JOptionPane.showInputDialog(null, 
                "Please input b1: ", "The system of first-degree equation with two variable", 
                JOptionPane.INFORMATION_MESSAGE);        
        sa21 = JOptionPane.showInputDialog(null, 
                "Please input a21: ", "The system of first-degree equation with two variable", 
                JOptionPane.INFORMATION_MESSAGE);
        sa22 = JOptionPane.showInputDialog(null, 
                "Please input a22: ", "The system of first-degree equation with two variable", 
                JOptionPane.INFORMATION_MESSAGE);
        sb2 = JOptionPane.showInputDialog(null, 
                "Please input b2: ", "The system of first-degree equation with two variable", 
                JOptionPane.INFORMATION_MESSAGE);
        
        double a11 = Double.parseDouble(sa11);
        double a12 = Double.parseDouble(sa12);
        double a21 = Double.parseDouble(sa21);
        double a22 = Double.parseDouble(sa22);
        double b1 = Double.parseDouble(sb1);
        double b2 = Double.parseDouble(sb2);
        double x1, x2;
        
        if (a11 / a21 == a12 / a22) {
            if (a11 / a12 == b1/ b2 ) {
                JOptionPane.showMessageDialog(null, "the system always true with any x1 and x2");
            } else {
                JOptionPane.showMessageDialog(null, "the system have no solution");
            }
        } else {
            x2 = (b2*a11 - b1*a21) / (a22*a11 - a12*a21);
            x1 = (b2*a12 - b1*a22) / (a12*a21 - a11*a22);
            JOptionPane.showMessageDialog(null, "x1 = " + x1 +" x2 = " + x2 );
        }

        // The second-degree equation with one variable
        String sa, sb, sc;

        sa = JOptionPane.showInputDialog(null, 
                "Please input A: ", "The system of second-degree equation with one variable", 
                JOptionPane.INFORMATION_MESSAGE);
        sb = JOptionPane.showInputDialog(null, 
                "Please input B: ", "The system of second-degree equation with one variable", 
                JOptionPane.INFORMATION_MESSAGE);
        sc = JOptionPane.showInputDialog(null, 
                "Please input C: ", "The system of second-degree equation with one variable", 
                JOptionPane.INFORMATION_MESSAGE);
        
        double A = Double.parseDouble(sa);
        double B = Double.parseDouble(sb);
        double C = Double.parseDouble(sc);
        double delta, n1, n2;

        delta = (B*B - 4*A*C);

        if (delta < 0 ) {
            JOptionPane.showMessageDialog(null, "no root x1, x2");
        } else {
            if (delta == 0) {
                JOptionPane.showMessageDialog(null, "the equation have x1 = x2 = " + (-B / (2*A)));
            } else {
                n1 = (-B - Math.sqrt(delta)) / (2 * A);
                n2 = (-B + Math.sqrt(delta)) / (2 * A);
                JOptionPane.showMessageDialog(null, "x1 = " + n1 + " x2 = " + n2);
                
            }
        }

        System.exit(0);
    }
    
}
