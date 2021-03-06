package info.nightscout.androidaps.plugins.PumpBluetooth.events;

import info.nightscout.androidaps.MainApp;
import info.nightscout.androidaps.R;
import info.nightscout.androidaps.events.Event;

public class EventBluetoothPumpStatusChanged extends Event {
    public static final int CONNECTING = 1;
    public static final int CONNECTED = 2;
    public static final int DISCONNECTED = 4;
    public static final int FAILED = 5;
    public static final int DROPPED = 6;
    public static final int INVALID = 7;

    public int sStatus = DISCONNECTED;

    public String EventPassStatus(int status) {
        sStatus = status;
        return textStatus();
    }

    public String textStatus() {
        if (sStatus == CONNECTING) {
            return MainApp.sResources.getString(R.string.bluetoothstatus_connecting);
        } else if (sStatus == CONNECTED) {
            return MainApp.sResources.getString(R.string.bluetoothstatus_connected);
        } else if (sStatus == DISCONNECTED) {
            return MainApp.sResources.getString(R.string.bluetoothstatus_disconnected);
        } else if (sStatus == FAILED) {
            return MainApp.sResources.getString(R.string.bluetoothstatus_failed);
        } else if (sStatus == DROPPED) {
            return MainApp.sResources.getString(R.string.bluetoothstatus_dropped);
        } else if (sStatus == INVALID) {
            return MainApp.sResources.getString(R.string.bluetoothstatus_invalid);
        }
        return "";
    }
}
