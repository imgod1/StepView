package com.imgod.stepview.view.bean;

/**
 * @author kk
 * @Date 2017/9/21 13:24
 * @Description: 步骤Bean
 */
public class StepBean {
    public static final int TYPE_NORMAL = 0;//还没有到达的位置
    public static final int TYPE_CURRENT = 1;//当前所在的位置
    public static final int TYPE_COMPELTED = 2;//已经完成的位置


    private int stepType;
    private String title;
    private String content;
    private boolean isFirst;
    private boolean isLast;

    public StepBean(int stepType, String title, String content, boolean isFirst, boolean isLast) {
        this.stepType = stepType;
        this.title = title;
        this.content = content;
        this.isFirst = isFirst;
        this.isLast = isLast;
    }

    public int getStepType() {
        return stepType;
    }

    public void setStepType(int stepType) {
        this.stepType = stepType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }
}
