public class IndirizzoIP {

    private int [] numeri =  new int[4];
    
    public IndirizzoIP(int num1, int num2, int num3, int num4) throws Exception{

        if(((num1<0)||(num1>255))||((num2<0)||(num2>255))||((num3<0)||(num3>255))||((num4<0)||(num4>255))){

            throw new Exception();

        } else{

            this.numeri[0]=num1;
            this.numeri[1]=num2;
            this.numeri[2]=num3;
            this.numeri[3]=num4;

        }

    }

    public String toString(){

        return this.numeri[0]+"."+this.numeri[1]+"."+this.numeri[2]+"."+this.numeri[3];
        
    }

}
