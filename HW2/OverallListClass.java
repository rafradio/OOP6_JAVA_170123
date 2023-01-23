package HW2;

import java.util.*;

public abstract class OverallListClass <T> {
    private List<T> myList;

    public OverallListClass(List<T> myList) {
        this.myList = myList;
    }

    public List<T> getMyList() {
        return myList;
    }

    public abstract int getSize();   
    
    public abstract T get(int i); 

    
}
