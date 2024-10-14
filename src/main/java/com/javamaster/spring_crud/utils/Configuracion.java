package com.javamaster.spring_crud.utils;


import com.javamaster.spring_crud.modelo.Vehiculo;
import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.*;


public class Configuracion {
    public static int PORCENTAJE = 7;

    @Getter
    @Setter
    Map<String, Object> codePagoPayU;

    @Getter
    @Setter
    private Vehiculo vehiculo;

    public Configuracion(Vehiculo vehiculo) {
        codePagoPayU = new HashMap();
        codePagoPayU.put("100", "1t2qNQV");
        codePagoPayU.put("110", "33SARHR");
        codePagoPayU.put("120", "2w54q8v");
        codePagoPayU.put("130", "2huiJeJ");
        codePagoPayU.put("140", "2huiJeJ");
        codePagoPayU.put("150", "2huiJeJ");

        codePagoPayU.put("211", "2tRwFH7");
        codePagoPayU.put("212", "1UHcTGL");
        codePagoPayU.put("221", "2CYJk8D");
        codePagoPayU.put("222", "2sCytqB");
        codePagoPayU.put("231", "1FUGkJY");
        codePagoPayU.put("232", "1KPFYUo");


        codePagoPayU.put("310", "1Dofu6t");//falta esta parte por confirmar
        codePagoPayU.put("320", "2c1Mhrp");
        codePagoPayU.put("330", "2PeA6wc");

        codePagoPayU.put("410", "2yRsvcd");
        codePagoPayU.put("420", "1AJVhbS");
        codePagoPayU.put("430", "1RsGxpJ");

        codePagoPayU.put("511", "2wowhaW");
        codePagoPayU.put("512", "1ZMxifS");
        codePagoPayU.put("521", "2a12S1C");
        codePagoPayU.put("522", "2NxP4xK");
        codePagoPayU.put("531", "1JMbb74");
        codePagoPayU.put("532", "29MbFxo");

        codePagoPayU.put("611", "2de4pkQ");
        codePagoPayU.put("612", "2kBsVtv");
        codePagoPayU.put("621", "1uhcHHg");
        codePagoPayU.put("622", "1EWsZkt");

        codePagoPayU.put("711", "1SQoQkc");
        codePagoPayU.put("712", "2a7dUKX");
        codePagoPayU.put("721", "2HUyxeu");
        codePagoPayU.put("722", "2adjLJz");
        codePagoPayU.put("731", "2NBWRfG");
        codePagoPayU.put("732", "2vzrgRM");

        codePagoPayU.put("810", "1NWrZWP");

        codePagoPayU.put("910", "21tEHue");
        codePagoPayU.put("920", "1oDxX4e");
    }

    public Configuracion() {
        codePagoPayU = new HashMap();
        codePagoPayU.put("100", "1t2qNQV");
        codePagoPayU.put("110", "33SARHR");
        codePagoPayU.put("120", "2w54q8v");
        codePagoPayU.put("130", "2huiJeJ");
        codePagoPayU.put("140", "2huiJeJ");
        codePagoPayU.put("150", "2huiJeJ");

        codePagoPayU.put("211", "2tRwFH7");
        codePagoPayU.put("212", "1UHcTGL");
        codePagoPayU.put("221", "2CYJk8D");
        codePagoPayU.put("222", "2sCytqB");
        codePagoPayU.put("231", "1FUGkJY");
        codePagoPayU.put("232", "1KPFYUo");


        codePagoPayU.put("310", "1Dofu6t");//falta esta parte por confirmar
        codePagoPayU.put("320", "2c1Mhrp");
        codePagoPayU.put("330", "2PeA6wc");

        codePagoPayU.put("410", "2yRsvcd");
        codePagoPayU.put("420", "1AJVhbS");
        codePagoPayU.put("430", "1RsGxpJ");

        codePagoPayU.put("511", "2wowhaW");
        codePagoPayU.put("512", "1ZMxifS");
        codePagoPayU.put("521", "2a12S1C");
        codePagoPayU.put("522", "2NxP4xK");
        codePagoPayU.put("531", "1JMbb74");
        codePagoPayU.put("532", "29MbFxo");

        codePagoPayU.put("611", "2de4pkQ");
        codePagoPayU.put("612", "2kBsVtv");
        codePagoPayU.put("621", "1uhcHHg");
        codePagoPayU.put("622", "1EWsZkt");

        codePagoPayU.put("711", "1SQoQkc");
        codePagoPayU.put("712", "2a7dUKX");
        codePagoPayU.put("721", "2HUyxeu");
        codePagoPayU.put("722", "2adjLJz");
        codePagoPayU.put("731", "2NBWRfG");
        codePagoPayU.put("732", "2vzrgRM");

        codePagoPayU.put("810", "1NWrZWP");

        codePagoPayU.put("910", "21tEHue");
        codePagoPayU.put("920", "1oDxX4e");
    }

    public int yearActual() {
        Date date = new Date();
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String currentYear = getYearFormat.format(date);
        return Integer.parseInt(currentYear);
    }


    public String mes() {
        Calendar c1 = Calendar.getInstance();
        List<String> meses = Arrays.asList("ENE", "FEB", "MAR", "ABR", ",MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC");
        return (String) meses.get(c1.get(Calendar.MONTH));
    }

    public int date(int DATE) {
        Calendar c1 = Calendar.getInstance();
        return c1.get(DATE);
    }

}
