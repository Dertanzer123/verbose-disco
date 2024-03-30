package pr00;

public class MAttribute {
	private String type;
	private String power;
	private String capacity;
	private String size;
	
	public MAttribute(String type,String power,String capacity,String size) {
	this.type    =type;    
	this.power   =power;   	
	this.capacity=capacity;	
	this.size    =size;    	
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
}
