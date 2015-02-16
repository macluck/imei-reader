package fi.srv.imei;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;

public class ImeiReader extends CordovaPlugin {

    public ImeiReader() {

    }

    public String DeviceImeiNumber() {
        TelephonyManager telephonyManager = (TelephonyManager) cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        return telephonyManager.getDeviceId();
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("imeiNumber")) {
            callbackContext.success(this.DeviceImeiNumber());
            return true;
        }
        else {
            return false;
        }
    }
}