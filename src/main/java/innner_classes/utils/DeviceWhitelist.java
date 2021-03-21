package innner_classes.utils;

public class DeviceWhitelist {
    private final Integer[] whitelistedIds = new Integer[] {5, 2, 1};

    public boolean contains(Device device) {
        for (Integer current : whitelistedIds) {
            if (current.equals(device.getId())) {
                return true;
            }
        }

        return false;
    }
}
