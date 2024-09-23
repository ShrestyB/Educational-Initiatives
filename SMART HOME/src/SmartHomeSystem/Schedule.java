package SmartHomeSystem;

import SmartHomeSystem.Exceptions.UnsupportedActionException;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Schedule {
    private final Device device;
    private final String time;
    private final String action;
    private final int deviceId;
    private static Logger logger = Logger.getLogger(Schedule.class.getName());

    public Schedule(Device device, String time, String action, int deviceId) {
        this.device = device;
        this.time = time;
        this.action = action;
        this.deviceId = deviceId;
    }

    // Executes the scheduled action on the specified device
    public void execute() throws UnsupportedActionException {
        if (action.equals("Turn On")) {
            device.turnOn(deviceId);
        } else if (action.equals("Turn Off")) {
            device.turnOff(deviceId);
        }
        else{
            logger.log(Level.WARNING,"Unsupported Action - " +action);
            throw new UnsupportedActionException("Unsupported Action - "+action);
        }
    }
}
