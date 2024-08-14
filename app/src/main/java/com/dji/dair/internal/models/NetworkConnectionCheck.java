package com.dji.dair.internal.models;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.util.Log;

import io.reactivex.annotations.NonNull;


public class NetworkConnectionCheck extends ConnectivityManager.NetworkCallback{
    private final ConnectivityManager manager;
    private boolean connect = false;

    public NetworkConnectionCheck(Context context){
        Log.d("test","NetworkConnectionCheck Context");
        NetworkRequest request = new NetworkRequest.Builder()
                .addCapability(NetworkCapabilities.NET_CAPABILITY_VALIDATED)
                .build();
        this.manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        this.manager.registerNetworkCallback(request,this);
    }

    public void finish() {
        this.manager.unregisterNetworkCallback(this);
    }

    public boolean isConnect() {
        Log.d("test","NetworkConnectionCheck isConnect");
        return this.connect;
    }

    @Override
    public void onAvailable(@NonNull Network network){
        super.onAvailable(network);
        Log.d("test","NetworkConnectionCheck onAvailable");
        this.connect = true;
    }

    @Override
    public void onLost(@NonNull Network network){
        super.onLost(network);
        Log.d("test","NetworkConnectionCheck onLost");
        this.connect = false;
    }

}
