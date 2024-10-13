package com.LSchina.exam.vo;

import com.LSchina.exam.entity.FillQuestion;
import com.LSchina.exam.entity.JudgeQuestion;
import com.LSchina.exam.entity.MultiQuestion;

public class QuestionVO {
    private String type;

    private FillQuestion fillQuestion;

    private JudgeQuestion judgeQuestion;

    private MultiQuestion multiQuestion;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FillQuestion getFillQuestion() {
        return fillQuestion;
    }

    public void setFillQuestion(FillQuestion fillQuestion) {
        this.fillQuestion = fillQuestion;
    }

    public JudgeQuestion getJudgeQuestion() {
        return judgeQuestion;
    }

    public void setJudgeQuestion(JudgeQuestion judgeQuestion) {
        this.judgeQuestion = judgeQuestion;
    }

    public MultiQuestion getMultiQuestion() {
        return multiQuestion;
    }

    public void setMultiQuestion(MultiQuestion multiQuestion) {
        this.multiQuestion = multiQuestion;
    }
}
