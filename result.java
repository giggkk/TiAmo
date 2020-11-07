package finish;

public class result {
    public static void main(String[] args) {

        finish.Calculate calculate;
        calculate = new finish.Add();
        finish.Compute.useCom(calculate);
        calculate = new finish.Subtract();
        finish.Compute.useCom(calculate);
        calculate = new finish.Multiply();
        finish.Compute.useCom(calculate);
        calculate = new finish.Divide();
        finish.Compute.useCom(calculate);
        System.out.println();



    }
}

