package my.company;


import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


@ManagedBean
@ApplicationScoped

public class Cart2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected List<Product2> selectedProducts;
	protected List<Product2> shoppingCart = new ArrayList<Product2>();
	
		
	
    public Cart2() {
		super();
	}

	public List<Product2> getSelectedProducts() {

    	return selectedProducts;
    }
 
    public void setSelectedProducts( List<Product2> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }
    
    public void addItem(ActionEvent actionEvent){
    	Iterator<Product2> itr = selectedProducts.iterator();
        while(itr.hasNext()) {
           Product2 pr = itr.next();
           shoppingCart.add(pr);
        }
        selectedProducts.clear();
        addMessage("Product Added");
    }
    
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public List<Product2> getShoppingCart(){
		return(shoppingCart);
	} 
    
    public String getTotal(){
    	double total=0;
    	Locale locale = new Locale("es", "ES");
    	NumberFormat nf = NumberFormat.getNumberInstance(locale);
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern("###,###.###");
    	Iterator<Product2> itr = shoppingCart.iterator();
        while(itr.hasNext()) {
           Product2 pr = itr.next();
           total += pr.getPrice();
        }
    	return df.format(total);
    }
    
    public void deleteItem(Product2 product){
    	shoppingCart.remove(product);
    }
       
    public String showCart(){
       	return("shoppingCart2");
    }
}   