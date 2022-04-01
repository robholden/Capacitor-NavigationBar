import { registerPlugin } from '@capacitor/core';

import type { NavigationBarPlugin } from './definitions';

const NavigationBar = registerPlugin<NavigationBarPlugin>('NavigationBar', {});

export * from './definitions';
export { NavigationBar };
