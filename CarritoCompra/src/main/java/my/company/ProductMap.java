package my.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ProductMap implements ProductService {
	
	private static HashMap<String, List<Product>> products;
	private static List<Product> lista1 = new ArrayList<Product>(); 
	private static List<Product> lista2 = new ArrayList<Product>(); 
	private static List<Product> lista3 = new ArrayList<Product>(); 
	private static List<Product> lista4 = new ArrayList<Product>(); 
	private static List<Product> lista5 = new ArrayList<Product>(); 
	private static List<Product> lista6 = new ArrayList<Product>(); 
	
    static {
        products = new HashMap<String, List<Product>>();
        
        	lista1.add(new Product("Yann Martel","Life Of Pi",11.59,"0000"));
        	lista1.add(new Product("F. Scott Fitzgerald","The Great Gatsby",17.64,"0001"));
        	lista1.add(new Product("Paula Hawkins","The Girl on the Train",7.05,"0002"));
        	lista1.add(new Product("David Lagercrantz","The Girl in the Spider\'s Web",5.03,"0003"));
        products.put("General Fiction", lista1);
        
        	lista2.add(new Product("Peter Frankopan", "The Silk Roads", 12.05,"0004"));
        	lista2.add(new Product("Elie Wiesel", "Night",12.11,"0005"));
        	lista2.add(new Product("Rupert Matthews", "Stalingrad", 3.62,"0006"));
        	lista2.add(new Product("Ta-Nehisi Coates", "Between the World and Me", 26.45,"0007"));
        products.put("History", lista2);	
        	        	
        	lista3.add(new Product("George Orwell", "1984",12.69,"0008"));
        	lista3.add(new Product("Ray Bradbury","Farenheit 451",9.91,"0009"));
        	lista3.add(new Product("Michael Crichton","Sphere",8.81,"0010"));
        	lista3.add(new Product("Neal Stephenson","Seveneves",14.85,"0011"));
        products.put("SciFi", lista3);
        
        	lista4.add(new Product("Nichole Cristoff", "The Kill List",3.24,"0012"));
        	lista4.add(new Product("Peter James","Dead Simple",0.94,"0013"));
        	lista4.add(new Product("Doug JohnStone","The Jump",2.61,"0014"));
        	lista4.add(new Product("Karin Slaugther","Pretty Girls",7.05,"0015"));
        products.put("Crime", lista4);
    
        	        	
        	lista5.add(new Product("Homer","The odyssey",7.05,"0016"));
        	lista5.add(new Product("Dante","Inferno: The Divine Comedy",9.57,"0017"));
        	lista5.add(new Product("Maryam Mafi","Rumi\'s Little Book of Life",15.66,"0018"));
        	lista5.add(new Product("Alice Oswald","Dart",13.10,"0019"));
        products.put("Poetry", lista5);
        
    
	    	lista6.add(new Product("Yann Martel","Life Of Pi",11.59,"0000"));
	    	lista6.add(new Product("F. Scott Fitzgerald","The Great Gatsby",17.64,"0001"));
	    	lista6.add(new Product("Paula Hawkins","The Girl on the Train",7.05,"0002"));
	    	lista6.add(new Product("David Lagercrantz","The Girl in the Spider\'s Web",5.03,"0003"));
	    	lista6.add(new Product("Peter Frankopan", "The Silk Roads", 12.05,"0004"));
	    	lista6.add(new Product("Elie Wiesel", "Night",12.11,"0005"));
	    	lista6.add(new Product("Rupert Matthews", "Stalingrad", 3.62,"0006"));
	    	lista6.add(new Product("Ta-Nehisi Coates", "Between the World and Me", 26.45,"0007"));
	    	lista6.add(new Product("George Orwell", "1984",12.69,"0008"));
	    	lista6.add(new Product("Ray Bradbury","Farenheit 451",9.91,"0009"));
	    	lista6.add(new Product("Michael Crichton","Sphere",8.81,"0010"));
	    	lista6.add(new Product("Neal Stephenson","Seveneves",14.85,"0011"));
	    	lista6.add(new Product("Nichole Cristoff", "The Kill List",3.24,"0012"));
	    	lista6.add(new Product("Peter James","Dead Simple",0.94,"0013"));
	    	lista6.add(new Product("Doug JohnStone","The Jump",2.61,"0014"));
	    	lista6.add(new Product("Karin Slaugther","Pretty Girls",7.05,"0015"));
	    	lista6.add(new Product("Homer","The odyssey",7.05,"0016"));
	    	lista6.add(new Product("Dante","Inferno: The Divine Comedy",9.57,"0017"));
	    	lista6.add(new Product("Maryam Mafi","Rumi\'s Little Book of Life",15.66,"0018"));
	    	lista6.add(new Product("Alice Oswald","Dart",13.10,"0019"));
	        lista6.add(new Product("Homer","The odyssey",7.05,"0016"));
	    	lista6.add(new Product("Dante","Inferno: The Divine Comedy",9.57,"0017"));
	    	lista6.add(new Product("Maryam Mafi","Rumi\'s Little Book of Life",15.66,"0018"));
	    	lista6.add(new Product("Alice Oswald","Dart",13.10,"0019"));
	    products.put("All", lista6);			

    }
	

	@Override
	public List<Product> findProduct(String category){
		List<Product> product=products.get(category);
		return(product);
	}

}
