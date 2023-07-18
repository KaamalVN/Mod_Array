import java.util.Scanner;

public class Mod_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        int result=array[0];
        for(int i=1;i<size;i++){
            result=Integer.valueOf(String.valueOf(result)+String.valueOf(array[i]));
        }
        int b = scanner.nextInt();
        System.out.println(result%b);
    }
}
