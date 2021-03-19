public class IndirizzoRete {
    
    IndirizzoIP indirizzoDiRete;
    IndirizzoIP mascheraSottorete;

    public IndirizzoRete(int num1, int num2,int num3,int num4, int mask) throws Exception{

        if(mask<8 || mask>30){

            throw new Exception();

        }
        
      

    }

    public boolean faParteDellaRete(IndirizzoIP indirizzo){

        return false;

    }
}
