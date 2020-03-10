package pl.zzpj2020.solid.ocp.usa.solution;

public class GASpeedLimit implements SpeedLimit {

    private static final int GA_MAX_SPEED = 50;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        if(speed > GA_MAX_SPEED){
            return (speed-GA_MAX_SPEED)*200;
        }
        return 0.0;
    }
}
