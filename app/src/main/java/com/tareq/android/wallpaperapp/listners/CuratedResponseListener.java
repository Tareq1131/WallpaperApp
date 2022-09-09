package com.tareq.android.wallpaperapp.listners;

import com.tareq.android.wallpaperapp.models.CuratedApiResponse;

public interface CuratedResponseListener {
    void onFetch(CuratedApiResponse response, String message);
    void onError(String message);
}
