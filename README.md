# 计191 王帆 2019310198


#### Experiment2-WangFan



#### 实验二 PC机模拟程序


## 一、实验目的：

#### 1、用类描述计算机中的CPU速度和硬盘容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test。其中Test是主类。


#### 2、掌握构造方法和对象的创建


#### 3、了解类与程序的基本结构


#### 4、理解类的封装




## 二、实验要求：


#### 1、 CPU类：要求getSpeed()返回speed的值，用setSpeed(int m)方法将参数m的值赋值给speed


#### 2、HardDisk类：要求getAmount()返回amount的值，用setAmount(int m)方法将参数m的值赋值给amount


#### 3、PC类：要求setCPU(CPU c)将参数c的值赋值给cpu,用setHardDisk(HardDisk h)方法将参数h的值赋值给HD，用show()方法显示cpu的速度和硬盘的容量


#### 4、Test主类：main方法中创建CPU对象cpu，将cpu speed 设置为2200；main方法中创建HardDisk对象disk，将disk amount 设置为200；main方法中创建PC对象pc


#### pc调用setCPU(CPU c)方法，调用实参是cpu；


#### pc调用setHardDisk(HardDisk h)方法，调用实参是disk


#### pc调用show()方法


#### 附加内容：


#### 1、类中定义不少于两个构造方法


#### 2、每个类定义不少于2个属性，且属性的类型应该多样化


#### 3、根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断


#### 4、尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法




## 三、操作过程：


#### 1、首先在Eclipse中创建放置此次代码的project，pack，再分别创建PC、CPU、HardDisk和Test4个类，分别在每个类里写入代码；


#### 2、用private将代码封装，保护需要保护的隐私；


#### 3、在4个类中分别使用构造方法来给类中的变量进行初始化赋值；


#### 4、用关键词this来传递变量的值，并用if语句判断输入的值是否与要求相同；


#### 5、使用show()来显示CPU和硬盘的信息；


#### 6、最后在输出语句中输出变量。




## 四、核心代码：
#### public class CPU {private int speed;
#### private String name;
#### private double hertz;
#### private String factory;
#### CPU(){
#### }
#### CPU(int speed, String name, double hertz) {
####     setSpeed(speed);
####     setName(name);
####     setHertz(hertz);
#### }
#### CPU(String factory){
####     setFactory(factory);
#### }
#### 
#### public String getName() {
####     return name;
#### }
#### 
#### public void setName(String name) {
####     if (name instanceof String){
####         this.name=name;
####     }
#### }
#### 
#### public double getHertz() {
####     return hertz;
#### }
#### 
#### public void setHertz(double hertz) {
####     if (hertz > 2.4 && hertz <4.0) {
####         this.hertz = hertz;
####     }
####     else {
####        System.out.println("赫兹错误！");
####     }
#### }
#### 
#### public String getFactory() {
####     return factory;
#### }
#### 
#### public void setFactory(String factory) {
####     if (factory == "Intel"){
####         this.factory=factory;
####     }
####     else {
####         System.out.println("厂家错误！");
####    }
#### 
#### }
#### public int getSpeed(){
####     return speed;
#### }
#### public void setSpeed(int speed) {
####     if (speed < 3500 && speed > 2000){
####         this.speed=speed;
####     }
####     else{
####         System.out.println("速度错误!");
####     }
#### }
#### 
#### 
#### }
## 五、实验结果：







## 六、实验感想：
