package pr00;

import pr00.Adress;

public class Corp {
	private String corpName;
	private String taxNum;
	private String taxCenterName;
	private String commercialRegNum;
	private Adress adress;
	private String phonenum;
	private String faxnum;
	private String email;
	public Corp(String corpName,String taxNum,String taxCenterName,String commercialRegNum,Adress adress,String phonenum,String faxnum,String email)
	{
		this.corpName =corpName;        
		this.taxNum=taxNum;          
		this.taxCenterName=taxCenterName;   
		this.commercialRegNum=commercialRegNum;
		this.adress=adress;          
		this.phonenum=phonenum;        
		this.faxnum=faxnum;          
		this.email=email;           
	}
	public String getCorpName() {
		return corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}
	public String getTaxNum() {
		return taxNum;
	}
	public void setTaxNum(String taxNum) {
		this.taxNum = taxNum;
	}
	public String getTaxCenterName() {
		return taxCenterName;
	}
	public void setTaxCenterName(String taxCenterName) {
		this.taxCenterName = taxCenterName;
	}
	public String getCommercialRegNum() {
		return commercialRegNum;
	}
	public void setCommercialRegNum(String commercialRegNum) {
		this.commercialRegNum = commercialRegNum;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getFaxnum() {
		return faxnum;
	}
	public void setFaxnum(String faxnum) {
		this.faxnum = faxnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
