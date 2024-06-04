package Belajar;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,10,3};
        BubblesortInt(arr);

    }
    static void BubblesortInt(int [] nilai){
        for ( int n : nilai){
            System.out.print(n + " ");
        }
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai.length-1; j++) {
                if(nilai[j] > nilai[j+1]){
                    int temp = nilai[j];
                    nilai[j] = nilai[j+1];
                    nilai[j+1] = temp;
                }

            }
        }
        System.out.println("\n");
        for ( int n : nilai) {
            System.out.print(n + " ");
        }
    }
}
