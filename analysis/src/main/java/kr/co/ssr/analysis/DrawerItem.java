package kr.co.ssr.analysis;

// Drawer Item Class => Needed itemName, imgResId
public class DrawerItem {
    String ItemName;
    int imgResID;

    public DrawerItem(String itemName, int imgResId) {
        super();
        ItemName = itemName;
        this.imgResID = imgResId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }
    public int getImgResID() {
        return imgResID;
    }
    public void setImgResID(int imgResID) {
        this.imgResID = imgResID;
    }
}