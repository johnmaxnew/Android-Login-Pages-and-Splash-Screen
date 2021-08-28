package www.travostudios.mya;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class SplashActivity extends AwesomeSplash {

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/

    @Override
    public void initSplash(ConfigSplash configSplash) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Background animation

        configSplash.setBackgroundColor(R.color.colorPrimaryDark);
        configSplash.setAnimCircularRevealDuration(500);
        configSplash.setRevealFlagX(Flags.WITH_LOGO);

        //Logo

        configSplash.setLogoSplash(R.drawable.splash);
        configSplash.setAnimCircularRevealDuration(2000);
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce);

        //Title

        configSplash.setTitleSplash(getString(R.string.title));
        configSplash.setTitleTextColor(R.color.textColor);
        configSplash.setTitleTextSize(40f);
        configSplash.setAnimTitleDuration(1000);
        configSplash.setAnimTitleTechnique(Techniques.FadeIn);


    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
    }
}
