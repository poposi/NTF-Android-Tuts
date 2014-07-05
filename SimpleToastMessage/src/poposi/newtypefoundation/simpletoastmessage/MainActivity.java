package poposi.newtypefoundation.simpletoastmessage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btnClickMe;

	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		context = this;

		// getting an instance of btnClickMe button, defined in

		// activity_main.xml

		btnClickMe = (Button) findViewById(R.id.btn_click_me);

		// setting onClick EventListener for the

		btnClickMe.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// TODO Auto-generated method stub

				// Adding Toast to show message
				// "I am enjoying with NewType-Foundation"

				Toast.makeText(context,
						"I am enjoying with NewType-Foundation !!!",
						Toast.LENGTH_LONG).show();
			}

		});

	}
}
