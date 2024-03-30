package pr00;

import pr00.MAttribute;

public class Machine {
	private String     name;
	private MAttribute attributes;
	private String     model;
	private String     origin;
	private String     unit;
	private String     quantity;
	private String     unitprice;
	
	Machine(String name,String model,String origin,String unit,String quantity,String unitprice,MAttribute attributes)
	{
		  
		this.name=name;      
		this.attributes=attributes;
		this.model=model;     
		this.origin=origin;    
		this.unit=unit;      
		this.quantity=quantity;  
	   this.unitprice=unitprice; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MAttribute getAttributes() {
		return attributes;
	}

	public void setAttributes(MAttribute attributes) {
		this.attributes = attributes;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}
	
	
	
}
