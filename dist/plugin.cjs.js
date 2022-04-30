'use strict';

Object.defineProperty(exports, '__esModule', { value: true });

var core = require('@capacitor/core');

const NavigationBar = core.registerPlugin('NavigationBar', {
    web: () => Promise.resolve().then(function () { return web; }).then(m => new m.NavigationBarWeb()),
    ios: () => Promise.resolve().then(function () { return web; }).then(m => new m.NavigationBarWeb()),
});

class NavigationBarWeb extends core.WebPlugin {
    setBackgroundColor(options) {
        return Promise.resolve();
    }
    setNavigationBarDividerColor(options) {
        return Promise.resolve();
    }
    setNavigationBarContrastEnforced(options) {
        return Promise.resolve();
    }
    setStyle(options) {
        return Promise.resolve();
    }
}

var web = /*#__PURE__*/Object.freeze({
    __proto__: null,
    NavigationBarWeb: NavigationBarWeb
});

exports.NavigationBar = NavigationBar;
//# sourceMappingURL=plugin.cjs.js.map
