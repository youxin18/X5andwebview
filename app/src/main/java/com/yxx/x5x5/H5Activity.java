package com.yxx.x5x5;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class H5Activity extends AppCompatActivity {
    private WebView webH5;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h5);
        webH5=findViewById(R.id.webview_h5);
        btn=findViewById(R.id.btn);
        WebSettings settings=webH5.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        webH5.addJavascriptInterface(new JsInteration(),"android");
        webH5.setWebViewClient(new WebViewClient());
        webH5.setWebViewClient(new WebViewClient());
        webH5.loadUrl("file:///android_asset/web/demo.html");
        webH5.loadUrl("JavaScript:B()");
        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
               webH5.evaluateJavascript("B(1,2)", new ValueCallback<String>() {
                   @Override
                   public void onReceiveValue(String value) {
                       Toast.makeText(H5Activity.this,"JS的返回值是="+value,Toast.LENGTH_SHORT).show();
                   }
               });
            }
        });
    }
    public class JsInteration{
        @JavascriptInterface
        public String show(){
            return "我是Java里的方法返回值";

        }
    }
}