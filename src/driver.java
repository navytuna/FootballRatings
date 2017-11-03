import java.util.Scanner;
   import javax.swing.JOptionPane;
public class driver {
	public int x;
	public double a, b, c, d, e, f, g;
	public String name;
	public static void main(String[] args)
    {
	 x = Integer.parseInt(JOptionPane.showInputDialog("Would you like a Quarterback, RunningBack, or Wide Reciever?(1 for Quarterback, 2 for RunningBack, 3 for Wide Reciever)"));
	 if (x==3){
		 a = Integer.parseInt(JOptionPane.showInputDialog("enter rush yards"));
	 }
    }
}
