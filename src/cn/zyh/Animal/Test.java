package cn.zyh.Animal;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();   // animal本来是猫（对象的向上转型）
        animal.cat();

        if(animal instanceof Cat){  // 判断父类对象是否为猫
            Cat cat = (Cat)animal; // 对象的向下转型（将animal还原为猫）
            cat.catchmouse();
        }
        if(animal instanceof Dog){  // 判断父类对象是否为Dog
            Dog dog = (Dog)animal;
            dog.watchhouse();
        }
        System.out.println("================================");
        giveMeAPet(animal);
    }
    public static void giveMeAPet(Animal animala){
        if (animala instanceof Cat){
            Cat cat = (Cat)animala;
            cat.catchmouse();
        }else{
            System.out.println("需要的是猫！！！");
        }

    }
}
