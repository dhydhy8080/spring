package com.dhy.spring5.collectionType;

public class Teacher {
    private Stu stu;

    public void setStu(Stu stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "stu=" + stu +
                '}';
    }
}
