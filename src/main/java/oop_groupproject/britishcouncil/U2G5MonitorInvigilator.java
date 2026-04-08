package oop_groupproject.britishcouncil;

import java.io.Serializable;
import java.util.ArrayList;

public class U2G5MonitorInvigilator extends SystemOperationsManager implements Serializable {

    public U2G5MonitorInvigilator(String name, int id, String pass, boolean active) {
        super(name, id, pass, active);
    }

    public String viewStatus() {

        ArrayList<Object> requests = FileHelper.readObjects("materialRequest.bin");

        if (requests.isEmpty()) {
            return "No Requests Found";
        }

        StringBuilder sb = new StringBuilder();

        for (Object obj : requests) {
            U1G7RequestMaterial r = (U1G7RequestMaterial) obj;

            sb.append("Material: ").append(r.toString()).append("\n");
        }

        return sb.toString();
    }
}