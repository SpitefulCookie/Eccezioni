public class IndirizzoRete {
    
    IndirizzoIP indirizzoDiRete;
    IndirizzoIP mascheraSottorete;

    public IndirizzoRete(int num4, int num3,int num2,int num1, int mask) throws Exception{

        if(mask<8 || mask>30){

            throw new ValoreNonValidoException();

        }
        
        int numeroDaControllare = num4;

        for (int i = 0; i<(32-mask); i++){

            if(i>8){numeroDaControllare = num3;}
            if(i>16){numeroDaControllare = num2;}
            if(i>24){numeroDaControllare = num1;}
            
            if ((numeroDaControllare & ((int)Math.pow(2,(i%8)))) != 0){

                throw new IndirizzoNonValidoException();

            }
        }

        indirizzoDiRete = new IndirizzoIP(num4, num3, num2, num1);

        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        int m4 = 0;


        if(mask>24){

            m1 = m2 = m3 = 255;

            m4 = 255-((int)Math.pow(2,(8-(mask%8)))- 1);


        } else if(mask > 16){

            m1 = m2 = 255;

            m3 = 255 - ((int)Math.pow(2,(8-(mask%8)))- 1);
            
        } else if(mask > 8){

            m1 = 255;

            m2 = 255 - ((int)Math.pow(2,(8-(mask%8)))- 1);

        }

        mascheraSottorete = new IndirizzoIP(m1, m2, m3, m4);

    }

    public boolean faParteDellaRete(IndirizzoIP indirizzo){

        return false;

    }

    public String toString(){

        return "Rete: " + indirizzoDiRete + "/" + mascheraSottorete;

    }
}
