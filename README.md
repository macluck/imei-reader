# IMEI Reader

A simple Cordova plugin for reading Android IMEI number.

In order to use the plugin, add to your *add-plugins.sh* :

```
cordova plugin add https://github.com/macluck/imei-reader.git
```

To use it in your app, add following:

```javascript
var imeiReader = window.plugins.imeiReader;
imeiReader.read(function (imei) {
    //Imei number is a string
},
function (err) {
});
```

Enjoy.