package com.asitrack.fontawesome2.FontAwesome;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class FontAwesomeUtils {


    public static void changeFontAwesomeForRegularIconColor(Context contextm, TextView textView, String icon, int colorId) {
        Typeface font = Typeface.createFromAsset(contextm.getAssets(), "fa_regular_400.ttf");
        textView.setTypeface(font);
        textView.setText(icon);
        textView.setTextColor(colorId);
    }

    public static void changeFontAwesomeForSloidIconColor(Context contextm,TextView textView, String icon, int colorId) {
        Typeface font = Typeface.createFromAsset(contextm.getAssets(), "fa_solid_900.ttf");
        textView.setTypeface(font);
        textView.setText(icon);
        textView.setTextColor(colorId);
    }
}
