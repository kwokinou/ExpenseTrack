package umbf16cs443.expensetrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addExpense(View v){
        Intent intent = new Intent(getApplicationContext(),AddExpense.class);
        startActivity(intent);
    }

    public void viewAllExpenses(View v){
        Intent intent = new Intent(getApplicationContext(),ViewAllExpenses.class);
        startActivity(intent);
    }

    public void addCategory(View v){
        Intent intent = new Intent(getApplicationContext(),AddCategory.class);
        startActivity(intent);
    }

    public void viewAllCategories(View v){
        Intent intent = new Intent(getApplicationContext(),ViewAllCategories.class);
        startActivity(intent);
    }
}
