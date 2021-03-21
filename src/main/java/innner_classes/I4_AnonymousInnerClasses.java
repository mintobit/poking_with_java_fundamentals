package innner_classes;

import innner_classes.utils.Device;
import innner_classes.utils.DeviceWhitelist;

public class I4_AnonymousInnerClasses {
    public static void main(String[] args) {
        DeviceWhitelist deviceWhitelist = new DeviceWhitelist();

        // Anonymous inner class
        Device device = new Device() {
            @Override
            public Integer getId() {
                return 5;
            }
        };

        if (deviceWhitelist.contains(device)) {
            System.out.printf("Device %s is whitelisted%n", device.getId());
        } else {
            System.out.printf("Device %s is not whitelisted", device.getId());
        }
    }
}
