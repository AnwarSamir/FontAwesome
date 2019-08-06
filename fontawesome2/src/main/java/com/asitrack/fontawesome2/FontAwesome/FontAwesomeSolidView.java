package com.asitrack.fontawesome2.FontAwesome;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontAwesomeSolidView extends TextView {


    public FontAwesomeSolidView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public FontAwesomeSolidView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FontAwesomeSolidView(Context context) {
        super(context);
        init();
    }

    private void init() {

        //Font name should not contain "/".
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "fa_solid_900.ttf");
        setTypeface(tf);
    }

}