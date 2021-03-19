public class ValoreNonValidoException extends Exception{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ValoreNonValidoException(){

        super("Valore non incluso nell'intervallo [0-255]");

    }

}
