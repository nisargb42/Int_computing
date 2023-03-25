
public class Nurse extends  HospitalEmployee{
	private int numOfPatients;
	
	public Nurse(String name, int number, int numOfPatients) {
		super(name, number);
		this.numOfPatients = numOfPatients;
	}
	
	public int getNumOfPatients() {
		return numOfPatients;
	}
	
	public void setNumOfPatients(int numOfPatients) {
		this.numOfPatients = numOfPatients;
	}
	
	@Override
	public String toString() {
		 return "Nurse{" +
	            "name='" + name + '\'' +
	            ", number=" + number +
	            ", numOfPatients=" + numOfPatients +
	                '}';
	}
	
	@Override
	public void work() {
		System.out.println(name+ " works for the hospital. " + name + " is a nurse with " + numOfPatients + " patients.");
	}
}
