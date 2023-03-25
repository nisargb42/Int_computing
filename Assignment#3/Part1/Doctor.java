

public class Doctor extends HospitalEmployee{
	private String specialty;
	
	public Doctor(String name, int number, String specialty) {
		super(name,number);
		this.specialty = specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	@Override
	public String toString() {
	    if (this instanceof Surgeon) {
	        return super.toString() + " Operating: " + ((Surgeon) this).isOperating();
	    } else {
	        return super.toString() + " " + specialty;
	    }
	}
	
	@Override
	public void work() {
		if (this instanceof Surgeon) {
		    if (((Surgeon) this).isOperating()) {
		    	System.out.print(name + " works for the hospital.");
		        
		    } else {
		        System.out.println(name + " is not currently in surgery.");
		    }
		} else {
		    System.out.println(name + " works for the hospital. " + name + " is a(n) " + specialty + " doctor.");
		}
	}

}