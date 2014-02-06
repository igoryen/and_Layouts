package ca.on.senecac.layouts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.linear_main);
		
		Button b1 = (Button) findViewById(R.id.button);
		
		final Intent myIntent = new Intent(this, SecondActivity.class);

		    b1.setOnClickListener(new View.OnClickListener() {

		        public void onClick(View v) {
		            startActivity(myIntent);
		        }
		    });
	}

}
