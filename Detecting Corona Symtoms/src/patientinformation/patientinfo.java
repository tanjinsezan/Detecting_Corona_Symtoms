package patientinformation;

import java.util.*;

import javax.swing.JOptionPane;

public class patientinfo {

	public static void main
	(String[] args) {
		
		final Formatter x;
	    try {
		    x = new Formatter("patientinformation.txt");
		    System.out.println("You have put your information on a file");
		 }
		 
		 catch(Exception e) {
	         System.out.println("Unable to open file");
		 }

	    
	    int i = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your body temperature"));
	    String answer = JOptionPane.showInputDialog(null,"Do you have any breathing problem ? Please answer y/n" );
	    String answer1 = JOptionPane.showInputDialog(null,"Do you have any dry cough ? Please answer y/n" );
	    String answer2 = JOptionPane.showInputDialog(null,"Do you have any throat pain Please answer y/n?" );
	    int j = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your body temperature again.?"));
	    String answer3 = JOptionPane.showInputDialog(null,"Do you think you have normal cough ? Please answer y/n" );
	    String answer4 = JOptionPane.showInputDialog(null,"Do you think you have normal breathing problem.? Please answer y/n" );
		
	    CoronaPatient p1 = new CoronaPatient();
	   
	    p1.highFever(i);
	    p1.breathingProblem(answer);
	    p1.dryCough(answer1);
	    p1.throatPain(answer2);
	    p1.normalFever(j);
	    p1.normalCough(answer3);
		p1.normalbreathingProblem(answer4);
		System.out.println("If most of the answer is yes then you should contact to your nearby COVID-19 testing lab to colect your sample");
		    

	}

}
