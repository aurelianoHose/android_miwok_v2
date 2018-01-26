package com.example.android.miwok.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.entity.Word;

import java.util.List;

/**
 * Header.
 * <p>
 * Date: 1/4/2018.
 *
 * @author Uladzislau_Shalamits
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceId;

    /**
     * Constructor.
     *
     * @param context the current context.
     * @param words   list of {@link Word}s
     */
    public WordAdapter(@NonNull Context context, @NonNull List<Word> words, int colorResourceId) {
        super(context, 0, words);
        this.colorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTranslationTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTranslationTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslationTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslationTextView.setText(currentWord.getMiwokTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(), colorResourceId));

        return listItemView;
    }
}
