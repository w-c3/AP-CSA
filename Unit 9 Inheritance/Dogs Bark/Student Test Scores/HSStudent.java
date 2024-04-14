public class HSStudent extends StudentTest {

    private int serviceHours;

    public HSStudent(String name1, int mathScore1, int elaScore1, int serviceHours1){
       super(name1, mathScore1, elaScore1);
       serviceHours = serviceHours1;
       
    }

    public int getServiceHours(){
       return serviceHours;
    }

    public void setServiceHours(int serviceHours1){
       serviceHours = serviceHours1;
       
    }

    // If math score is at least 525, return true
    public boolean passMath(){
        if(super.getMathScore() >= 525){
            return true;
        }
        else{
            return false;
        }
        
    }

    // If ela score is at least 560, return true
    public boolean passEla(){
       if(super.getElaScore() >= 560){
           return true;
       }
       else{
           return false;
       }
       
    }

    // If service hours are at least 75, return true
    public boolean completeService(){
        if(this.getServiceHours() > 75){
            return true;
        }
        else{
            return false;
        }
        
    }

    // If the student has passed math, passed ela, and completed
    // service hours, return true.
    public boolean gradQualify(){
       if(this.passMath() && this.passEla() && this.completeService()){
           return true;
       }
       else{
           return false;
       }
       
    }

    // If the student has qualified for graduation, print:
    // (name) has qualified for graduation.
    // Otherwise print:
    // (name) has not yet qualified for graduation.
    // Where (name) is the student's name.
    public String toString(){
        if (gradQualify()){
            return super.getName() + " has qualified for graduation.";
        }

        return super.getName() + " has not yet qualified for graduation.";
    }
}