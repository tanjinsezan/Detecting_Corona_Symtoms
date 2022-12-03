package patientinformation;

public abstract class NormalPatient implements OtherSymtoms {

	 int nfever;
	 String answer3;
	 String answer5;
	 boolean yn;
	
	 NormalPatient()
	  {
		  System.out.println("Welcome to the Virtual COVID-19 test");
	  }

	 
    public void normalFever(int j) {
	 
	 if (nfever <= 100 )
     {
    	System.out.println("This Patient Has normal fever");
     }
    
     else
     { 
        System.out.println("This Patient has high fever");
     }
    }

	public void normalCough(String answer3){
		
		if (answer3.equals("y")) {
		     yn = true;
		     System.out.println("This Patient Has normal cough");
		   } else if (answer3.equals("n")) {
		     yn = false;
		     System.out.println("This Patient Has major dry cough");
		   } else {
		      System.out.println("Sorry, I didn't catch that. Please answer y/n");
		   }	
		 
}
   
	public void normalbreathingProblem(String answer4) {
		 
		if (answer4.equals("y")) {
		     yn = true;
		     System.out.println("This Patient Has normal breathing problem");
		   } else if (answer4.equals("n")) {
		     yn = false;
		     System.out.println("This Patient Has major breathing problem");
		   } else {
		      System.out.println("Sorry, I didn't catch that. Please answer y/n");
		   }	
    	
	    }
	

	public void highFever() {
		// TODO Auto-generated method stub
		
	}

	public void dryCough() {
		// TODO Auto-generated method stub
		
	}


	public void throatPain() {
		// TODO Auto-generated method stub
		
	}

	public void breathingProblem() {
		// TODO Auto-generated method stub
		
	}


}