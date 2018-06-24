package pico;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Pico {
        
    public int obtener(PriorityQueue<Integer> pq) {
        return pq.peek();
    }
    
    public int obtener(int[] vec) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x, y) -> y - x);
        for(int num : vec) pq.add(num);
        
        return obtener(pq);
    }
    
    public int obtener(ArrayList<Integer> al) {
        al.sort((x, y) -> y - x);
        return al.get(0);
    }
}
