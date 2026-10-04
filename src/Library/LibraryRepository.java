package Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepository<T> implements Repository<T> {

    private List<T> items = new ArrayList<>();

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public void remove(T item) {
        items.remove(item);
    }

    @Override
    public List<T> getAll() {
        return items;
    }
}