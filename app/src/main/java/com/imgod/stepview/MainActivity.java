package com.imgod.stepview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.imgod.stepview.view.StepView;
import com.imgod.stepview.view.bean.StepBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @date 2017/9/21 15:17
 * @description: 测试stepview
 */
public class MainActivity extends Activity {

    private StepView stepview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stepview = (StepView) findViewById(R.id.stepview);
        initData();
    }

    List<StepBean> list = new ArrayList<>();

    private void initData() {

        StepBean stepBean1 = new StepBean(StepBean.TYPE_CURRENT, "1", "微信授权", true, false);
        StepBean stepBean2 = new StepBean(StepBean.TYPE_NORMAL, "2", "手机验证", false, false);
        StepBean stepBean3 = new StepBean(StepBean.TYPE_NORMAL, "3", "设置密码", false, true);
        list.add(stepBean1);
        list.add(stepBean2);
//        list.add(stepBean2);
//        list.add(stepBean2);
//        list.add(stepBean2);
//        list.add(stepBean2);
//        list.add(stepBean2);
//        list.add(stepBean2);
//        list.add(stepBean2);
        list.add(stepBean3);
        stepview
                .setmCompletedContentColor(getResources().getColor(R.color.stepview_grey))
                .setmCurrentContentColor(getResources().getColor(R.color.stepview_grey))
                .setmNormalContentColor(getResources().getColor(R.color.stepview_grey))
                .setmCompletedTitleColor(getResources().getColor(R.color.stepview_orange))
                .setmCurrentTitleColor(getResources().getColor(R.color.white))
                .setmNormalTitleColor(getResources().getColor(R.color.stepview_grey))
                .setmCompletedTitleBgRes(R.drawable.shape_solid_white_stoken_orange_conner_20)
                .setmCurrentTitleBgRes(R.drawable.shape_solid_orange_corner_20)
                .setmNormalTitleBgRes(R.drawable.shape_solid_white_stoken_gray_conner_20)
                .setmCompletedLineColor(getResources().getColor(R.color.stepview_orange))
                .setmUnCompletedLineColor(getResources().getColor(R.color.stepview_grey));
        stepview.setmStepBeanList(list);
    }


    private int location = 0;

    public void onClick(View view) {
        location += 1;
        if (location >= list.size()) {
            location = 0;
        }
        stepview.setStepPosition(location);
    }
}
