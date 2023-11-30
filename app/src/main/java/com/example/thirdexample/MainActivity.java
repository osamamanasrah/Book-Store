package com.example.thirdexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.example.thirdexample.model.Book;
import com.example.thirdexample.model.BookFactory;
import com.example.thirdexample.model.IBookDa;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText editResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        populateSpinner();
        editResult=findViewById(R.id.edtResult);
    }

    private void populateSpinner() {
        BookFactory factory = new BookFactory();
        IBookDa proof = factory.getModel();
        String [] cat = proof.getCategories();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, cat);
        spinner.setAdapter(adapter);
    }

    public void btnGetBooksOnclick(View view) {
        BookFactory factory = new BookFactory();
        IBookDa proof = factory.getModel();
        List<Book> books = proof.getBooks(spinner.getSelectedItem().toString());

        String str = "";
        for (Book b: books){
            str += b.getTitle() + "\n";
        }
        editResult.setText(str);
    }
}