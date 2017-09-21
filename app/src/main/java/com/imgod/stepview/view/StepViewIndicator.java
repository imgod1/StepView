package com.imgod.stepview.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.imgod.stepview.R;
import com.imgod.stepview.view.bean.StepBean;

/**
 * @author kk
 * @Date 2017/9/21 12:55
 * @Description: 每一个步骤的view
 */
public class StepViewIndicator extends RelativeLayout {
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

    //控件
    private View v_line_left;
    private View v_line_right;
    private TextView txt_title;
    private TextView txt_content;

    private StepBean mStepBean;


    public StepViewIndicator(Context context) {
        this(context, null);
    }


    public StepViewIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.view_stepview, this);
        initView();
    }

    private void initView() {
        v_line_left = findViewById(R.id.v_line_left);
        v_line_right = findViewById(R.id.v_line_right);
        txt_title = (TextView) findViewById(R.id.txt_title);
        txt_content = (TextView) findViewById(R.id.txt_content);
    }

    public StepBean getmStepBean() {
        return mStepBean;
    }

    public void setmStepBean(StepBean mStepBean) {
        this.mStepBean = mStepBean;
        notifyDataSetChanged();
    }


    public void notifyDataSetChanged() {
        if (null != mStepBean) {
            //如果是第一个 隐藏左边的line
            if (mStepBean.isFirst()) {
                v_line_left.setVisibility(INVISIBLE);
            }

            //如果是最后一个 隐藏右边的line
            if (mStepBean.isLast()) {
                v_line_right.setVisibility(INVISIBLE);
            }

            txt_title.setText(mStepBean.getTitle());
            txt_content.setText(mStepBean.getContent());
            if (mStepBean.getStepType() == StepBean.TYPE_NORMAL) {
                v_line_left.setBackgroundColor(mUnCompletedLineColor);
                v_line_right.setBackgroundColor(mUnCompletedLineColor);

                txt_title.setTextColor(mNormalTitleColor);
                txt_title.setBackgroundResource(mNormalTitleBgRes);
                txt_content.setTextColor(mNormalContentColor);
            } else if (mStepBean.getStepType() == StepBean.TYPE_CURRENT) {
                v_line_left.setBackgroundColor(mCompletedLineColor);
                v_line_right.setBackgroundColor(mCompletedLineColor);

                txt_title.setTextColor(mCurrentTitleColor);
                txt_title.setBackgroundResource(mCurrentTitleBgRes);
                txt_content.setTextColor(mNormalContentColor);
            } else {
                v_line_left.setBackgroundColor(mCompletedLineColor);
                v_line_right.setBackgroundColor(mCompletedLineColor);

                txt_title.setTextColor(mCompletedTitleColor);
                txt_title.setBackgroundResource(mCompletedTitleBgRes);
                txt_content.setTextColor(mCompletedContentColor);
            }

        }
    }

    public int getmCompletedLineColor() {
        return mCompletedLineColor;
    }

    public void setmCompletedLineColor(int mCompletedLineColor) {
        this.mCompletedLineColor = mCompletedLineColor;
    }

    public int getmUnCompletedLineColor() {
        return mUnCompletedLineColor;
    }

    public void setmUnCompletedLineColor(int mUnCompletedLineColor) {
        this.mUnCompletedLineColor = mUnCompletedLineColor;
    }

    public int getmNormalTitleColor() {
        return mNormalTitleColor;
    }

    public void setmNormalTitleColor(int mNormalTitleColor) {
        this.mNormalTitleColor = mNormalTitleColor;
    }

    public int getmCurrentTitleColor() {
        return mCurrentTitleColor;
    }

    public void setmCurrentTitleColor(int mCurrentTitleColor) {
        this.mCurrentTitleColor = mCurrentTitleColor;
    }

    public int getmCompletedTitleColor() {
        return mCompletedTitleColor;
    }

    public void setmCompletedTitleColor(int mCompletedTitleColor) {
        this.mCompletedTitleColor = mCompletedTitleColor;
    }

    public int getmNormalTitleBgRes() {
        return mNormalTitleBgRes;
    }

    public void setmNormalTitleBgRes(int mNormalTitleBgRes) {
        this.mNormalTitleBgRes = mNormalTitleBgRes;
    }

    public int getmCurrentTitleBgRes() {
        return mCurrentTitleBgRes;
    }

    public void setmCurrentTitleBgRes(int mCurrentTitleBgRes) {
        this.mCurrentTitleBgRes = mCurrentTitleBgRes;
    }

    public int getmCompletedTitleBgRes() {
        return mCompletedTitleBgRes;
    }

    public void setmCompletedTitleBgRes(int mCompletedTitleBgRes) {
        this.mCompletedTitleBgRes = mCompletedTitleBgRes;
    }

    public int getmNormalContentColor() {
        return mNormalContentColor;
    }

    public void setmNormalContentColor(int mNormalContentColor) {
        this.mNormalContentColor = mNormalContentColor;
    }

    public int getmCurrentContentColor() {
        return mCurrentContentColor;
    }

    public void setmCurrentContentColor(int mCurrentContentColor) {
        this.mCurrentContentColor = mCurrentContentColor;
    }

    public int getmCompletedContentColor() {
        return mCompletedContentColor;
    }

    public void setmCompletedContentColor(int mCompletedContentColor) {
        this.mCompletedContentColor = mCompletedContentColor;
    }
}
