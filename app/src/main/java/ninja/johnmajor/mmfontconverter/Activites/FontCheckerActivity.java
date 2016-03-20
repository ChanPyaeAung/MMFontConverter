package ninja.johnmajor.mmfontconverter.Activites;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import ninja.johnmajor.mmfontconverter.R;

public class FontCheckerActivity extends Activity {


    private Toolbar toolbar;
    private View v;
    private Button btnSubmit;

    public FontCheckerActivity() {

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font_checker);
        initUI();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void initUI() {
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
    }

}
