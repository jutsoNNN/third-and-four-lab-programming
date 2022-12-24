package abstractClasses;

public abstract class Image {
    private boolean visibility = false;
    private String picture;

    public Image(String picture) {
        if (picture != null){
            this.picture = picture;
        }
    }

    public String getPicture() {
        return picture;
    }
    public boolean getVisibility() {
        return visibility;
    }
    public void giveSmth(){}
    public void imgFivePointed(){}
    public void describe(){}
}
