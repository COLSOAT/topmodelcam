package spring_crud.utils;


import com.javamaster.spring_crud.modelo.Vehiculo;
import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.*;


public class Cobro {


    @Getter
    @Setter
    private List<String> valoresDES = Arrays.asList("176.176", "365.024", "489.720", "552.288", "552.288", "552.288"
            , "575.080", "691.328", "686.752", "813.384", "805.376", "924.176"
            , "644.512", "930.600", "1.176.560"
            , "725.120", "913.968", "1.095.776"
            , "324.544", "430.232", "395.032", "491.480", "461.384", "547.272"
            , "578.512", "738.232", "774.224", "929.632"
            , "401.808", "502.040", "499.488", "617.320", "644.512", "756.008"
            , "961.928"
            , "951.368", "1.380.280");


    @Getter
    @Setter
    private String cobroPAYU;

    private List<String> hrefs = Arrays.asList("B0ed163B327CA04", "B0ed163770C4565", "B0ed163844C9DF8", "B0ed163BAADC6CF", "B0ed163BAADC6CF", "B0ed163BAADC6CF"
            , "B0ed16343CF8024", "B0ed1634F70DEE7", "B0ed16317AD56ED", "B0ed16350E375EA", "B0ed163B427100D", "B0ed163BA7D59CF"
            , "B0ed163A00BF650", "B0ed163651B8EB8", "B0ed163C1031417"
            , "B0ed163619BEB17", "B0ed16332594D40", "B0ed1631C7749F8"
            , "B0ed1636551CA83", "B0ed1632D25F3A2", "B0ed1635C6DBFE4", "B0ed163AA3AE3DD", "B0ed1634A000202", "B0ed163F2670E71"
            , "B0ed163645B1FA9", "B0ed163ECEDF340", "B0ed1637337DFEA", "B0ed163EBDA2A55"
            , "B0ed163A3FBA538", "B0ed1630A9F5FC5", "B0ed1631B2713EE", "B0ed16324EFD1BA", "B0ed163CEF412A8", "B0ed163CEF412A8"
            , "B0ed16309C35D31"
            , "B0ed1632423C84A", "B0ed16312886908");


    @Getter
    @Setter
    private Vehiculo vehiculo;

    public Cobro(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String calcularCobro() {

        double cosoto = Double.parseDouble(vehiculo.getCostototal());
        double resultado=(cosoto*15)/100;
        return String.valueOf(cosoto-resultado);
    }

    public int yearActual() {
        Date date = new Date();
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String currentYear = getYearFormat.format(date);
        return Integer.parseInt(currentYear);
    }


    public String mes() {
        Calendar c1 = Calendar.getInstance();
        List<String> meses = Arrays.asList("ene", "feb", "mar", "abr", ",may", "jun", "jul", "ago", "sep", "oct", "nov", "dic");
        return (String) meses.get(c1.get(Calendar.MONTH));
    }

    public int date(int DATE) {
        Calendar c1 = Calendar.getInstance();
        return c1.get(DATE);
    }

}
