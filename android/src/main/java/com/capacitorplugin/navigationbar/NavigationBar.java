package com.capacitorplugin.navigationbar;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class NavigationBar
{

    private final AppCompatActivity activity;

    public NavigationBar(AppCompatActivity activity)
    {
        this.activity = activity;
    }

    public void setBackgroundColor(int color)
    {
        activity.getWindow().setNavigationBarColor(color);
    }

    public void setNavigationBarDividerColor(int color)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
        {
            activity.getWindow().setNavigationBarDividerColor(color);
        }
    }

    public void setNavigationBarContrastEnforced(boolean enforceContrast)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q)
        {
            activity.getWindow().setNavigationBarContrastEnforced(enforceContrast);
        }
    }

    public void setStyle(Boolean isLight)
    {
        Window window = activity.getWindow();

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R)
        {
            WindowInsetsController ctrl = window.getInsetsController();

            if (isLight)
            {
                ctrl.setSystemBarsAppearance(APPEARANCE_LIGHT_NAVIGATION_BARS, APPEARANCE_LIGHT_NAVIGATION_BARS);
            } else
            {
                ctrl.setSystemBarsAppearance(0, APPEARANCE_LIGHT_NAVIGATION_BARS);
            }
        }

        else
        {
            View decorView =window.getDecorView();
            int flags = decorView.getSystemUiVisibility();
            if (isLight)
            {
                flags |= View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
            }
            else
            {
                flags &= ~View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
            }

            decorView.setSystemUiVisibility(flags);
        }
    }

}
