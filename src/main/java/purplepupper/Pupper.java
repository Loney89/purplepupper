package purplepupper;

import java.util.ArrayList;

public class Pupper {
    private PupperTypes pupperType;
    private PupperStatus pupperStatus;
    private int borkCount = 0;
    private ArrayList <PupperTypes> smallPuppers = new ArrayList();
    private ArrayList <PupperTypes> largePuppers = new ArrayList();
    private ArrayList <PupperStatus> activePupper = new ArrayList();
    private ArrayList <PupperStatus> nonActivePupper = new ArrayList();

    public Pupper(PupperTypes type) {
        this.pupperType = type;
        this.pupperStatus = PupperStatus.GOOD_BOY;

        setupSmallPuppers();
        setupLargePuppers();
        setupActivePuppers();
        setupNonActivePuppers();
    }

    public void takePupperForWalk(int time) {
        if (time > 40 && smallPuppers.contains(this.pupperType)) {
            this.pupperStatus = PupperStatus.DOING_A_SLEEP;
        } else if (time > 30 && smallPuppers.contains(this.pupperType)) {
            this.pupperStatus = PupperStatus.DOING_A_TIRED;
        }
    }

    public String makePupperBork() {
        if (smallPuppers.contains(this.pupperType) && activePupper.contains(this.pupperStatus)) {
            this.borkCount = borkCount + 1;
            return "Worf";
        } else if (largePuppers.contains(this.pupperType) && activePupper.contains(this.pupperStatus)) {
            this.borkCount = borkCount + 1;
            return "BORK";
        } else if (this.pupperType.equals(PupperTypes.PUPPERWISH)) {
            this.borkCount = 0;
            return "Wtf....";
        } else {
            this.borkCount = 0;
            return "zzz";
        }
    }

    public String getPupperStatus() {return formatStatus(this.pupperStatus.toString());}
    public String getPupperType() {return this.pupperType.toString();}

    private String formatStatus(String status) {
        return status.replaceAll("_", " ").toLowerCase();
    }

    private void setupSmallPuppers() {
        smallPuppers.add(PupperTypes.SHIBER);
        smallPuppers.add(PupperTypes.CORGO);
        smallPuppers.add(PupperTypes.DOGGERINO);
        smallPuppers.add(PupperTypes.PUPPER);
        smallPuppers.add(PupperTypes.PUGGERINO);
        smallPuppers.add(PupperTypes.SHIBE);
        smallPuppers.add(PupperTypes.PUGGERINO);
        smallPuppers.add(PupperTypes.DOGGO);
        smallPuppers.add(PupperTypes.PUPPERINO);
        smallPuppers.add(PupperTypes.PUGGO);
    }

    private void setupLargePuppers() {
        largePuppers.add(PupperTypes.DOGGEST);
        largePuppers.add(PupperTypes.DOGGOR);
        largePuppers.add(PupperTypes.DOGE);
        largePuppers.add(PupperTypes.SHOOB);
        largePuppers.add(PupperTypes.SHOOBER);
        largePuppers.add(PupperTypes.SHOOBERINO);
        largePuppers.add(PupperTypes.LONGBOYS);
        largePuppers.add(PupperTypes.BORFER);
        largePuppers.add(PupperTypes.WOOFER);
    }

    private void setupActivePuppers() {
        activePupper.add(PupperStatus.GOOD_BOY);
        activePupper.add(PupperStatus.YOU_DOING_ME_A_FRIGHTEN);
        activePupper.add(PupperStatus.DOING_ME_CONCERN);
        activePupper.add(PupperStatus.HECKING_ANGERY);
        activePupper.add(PupperStatus.FOREBODEN);
        activePupper.add(PupperStatus.OVERBORK);
    }

    private void setupNonActivePuppers() {
        nonActivePupper.add(PupperStatus.DOING_A_SWIM);
        nonActivePupper.add(PupperStatus.DOING_A_FOOD);
        nonActivePupper.add(PupperStatus.DOING_A_TIRED);
        nonActivePupper.add(PupperStatus.DOING_A_SLEEP);
    }
}
