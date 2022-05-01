import java.util.*;

public class CollArray {

    public static void main(String[] args) {
//        ArrayList<Integer> lt = new ArrayList<>();
//        lt.add(5);
//        lt.add(10);
//        lt.add(15);
//        lt.add(25);
//        int sum = 0;
//        for (int i=0;i<lt.size();i++){
//sum=sum+lt.get(i);
//        }
//        System.out.println(sum);
//    }
//        System.out.println(lt.get(2));
//        System.out.println(lt.remove(1));
//        System.out.println(lt);
////        lt.clear();
//        System.out.println(lt);
//       lt.set(0,100);
//        System.out.println(lt);
//        Iterator<Integer> it= lt.iterator();
//while (it.hasNext()){
//    System.out.println("Iterator-->"+it.next());
//}
//        Stack<Integer> st=new Stack<>();
//        st.push(5);
//        st.push(15);
//        st.push(25);
//        st.push(55);
//        System.out.println(st);
//        System.out.println(st.pop());
//        System.out.println(st.peek());
        Queue<Integer> qu=new LinkedList<>();
        qu.offer(5);
        qu.offer(10);
        qu.offer(15);
        qu.offer(20);
        System.out.println(qu);
        System.out.println(qu.poll());
        System.out.println(qu.peek());
        System.out.println(qu);
        }
    }

