public class RubiksCube {
    private int layers = 3;
    private String shape = "Cube";
    RubiksCube(){
        layers = 3;
        shape = "Cube";
    }
    RubiksCube(String shape){
        this.shape =shape;

    }
    RubiksCube(int layers) {
        this.layers = layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getLayers() {
        return layers;
    }

    public String getShape() {
        return shape;
    }
    public String toString() {
        return "RubiksCubes" +
                "\nlayers = " + layers +
                "\nshape = " + shape
                ;
    }
}
