package phamtanphat.ptp.khoaphamtraining.intentcameraandgallery29072019;

import android.graphics.Bitmap;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Mainmodel extends ViewModel implements LifecycleObserver {

    public Mainmodel() {
    }

    MutableLiveData<Bitmap> mimgHinh = new MutableLiveData<>();




}
