package poposi.newtypefoundation.listviewdemo;

import poposi.newtypefoundation.simpletoastmessage.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Context context;

	// Declaring array to store a set of Android version
	private String[] versions = new String[] { "Froyo", "Gingerbread",
			"Honeycomb 3.2", "Ice Cream Sandwich 4.0.3",
			"Ice Cream Sandwich 4.0.4", "Jelly Bean 4.1.x", "Jelly Bean 4.2.x",
			"Jelly Bean 4.3.x", "KitKat" };

	// Declaring an ArrayAdapter to store an array
	private ArrayAdapter<String> adapter;

	// Declaring ListView to display records
	private ListView listview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		context = this;

		// ArrayAdapter is used to store an array of arbitrary objects
		// The second argument to the constructor is a resource id containing a
		// textview for drawing each item in a view
		// android.R.layout.simple_list_item_1 is a built in layout containing
		// textview

		adapter = new ArrayAdapter<String>(context,
				android.R.layout.simple_list_item_1, versions);
		listview = (ListView) findViewById(R.id.listview);

		// ArrayAdapter indirectly implements ListAdapter interface
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
				// Adding Toast to show your selection
				Toast.makeText(context, "Your selected " + versions[position],
						Toast.LENGTH_LONG).show();
			}

		});

	}
}
