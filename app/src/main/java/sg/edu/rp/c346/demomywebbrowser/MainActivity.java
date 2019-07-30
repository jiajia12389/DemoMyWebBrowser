package sg.edu.rp.c346.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import sg.edu.rp.c346.mywebbrowser.R;

public class MainActivity extends AppCompatActivity {

    Button btnloadURL;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvMyPage = findViewById(R.id.webViewMyPage);
        btnloadURL = findViewById(R.id.buttonLoad);

        wvMyPage.setWebViewClient(new WebViewClient());


        btnloadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.rp.edu.sg";
                wvMyPage.loadUrl(url);
                wvMyPage.getSettings().setJavaScriptEnabled(true);
                wvMyPage.getSettings().setAllowFileAccess(false);
                wvMyPage.getSettings().setBuiltInZoomControls(true);

            }
        });
    }
}
