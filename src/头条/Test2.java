package 头条;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Test2{
    public static class time{
        public int x;
        public int y;
        public time(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int countn=sc.nextInt();
        int countm=sc.nextInt();
        
        ArrayList<time> arrlist=new ArrayList<>();
        ArrayList<time> reslist=new ArrayList<>();
        for(int i=0;i<countn;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y<x)
                y+=countm;
            arrlist.add(new time(x,y));
        }
        Comparator c=new Comparator<time>() {
            @Override
            public int compare(time o1, time o2) {
                return o1.y-o2.y;
            }
        };
        //按结束时间排序
        arrlist.sort(c);
        for(int i = 0;i < countn;i++){
            if(i == 0||reslist.get(reslist.size()-1).y <= arrlist.get(i).x){
                if(arrlist.get(i).y >= countm){
                    arrlist.get(i).y -= countm;
                    //若开始时间小于countm，也放入集合中，直接结束，后面的主播都不能观看
                    if(arrlist.get(i).y <= reslist.get(0).x){
                        reslist.add(arrlist.get(i));
                        break;
                    }
                }
                //比countm小，则直接放入集合中
                else
                    reslist.add(arrlist.get(i));
            }
        }
        System.out.println(reslist.size());
    }
}