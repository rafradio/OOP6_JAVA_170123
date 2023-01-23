package HW2;

import java.util.List;

public class MutableList <T> extends OverallListClass <T> {

    public MutableList(List<T> myList) {
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
    
    public void set(int i, T newValue) {
        this.getMyList().set(i, newValue);
    }

    public void add(T newValue) {
        this.getMyList().add(newValue);
    }
    
    public void remove(T value) {
        this.getMyList().remove(value);
    }
}
