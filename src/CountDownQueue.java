import java.util.*;


public class CountDownQueue {

	private static class A implements Comparable<A>{
		public String s;
		
		@Override
		public String toString() {
			return s;
		}

		@Override
		public int compareTo(A arg0) {
			
			return s.compareTo(arg0.s);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		int time = Integer.parseInt(args[0]);
		
		Queue<A> queue = new LinkedList<A>();
		
		for (int i = time; i >= 0; i--) {
			A a = new A();
			a.s = "" + i;
			queue.add(a);
		}

		/*while(!queue.isEmpty()) {
			System.out.println(queue.remove());
			Thread.sleep(1000);
		}*/
		
		System.out.println(queue);
		System.out.println(heapSort(queue));
	}

	public static <E extends Comparable<E>> List<E> heapSort(Collection<E> c){
		Queue<E> queue = new PriorityQueue<E>(c);
		List<E> list = new ArrayList<E>();
		
		while (!queue.isEmpty()) {
			list.add(queue.remove());
		}
		
		return list;
	}
}
