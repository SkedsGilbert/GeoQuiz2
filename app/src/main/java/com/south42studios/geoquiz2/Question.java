package com.south42studios.geoquiz2;

/**
 * Created by Jsin on 8/6/2015.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mCheatedOn;



    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mCheatedOn = false;
    }

    public boolean isCheatedOn() {
        return mCheatedOn;
    }

    public void setCheatedOn(boolean cheatedOn) {
        mCheatedOn = cheatedOn;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
