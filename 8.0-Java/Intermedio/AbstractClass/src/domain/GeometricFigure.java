package domain;

public abstract class GeometricFigure {

    protected String typeFigure;

    protected GeometricFigure(String typeFigure) {
        this.typeFigure = typeFigure;
    }

    public String getTypeFigure() {
        return typeFigure;
    }

    public void setTypeFigure(String typeFigure) {
        this.typeFigure = typeFigure;
    }

    public abstract void  draw();

    public void test(){
        System.out.println("test");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GeometricFigure{");
        sb.append("typeFigure='").append(typeFigure).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
