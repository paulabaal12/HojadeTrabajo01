import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Fabi
 *
 */

public class radio implements IRadio{
	
	private boolean turnOn; 
	private String FMFrequency;
	private float nowP;
	private ArrayList<String> savedBotons;
	
	public radio(boolean onf, String Frequency, float station,ArrayList<String> savedBt) {
		turnOn = onf;
		FMFrequency = Frequency;
		nowP = station;
		savedBotons = savedBt;
		
		turnOn = false;
		FMFrequency = "FM";
		nowP = 0;
		savedBotons = new ArrayList<String>();
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
    	if(FMFrequency == "FM") {
			FMFrequency = "AM";
		}else {
			FMFrequency = "FM";
		}
		return;
        
    }

    @Override
    public String getFrequence() {
        // TODO Auto-generated method stub
    	return FMFrequency;
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

    public static void turnOn(boolean b) {
    }
}
