package sobrecarga;

public class Sobrecarga {
    
    private int soma (int a, int b) {
        
        System.out.println ("Soma int!");
        
        return a + b;
    }
    
    private int soma (float a, float b) {
        
        System.out.println ("Soma float!");
        
        return (int) (a + b);
    }
    
    private float soma (double a, float b) {
        
        System.out.println ("Soma double float!");
        
        return (float) (a + b);
    }
    
    private double soma (double a, double b) {
        
        System.out.println ("Soma double!");
        
        return a + b;
    }

    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;
        double xx = 12.3;
        double yy = 13.4;
        float aa = 1;
        float bb = 3;
        
        Sobrecarga objetoSobrecarga = new Sobrecarga ();
        
        System.out.println ("Soma = " + objetoSobrecarga.soma (x, y));
        
        System.out.println ("Soma = " + objetoSobrecarga.soma (xx, yy));
        
        System.out.println ("Soma = " + objetoSobrecarga.soma (aa, bb));
        
        System.out.println ("Soma = " + objetoSobrecarga.soma (x, bb));
        
        System.out.println ("Soma = " + objetoSobrecarga.soma (aa, xx));
        
        System.out.println ("Soma = " + objetoSobrecarga.soma (10, 2.3));
        
    }
    
}
