import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(NavigationBarPlugin)
public class NavigationBarPlugin: CAPPlugin {
    @objc func setBackgroundColor(_ call: CAPPluginCall) -> Void {
        call.resolve();
    }

    @objc func setNavigationBarDividerColor(_ call: CAPPluginCall) -> Void {
        call.resolve();
    }

    @objc func setNavigationBarContrastEnforced(_ call: CAPPluginCall) -> Void {
        call.resolve();
    }

    @objc func setStyle(_ call: CAPPluginCall) -> Void {
        call.resolve();
    }
}
