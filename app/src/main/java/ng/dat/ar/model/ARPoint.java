package ng.dat.ar.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;

/**
 * Created by ntdat on 1/16/17.
 */

public class ARPoint {
    private final Context _ctx;
    Location location;
    String name;
    int poiImage;
    Bitmap poiBitmap;

    public ARPoint(Context ctx, String name, double lat, double lon, double altitude, int poiImage) {
        this.name = name;
        location = new Location("ARPoint");
        location.setLatitude(lat);
        location.setLongitude(lon);
        location.setAltitude(altitude);
        this.poiImage = poiImage;

        _ctx = ctx;

        poiBitmap = BitmapFactory.decodeResource(_ctx.getResources(), poiImage);


    }

    public Bitmap getPoiBitmap() {
        return poiBitmap;
    }

    public void setPoiBitmap(Bitmap poiBitmap) {
        this.poiBitmap = poiBitmap;
    }

    public int getPoiImage() {
        return poiImage;
    }

    public void setPoiImage(int poiImage) {
        this.poiImage = poiImage;
    }

    public Location getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
