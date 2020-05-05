package cn.zyh.DomePerson;
/*
set方法用于接收外部输入
get方法用于赋值私有变量
 */
public class DomePer {
    String  name;
    private int age;    //私有变量age
    public void show(){
//        if(age>=0){
            System.out.println("我叫"+name+","+"今年"+age);
//        }else {
//            System.out.println("age数据不合理！！！");
//        }
    }
    public void setAge(int agea){   //设置age变量（在方法参数中定义另一个变量供外部调用，在方法中进行判断，如果数据符合规则，赋值给私有变量age，如果不合理直接在此处停止程序运行）

        if(agea>0 && agea<100){     //判断变量age的值是否符合规则
            age = agea;             //如果如何复制给私有变量age
        }else{
            System.out.println("age数据不合理");//如果不合理提示后停止程序

        }
    }
    public int getAge(){                      //返回私有变量给外部调用处达到间接访问的目的
        return age;
    }
}
