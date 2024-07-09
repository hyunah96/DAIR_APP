package com.dji.dair.internal.models

import androidx.lifecycle.MutableLiveData
import dji.v5.manager.KeyManager
import dji.v5.manager.datacenter.MediaDataCenter
import dji.v5.manager.datacenter.media.MediaFileListData
import dji.v5.manager.datacenter.media.MediaFileListState
import dji.v5.manager.datacenter.media.MediaFileListStateListener

class MediaVM : DJIViewModel() {
    var mediaFileListData =MutableLiveData<MediaFileListData>()
    var fileListState = MutableLiveData<MediaFileListState>()
    var isPlayBack = MutableLiveData<Boolean?>()

    fun init() {
        addMediaFileListStateListener()
        mediaFileListData.value = MediaDataCenter.getInstance().mediaManager.mediaFileListData
        MediaDataCenter.getInstance().mediaManager.addMediaFileListStateListener {
            mediaFileListState ->
                if (mediaFileListState == MediaFileListState.UP_TO_DATE) {
                    val data = MediaDataCenter.getInstance().mediaManager.mediaFileListData;
                    mediaFileListData.postValue(data)
                }
            }
        }

    fun destroy() {
        KeyManager.getInstance().cancelListen(this);
        MediaDataCenter.getInstance().mediaManager.release()
    }




    private fun addMediaFileListStateListener() {
        MediaDataCenter.getInstance().mediaManager.addMediaFileListStateListener(
            object : MediaFileListStateListener {
                override fun onUpdate(mediaFileListState: MediaFileListState) {
                    fileListState.postValue(mediaFileListState)
                }
            })
    }
}