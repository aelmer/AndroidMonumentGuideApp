package ae.monumentguide;

/**
 * Created by amy on 5/18/2016.
 */
public class MainDataDef {
    int image;
    String name, info;

    public MainDataDef(int image, String name, String info) {
        this.image = image;
        this.name = name;
        this.info = info;
    }

    public int getImage() { return image;}

    public String getName() {return name;}

    public String getInfo() {return info;}
}
