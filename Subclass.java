//Extends Animal Hyena, Lion, Tiger, Bear.

public class Hyena extends Animal {
    private int laughVolume; // Unique feature for Hyena

    public Hyena(String name, int age, int laughVolume) {
        super(name, age, "Hyena");
        this.laughVolume = laughVolume;
    }

    public int getLaughVolume() {
        return laughVolume;
    }

    public void setLaughVolume(int laughVolume) {
        this.laughVolume = laughVolume;
    }
}

public class Lion extends Animal {
    private boolean hasMane; // Unique feature for Lion

    public Lion(String name, int age, boolean hasMane) {
        super(name, age, "Lion");
        this.hasMane = hasMane;
    }

    public boolean getHasMane() {
        return hasMane;
    }

    public void setHasMane(boolean hasMane) {
        this.hasMane = hasMane;
    }
}

public class Tiger extends Animal {
    private int stripeCount; // Unique feature for Tiger

    public Tiger(String name, int age, int stripeCount) {
        super(name, age, "Tiger");
        this.stripeCount = stripeCount;
    }

    public int getStripeCount() {
        return stripeCount;
    }

    public void setStripeCount(int stripeCount) {
        this.stripeCount = stripeCount;
    }
}

public class Bear extends Animal {
    private boolean likesHoney; // Unique feature for Bear

    public Bear(String name, int age, boolean likesHoney) {
        super(name, age, "Bear");
        this.likesHoney = likesHoney;
    }

    public boolean getLikesHoney() {
        return likesHoney;
    }

    public void setLikesHoney(boolean likesHoney) {
        this.likesHoney = likesHoney;
    }
}

