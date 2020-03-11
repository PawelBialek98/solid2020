package pl.zzpj2020.solid.dip.weathertracker.solution;

public class WeatherTrack {
    private Device device;
    String currentConditions;

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        System.out.println(device.generateWeatherAlert(currentConditions));
    }
    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
