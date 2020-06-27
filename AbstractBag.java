
public abstract class AbstractBag {
	
	protected Product[] content;
	double maxWeight;
	
	public AbstractBag(int size, double maxWeight) {
		if(size > 0) {
			content = new Product[size];
		}
		if(maxWeight > 0) {
			this.maxWeight = maxWeight;
		}
		
	}
	
	public abstract Product[] getContent();
	
	public abstract String toString();
	
	public boolean putIn(Product it) {
		boolean result = false;
		for (int i = 0; i < content.length; i++)
		{
			double currentWeight = getTotalWeight();
			double addedWeight = currentWeight + it.weight;

			if (content[i] == null && addedWeight <= maxWeight) {

				content[i] = it;

				result = true;

				break;
			}
		}
		return result;
	}

	public int putIn(Product[] its) {
		int result=0;
	    for (int i = 0; i < its.length; i++) {
			result++;
		}
	    return(result);
	}
	
	public double getTotalWeight() {
		double result = -0.0;
		for (int i = 0; i < content.length; i++) {
			if (content[i] != null) {
				result += content[i].weight;
			}
		}
		return result;
	} 
	
	public double getTotalWeight(Products product) {
		double result=-0.0;
			
		return result;
	} 
	
	public abstract void removeProduct(Products toRemove);
}

