import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog(null, "What is your test score?");
	double s = Double.parseDouble(score);
	if(s<=100&&s>90) {
		JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
	}
	else if(s<=90&&s>80) {
		JOptionPane.showMessageDialog(null, "At least you passed!");
	}
	else if(s<=80&&s>70) {
		JOptionPane.showMessageDialog(null, "Better luck next time");
	}
	else if(s<=70&&s>60) {
		JOptionPane.showMessageDialog(null, "Actually try in life");
	}
	else if(s<=60&&s>50) {
		JOptionPane.showMessageDialog(null, "You are a complete failure");
	}
	else {
		JOptionPane.showMessageDialog(null, "Your world is ending");
	}
}
}
