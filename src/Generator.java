/**
 * The Generator class represents a generator for PPA which takes two bits, and generates a halfsum, a propagation and a generation for PPA
 * Atributes of the class:
 * <ul>
 * <li>halfsum</li>
 * <li>propagation</li>
 * <li>generation</li>
 * </ul>
 */
public class Generator {
    private boolean halfsum;
    /**
     * generated propagation
     */
    private boolean propagation;
    /**
     * generated generation
     */
    private boolean generation;

    /**
     * Class constructor, takes two bits and sets halfsum, propagation and generation according to the bits.
     * @param x - bit of first number
     * @param y - bit of second number
     */
    public Generator(boolean x, boolean y){
        halfsum = x^y;
        propagation = x|y;
        generation = x&y;
    }

    /**
     * Halfsum getter
     * @return halfsum
     */
    public boolean getHalfsum(){
        return halfsum;
    }

    /**
     * Propagation getter
     * @return propagation
     */
    public boolean getPropagation(){
        return propagation;
    }

    /**
     * Generation getter
     * @return generation
     */
    public boolean getGeneration(){
        return generation;
    }
}
