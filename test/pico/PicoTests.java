package pico;

import java.util.ArrayList;
import java.util.PriorityQueue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PicoTests {
    
    Pico pico;

    @Before
    public void SetUp() {
        pico = new Pico();
    }
    
    @Test
    public void conColaDePrioridad() {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x, y) -> y - x);
        pq.add(2);
        pq.add(3);
        pq.add(8);
        pq.add(5);
        Assert.assertEquals(8, pico.obtener(pq));
    }
    
    @Test
    public void conVector() {
        int[] vec = {4, 6, 8, 10, 7, 3, 2, 1};
        Assert.assertEquals(10, pico.obtener(vec));
    }
    
    @Test
    public void conLista() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(2);
        al.add(1);
        Assert.assertEquals(9, pico.obtener(al));
    }

}
