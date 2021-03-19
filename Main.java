public class Main{

        public static void main(String[] args) {
        
        try{

            IndirizzoIP ip = new IndirizzoIP(192, 168, 0, 0);

            IndirizzoRete ipR = new IndirizzoRete(192, 168, 0, 0, 30);

            System.out.println(ip.toString());

            System.out.println(ipR.toString()); 

            System.out.println(ip.toBinString());

        } catch(Exception e){

            System.err.println(e.getMessage());

        } finally{

            System.out.println("Fine programma");

        }


    }
    
}
