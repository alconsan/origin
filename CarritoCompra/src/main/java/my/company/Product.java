package my.company;

import java.io.Serializable;

public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String author, title,id;
	private double price; 
	
	  public Product(String author, String title, double price,String id) {
		  	this.author = author;
		  	this.title = title;
		  	this.price = price;
		  	this.id=id;
	  }

	  public Product(){}
	  
	  public String getAuthor() {
	    return(author);
	  }
	  
	  public void setAuthor(String author) {
	    this.author = author;
	  }
	  
	  public String getTitle() {
	    return(title);
	  }
	  
	  public void setTitle(String title) {
	    this.title = title;
	  }
	  
	  public double getPrice() {
	    return(price);
	  }
	  
	  public void setPrice(double price) {
	    this.price = price;
	  }
	  
	  public String getId() {
		    return(id);
		  }
		  
	  public void setId(String id) {
		    this.id = id;
		  }
	  
	  
	    @Override
	    public int hashCode() {
	        int hash = 7;
	        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Product other = (Product) obj;
	        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
	            return false;
	        }
	        return true;
	    }

}
