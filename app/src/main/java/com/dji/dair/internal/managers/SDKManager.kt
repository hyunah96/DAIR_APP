package com.dji.dair.internal.managers

    object SDKManager {
        var isConnected: Boolean = false
        private set

        fun updateSDKConnection(connected: Boolean) {
            isConnected = connected
        }
    }
