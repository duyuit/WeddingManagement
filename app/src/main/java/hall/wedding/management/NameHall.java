package hall.wedding.management;

/**
 * Created by Vu Khac Hoi on 3/4/2017.
 */

public class NameHall {
    private  int BanToiDa;

    public NameHall() {
    }

    public String getNamehall() {
        return Namehall;
    }

    public void setNamehall(String namehall) {
        Namehall = namehall;
    }

    public int getImgActive() {
        return imgActive;
    }

    public void setImgActive(int imgActive) {
        this.imgActive = imgActive;
    }

    public NameHall(int banToiDa, int imgActive, String namehall, boolean isActive, int giaToiThieu) {

        BanToiDa = banToiDa;
        this.imgActive = imgActive;
        Namehall = namehall;
        this.isActive = isActive;
        GiaToiThieu = giaToiThieu;
    }

    private  int imgActive;
    private String Namehall;

    public boolean isActive() {

        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    private  boolean isActive;

    public int getBanToiDa() {
        return BanToiDa;
    }

    public void setBanToiDa(int banToiDa) {
        BanToiDa = banToiDa;
    }

    public int getGiaToiThieu() {
        return GiaToiThieu;
    }

    public void setGiaToiThieu(int giaToiThieu) {
        GiaToiThieu = giaToiThieu;
    }

    private  int GiaToiThieu;
}
