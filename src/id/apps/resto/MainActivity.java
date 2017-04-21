package id.apps.resto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	//private ImageView imgOffers;
	private Button btn_order;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		imgOffers = (ImageView) findViewById(R.id.imgOffers);
//		imgOffers.setImageResource(R.drawable.bg_offers);
		
		btn_order = (Button) findViewById(R.id.btn_order);
		btn_order.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i_intent = new Intent(MainActivity.this, ProductActivity.class);
				startActivity(i_intent);
			}
		});
	}

}
