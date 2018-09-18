package simulated_annealing;

import java.util.ArrayList;

/**
 * @author Bastomy ID : 1301178418 Class : IF-40-GAB05
 */
public class Simulated_Annealing {

    public Data data = new Data();
    ArrayList<BSF> bsf = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Simulated_Annealing run = new Simulated_Annealing();
        run.startFunction();
//        System.out.println(run.theFunction(-5.1, 5));

    }

    private double theFunction(double x1, double x2) {
        double value, sin, cos, exp, sqrt;

        sin = Math.sin(x1);
        cos = Math.cos(x2);
        sqrt = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2)) / Math.PI;
        value = -Math.abs(sin * cos * Math.exp(Math.abs(1 - sqrt)));

        return value;
    }
    
    public void startFunction() throws InterruptedException {
        data.setX1(-10);
        data.setX2(-10);

        data.setE0(theFunction(data.getX1(), data.getX2()));
        data.setTemperature(200);
        bsf.add(new BSF(data.getX1(), data.getX2()));
        data.seteCurrent(data.getE0());

        for (int i = data.getTemperature(); i >= 0; i--) {
            data.setX1(data.getX1() + 0.1);
            data.setX2(data.getX2() + 0.1);
            data.seteNew(theFunction(data.getX1(), data.getX2()));

            data.setDeltaE(data.geteNew() - data.geteCurrent());
            if (data.getDeltaE() < 0) {
                data.seteCurrent(data.geteNew());
                bsf.clear();
                bsf.add(new BSF(data.getX1(), data.getX2()));
            } else {
                data.setP(Math.pow(Math.E, -data.getDeltaE() / i));
                data.setRandom(Math.random());
                if (data.getRandom() < data.getP()) {
                    data.seteCurrent(data.geteNew());
                }
            }
            System.out.println("Temp : " + i);
            System.out.println("x1 :" + bsf.get(0).getX1());
            System.out.println("x2 :" + bsf.get(0).getX2());
            System.out.println("nilai : " + data.geteCurrent());
            Thread.sleep(500);
        }
        System.out.println("BSF");
        System.out.println("x1 :" + bsf.get(0).getX1());
        System.out.println("x2 :" + bsf.get(0).getX2());
        System.out.println("nilai : " + data.geteCurrent());

    }

}
