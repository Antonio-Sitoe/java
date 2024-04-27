package testeii.Model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Voto implements Serializable {

    public boolean isNull;
    public boolean isValid;

    String date = getDateTime();

    public Voto(boolean isNull, boolean isValid) {
        this.isNull = isNull;
        this.isValid = isValid;
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
