package collection;

public class TestCollection {
    private static CollectionClass collectionClass;

    public static void main(String[] args) {


        CollectionClass collectionClass = new CollectionClass();
        collectionClass.fillCollection();

        collectionClass.addToCollection("key 3", 3);
        collectionClass.addToCollection("key 4", 4);
        collectionClass.addToCollection("key 5", 5);
        collectionClass.addToCollection("key 1", 10);
        System.out.println(collectionClass);
    }
}
