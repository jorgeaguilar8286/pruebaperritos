package cl.dogbreed;

import java.util.Map;

public class RazaImagen {
    private String status;
    private Map<String,String> message;

    public String getStatus() {
        return status;
    }

    public Map<String, String> getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "RazaImagen{" +
                "status='" + status + '\'' +
                ", message=" + message +
                '}';
    }
}
