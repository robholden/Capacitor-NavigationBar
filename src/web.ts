import { WebPlugin } from '@capacitor/core';

// eslint-disable-next-line @typescript-eslint/consistent-type-imports
import { NavigationBarPlugin } from './definitions';

export class NavigationBarWeb extends WebPlugin implements NavigationBarPlugin {
  setBackgroundColor(options: { color: string }): Promise<void> {
    return Promise.resolve();
  }

  setNavigationBarDividerColor(options: { color: string }): Promise<void> {
    return Promise.resolve();
  }

  setNavigationBarContrastEnforced(options: {
    enforceContrast: boolean;
  }): Promise<void> {
    return Promise.resolve();
  }

  setStyle(options: { style: 'Light' | 'Dark' }): Promise<void> {
    return Promise.resolve();
  }
}
