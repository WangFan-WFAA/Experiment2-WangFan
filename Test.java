package wangfan;


public class Test {
	public static void main(String[] args) {
        CPU cPU = new CPU(2200,"i5",2.5);
        cPU.setFactory("Intel");
        HardDisk hardDisk =new HardDisk(1028,200.0);
        hardDisk.setID("C61D4211");
        PC pc =new PC(cPU);
        pc.sethardDisk(hardDisk);
        pc.show();
    }

}