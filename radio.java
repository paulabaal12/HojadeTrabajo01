import java.util.ArrayList;
import java.util.Scanner;

public class radio implements IRadio{
	protected boolean turnOn;
    private String banda;
    private ArrayList<stations>AM = new ArrayList<stations>();
    private ArrayList<stations>FM = new ArrayList<stations>();

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public radio(boolean turnOn) {
        this.turnOn = turnOn;
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setFrequence(String freq) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getFrequence() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void Forward() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Backward() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double getFMActualStation() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAMActualStation() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setFMActualStation(double actualStation) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setAMActualStation(int actualStation) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void saveFMStation(double actualStation, int slot) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void saveAMStation(int actualStation, int slot) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double getFMSlot(int slot) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAMSlot(int slot) {
        // TODO Auto-generated method stub
        return 0;
    }
}
