public class GameSpinner {
    private int sectors;
	private int previousSpin;
	private int lengthRun;
    public GameSpinner(int initSectors){
        sectors = initSectors;
    }
    public int currentRun(){
        return lengthRun;
    }
    public int spin(){
        int spin = (int)(Math.random()*sectors)+1;
        if(spin == previousSpin){
            lengthRun++;
        }
        else{
            lengthRun = 0;
        }
        previousSpin = spin;
        return spin;
    }

}
