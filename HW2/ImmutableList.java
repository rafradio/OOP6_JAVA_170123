package HW2;

import java.util.*;

public class ImmutableList <T> extends OverallListClass <T> {

    public ImmutableList(List<T> myList) {
        super(myList);
    }

    @Override
    public int getSize() {
        return this.getMyList().size();
    }

    @Override
    public T get(int i) {
        return this.getMyList().get(i);
    }
    
}
