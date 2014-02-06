package ca.on.senecac.layouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.table_main);
		Button b1 = (Button) findViewById(R.id.button2);

		final Intent myIntent = new Intent(this, FourthActivity.class);

		b1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				startActivity(myIntent);
			}
		});
		
		
	}
}
