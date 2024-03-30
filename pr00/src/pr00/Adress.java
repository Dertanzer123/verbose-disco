package pr00;

public class Adress {
	private String city;
	private String district;
	private String neighborhood;
	private String streetNo;
	
	public Adress(String city,String district,String neighborhood,String streetNo)
	{
		this.city=city;
		this.district=district;
		this.neighborhood=neighborhood;
		this.streetNo=streetNo;
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

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	
}
