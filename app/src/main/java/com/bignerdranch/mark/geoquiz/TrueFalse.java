package com.bignerdranch.mark.geoquiz;

public class TrueFalse {

    private int mQuestion;
    private boolean mTrueFalse;

    /**
     *
     * @param question
     * @param trueQuestion
     */
    public TrueFalse (int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueFalse = trueQuestion;
    }

    /**
     *
     * @return
     */
    public int getQuestion() {
        return mQuestion;
    }

    /**
     *
     * @param question
     */
    public void setQuestion(int question) {
        mQuestion = question;
    }

    /**
     *
     * @return
     */
    public boolean isTrueFalse() {
        return mTrueFalse;
    }

    /**
     *
     * @param trueFalse
     */
    public void setTrueFalse(boolean trueFalse) {
        mTrueFalse = trueFalse;
    }
}
