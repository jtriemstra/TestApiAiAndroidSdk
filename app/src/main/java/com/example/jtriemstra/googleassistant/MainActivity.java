package com.example.jtriemstra.googleassistant;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ai.api.android.AIConfiguration;
import ai.api.android.AIService;

public class MainActivity extends Activity {

    AIService aiService;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AIConfiguration config = new AIConfiguration("348dec206c964356bbea514136328194",
                AIConfiguration.SupportedLanguages.English,
                AIConfiguration.RecognitionEngine.System);

        aiService = AIService.getService(this, config);

        aiService.setListener(new TestAIListener());
    }



    public void startClick(View view)
    {
        aiService.startListening();
    }

    public void stopClick(View view)
    {
        aiService.stopListening();
    }
}
