package atividadeEstruturaDecisao1509;

public class Diaria {
    private double valor;
    private boolean cafe;
    private boolean almoco;
    private boolean jantar;
    private int ID;

    public Diaria(double valor, boolean cafe, boolean almoco, boolean jantar, int ID) {
        this.valor = valor;
        this.cafe = cafe;
        this.almoco = almoco;
        this.jantar = jantar;
        this.ID = ID;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isCafe() {
        return cafe;
    }

    public void setCafe(boolean cafe) {
        this.cafe = cafe;
    }

    public boolean isAlmoco() {
        return almoco;
    }

    public void setAlmoco(boolean almoco) {
        this.almoco = almoco;
    }

    public boolean isJantar() {
        return jantar;
    }

    public void setJantar(boolean jantar) {
        this.jantar = jantar;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Diaria{" + "valor=" + valor + ", cafe=" + cafe + ", almoco=" + almoco + ", jantar=" + jantar + ", ID=" + ID + '}';
    }
    
}

   