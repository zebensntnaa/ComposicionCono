package ETS.AreaPrisma;

public class Prisma {

    int baseTriangulo;
    int alturaPrisma;
    int alturaTriangulo;
    int areaBase;
    int perimetro;
    int areaLateral;
    int valores;

    Prisma(){
        baseTriangulo = getBaseTriangulo();
        alturaPrisma = getAlturaPrisma();
        perimetro = getPerimetro();
        alturaTriangulo = getAlturaTriangulo();
        areaLateral = getAreaLateral();
        areaBase = getAreaBase();
    }

    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public int getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public void setAlturaTriangulo(int alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }

    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    public int getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(int areaBase) {
        this.areaBase = areaBase;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getAreaLateral() {
        return areaLateral;
    }

    public void setAreaLateral(int areaLateral) {
        this.areaLateral = areaLateral;
    }

    public int areaTotal() {
        int areaTotal;
        areaTotal = 2*getAreaBase() + getAreaLateral();
        return areaTotal;
    }

    public int areaLateral() {
        int areaLateral;
        areaLateral = getAlturaPrisma() * getPerimetro();
        return areaLateral;
    }

    public int perimetro() {
        int perimetro;
        perimetro = 3*getBaseTriangulo();
        return perimetro;
    }

    public int areaBase() {
        int areaBase;
        areaBase = getBaseTriangulo() * getAlturaTriangulo()/2;
        return areaBase;
    }

    public int alturaTriangulo() {
        int alturaTriangulo;
        alturaTriangulo = (int) (getBaseTriangulo()*1.73/2);
        return alturaTriangulo;
    }

    public int valores() {
        valores = (int) (Math.random()*15+1);
        return valores;
    }

}
