import java.util.List;
import java.util.ArrayList;

public class Resuelto3 {
    public static void main (String [] args) {
        ArrayList<Animal> mascotas = new ArrayList<Animal>();
        List<Animal> mascotas2 = new List<Animal>(); /** <- Ver error */ 
        List<Animal> mascotas2 = new ArrayList<Animal>();
    }
}