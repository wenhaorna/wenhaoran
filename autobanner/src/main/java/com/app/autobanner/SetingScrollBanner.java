package com.app.autobanner;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Administrator on 2017/12/2.
 */

public class SetingScrollBanner extends ViewPager {
    public SetingScrollBanner(Context context) {
        super(context);
    }

    public SetingScrollBanner(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    private boolean scrollable = true;


    /**
     * 设置viewpager是否可以滚动
     *
     * @param enable
     */
    public void setScrollable(boolean enable) {
        scrollable = enable;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (scrollable) {
            return super.onInterceptTouchEvent(event);
        } else {
            return false;
        }
    }
}