#import <Foundation/Foundation.h>
#import <Capacitor/Capacitor.h>

// Define the plugin using the CAP_PLUGIN Macro, and
// each method the plugin supports using the CAP_PLUGIN_METHOD macro.
CAP_PLUGIN(NavigationBarPlugin, "NavigationBar",
           CAP_PLUGIN_METHOD(setBackgroundColor, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(setNavigationBarDividerColor, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(setNavigationBarContrastEnforced, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(setStyle, CAPPluginReturnPromise);
)
