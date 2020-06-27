import java.util.Arrays;

public class SmallBag extends AbstractBag {
	
	protected boolean hasBelt = true;

	public SmallBag() {
		super(5,2);
	}

	@Override
	public String toString() {
		
		String message = "";;
		message += "SmallBag content= " + Arrays.toString(content) + "\n";
		message += "Weight: " + getTotalWeight() + "\n";
        message += "Has belt: " + hasBelt + "\n";

		return message;
	}

	public void removeProduct(Products toRemove) {
		
		for (int i = 0; i < content.length; i++) {
            if (content[i] != null && content[i].type == toRemove) {
                content[i] = null;
            }
		}
	}
	
	public void setHasBelt(boolean belt) {
        hasBelt = belt;
    }
	
	public Product[] getContent(){

		return content;
	}
}
