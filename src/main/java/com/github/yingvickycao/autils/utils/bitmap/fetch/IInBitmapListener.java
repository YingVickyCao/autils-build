package com.github.yingvickycao.autils.utils.bitmap.fetch;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public interface IInBitmapListener {
    Bitmap getReusableBitmap4InBitmap(BitmapFactory.Options options);
}