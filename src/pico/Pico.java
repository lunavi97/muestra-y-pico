package pico;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 
 * @author lunavi97
 *
 */
public class Pico {
    
    /**
     * 
     * @param pq - cola de prioridad con enteros en orden descendiente
     * @return pico máximo
     */
    public int obtener(PriorityQueue<Integer> pq) {
        return pq.peek();
    }
    
    /**
     * 
     * @param vec - Vector
     * @return pico máximo
     */
    public int obtener(int[] vec) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x, y) -> y - x);
        for(int num : vec) pq.add(num);
        
        return obtener(pq);
    }
    
    /**
     * 
     * @param al - Array List que se ordena de mayor a menor
     * @return pico máximo
     */
    public int obtener(ArrayList<Integer> al) {
        al.sort((x, y) -> y - x);
        return al.get(0);
    }
    
    /**
     * 
     * @param vec - Vector creciente hasta pico y luego decreciente 
     * @return entero pico del vector
     */
    public int buscar(int[] vec) {
        if(vec.length == 1) return vec[0];
        if(vec.length == 2) return vec[0] > vec[1] ? vec[0] : vec[1];
        
        int i;
        
        for(i = 1; i < vec.length - 1; i++) {
            if(vec[i] > vec[i - 1] && vec[i] > vec[i + 1]) return vec[i];
        }
        
        return vec[i];
    }
}
