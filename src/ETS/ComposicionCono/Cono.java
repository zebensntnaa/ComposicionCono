package ETS.ComposicionCono;

/**
 * Clase Objeto Cono con getter y setters
 */
public class Cono {

    private Circulo base;
    private float altura;
    private String color;
    
    /**
     * @param cX Establece en el constructor el valor de sus variables (X)
     * @param cY Establece en el constructor  el valor de sus variables (Y)
     * @param r Establece en el constructor  el valor de sus variables (r)
     * @param h Establece en el constructor  el valor de sus variables (h)
     * @param color Establece en el constructor  el valor de sus variables (color)
     */
    public Cono (float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }
    
    /**
     * @return Devuelve el valor de la base
     */
    public Circulo getBase() {
        return base;
    }
    
    /**
     * @param base Establece el valor de la base
     */
    public void setBase(Circulo base) {
        this.base = base;
    }
    
    /**
     * @return Devuelve el valor de altura
     */
    public float getAltura() {
        return altura;
    }
    
    /**
     * @param altura Establece el valor de altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * @return Devuelve el valor de color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * @param color Establece el color del objeto
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Imprime los datos recogidos con los anteriores m�todos
     */
    public void imprimir () {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }

}
