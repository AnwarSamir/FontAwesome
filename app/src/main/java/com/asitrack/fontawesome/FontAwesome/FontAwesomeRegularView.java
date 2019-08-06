package com.asitrack.fontawesome.FontAwesome;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontAwesomeRegularView extends TextView {


    public FontAwesomeRegularView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public FontAwesomeRegularView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FontAwesomeRegularView(Context context) {
        super(context);
        init();
    }

    private void init() {

        //Font name should not contain "/".
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "fa_regular_400.ttf");
        setTypeface(tf);
    }

}