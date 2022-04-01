import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(NavigationBarPlugin)
public class NavigationBarPlugin: CAPPlugin {
    private let implementation = NavigationBar()

    @objc func setBackgroundColor(_ call: CAPPluginCall) -> {
        call.resolve();
    }

    @objc func setNavigationBarDividerColor(_ call: CAPPluginCall) -> {
        call.resolve();
    }

    @objc func setNavigationBarContrastEnforced(_ call: CAPPluginCall) -> {
        call.resolve();
    }

    @objc func setStyle(_ call: CAPPluginCall) -> {
        call.resolve();
    }

}
