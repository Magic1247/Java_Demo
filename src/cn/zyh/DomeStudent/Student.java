package cn.zyh.DomeStudent;

public class Student {
    private String name;
    private int age;
    private  boolean male;
    public void setName(String sname){
        name = sname;
    }
    public String getName(){
        return name;
    }
    public void setAge(int sage){
        age = sage;
    }
    public int getAge(){
        return age;

    }

    public void  setMale(boolean iMale) {
        male = iMale;

    }
    public boolean isMale(){
        return male;
    }
}
