package com.itheima.pojo;

public class IdCard {
    private int id;
    private String code;

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
