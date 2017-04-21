package id.apps.resto;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
				showProgressDialog();
				Intent i_intent = new Intent(MainActivity.this, ProductActivity.class);
				startActivity(i_intent);
				MainActivity.this.finish();
			}
		});
	}
	
	private void showProgressDialog() {
		// TODO Auto-generated method stub
		ProgressDialog progressDialog = new ProgressDialog(this);
		progressDialog.setMessage("Tunggu, sedang diproses");
		progressDialog.show();
	}

}
