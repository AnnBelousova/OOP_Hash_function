package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class CollectionClass {
    private Map<String, Integer> collection = new HashMap<>();

    public void fillCollection() {
        collection.put("key 1", 1);
        collection.put("key 2", 2);
    }


    public void addToCollection(String key, Integer value) {
        Iterator<Map.Entry<String, Integer>> iterator = collection.entrySet().iterator();
        Map.Entry<String, Integer> entry = iterator.next();
        for (int i = 0; ; i++) {
            if (iterator.hasNext()) {
                //Map.Entry<String, Integer> entry = iterator.next();
                if (entry.getKey().contains(key) && entry.getValue().equals(value)) {
                    throw new IllegalArgumentException("Такой ключ уже есть");
                } else if (entry.getKey().contains(key) && !entry.getValue().equals(value)) {
                    collection.put(key, value);
                } else {
                    collection.put(key, value);
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return collection + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionClass that = (CollectionClass) o;
        return Objects.equals(collection, that.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }
}
