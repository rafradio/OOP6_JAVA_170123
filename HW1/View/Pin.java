package HW1.View;

public class Pin implements Unlocker {
    private int pin;

    @Override
    public String unlockeThisPhone() {
        return "Телефон разблокирован c помощью пин-кода.";
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
 
}
