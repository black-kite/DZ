import java.util.ArrayList;

public class Box<T extends Fruit>{

     ArrayList<T> list;

    public Box() {
        this.list = new ArrayList<T>();
    }

    public Box(ArrayList<T> fruitArray) {
        this.list = fruitArray;
    }

    public float getWeightFruits() {
        float weight = 0;

        for (T ob : list) {
            weight += ob.getWeight();
        }
        return weight;
    }

    public void pour(Box<T> another) {
        another.list.addAll(list);
        list.clear();
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    public boolean compare(Box<? extends Fruit> ob) {
        return Math.abs(this.getWeightFruits() - ob.getWeightFruits()) < 0.0001f;
    }
}
