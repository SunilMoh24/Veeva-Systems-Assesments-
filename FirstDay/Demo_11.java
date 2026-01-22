public class Demo_11{

    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};
            try { 
                int result = arr[1] / 0;  
            }
            catch (ArithmeticException e) {
                System.out.println("ArithemeticException.");
            }
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}


//First inner try is executed and then the outer try is executed

