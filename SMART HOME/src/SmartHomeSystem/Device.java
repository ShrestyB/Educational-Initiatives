package SmartHomeSystem;



public interface Device extends DeviceObserver {
    void turnOn(int id);
    void turnOff(int id);
    String deviceType();
    int getId();
}

