package fr.ensma.a3.ia.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import fr.ensma.a3.ia.testapp.composants.navigation.INavigationObserver;
import fr.ensma.a3.ia.testapp.composants.navigation.Navigation;

public class MainActivity extends AppCompatActivity implements INavigationObserver {

    private Navigation navLogin ;
    private Navigation navHome ;
    //private Navigation navChat ;
    //private Navigation navTicTacToe ;
    //private Navigation navLogout ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navLogin = (Navigation) findViewById(R.id.navLogin) ;
        navHome = (Navigation) findViewById(R.id.navHome) ;
        navHome.addListener(this);
        navLogin.addListener(this);
    }

    @Override
    public void stateChanged(boolean b, int id) {
        Log.i("leSwitch", "stateChanged: leSwitch");


    }
}