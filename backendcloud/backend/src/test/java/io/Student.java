package io;
import java.io.*;
import java.util.*;
public class Student implements Serializable{
    private static final long serialVersionUID=10L;
    String name;
    String ID;//存放4科成绩
    int [ ] record=new int[4];
    int total; //总成绩
    float avg; //平均成绩
    public Student(){}
    public String getName(){return name; }
    public String getlD(){return ID;}
    public int[ ] getRecord(){return record;}
    public int getTotal(){ return total;}
    public float getAvg(){ return avg;}
    public void setName(String name){ this.name=name; }
    public void setlD(String ID){ this.ID=ID; }
    public void setRecord(int [] record){ this.record=record; }
    public void setTotal(int total){ this.total=total;}
    public void setAvg(float avg){ this.avg=avg; }
}
class Text {
    public static void main(String[] args) {
        ArrayList<Student> Stu=new ArrayList<Student>();//创建一个学生类的数组链表
        InputStreamReader in=new InputStreamReader(System.in);//接收键盘的标准输入
        BufferedReader buffer=new BufferedReader(in);//键盘数据缓存输入
        Scanner cin=new Scanner(buffer);//得到键盘的输入
        int cnt=0;
        System.out.println("请输入姓名，学号，高数，英语，C语言，Java语言的成绩.(eof:输入结束)");//输入学生信息
        while (true){
            Student temp=new Student();//暂时学生对象
            String s=null;
            System.out.print("姓名:");
            s=cin.next();
            if(s.equals("eof"))break;
            cnt++;
            temp.setName(s);
            System.out.print("学号:");
            s=cin.next();
            if(s.equals("eof"))break;
            cnt++;
            temp.setlD(s);
            int [] record=new int[4];
            int total=0;
            System.out.print("高数:"); record[0]=cin.nextInt(); total+=record[0];
            System.out.print("英语:"); record[1]=cin.nextInt(); total+=record[1];
            System.out.print("Java语言:"); record[2]=cin.nextInt(); total+=record[2];
            System.out.print("C语言:"); record[3]=cin.nextInt(); total+=record[3];
            temp.setRecord(record); temp.setTotal(total);
            temp.setAvg(total/(4.0f));
            Stu.add(temp);//链表调用添加
            System.out.println(" ");
        }
        try{
            FileOutputStream fileout=new FileOutputStream("E:/eclipse/IO字符/data.stu.txt");
            ObjectOutputStream objectout=new ObjectOutputStream(fileout);//向data.stu写入数据
            for (int i=0;i<Stu.size();i++){
                objectout.writeObject(Stu.get(i));
            }
            objectout.close();
            System.out.println("保存成功");
            cin.close();
        }
        catch (Exception e){System.out.println(e);}
        Stu.clear();
        try{
            FileInputStream filein=new FileInputStream("E:/eclipse/IO字符/data.stu.txt");
            ObjectInputStream objectin=new ObjectInputStream(filein);
            System.out.println("姓名\t学号\t高数\t英语\tJava\tC语言\t总成绩\t平均分");
            int i=0;
            while(true){
                Student temp=(Student)objectin.readObject();//输入学生对象
                System.out.print(temp.name+"\t"+temp.ID+"\t"+temp.record[0]);
                System.out.print("\t"+temp.record[1]+"\t"+temp.record[2]);
                System.out.println("\t"+temp.record[3]+"\t"+"\t"+temp.total+"\t"+"\t"+temp.avg);
                i++;
                if (i>cnt)break;
                objectin.close();
            }
        }
        catch (Exception e){System.out.println(e);}
        Stu.clear();
    }
}