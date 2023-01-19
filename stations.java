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

    
    /** 
     * @return String
     */
    public String getStation_name() {
        return station_name;
    }

    
    /** 
     * @param station_name
     */
    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    
    /** 
     * @return String
     */
    public String getStation_frecuency() {
        return station_frecuency;
    }

    
    /** 
     * @param station_frecuency
     */
    public void setStation_frecuency(String station_frecuency) {
        this.station_frecuency = station_frecuency;
    }

    
    /** 
     * @return String
     */
    public String getStation_band () {
        return station_band;
    }

    
    /** 
     * @param station_band
     */
    public void setStation_band (String station_band ) {
        this.station_band = station_band ;
    }
    
    

    
    
}
