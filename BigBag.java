import java.util.Arrays;

public class BigBag extends AbstractBag {
	
    protected boolean hasRolls = false;

	public BigBag() {
		super(15,20);
	}

	public String toString() {
		String message ="";
		message += "BigBag content: \n" + Arrays.toString(content);
		message += "Weight: " + getTotalWeight() + "\n";
		message += "Has rolls: " + hasRolls + "\n";
		return message;
	}
	
	public void setHasRolls(boolean rolls) {
        hasRolls = rolls;
    }

	public void removeProduct(Products toRemove) {
		
		for (int i = 0; i < content.length; i++) {
            if (content[i] != null && content[i].type == toRemove) {
                content[i] = null;
            }
        }
		
	}

	public Product[] getContent(){

		return content;
	}
}


