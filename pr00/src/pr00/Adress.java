package pr00;

public class Adress {
	private String city;
	private String district;
	private String neighborhood;
	private String street;
	private String apartment;
	private String No;
	
	public Adress(String city,String district,String neighborhood,String street,String apertment,String No)
	{
		this.city=city;
		this.district=district;
		this.neighborhood=neighborhood;
		this.street=street;
		this.apartment=apertment;
		this.No=No;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}
	public String allAdress() 
	{
		String sum="";
		
		if(city!=null) 
		{
			sum=sum+city+" ";
		}
		if(district!=null) 
		{
			sum=sum+district+" ";
		}
		if(neighborhood!=null) 
		{
			sum=sum+neighborhood+" ";
		}
		if(street!=null) 
		{
			sum=sum+street+" ";
		}
		if(No!=null) 
		{
			sum=sum+No;
		}
		if(sum.equals(""))
		{return null;}
		else {
		return sum;
		}
	}
}
