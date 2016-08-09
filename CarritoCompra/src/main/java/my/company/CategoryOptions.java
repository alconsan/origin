package my.company;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CategoryOptions {
	
	private final static String[] cat = {"General Fiction", "History", "SciFi","Crime", "Poetry"};
	
	public List<String> getCategories(){
		return Arrays.asList(cat);
	}
 
}
