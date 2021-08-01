package cn.start.DemoRedenvelopes;

import java.util.ArrayList;

public class Leader extends Pepole {
    public Leader(){

    }

    public Leader(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();   // 当前余额
        if(leftMoney < totalMoney){
            System.out.println("余额不足！！！");
            return redList;
        }
        super.setMoney(leftMoney - totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg+mod;
        redList.add(last);
        return redList;
        }
    }

