package id.apps.resto;

public class Card {
	
	private String Product;
	private String Harga;
	private int FoodImage;
	private int Qty;
	
	public Card(String txtProduct, String txtHarga, int imgFood, int edtQty) {
		this.Product = txtProduct;
		this.Harga = txtHarga;
		this.FoodImage = imgFood;
		this.Qty = edtQty;
	}
	
	public String getProduct() {
		return Product;
	}
	
	public String getHarga() {
		return Harga;
	}
	
	public int getFoodImage() {
		return FoodImage;
	}
	
	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

}
