package my.company;


import java.io.Serializable;
import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


@ManagedBean

@ApplicationScoped

public class Cart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected List<Product> selectedProducts;
	protected List<Product> shoppingCart = new ArrayList<Product>();
		
	
    public Cart() {
		super();
	}

	public List<Product> getSelectedProducts() {

    	return selectedProducts;
    }
 
    public void setSelectedProducts( List<Product> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }
    
    public void addItem(ActionEvent actionEvent){
    	Iterator<Product> itr = selectedProducts.iterator();
        while(itr.hasNext()) {
           Product pr = itr.next();
           shoppingCart.add(pr);
        }
        addMessage("Product Added");
    }
    
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public List<Product> getShoppingCart(){
		return(shoppingCart);
	} 
       
    public String showCart(){
       	return("shoppingCart");
    }
}   