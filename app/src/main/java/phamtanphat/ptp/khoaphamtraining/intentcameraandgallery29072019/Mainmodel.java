package phamtanphat.ptp.khoaphamtraining.intentcameraandgallery29072019;

import android.database.Observable;
import android.graphics.Bitmap;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Mainmodel extends ViewModel implements LifecycleObserver {

    public Mainmodel() {
    }

    MutableLiveData<Bitmap> mimgHinh = new MutableLiveData<>();
    public void setImageBitmap(Bitmap imageBitmap){
        mimgHinh.setValue(imageBitmap);
    }


}
