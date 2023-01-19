public class stations {
    private String station_name;
    private String station_frecuency;
    private String station_band;

    stations (String nombre, String numero, String banda){
        station_name = nombre;
        station_frecuency = numero;
        station_band = banda;
    }
    stations (){}

    public String getNombreemisora() {
        return station_name;
    }

    public void setNombreemisora(String nombreemisora) {
        this.station_name = nombreemisora;
    }

    public String getFrecuenciaemisora() {
        return station_frecuency;
    }

    public void setFrecuenciaemisora(String frecuenciaemisora) {
        this.station_frecuency = frecuenciaemisora;
    }

    public String getBandaemisora() {
        return station_band;
    }

    public void setBandaemisora(String bandaemisora) {
        this.station_band = bandaemisora;
    }
    
    

    
    
}
