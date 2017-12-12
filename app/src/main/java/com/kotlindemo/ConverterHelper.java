package com.kotlindemo;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.logging.Level;

/**
 * Created by anish on 05-12-2017.
 */

public class ConverterHelper {
    private Context context2;

    public ConverterHelper(Context context) {
        this.context2 = context;
        Toast.makeText(context, "dvfh", Toast.LENGTH_SHORT).show();
    }

    public void converter(){
        Log.e("tag", "msg");
    }
}
