package com.dji.dair.internal.models;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.widget.Toast;

import io.reactivex.annotations.NonNull;

public class NetworkConnectionCheck extends ConnectivityManager.NetworkCallback {

    private NetworkRequest networkRequest;
    private ConnectivityManager connectivityManager;
    private Context context;

    public NetworkConnectionCheck(Context context){
        this.context = context;
        networkRequest =
                new NetworkRequest.Builder()
                        .addTransportType(NetworkCapabilities.TRANSPORT_CELLULAR)
                        .addTransportType(NetworkCapabilities.TRANSPORT_WIFI)
                        .build();
        this.connectivityManager = (ConnectivityManager) this.context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }
    public void register() {
        this.connectivityManager.registerNetworkCallback(networkRequest,this);
    }
    public void unregister() {
        this.connectivityManager.unregisterNetworkCallback(this);
    }

    @Override
    public void onAvailable(@NonNull Network network){
        super.onAvailable(network);
        Toast.makeText(context.getApplicationContext(), "인터넷이 연결되어있음 ",Toast.LENGTH_SHORT);
    }

    @Override
    public void onLost(@NonNull Network network){
        super.onLost(network);
        Toast.makeText(context.getApplicationContext(), "인터넷이 연결되어있지 않음",Toast.LENGTH_SHORT);
    }
}
