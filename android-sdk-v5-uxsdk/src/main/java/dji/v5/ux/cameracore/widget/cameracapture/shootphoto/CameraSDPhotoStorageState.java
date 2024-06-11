/*
 * Copyright (c) 2018-2020 DJI
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package dji.v5.ux.cameracore.widget.cameracapture.shootphoto;

import dji.sdk.keyvalue.value.camera.CameraStorageLocation;
import dji.sdk.keyvalue.value.camera.SDCardLoadState;

/**
 * CameraSDPhotoStorageState 클래스는 SD 카드 및 내부 저장소의 저장소 상태를 나타냅니다.
 * 카메라가 사진 촬영 모드일 때
 *
 */
public class CameraSDPhotoStorageState extends CameraPhotoStorageState {
    private SDCardLoadState storageOperationState;

    public CameraSDPhotoStorageState(CameraStorageLocation storageLocation, long availableCaptureCount, SDCardLoadState storageOperationState) {
        super(storageLocation, availableCaptureCount);
        this.storageOperationState = storageOperationState;
    }

    /**
     * Get the operation state of current storage
     *
     * @return instance of CameraSDCardState
     *  representing state for SDCard or internal Storage
     */
    public SDCardLoadState getStorageOperationState() {
        return storageOperationState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CameraSDPhotoStorageState)) return false;
        if (!super.equals(o)) return false;
        CameraSDPhotoStorageState that = (CameraSDPhotoStorageState) o;
        return storageOperationState == that.storageOperationState;
    }


    @Override
    public int hashCode() {
        int result = 31 * storageOperationState.value();
        result = result + 31 * getStorageLocation().value();
        result = result + 31 * (int) getAvailableCaptureCount();
        return result;
    }
}
