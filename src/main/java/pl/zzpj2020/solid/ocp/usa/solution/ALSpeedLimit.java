package pl.zzpj2020.solid.ocp.usa.solution;

public class ALSpeedLimit implements SpeedLimit {

    private static final int AL_MAX_SPEED = 80;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        if(speed > AL_MAX_SPEED){
            return (speed - AL_MAX_SPEED)^2;
        }
        return 0.0;
    }
}
