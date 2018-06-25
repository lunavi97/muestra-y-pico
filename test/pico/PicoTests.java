package pico;

import java.util.ArrayList;
import java.util.PriorityQueue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PicoTests {

    Pico pico;
    int vec[];
    final int CANT = 10000;

    @Before
    public void SetUp() {
        pico = new Pico();
        vec = new int[CANT];
    }

    @Test (timeout = 5)
    public void solveOrdenados() {
        for(int i = 0; i < CANT; i++) {
            vec[i] = i;
        }
        Assert.assertEquals(CANT - 1, (int) pico.solve(vec));

        for(int i = 0; i < CANT; i++) {
            vec[i] = CANT - i;
        }
        Assert.assertEquals(CANT, (int) pico.solve(vec));
    }

    @Test (timeout = 5)
    public void solveOrdenadosCrecienteDecreciente() {
        for(int i = 0; i < (CANT / 2) + 1; i++) {
            vec[i] = i + 1;
        }

        for(int i = (CANT / 2) + 1; i < CANT; i++) {
            vec[i] = CANT - i;
        }

        Assert.assertEquals((CANT / 2) + 1, (int) pico.solve(vec));
    }

    @Test (timeout = 5)
    public void solveDesordenados() {
        int[] vecS = {4, 8, 10, 11, 5, 4, 3, 2, -1, -2};
        Assert.assertEquals(11, (int) pico.solve(vecS));
    }

    @Test (timeout = 5)
    public void posicionOrdenados() {
        for(int i = 0; i < CANT; i++) {
            vec[i] = i;
        }
        Assert.assertEquals(CANT - 1, (int) pico.pos(vec));

        for(int i = 0; i < CANT; i++) {
            vec[i] = CANT - i;
        }
        Assert.assertEquals(0, (int) pico.pos(vec));
    }

    @Test (timeout = 5)
    public void posicionOrdenadosCrecienteDecreciente() {
        for(int i = 0; i < (CANT / 2) + 1; i++) {
            vec[i] = i + 1;
        }

        for(int i = (CANT / 2) + 1; i < CANT; i++) {
            vec[i] = CANT - i;
        }

        Assert.assertEquals(CANT / 2, (int) pico.pos(vec));
    }

    @Test (timeout = 5)
    public void posicionDesordenados() {
        int[] vecP = {1200, 3400, 4123, 2000, 1999, 555, 23, 21};
        Assert.assertEquals(2, pico.pos(vecP));
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

    @Test
    public void buscar() {
        int[] vecB = {4, 6, 8, 10, 7, 3, 2, 1};
        Assert.assertEquals(10, pico.buscar(vecB));
    }

}
