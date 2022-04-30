import { WebPlugin } from '@capacitor/core';
import { NavigationBarPlugin } from './definitions';
export declare class NavigationBarWeb extends WebPlugin implements NavigationBarPlugin {
    setBackgroundColor(options: {
        color: string;
    }): Promise<void>;
    setNavigationBarDividerColor(options: {
        color: string;
    }): Promise<void>;
    setNavigationBarContrastEnforced(options: {
        enforceContrast: boolean;
    }): Promise<void>;
    setStyle(options: {
        style: 'Light' | 'Dark';
    }): Promise<void>;
}
