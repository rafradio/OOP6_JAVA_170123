package HW1.View;

public class FaceID implements Unlocker {
    private String faceID;

    @Override
    public String unlockeThisPhone() {
        return "Телефон разблокирован c помощью FaceID.";
    }

    public String getFaceID() {
        return faceID;
    }

    public void setFaceID(String faceID) {
        this.faceID = faceID;
    }
    
    
}
