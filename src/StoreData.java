import java.util.Stack;

public class StoreData<E> extends Stack<E> {

    public static void main(String[] args) {
        Integer n1[] = new Integer[100];
        Integer n2[] = new Integer[100];

        long time = System.nanoTime();

        for(int i = 0 ;i < n1.length; i++){
            int x = (int)(Math.random() * 100);
            if(x <101) {
                n1[i] = x;
            }
            else {
                x = (int)(Math.random() * 100);
            }
        }

        System.out.println("Time: " + (System.nanoTime() - time));

        printArray(n1);

    }

    static void printArray(Integer arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop :");

        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top : " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }


    static int getI(int i){
        return i;
    }

}
