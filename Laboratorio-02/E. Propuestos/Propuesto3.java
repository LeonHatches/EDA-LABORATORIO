public class Propuesto3 {
    
    public void trianguloRecursivo1 (int base) {
        
        if (base > 0) {
            trianguloRecursivo1(base - 1);
            
            for (int i = 0 ; i < base ; i++)
                System.out.print("*");

            System.out.println();
        }

    }

    public static void main (String [] args) {
        Propuesto3 re = new Propuesto3();

        re.trianguloRecursivo1(5);
    }
}