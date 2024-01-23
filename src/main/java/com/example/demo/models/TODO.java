package com.example.demo.models;

public class TODO {
    private int id;
    private String content;
    public TODO(int id , String content){
        this.id = id;
        this.content = content;
    }
    public TODO(){
    }

    public int getId() {
        return id;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(int id) {
        this.id = id;
    }
}
