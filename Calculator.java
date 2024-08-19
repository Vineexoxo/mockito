package Mockito;
public class Calculator{

    CalculatorService service; //called from cloud, lets say via an api

    public int perform(int i,int j){
        return service.add(i,j)*i;
    }
}