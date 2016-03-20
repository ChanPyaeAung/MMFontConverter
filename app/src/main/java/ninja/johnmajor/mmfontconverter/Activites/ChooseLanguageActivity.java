package ninja.johnmajor.mmfontconverter.Activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import antistatic.spinnerwheel.AbstractWheel;
import antistatic.spinnerwheel.OnWheelChangedListener;
import antistatic.spinnerwheel.OnWheelScrollListener;
import ninja.johnmajor.mmfontconverter.R;

public class ChooseLanguageActivity extends Activity {

    private AbstractWheel spinner;
    LanguageAdpater languageAdpater;
    private boolean scrolling = false;
    private ImageButton btnDone;
    private String whichLanguage = "English";

    public ChooseLanguageActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);
        initUI();

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChooseLanguageActivity.this, whichLanguage, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(view.getContext(), FontCheckerActivity.class));
            }
        });
    }

    public void initUI () {

        btnDone = (ImageButton) findViewById(R.id.btnDone);
        spinner = (AbstractWheel) findViewById(R.id.spinnerWheel);
        spinner.setVisibleItems(3);
        languageAdpater = new LanguageAdpater(this);
        spinner.setViewAdapter(languageAdpater);

        spinner.addChangingListener(new OnWheelChangedListener() {
            @Override
            public void onChanged(AbstractWheel wheel, int oldValue, int newValue) {
                if (!scrolling) {
                    //do something
                    whichLanguage = languageAdpater.getItemText(newValue).toString();
                }
            }
        });

        spinner.addScrollingListener(new OnWheelScrollListener() {
            @Override
            public void onScrollingStarted(AbstractWheel wheel) {
                scrolling = true;
            }

            @Override
            public void onScrollingFinished(AbstractWheel wheel) {
                scrolling = false;
                //do something
                whichLanguage = languageAdpater.getItemText(spinner.getCurrentItem()).toString();
            }
        });

    }

}
