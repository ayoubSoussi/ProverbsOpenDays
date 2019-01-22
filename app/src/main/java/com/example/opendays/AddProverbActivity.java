package com.example.opendays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddProverbActivity extends Activity {
    EditText editText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_proverb);
        editText = findViewById(R.id.edit) ;
        editText.setText(MySingletonClass.getInstance().getValue()) ;
    }
    public void addProverb(View v){
        String proverbe = editText.getText().toString() ;
        if(proverbe.length() != 0){
            // ajouter le proverbe dans le hardware
        }else{
            Intent i = new Intent(this,MainActivity.class) ;
            startActivity(i);
        }
    }
}
