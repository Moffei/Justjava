package com.example.dsuappacademy.justjava;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.

    public void submitOrder(View view) {
        int price = calculatePrice();
        displayPrice(price);
    }
     */
    public void decrement(View view) {
        quantity=quantity-1;
        displayQuantity();
    }

    public void increment(View view) {
        quantity=quantity+1;
        displayQuantity();
    }

    public int calculatePrice(){
        return quantity * 5;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity() {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }

    /*
    public void displayPrice(){
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        priceTextView.setText("" + calculatePrice());
    }
    */


     // This method displays the given price on the screen.
/*
    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("Total:"+NumberFormat.getCurrencyInstance().format(number)+"\nThank you!");
    }
*/

    public String createOrderSummary (int number) {

       return "name : Marlon Offei\nquantity: " + quantity + "\nTotal:" + "$" + calculatePrice() + "\n Thank you!";
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        String message = createOrderSummary(price);
        displayMessage(message);
    }

    private void displayMessage(String message){
        TextView orderSummaryTextView2 = (TextView) findViewById(R.id.order_summary_textView2);
        orderSummaryTextView2.setText(message);
    }

}
