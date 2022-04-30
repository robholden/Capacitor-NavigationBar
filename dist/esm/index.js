import { registerPlugin } from '@capacitor/core';
const NavigationBar = registerPlugin('NavigationBar', {
    web: () => import('./web').then(m => new m.NavigationBarWeb()),
    ios: () => import('./web').then(m => new m.NavigationBarWeb()),
});
export * from './definitions';
export { NavigationBar };
//# sourceMappingURL=index.js.map