package HW1.View;

public class Mode implements Unlocker {
    private int mode;

    @Override
    public String unlockeThisPhone() {
        return "Телефон разблокирован без пароля.";
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }  
}
