package ninja.johnmajor.mmfontconverter.Activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import org.rabbitconverter.rabbit.Rabbit;

import ninja.johnmajor.mmfontconverter.R;

public class FontConverterActivity extends AppCompatActivity{

    private EditText etZawGyi, etUnicode;
    String input = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font_converter);
        initUI();

        etZawGyi.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                input = etZawGyi.getText() + "";
                Log.i("input", input);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                etUnicode.setText(Rabbit.zg2uni(input));
                Log.i("uni", etUnicode.getText()+"");
            }
        });





//        etUnicode.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                input = etUnicode.getText()+"";
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                etZawGyi.setText(Rabbit.uni2zg(input));
//            }
//        });

    }

    public void initUI(){
        etZawGyi = (EditText) findViewById(R.id.etInput1);
        etUnicode = (EditText) findViewById(R.id.etInput2);
    }
}
