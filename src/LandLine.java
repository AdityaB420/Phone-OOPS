public class LandLine implements Phone{
    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging=false;
        this.isPowerOn=true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn==true){
            System.out.println("You are dialing the number : "+phoneNo);

        }
        else{
            System.out.println("Your LandLine is Off");
        }
        return;


    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging=true;
            System.out.println("Hey, "+myPhoneNo+" You are receiving a call");
        }
        else{
            System.out.println("Call nor received");
        }
        return;

    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("Call Answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
