package name.caiyao.microreader.bean.zhihu;

/**
 * Created by 蔡小木 on 2016/3/6 0006.
 */
public class ZhihuDailyItem{
    private String[] images;
    private int type;
    private String id;
    private String title;

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
