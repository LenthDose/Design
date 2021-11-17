package Ex_4_2;



public abstract class OperationSystemVersion {

    protected ImageFile img;

    public void setImg(ImageFile img){
        this.img = img;
    }

    public abstract void show(String fileName);
}
