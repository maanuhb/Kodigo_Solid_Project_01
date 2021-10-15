package utilities;
import Interfaces.iAircrafts.IModel;
import Interfaces.iAircrafts.IPc;
import Interfaces.iAircrafts.IRf;
import Interfaces.iAircrafts.IType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aircrafts implements IModel, IType, IPc, IRf {
    String model = "";
    String type = "";
    //pc=passenger capacity
    int pc = 0 ;
    // rf= remaining fuel
    int rf = 0 ;
    Scanner sc = new Scanner(System.in);
@Override
    public void model() {
        System.out.println("Type the model: ");
        model = sc.nextLine();
        System.out.println("the model is: " + model);
    }
@Override
    public void type() {
        System.out.println("Type: ");
        model = sc.nextLine();
        System.out.println("the type is: " + model);
    }
@Override
    public void pc() {
        System.out.println("Type the passenger capacity: ");
        pc = sc.nextInt();
        System.out.println("the passanger capacity is: " + pc);
    }
@Override
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
