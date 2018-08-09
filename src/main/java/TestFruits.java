import java.util.ArrayList;
import java.util.Arrays;

public class TestFruits {

    //ТЕСТИМ ФРУКТЫ с GitHub пока подтупеваю!!!!!
    public static void main(String[] args) {
        Box<Apple> box = new Box<Apple>();
        Box<Orange> box1 = new Box<Orange>();

        for (int i = 0; i < 6; i++) {
            box.list.add(new Apple());
        }
        for (int i = 0; i < 18; i++) {
            box1.list.add(new Orange());
        }

        System.out.println("Orange weight : " + box1.getWeightFruits());
        System.out.println("Apple weight : " + box.getWeightFruits()+"\n");

        System.out.println(box.compare(box1) + "\n");

        Box<Orange> oneMore = new Box<Orange>();
        for (int i = 0; i < 5; i++) {
            oneMore.list.add(new Orange());
        }
        System.out.println("Before pour " + oneMore.getWeightFruits());
        box1.pour(oneMore);
        System.out.println("After pour " + oneMore.getWeightFruits());
        System.out.println("\n" + box.compare(box1) + " потому что вес box1 стал : " + box1.getWeightFruits());

        System.out.println("-----------------------------------------------------------------------");
        String[] arr = new String[] {"один","два","три","четыре","пять"};
        System.out.println(Arrays.toString(arr));
        swichElementArray(arr,2,3);
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------------------------------------");
        ArrayList<String> arrNew = toArrayList(arr);
        System.out.println(Arrays.toString(arrNew.toArray()));
    }

    public static <T> void swichElementArray(T[] arr, int index1, int index2) {
        if (index1 == index2){
            System.out.println("Индексы одинаковые");
            return;
        }
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
            T obj = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = obj;
        } else System.out.println("Некорректные аргументы");
    }

    public static <T> ArrayList toArrayList(T[] arr){
        ArrayList<T> resArrayList = new ArrayList<T>();
        for (int i = 0; i < arr.length; i++) {
            resArrayList.add(arr[i]);
        }

        return resArrayList;
    }
}
