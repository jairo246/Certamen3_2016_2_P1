package cl.telematica.android.certamen3.modelo;

import java.util.ArrayList;

/**
 * Created by labtel on 18-11-2016.
 */

public interface base_datos {
    public String guardar(String title, String link, String author,String publishedDate,String content ,String imagen);
    public String eliminar(String title);
    public ArrayList llenar_lv();


}
