package jubaw.creationalDP.factoryDP;

/*public*/ class Pentagon implements Shape {

    private String name;

    private int angle;

    private  int edge;

    public Pentagon(String name, int edge, int angle) {
        this.name = name;
        this.edge = edge;
        this.angle = angle;
    }

    @Override
    public void draw() {
        System.out.println(this.name + " has been drawn. Angle : " + this.angle + " Edge : " + this.edge);

    }
}
