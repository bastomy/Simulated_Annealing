package simulated_annealing;

/**
 * @author Bastomy 
 * ID       : 1301178418 
 * Class    : IF-40-GAB05 
 */

public class Simulated_Annealing {

    public static void main(String[] args) {
        Simulated_Annealing run = new Simulated_Annealing();
        System.out.println(run.theFunction(0.1, 0.1));
    }

    private double theFunction(double x1, double x2) {
        double value, sin, cos, exp, sqrt;

        sin = Math.sin(x1);
        cos = Math.cos(x2);
        sqrt = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2)) / Math.PI;
        value = - Math.abs(sin * cos * Math.exp(Math.abs(1 - sqrt)));

        return value;
    }

}
