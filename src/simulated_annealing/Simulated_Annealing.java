package simulated_annealing;

/**
 * @author Bastomy ID : 1301178418 Class : IF-40-GAB05
 */
public class Simulated_Annealing {

    public static void main(String[] args) {
        Simulated_Annealing run = new Simulated_Annealing();
        run.mainFunction();
    }

    private double theFunction(double x1, double x2) {
        double value, sin, cos, exp, sqrt;

        sin = Math.sin(x1);
        cos = Math.cos(x2);
        sqrt = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2)) / Math.PI;
        value = -Math.abs(sin * cos * Math.exp(Math.abs(1 - sqrt)));

        return value;
    }

    private void mainFunction() {
        double e0, eCurrent, eNew, deltaE, p, random;
        double bfs1 = 0, bfs2 = 0;   //Best So Far
        int temp = 2000;    //Temperature 
        double x1 = -10;    // initial value
        double x2 = -10;    // initial value

        e0 = theFunction(x1, x2);
        eCurrent = e0;
        while (temp != 0) {
            x1 = x1 + 0.01;
            x2 = x2 + 0.01;
            eNew = theFunction(x1, x2);
            deltaE = eNew - eCurrent;
            if (deltaE < 0) {
                eCurrent = eNew;
                bfs1 = x1;
                bfs2 = x2;
            } else {
                p = Math.pow(Math.E, -deltaE / temp);
                random = Math.random();
                if (random < p) {
                    eCurrent = eNew;
                }
            }
            temp--;
        }
        System.out.println("X1 " + bfs1);
        System.out.println("X2 " + bfs2);
        System.out.println("Hasil " + eCurrent);
    }

}
