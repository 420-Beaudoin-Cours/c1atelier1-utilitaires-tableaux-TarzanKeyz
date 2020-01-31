import static org.junit.Assert.*;

public class TableauxTest {

    @org.junit.Test
    public void trierCroissantSSS() {
        int [] tab = {10, -5, 40, 700, 4, 0};
        int [] expectedTab = {-5, 0, 4, 10, 40, 700};
        Tableaux.trierCroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @org.junit.Test
    public void testTrierCroissantSSS() {
        String [] tab = {"23", "54", "-3", "0", "970"};
        String [] expectedTab = {"-3", "0", "23", "54", "970"};
        Tableaux.trierCroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @org.junit.Test
    public void trierDecroissantSSS() {
        int [] tab = {10, -5, 40, 700, 4, 0};
        int [] expectedTab = {700, 40, 10, 4, 0, -5};
        Tableaux.trierDecroissant(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @org.junit.Test
    public void trierDecroissant() {
        String [] tab = {"23", "54", "-3", "0", "970"};
        String [] expectedTab = {"970", "54", "23", "0", "-3"};
        Tableaux.trierDecroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @org.junit.Test
    public void maximum() {
        int [] tab = {10, -5, 40, 700, 4, 0};
        int expectedMax = 700;
        int max = Tableaux.maximum(tab);
        assertEquals(expectedMax, max);
    }

    @org.junit.Test
    public void minimum() {
        int [] tab = {10, -5, 40, 700, 4, 0};
        int expectedMin = -5;
        int min = Tableaux.minimum(tab);
        assertEquals(expectedMin, min);
    }

    @org.junit.Test
    public void moyenne() {
        double [] tab = {25, 25, 25, 25, 25};
        double expectMean = 25.0;
        double mean = Tableaux.moyenne(tab);
        assertEquals(expectMean, mean, 0);
    }

    @org.junit.Test
    public void fouilleSeq() {
        int [] tab = {10, -5, 40, 700, 4, 0};
        int expectedIndice = 2;
        int indice = Tableaux.fouilleSeq(tab, 40);
        assertEquals(expectedIndice, indice);

    }
}