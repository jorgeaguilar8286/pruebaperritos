package cl.dogbreed.data.model;

import java.util.List;
import java.util.Map;

public class Razaslista {
    private String status;
    private Map<String, List<String>>message;

    public Razaslista(String status, Map<String, List<String>> message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public Map<String, List<String>> getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Razaslista{" +
                "status='" + status + '\'' +
                ", message=" + message +
                '}';
    }
}
