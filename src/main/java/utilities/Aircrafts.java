package utilities;
import java.util.Scanner;
public class Aircrafts {
    String model = "";
    String type = "";
    //pc=passenger capacity
    int pc = 0 ;
    // rf= remaining fuel
    int rf = 0 ;
    Scanner sc = new Scanner(System.in);
    public void model() {
        System.out.println("Type the model: ");
        model = sc.nextLine();
        System.out.println("the model is: " + model);
    }
    public void type() {
        System.out.println("Type: ");
        model = sc.nextLine();
        System.out.println("the type is: " + model);
    }
    public void pc() {
        System.out.println("Type the passenger capacity: ");
        pc = sc.nextInt();
        System.out.println("the passanger capacity is: " + pc);
    }
    public void rf() {
        System.out.println("Type the remaining fuel: ");
        rf = sc.nextInt();
        System.out.println("the remaining fuel is: " + rf);
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPc() {
        return pc;
    }
    public void setPc(int pc) {
        this.pc = pc;
    }
    public int getRf() {
        return rf;
    }
    public void setRf(int rf) {
        this.rf = rf;
    }
}
