import java.util.*;

public class Safe {
	
    private Collection<String> items = new ArrayList<String>();
    private int capacity;

    public Safe(int capacity) {
        capacity = capacity;
    }

    public int getCapacity() { 
      return capacity;
    }

    public final Collection<String> getItems() {
      return items; 
    }

    public void addItem(String item) {
        if (this.items.size() == capacity)
            throw new IllegalStateException();
        else 
        	items.add(item);
    }
    
    @Override 
    public String toString() {
    	if (!items.isEmpty() && capacity != 0) {
    		return String.format("Safe: {%d}/{%d}", (items.size() / capacity));
    	} else {
    		return String.format("Safe: {%d}/{%d}", 0, capacity);
    	}
        
    }
	
    public static void main(String[] args) {
        Safe safe = new Safe(2);
        safe.addItem("item");
        System.out.println(safe);
    }
}