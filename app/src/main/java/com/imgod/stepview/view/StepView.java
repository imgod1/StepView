package com.imgod.stepview.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.imgod.stepview.R;
import com.imgod.stepview.view.bean.StepBean;

import java.util.List;

/**
 * @author kk
 * @Date 2017/9/21 14:00
 * @Description: 步骤view 引用线性布局 然后通过addview的方式添加步骤
 */
public class StepView extends LinearLayout {
    private LinearLayout llayout_content;
    private List<StepBean> mStepBeanList;

    public List<StepBean> getmStepBeanList() {
        return mStepBeanList;
    }

    public void setmStepBeanList(List<StepBean> mStepBeanList) {
        this.mStepBeanList = mStepBeanList;
        notifyDataSetChanged();
    }

    public StepView(Context context) {
        this(context, null);
    }

    public StepView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.layout_stepview, this);
        llayout_content = (LinearLayout) findViewById(R.id.llayout_content);
    }

    public void notifyDataSetChanged() {
        if (null != mStepBeanList && mStepBeanList.size() != 0) {
            llayout_content.removeAllViews();
            for (int i = 0; i < mStepBeanList.size(); i++) {
                StepBean stepBean = mStepBeanList.get(i);
                StepViewIndicator stepViewIndicator = new StepViewIndicator(getContext());
                stepViewIndicator.setmCompletedContentColor(mCompletedContentColor);
                stepViewIndicator.setmCurrentContentColor(mCurrentContentColor);
                stepViewIndicator.setmNormalContentColor(mNormalContentColor);
                stepViewIndicator.setmCompletedTitleColor(mCompletedTitleColor);
                stepViewIndicator.setmCurrentTitleColor(mCurrentTitleColor);
                stepViewIndicator.setmNormalTitleColor(mNormalTitleColor);
                stepViewIndicator.setmCompletedTitleBgRes(mCompletedTitleBgRes);
                stepViewIndicator.setmCurrentTitleBgRes(mCurrentTitleBgRes);
                stepViewIndicator.setmNormalTitleBgRes(mNormalTitleBgRes);
                stepViewIndicator.setmCompletedLineColor(mCompletedLineColor);
                stepViewIndicator.setmUnCompletedLineColor(mUnCompletedLineColor);

                stepViewIndicator.setmStepBean(stepBean);
                llayout_content.addView(stepViewIndicator);
            }
        }
    }


    //颜色 背景等各种资源
    private int mCompletedLineColor = Color.GREEN;
    private int mUnCompletedLineColor = Color.GRAY;


    private int mNormalTitleColor = Color.GREEN;
    private int mCurrentTitleColor = Color.WHITE;
    private int mCompletedTitleColor = Color.WHITE;

    private int mNormalTitleBgRes = R.drawable.shape_solid_white_stoken_gray_conner_20;
    private int mCurrentTitleBgRes = R.drawable.shape_solid_orange_corner_20;
    private int mCompletedTitleBgRes = R.drawable.shape_solid_white_stoken_orange_conner_20;

    private int mNormalContentColor = Color.BLACK;
    private int mCurrentContentColor = Color.BLACK;
    private int mCompletedContentColor = Color.BLACK;

    public StepView setmCompletedLineColor(int mCompletedLineColor) {
        this.mCompletedLineColor = mCompletedLineColor;
        return this;
    }

    public StepView setmUnCompletedLineColor(int mUnCompletedLineColor) {
        this.mUnCompletedLineColor = mUnCompletedLineColor;
        return this;
    }

    public StepView setmNormalTitleColor(int mNormalTitleColor) {
        this.mNormalTitleColor = mNormalTitleColor;
        return this;
    }

    public StepView setmCurrentTitleColor(int mCurrentTitleColor) {
        this.mCurrentTitleColor = mCurrentTitleColor;
        return this;
    }

    public StepView setmCompletedTitleColor(int mCompletedTitleColor) {
        this.mCompletedTitleColor = mCompletedTitleColor;
        return this;
    }

    public StepView setmNormalTitleBgRes(int mNormalTitleBgRes) {
        this.mNormalTitleBgRes = mNormalTitleBgRes;
        return this;
    }

    public StepView setmCurrentTitleBgRes(int mCurrentTitleBgRes) {
        this.mCurrentTitleBgRes = mCurrentTitleBgRes;
        return this;
    }

    public StepView setmCompletedTitleBgRes(int mCompletedTitleBgRes) {
        this.mCompletedTitleBgRes = mCompletedTitleBgRes;
        return this;
    }

    public StepView setmNormalContentColor(int mNormalContentColor) {
        this.mNormalContentColor = mNormalContentColor;
        return this;
    }

    public StepView setmCurrentContentColor(int mCurrentContentColor) {
        this.mCurrentContentColor = mCurrentContentColor;
        return this;
    }

    public StepView setmCompletedContentColor(int mCompletedContentColor) {
        this.mCompletedContentColor = mCompletedContentColor;
        return this;
    }
}
