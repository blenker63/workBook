public class Main {
    public static void main(String[] args) {
        char[] arr1 = {'к', 'о', 'т'};
        char[] arr2 = new char[3];
        System.out.println(arr1);
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }
        System.out.println(arr2);
    }
}