package com.capacitorplugin.navigationbar;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.util.WebColor;

@CapacitorPlugin(name = "NavigationBar")
public class NavigationBarPlugin extends Plugin
{

    private NavigationBar implementation;

    @Override
    public void load()
    {
        implementation = new NavigationBar(getActivity());
    }

    @PluginMethod
    public void setBackgroundColor(PluginCall call)
    {
        final String color = call.getString("color");
        if (color == null)
        {
            call.reject("Color must be provided");
            return;
        }

        getBridge()
                .executeOnMainThread(
                        () ->
                        {
                            try
                            {
                                final int parsedColor = WebColor.parseColor(color.toUpperCase());
                                implementation.setBackgroundColor(parsedColor);
                                call.resolve();
                            }
                            catch (IllegalArgumentException ex)
                            {
                                call.reject("Invalid color provided. Must be a hex string (ex: #ff0000");
                            }
                        }
                );
    }

    @PluginMethod
    public void setNavigationBarDividerColor(PluginCall call)
    {
        final String color = call.getString("color");
        if (color == null)
        {
            call.reject("Color must be provided");
            return;
        }

        getBridge()
                .executeOnMainThread(
                        () ->
                        {
                            try
                            {
                                final int parsedColor = WebColor.parseColor(color.toUpperCase());
                                implementation.setNavigationBarDividerColor(parsedColor);
                                call.resolve();
                            }
                            catch (IllegalArgumentException ex)
                            {
                                call.reject("Invalid color provided. Must be a hex string (ex: #ff0000");
                            }
                        }
                );
    }

    @PluginMethod
    public void setNavigationBarContrastEnforced(PluginCall call)
    {
        final Boolean enforceContrast = call.getBoolean("enforceContrast");

        getBridge()
                .executeOnMainThread(
                        () ->
                        {
                            try
                            {
                                implementation.setNavigationBarContrastEnforced(enforceContrast);
                            }
                            catch (Exception ex)
                            {
                            }

                            call.resolve();
                        }
                );
    }

    @PluginMethod
    public void setStyle(PluginCall call)
    {
        final String style = call.getString("style");
        if (style == null)
        {
            call.reject("Style must be provided");
            return;
        }

        getBridge()
                .executeOnMainThread(
                        () ->
                        {
                            try
                            {
                                implementation.setStyle(style.equalsIgnoreCase("light"));
                                call.resolve();
                            }
                            catch (IllegalArgumentException ex)
                            {
                                call.reject("Invalid color provided. Must be a hex string (ex: #ff0000");
                            }
                        }
                );
    }
}
