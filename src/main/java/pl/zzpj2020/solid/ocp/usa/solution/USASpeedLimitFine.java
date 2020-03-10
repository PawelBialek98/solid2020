package pl.zzpj2020.solid.ocp.usa.solution;

public class USASpeedLimitFine {
    SpeedLimit speedLimitInState;

    public USASpeedLimitFine(SpeedLimit speedLimitInState) {
        this.speedLimitInState = speedLimitInState;
    }

    public double calcualateSpeedLimitFine(int speed){
        return speedLimitInState.calcualateSpeedLimitFine(speed);
    }
}

