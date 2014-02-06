package ca.on.senecac.layouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_main);
		Button b1 = (Button) findViewById(R.id.button3);

		final Intent myIntent = new Intent(this, FifthActivity.class);

		b1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				startActivity(myIntent);
			}
		});
	}
}
