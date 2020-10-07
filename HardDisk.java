package wangfan;

public class HardDisk {
	private int amount;
    private double size;
    private String ID;
    HardDisk(int amount,double size){
        setAmount(amount);
        setSize(size);

    }
    HardDisk(String ID){
        setID(ID);
    }

    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        if(size>100 && size<1000){
            this.size = size;
        }
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        if(ID.length()>5 && ID.length() <20){
            this.ID=ID;
        }
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount) {
        if(amount > 64 && amount  <2048){
            this.amount = amount;
        }
        else{
            System.out.println("´íÎó£¡");
        }
    }

}