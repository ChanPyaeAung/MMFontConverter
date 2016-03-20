package ninja.johnmajor.mmfontconverter.Activites;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import antistatic.spinnerwheel.adapters.AbstractWheelTextAdapter;
import ninja.johnmajor.mmfontconverter.R;

/**
 * Created by johnmajor on 3/20/16.
 */
public class LanguageAdpater extends AbstractWheelTextAdapter {

    private String[] languages = new String[] {"English", "Myanmar"};

    protected LanguageAdpater(Context context) {
        super(context, R.layout.language_cell, NO_RESOURCE);
        setItemTextResource(R.id.tvName);
    }

    @Override
    public int getItemsCount() {
        return languages.length;
    }

    @Override
    protected CharSequence getItemText(int index) {
        return languages[index];
    }

    @Override
    public View getItem(int index, View convertView, ViewGroup parent) {
        View view = super.getItem(index, convertView, parent);
        return view;
    }
}
