import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int [] massive = new int[100];
        Random random = new Random();
        int maxValue = 1000;

        for (int i = 0; i < 100; i++) {
            massive[i] = random.nextInt(maxValue + 1);
        }

        sortMass(massive, 0, massive.length - 1);

        System.out.println(Arrays.toString(massive));

        BinarySearch bs = new BinarySearch();

        int index = bs.binarySearch(massive, 0, massive.length - 1, random.nextInt(maxValue ));

        System.out.println(index);
    }

    public static void sortMass(int[] mass, int low, int high){

        if(mass.length == 0){
            return;
        }

        if(low > high){
            return;
        }

        int middle = low + (high - low)/2;
        int supportElement = mass[middle];
        int i = low;
        int j = high;

        while (i <= j){
            while (mass[i] < supportElement){
                i++;
            }

            while (mass[j] > supportElement) {
                j--;
            }

            if(i <= j) {
                int temp = mass[i];
                mass[i] = mass[j];
                mass[j] = temp;
                i++;
                j--;
            }
        }

        if(low < j)
            sortMass(mass, low, j);

        if(high > i)
            sortMass(mass, i, high);

    }
}
