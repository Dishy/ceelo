package com.ceelo;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CeeloActivity extends Activity implements OnClickListener{
    private TextView dieTextView1;
    private TextView dieTextView2;
    private TextView dieTextView3;
    
    private Button rollButton;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        dieTextView1 = new TextView(this);
        dieTextView2 = new TextView(this);
        dieTextView3 = new TextView(this);
        rollButton = new Button(this);
        
        dieTextView1 = (TextView)findViewById(R.id.textView1);
        dieTextView2 = (TextView)findViewById(R.id.textView2);
        dieTextView3 = (TextView)findViewById(R.id.textView3);
        rollButton = (Button)findViewById(R.id.button1);
        
        // TODO: create a buttonClickListener class and inject here instead of having the activity implement OnClickListener
        rollButton.setOnClickListener(this);
        
    }

	public void onClick(View view) {
		Random random = new Random();
		
        dieTextView1.setText(Integer.toString(random.nextInt(5)+1));
        dieTextView2.setText(Integer.toString(random.nextInt(5)+1));
        dieTextView3.setText(Integer.toString(random.nextInt(5)+1));
	}
}