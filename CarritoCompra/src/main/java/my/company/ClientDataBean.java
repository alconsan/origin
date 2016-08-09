package my.company;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="client")
public class ClientDataBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, surname, email, ccNumber, cvv, cardholder, creditCard;
	private final String[] months  = {"1","2","3","4","5","6","7","8","9","10","11","12"};
	private final String[] years  = {"2016","2017","2018","2019","2020"};
	
	public String getName(){
		return(name);
	}
	
	public void setName(String name){
		this.name=name;
	}	
	public String getsurname(){
		return(surname);
	}
	
	public void setsurname(String surname){
		this.surname=surname;
	}	
	
	public String getEmail(){
		return(email);
	}
	
	public void setEmail(String email){
		this.email=email;
	}	
	public String getCcNumber(){
		return(ccNumber);
	}
	
	public void setCcNumber(String ccNumber){
		this.ccNumber=ccNumber;
	}	
	public String getCvv(){
		return(cvv);
	}
	
	public void setCvv(String cvv){
		this.cvv=cvv;
	}	
	public String getCarholder(){
		return(cardholder);
	}
	
	public void setCardHolder(String cardholder){
		this.cardholder = cardholder;
	}		
	public String getCreditCard(){
		return(creditCard);
	}
	public void setCreditCard(String creditCard){
		this.creditCard = creditCard;
	}
	public String[] getMonths(){
		return(months);
	}
		
	public String[] getYears(){
		return(years);
	}
	
	public String orderPay(){
		return("bye");
	}
	
}
