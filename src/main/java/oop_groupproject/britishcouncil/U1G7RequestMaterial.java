package oop_groupproject.britishcouncil;

import java.io.Serializable;

public class U1G7RequestMaterial extends Invigilator implements Serializable {

    private String materialType;
    private int quantity;

    public U1G7RequestMaterial(String name, int userId, String password, boolean active,
                               String materialType, int quantity) {
        super(name, userId, password, active, studentId);
        this.materialType = materialType;
        this.quantity = quantity;
    }

    public String sendRequest() {

        if (materialType.isEmpty() || quantity <= 0) {
            return "Invalid request!";
        }

        FileHelper.writeObject(this, "materialRequest.bin");

        return "Request Sent to Manager";
    }
}