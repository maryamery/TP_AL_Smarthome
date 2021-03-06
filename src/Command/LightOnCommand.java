package Command;

import Devices.Device;
import Devices.Light;

public class LightOnCommand implements Command {
    Device light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void cancel() {
        light.off();
    }
}

