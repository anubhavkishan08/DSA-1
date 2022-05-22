import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Collections {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
   /*     int n=sc.nextInt();
     ArrayList eg.
    List<Integer> arr=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i : arr)
            System.out.print(" "+i);
        arr.remove(2);
        arr.add(2,55);
        for(int i : arr)
            System.out.print(" "+i);
    */
        /* LinkedList example
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);ll.add(4);
        ll.addFirst(14); ll.addLast(6);
       for(Integer i: ll)
             System.out.println(i);
       ll.removeFirst();ll.removeLast();
       System.out.println(ll.isEmpty());

         */
        /*Stacks:--peek fn is used to get the last element of stack without popping it.
        Stack<Integer> st=new Stack<Integer>();
        st.push(5);st.push(10);st.push(45);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        for(int s: st)
            System.out.println(s);
      */
       /* Queue<Integer> q=new LinkedList<>();
        q.add(5); q.add(14); q.add(47);
        q.remove();
        for(int a:q)
            System.out.println(a);  */
         /*
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(5);pq.add(10);pq.add(41);pq.add(14);pq.add(147);
        System.out.println("peeked element"+pq.peek()); //remove the first element of queue.
        System.out.println("polled element"+pq.poll()); //display first element without displaying
        for(int s:pq)
            System.out.println(s);
        System.out.println(pq);
        */
        // Dequeue---Double ended queue.
      /*  Deque<Integer> queue=new ArrayDeque<>();
        queue.add(5);queue.add(55);queue.add(14);queue.add(147);queue.add(12345);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }*/
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(5);stack.push(55);stack.push(14);stack.push(147);stack.push(12345);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void swap(ArrayList<Integer> nums, int i, int j) {
    }
}
