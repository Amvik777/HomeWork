public class Main {
    public static void main(String[] args) {

        IntArray intArray = new IntArray();
        intArray.setMax(100);
        intArray.setMin(1);

        intArray.array(15,40,75);

        int [] arr = intArray.createArray();
        intArray.fillArrayRandom(arr);

        intArray.arraySort(-1, arr);
        intArray.arraySort(2, arr);

    }
}
}