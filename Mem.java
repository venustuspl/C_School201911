import com.sun.jndi.toolkit.url.Uri;

import java.net.MalformedURLException;
import java.net.URL;

public class Mem {

    private String name;
    private URL url;
    private String desc;
    private boolean isFavorite;
    private ServiceCategory serviceCategory;

    public Mem(String name,  String desc, boolean isFavorite, ServiceCategory serviceCategory) {
        this.name = name;
        this.desc = desc;
        this.isFavorite = isFavorite;
        this.serviceCategory = serviceCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public boolean setUrl(String url) {
        try {
            this.url = new URL(url);
            return true;
        } catch (MalformedURLException e){
            System.out.println("Błąd zapisu URL.");
            return false;
        }

    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    @Override
    public String toString() {
        return "Mem{" +
                "name='" + name + '\'' +
                ", url=" + url +
                ", desc='" + desc + '\'' +
                ", isFavorite=" + isFavorite +
                ", category=" + serviceCategory.getName() +
                '}';
    }
}
