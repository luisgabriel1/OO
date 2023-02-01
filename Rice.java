public class Rice {
    private double weight;

    public Rice (double weight){
        setWeight(weight);
    }
    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0){
            this.weight = weight;
        }

    }
}
