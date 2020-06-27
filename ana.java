
public class ana {
	public static void main(String[] args) {
		
		Product obj1 = new Product(Products.TEA, 9, 1);
		Product obj2 = new Product(Products.BREAD, 32, 1);
		Product obj3 = new Product(Products.MILK, 9, 12);
		Product obj4 = new Product(Products.TEA, 3, 1);
		Product obj5 = new Product(Products.BUTTER, 15, 13);
		
		Product[] its = {obj1,obj2,obj3,obj4,obj5};
		
		AbstractBag small = new SmallBag();
		AbstractBag big = new BigBag();
		
	small.getContent()[0] = obj1;
small.getContent()[1] = obj2;
	small.getContent()[2] = obj3;
	small.getContent()[3] = obj4;
	small.getContent()[4] = obj5;
	
		big.getContent()[0] = obj1;
		
//for(int i =0; i<small.getContent().length; i++) {
//
//	System.out.println(small.getContent()[i]);
//}
				
//		System.out.println(small.putIn(small.getContent()));
		
		System.out.println(small.putIn(its));
		//System.out.println(big.toString() +"\n");
		System.out.println(small.toString());

		System.out.println("Removing bread:");
        small.removeProduct(Products.BREAD);
        System.out.println(small.toString());
	}
	
	
	

}


