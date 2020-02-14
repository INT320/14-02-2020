import java.util.LinkedList;
import java.util.List;

public class labclass {

    public static void main(String[] args) {
        testQueue();
//        testStack();
    }

    

    static void testQueue(){
        LinkedList<String> queue = new LinkedList<>();
        long time = System.nanoTime();
        for(int i = 0 ; i < 27; i++){
            queue.offer((char)((int)(Math.random() *26) +65) + "");
        }
        System.out.println("Time: " + (System.nanoTime() - time));
        System.out.println(queue);
        int i = 1;
        while(!queue.isEmpty()){
            System.out.println(queue.poll() + (i++ % 10 == 0? "\n" : " "));
        }
    }

    static void testStack(){
        List<String> lst = new LinkedList();
        LinkedList<String> stack = (LinkedList<String>) lst;
        long time = System.nanoTime();
        for(int i = 0;i < 20; i++){
            stack.push((char) ((int) (Math.random() * 26) +65)+ "");
        }
        System.out.println("Time: " + (System.nanoTime() - time));
        System.out.println(stack);
        System.out.println(lst);
        int i = 1;
        while(!stack.isEmpty()){
            System.out.println(stack.poll() + (i++ % 10 == 0? "\n" : " "));
        }
    }

}
