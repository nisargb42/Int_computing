
public class HospitalEmployee{
	protected String name;
	protected int number;
	
	public HospitalEmployee(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void work() {
		System.out.println (name + " works for the hospital.");
	}
	
	@Override
	public String toString() {
        return "HospitalEmployee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
	}
	
}