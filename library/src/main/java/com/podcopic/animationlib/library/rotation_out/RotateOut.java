package com.podcopic.animationlib.library.rotation_out;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class RotateOut extends BaseViewAnimator {
    @Override
    public void prepare(View target) {

        final float horizontalCenter = mHorizontalCenter;
        final float verticalCenter = mVerticalCenter;
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",1,0),
                ObjectAnimator.ofFloat(target,"rotation",0,200),

                ObjectAnimator.ofFloat(target, "pivotX", horizontalCenter, horizontalCenter),
                ObjectAnimator.ofFloat(target, "pivotY", verticalCenter, verticalCenter)
        );
    }
}