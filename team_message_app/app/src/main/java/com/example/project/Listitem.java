package com.example.project;

public class Listitem {

    private String question;
    private String answer;
    private String texttime;
    private String textlikes;


    public Listitem(String question, String answer, String texttime, String textlikes) {
        this.question = question;
        this.answer = answer;
        this.texttime = texttime;
        this.textlikes = textlikes;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getTexttime() {
        return texttime;
    }

    public String getTextlikes() {
        return textlikes;
    }
}