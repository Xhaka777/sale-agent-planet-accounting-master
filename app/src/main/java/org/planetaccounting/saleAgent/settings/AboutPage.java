package org.planetaccounting.saleAgent.settings;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.planetaccounting.saleAgent.Kontabiliteti;
import org.planetaccounting.saleAgent.R;
import org.planetaccounting.saleAgent.api.ApiService;
import org.planetaccounting.saleAgent.databinding.ActivityAboutPageBinding;
import org.planetaccounting.saleAgent.persistence.RealmHelper;
import org.planetaccounting.saleAgent.utils.LocaleManager;
import org.planetaccounting.saleAgent.utils.Preferences;

import javax.inject.Inject;

public class AboutPage extends AppCompatActivity {

    ActivityAboutPageBinding binding;
    //TextViews for aboutPage
    TextView phoneComp, saleComp, helpComp;
    @Inject
    ApiService apiService;
    @Inject
    Preferences preferences;
    @Inject
    RealmHelper realmHelper;
    @Inject
    LocaleManager localeManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about_page);
        Kontabiliteti.getKontabilitetiComponent().inject(this);

        initializeViews();

    }

    private void initializeViews() {

        phoneComp = findViewById(R.id.phoneComp);
        saleComp = findViewById(R.id.saleComp);
        helpComp = findViewById(R.id.helpComp);
    }


    public void facebook(View view) {
        Intent fb_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/planetaccounting"));
        startActivity(fb_intent);
    }

    public void youtube(View view) {
        Intent fb_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCVd1gkbzU7fO-Vu5JSs-JIw"));
        startActivity(fb_intent);
    }

    public void instagram(View view) {
        Intent fb_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/planetaccounting/"));
        startActivity(fb_intent);
    }

    public void linkedin(View view) {
        Intent fb_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/planetaccounting"));
        startActivity(fb_intent);
    }

//
//    void initView() {
//
//        binding.aboutNumri = preferences.
//    }
}