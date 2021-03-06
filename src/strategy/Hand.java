package strategy;

public class Hand {

    public static final int HANDVALUE_SHI=0;
    public static final int HANDVALUE_JIAN=1;
    public static final int HANDVALUE_BU=2;

    private int handvalue;

    public static final Hand[] hand={
            new Hand(HANDVALUE_SHI),
            new Hand(HANDVALUE_JIAN),
            new Hand(HANDVALUE_BU)
    };

    private static final String[] name={
            "石头","剪刀","布"
    };

    private Hand(int handvalue){
        this.handvalue=handvalue;
    }

    public static Hand getHand(int handvalue){
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand h){
        return fight(h)==1;
    }
    public boolean isWeakerThan(Hand h){
        return fight(h)==-1;
    }

    private int fight(Hand h){
        if(this==h){
            return 0;
        }else if((this.handvalue+1)%3==h.handvalue){
            return 1;
        }else {
            return -1;
        }
    }

    public String toString(){
        return name[handvalue];
    }

}
