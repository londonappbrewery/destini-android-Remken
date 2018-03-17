package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mBottomButton;
    private Button mTopButton;
    private TextView mStoryTextView;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mBottomButton = (Button)findViewById(R.id.buttonBottom);
        mTopButton = (Button)findViewById(R.id.buttonTop);
        mStoryTextView = (TextView)findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex <= 2){
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else
                {
                    //T6_End
                    mStoryTextView.setText(R.string.T6_End);
                    Toast.makeText(MainActivity.this, "T6_End", Toast.LENGTH_SHORT).show();
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if(mStoryIndex == 2)
                {
                    //T4_End
                    mStoryTextView.setText(R.string.T4_End);
                    Toast.makeText(MainActivity.this, "T4_End", Toast.LENGTH_SHORT).show();
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }
                else
                {
                    //T5_End
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "T5_End", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
