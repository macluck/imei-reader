var ImeiReader = function() {};

ImeiReader.prototype.read = function (successCallback, errorCallback) {
    if (errorCallback == null) { errorCallback = function() {}}

    if (typeof errorCallback != "function")  {
        console.log("PushNotification.register failure: failure parameter not a function");
        return
    }

    if (typeof successCallback != "function") {
        console.log("PushNotification.register failure: success callback parameter must be a function");
        return
    }

    cordova.exec(successCallback, errorCallback, "ImeiReader", "imeiNumber", []);
};

if(!window.plugins) {
    window.plugins = {};
}
if (!window.plugins.imeiReader) {
    window.plugins.imeiReader = new ImeiReader();
}