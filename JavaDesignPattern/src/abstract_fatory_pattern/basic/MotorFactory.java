package abstract_fatory_pattern.basic;

public class MotorFactory {
    public static Motor createMotor(VendorID vendorID) {
        Motor motor = null;
        switch (vendorID) {
            case First:
                motor = new FirstMotor();
                break;
            case Second:
                motor = new SecondMotor();
                break;
        }
        return motor;
    }
}
