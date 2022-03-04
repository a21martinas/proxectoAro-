package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Martin
 */
public class Aro {

    

    private static final double LIMITERADIO = 0.0;

    /**
     *
     */
    public static final double MINIMO = LIMITERADIO;
    

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Constructor vacío
     */
    public Aro() {
    }

    /**
     * Constructor parametrizado
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    
    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio =(radio < MINIMO ? MINIMO : radio);
    }

    /**
     * metodo para obter o diametro do Aro
     * @return
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     *metodo para obter a ciscunferencia do Aro
     * @return
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * metodo para obter a superficie do Aro
     * @return
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * metodo toString
     * @return
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * metodo para trasladar o centro do Aro
     * @param trasladarx
     * @param trasladary
     */
    public void trasladarCentro(int trasladarx, int trasladary){
        this.setCoordenadaX(this.getCoordenadaX() + trasladarx);
        this.setCoordenadaY(this.getCoordenadaY() + trasladary);
    }
    
    
}