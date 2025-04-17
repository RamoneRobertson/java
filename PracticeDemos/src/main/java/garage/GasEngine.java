package garage;

public class GasEngine implements Engine {
    private int torque;
    private int rpm;

    public GasEngine(int torque, int rpm){
        this.torque = torque;
        this.rpm = rpm;
    }

    @Override
    public void getHorsePower() {

    }
}
