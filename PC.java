package wangfan;

public class PC {
	private CPU cPU;
    private HardDisk hardDisk;
    PC(CPU cPU){
        setcPU(cPU);
    }
    PC(HardDisk hardDisk){
        sethardDisk(hardDisk);
    }
    public void setcPU(CPU cPU) {
        this.cPU = cPU;
    }
    public void sethardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void show(){
        System.out.println("cpu���ٶ�Ϊ��"+cPU.getSpeed());
        System.out.println("cpu������Ϊ��"+cPU.getName());
        System.out.println("cpu�ĺ���Ϊ��"+cPU.getHertz());
        System.out.println("cpu�ĳ���Ϊ��"+cPU.getFactory());
        System.out.println("Ӳ�̵�����Ϊ��"+hardDisk.getAmount());
        System.out.println("Ӳ�̵ĳߴ�Ϊ��"+hardDisk.getSize());
        System.out.println("Ӳ�̵�������Ϊ��"+hardDisk.getID());
    }
}
