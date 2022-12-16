package calcularpi;


import java.math.BigDecimal;
import java.math.MathContext;

public class CalcularPI extends ClasePadre {

     public static void main(String[] args) {
        MathContext mc = new MathContext(NUM_DIG);   // clic derecho refactor, introduce, constant NUM_DIG con modificador de acceso publico
        compute(mc);
    }

    public static void compute(MathContext mc) {
        //meter en el método compute
        //clic derecho refactor, introduce, method de nombre compute y con modificador de acceso público
        BigDecimal pi = new BigDecimal(0);
        BigDecimal limit = new BigDecimal(1).movePointLeft(NUM_DIG);
        boolean stop = false;
        for (int k = 0; !stop; k++) {
            BigDecimal piK = piFunction(k, mc);
            //meter en el método piFunction                
            pi = pi.add(piK);
            if (piK.compareTo(limit) < 0) {
                stop = true;
            }
        }
        System.out.println(pi.round(mc));
        //meter en el método compute
    }
    public static final int NUM_DIG = 10;

     
}