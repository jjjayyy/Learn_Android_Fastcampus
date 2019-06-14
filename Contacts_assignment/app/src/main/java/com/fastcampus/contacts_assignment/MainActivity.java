package com.fastcampus.contacts_assignment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacts> contactsList;
    Contacts contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequestOptions cropOption = new RequestOptions().circleCrop();

        Context context = this;

        contactsList = new ArrayList<>();
        contacts = new Contacts();
        contacts.setName("Mr.KIM");
        contacts.setNumber("010-0000-0000");
        contacts.setProfile("https://post-phinf.pstatic.net/MjAxOTAxMTdfNDEg/MDAxNTQ3NzA1NDQxMTk1.ieYZa5KIvF3Uo4t7Vuj96vJ8aBorwylJWt6kJuN2ssIg.q8572nRlsMVLTA-rU8y7Fjg4yIUjN4v4lzInj2g160kg.JPEG/신세경1.jpg?type=w1200");
        contactsList.add(contacts);

        contacts = new Contacts();
        contacts.setName("Mr.LEE");
        contacts.setNumber("010-1111-1111");
        contacts.setProfile("https://post-phinf.pstatic.net/MjAxOTAxMTdfNDEg/MDAxNTQ3NzA1NDQxMTk1.ieYZa5KIvF3Uo4t7Vuj96vJ8aBorwylJWt6kJuN2ssIg.q8572nRlsMVLTA-rU8y7Fjg4yIUjN4v4lzInj2g160kg.JPEG/신세경1.jpg?type=w1200");
        contactsList.add(contacts);

        contacts = new Contacts();
        contacts.setName("Mr.SON");
        contacts.setNumber("010-2222-2222");
        contacts.setProfile("https://post-phinf.pstatic.net/MjAxOTAxMTdfNDEg/MDAxNTQ3NzA1NDQxMTk1.ieYZa5KIvF3Uo4t7Vuj96vJ8aBorwylJWt6kJuN2ssIg.q8572nRlsMVLTA-rU8y7Fjg4yIUjN4v4lzInj2g160kg.JPEG/신세경1.jpg?type=w1200");
        contactsList.add(contacts);

        contacts = new Contacts();
        contacts.setName("Mr.PARK");
        contacts.setNumber("010-3333-3333");
        contacts.setProfile("https://post-phinf.pstatic.net/MjAxOTAxMTdfNDEg/MDAxNTQ3NzA1NDQxMTk1.ieYZa5KIvF3Uo4t7Vuj96vJ8aBorwylJWt6kJuN2ssIg.q8572nRlsMVLTA-rU8y7Fjg4yIUjN4v4lzInj2g160kg.JPEG/신세경1.jpg?type=w1200");
        contactsList.add(contacts);

        LinearLayout container = findViewById(R.id.container);
        LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);

        for(Contacts contact : contactsList) {
            View view = layoutInflater.inflate(R.layout.contact_item, null, false);
            TextView itemText = view.findViewById(R.id.number);
            ImageView itemImg = view.findViewById(R.id.profile);
            TextView itemName = view.findViewById(R.id.name);

            itemText.setText(contact.getNumber());
            itemName.setText(contact.getName());
            Glide.with(context)
                    .load(contact.getProfile())
                    .apply(cropOption)
                    .into(itemImg);

            final Contacts finalContact = contact;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String number = finalContact.getNumber();
                    Log.d("test", number);
                }
            });

            container.addView(view);
        }

    }
}
