package com.example.jtriemstra.googleassistant;

import android.util.Log;

import ai.api.*;
import ai.api.model.AIError;
import ai.api.model.AIResponse;


/**
 * Created by JTriemstra on 9/11/2017.
 */
public class TestAIListener implements AIListener {
    private static final String TAG = "TestAIListener";

    public void onResult(AIResponse result)
    {
        Log.d(TAG, "onResult");
        Log.d(TAG, result.getResult().getFulfillment().getSpeech());
    }
    public void onError(AIError error)
    {
        Log.d(TAG, "onError");
    }
    public void onAudioLevel(float level)
    {
        Log.d(TAG, "onAudioLevel");
    }
    public void onListeningStarted()
    {
        Log.d(TAG, "onListeningStarted");
    }
    public void onListeningCanceled()
    {
        Log.d(TAG, "onListeningCanceled");
    }
    public void onListeningFinished()
    {
        Log.d(TAG, "onListeningFinished");
    }
}
