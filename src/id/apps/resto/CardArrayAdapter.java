package id.apps.resto;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CardArrayAdapter extends ArrayAdapter<Card> {
	
    private List<Card> cardList = new ArrayList<Card>();
    
    static class CardViewHolder {
        TextView txtProduct;
        TextView txtHarga;
        ImageView imgFood;
        EditText edtQty;
        Button btnAdd;
    }

	public CardArrayAdapter(Context context, int resource) {
		super(context, resource);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void add(Card object) {
        cardList.add(object);
        super.add(object);
    }

    @Override
    public int getCount() {
        return this.cardList.size();
    }

    @Override
    public Card getItem(int index) {
        return this.cardList.get(index);
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	View row = convertView;
        final CardViewHolder viewHolder;
        
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item_card, parent, false);
            viewHolder = new CardViewHolder();
            viewHolder.txtProduct = (TextView) row.findViewById(R.id.txtProduct);
            viewHolder.txtHarga = (TextView) row.findViewById(R.id.txtHarga);
            viewHolder.imgFood = (ImageView) row.findViewById(R.id.imgFood);
            viewHolder.edtQty = (EditText) row.findViewById(R.id.edtQty);
            viewHolder.btnAdd = (Button) row.findViewById(R.id.btnAdd);
            
            row.setTag(viewHolder);
        } else {
            viewHolder = (CardViewHolder)row.getTag();
        }
        
        final Card card = getItem(position);
        viewHolder.txtProduct.setText(card.getProduct());
        viewHolder.txtHarga.setText(card.getHarga());
        viewHolder.imgFood.setImageResource(card.getFoodImage());
        viewHolder.edtQty.setText(String.valueOf(card.getQty()));
        viewHolder.edtQty.addTextChangedListener(new TextWatcher() {

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				if(!s.equals(null)) {
					card.setQty(Integer.valueOf(s.toString()));
                }
			}
        	
        });
        
        viewHolder.btnAdd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String tempProduct = card.getProduct();
				int tempQty = card.getQty();
				Toast.makeText(getContext(), "Makanan : " + tempProduct + ", Jml : " + String.valueOf(tempQty).toString(), Toast.LENGTH_SHORT).show();
			}
		});
		return row;
    }

}
