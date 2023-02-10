package shipsAndCones.containers;

public class RandomConteiner extends Container{

    private int weight;
    private int diagonal;
    private int din;
    private int baseArea;
    private String type;

    public void make(){
        switch (random.nextInt(1, 4)){
            case 1:
                Container square = new Square();
                weight = square.getWeight();
                diagonal = square.getDiagonal();
                din = square.getDin();
                type = square.getType();
                baseArea = square.getBaseArea(diagonal);
                break;
            case 2:
                Container cylinder = new Cylinder();
                weight = cylinder.getWeight();
                diagonal = cylinder.getDiagonal();
                din = cylinder.getDin();
                type = cylinder.getType();
                baseArea = cylinder.getBaseArea(diagonal);
                break;
            case 3:
                Container cone = new Cone();
                weight = cone.getWeight();
                diagonal = cone.getDiagonal();
                din = cone.getDin();
                type = cone.getType();
                baseArea = cone.getBaseArea(diagonal);
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

    public int getDiagonal() {
        return diagonal;
    }
}
