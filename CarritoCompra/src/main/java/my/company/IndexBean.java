package my.company;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;


import org.springframework.stereotype.Component;

@ManagedBean
@Component
@NoneScoped
public class IndexBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String category;
	protected List<Product2> product;
	private List<Product2> filteredProducts;
	protected Product2 selectedProduct;
	protected static ProductService2 productService = new ProductMap2();
	
	public String getCategory(){
		return (category);
	}
	
	public void setCategory(String category){
		this.category=category;
	}
	
    public List<Product2> getFilteredProducts() {
        return filteredProducts;
    }
 
    public void setFilteredProducts(List<Product2> filteredProducts) {
        this.filteredProducts = filteredProducts;
    }
 
	
	public List<Product2> getProducts(){
		product=productService.listOfProducts();
		return(product);
	}
	
	public Product2 getSelectedProduct() {
    	return selectedProduct;
    }
 
    public void setSelectedProduct(Product2 selectedProduct) {
        this.selectedProduct = selectedProduct;
    }
}

