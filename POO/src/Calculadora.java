import Exceptions.CalculateExceptions;


public class Calculadora {

    public int dividir(int dividendo, int divisor) throws CalculateExceptions {

        if(divisor == 0){
            throw new CalculateExceptions("No se puede dividir por 0 burro!!!");
        }
        return dividendo / divisor;
    }

}
