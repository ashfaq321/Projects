package webviewapp.android.com.webviewapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    WebView webViewApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webViewApp=(WebView)findViewById(R.id.web_view_app);
        /*just two lines....Oh My God...its awesome.*/
        //--------loading url of website------...
        webViewApp.loadUrl("https://www.unsplash.com");
        //--------Enabling javascript---------...
        webViewApp.getSettings().setJavaScriptEnabled(true);

        /*-----Doing this so that website open in our own app not in other built in browser like Google Chrome etc-----*/
        final Activity activity = this;
        webViewApp.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                // Activities and WebViews measure progress with different scales.
                // The progress meter will automatically disappear when we reach 100%
                activity.setProgress(progress * 1000);
            }
        });
        webViewApp.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, "Oh no! " + description, Toast.LENGTH_SHORT).show();
            }
        });

    /*-----Adding feauture of "Zoom" in your app. introduced in cupkake API. hieght and width should be match parent.------*/
                                /*-----wrap content is undefind and should be undefined.-------*/
        webViewApp.getSettings().setBuiltInZoomControls(true);

        /**/

    }
}
