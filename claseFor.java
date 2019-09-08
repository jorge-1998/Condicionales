package Menu2;

public class claseFor {
    Integer [] numero = new Integer[15];
    
    public void For(){
        for(int i=0;  i<15; i++){
            //numero [i] = 5;
            numero[i] = (int)(Math.random()*100 + 1);
        }
    }
    
    public void datos(){
        numero[0] = 794;
        numero[1] = 540;
        numero[2] = 851;
    }
    
    public void Impresion(){
        for(int i=0; i>10; i++){
            System.out.println("numeros [" + i + " ]");
        }
    }
}
