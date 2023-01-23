package HW1.Model;

public class Model {
    private StringBuilder sb;

    public Model() {
        this.sb = new StringBuilder()
            .append("\n ==== \n")
            .append("1 - Разблокоривать без пароля\n")
            .append("2 - Разблокоривать с пин-кодом\n")
            .append("3 - Разблокоривать по отпечатку пальца\n")
            .append("4 - Разблокоривать по распознаванию лица\n");
    }

    public static Model creatModel() {
        return new Model();
    }

    public StringBuilder getSb() {
        return sb;
    }

    

    
}
