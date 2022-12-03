package patientinformation;

public class CoronaPatient extends NormalPatient implements CoronaSymptoms {
	
	    int hfever;
	    int a;
	    String answer;
	    String answer1;
	    String answer2;
		boolean yn;
	   
	CoronaPatient(){
		
		System.out.println("Please Provide your current health information");
	}

	 public void highFever(int i) {

	     if (hfever >= 100 )
	     {
	    	System.out.println("This Patient Has High Fever");
	     }
	    
	     else
	     { 
	        System.out.println("This Patient is Normal");
	     }
	}

	public void breathingProblem(String answer) {
		
		if (answer.equals("y")) {
		     yn = true;
		     System.out.println("This Patient Has breathing problem");
		   } else if (answer.equals("n")) {
		     yn = false;
		     System.out.println("This Patient Has no breathing problem");
		   } else {
		      System.out.println("Sorry, I didn't catch that. Please answer y/n");
		   }	
	}
	
	public void dryCough(String answer1) {
		
		if (answer1.equals("y")) {
		     yn = true;
		     System.out.println("This Patient Has dry cough");
		   } else if (answer1.equals("n")) {
		     yn = false;
		     System.out.println("This Patient Has no cough");
		   } else {
		      System.out.println("Sorry, I didn't catch that. Please answer y/n");
		   }	
	}

	public void throatPain(String answer2) {
   
		 if (answer2.equals("y")) {
		     yn = true;
		     System.out.println("This Patient Has throat pain");
		   } else if (answer2.equals("n")) {
		     yn = false;
		     System.out.println("This Patient Has no throat pain");
		   } else {
		      System.out.println("Sorry, I didn't catch that. Please answer y/n");
		   }	
	}

	public void normalFever() {
		// TODO Auto-generated method stub
		
	}
	
	public void normalCough() {
		// TODO Auto-generated method stub
		
	}

	public void normalbreathingProblem() {
		// TODO Auto-generated method stub
		
	}


	


}