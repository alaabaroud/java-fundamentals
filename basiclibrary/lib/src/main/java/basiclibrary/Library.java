/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

public class Library {
    public static void main(String[] args) {
        System.out.println("hello");
        roll(6);
    }

    public static int[] roll(int number) {

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (6 * Math.random());
            System.out.println(array[i]);
        }

        return array;

    }

    public boolean containsDuplicates(int[] array){
        boolean value = false;
        // int[] newAarray = {2,4,11,5,6};
        for (int i = 0; i < array.length; i++) {
            if (i == i*2) {
                value= true;
              System.out.println(true);
            }
            
            
        }
        return value;
    }

}
