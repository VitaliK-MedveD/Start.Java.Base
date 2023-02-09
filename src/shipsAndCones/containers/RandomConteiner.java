package shipsAndCones.containers;

public class RandomConteiner extends Container{

    private int weight;
    private int baseArea;
    private String type;

    public void make(){
        switch (random.nextInt(1, 4)){
            case 1:
                Container square = new Square();
                baseArea = square.getBaseArea(diagonal);
                weight = square.getWeight();
                type = square.getType();
                break;
            case 2:
                Container cylinder = new Cylinder();
                baseArea = cylinder.getBaseArea(diagonal);
                weight = cylinder.getWeight();
                type = cylinder.getType();
                break;
            case 3:
                Container cone = new Cone();
                baseArea = cone.getBaseArea(diagonal);
                weight = cone.getWeight();
                type = cone.getType();
                break;
        }
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getBaseArea(int a) {
        return baseArea;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getDin() {
        return din;
    }
}
