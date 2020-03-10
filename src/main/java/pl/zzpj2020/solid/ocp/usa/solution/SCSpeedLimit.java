package pl.zzpj2020.solid.ocp.usa.solution;

public class SCSpeedLimit implements SpeedLimit {

    private static final int SC_MAX_SPEED = 100;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        if(speed > SC_MAX_SPEED){
            return Math.log(speed);
        }
        return 0.0;
    }
}
