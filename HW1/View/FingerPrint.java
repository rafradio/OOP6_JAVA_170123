package HW1.View;

public class FingerPrint implements Unlocker {
    private String fingerprint;

    @Override
    public String unlockeThisPhone() {
        return "Телефон разблокирован c помощью отпечатка пальца.";
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

}
