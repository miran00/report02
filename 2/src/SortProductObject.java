import java.util.Arrays;

public class SortProductObject {

	public static void main(String[] args) {
		Product[] product = new Product[5];
		product[0] = new Product("A", 11);
		product[1] = new Product("Z", 13);
		product[2] = new Product("X", 10);
		
		System.out.println("[compareTo sort productNum]");
		Arrays.sort(people);
		printProduct(people);
		
		System.out.println("[compareTo sort productName]");
		Arrays.sort(product, new ProductNameComparator());
		printProduct(product);
		
	}
	
	public static void printProduct(Product[] product) {
		
		for(Product : product)
			System.out.println(product);
	}
}
