package fr.ensma.a3.ia.testapp.composants.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.testapp.R;

public class Navigation extends LinearLayout {

    private List<INavigationObserver> mesAbos ;
    private Switch leSwitch ;
    private TextView leLabel ;
    private TypedArray att ;

    public Navigation(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.compo_navigation, this);
        mesAbos = new ArrayList<INavigationObserver>() ;
    }

    public Navigation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.compo_navigation, this);
        setCompo(context,attrs) ;

    }

    public Navigation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.compo_navigation, this);
        setCompo(context,attrs) ;
    }

    public void setCompo(Context context, AttributeSet attrs) {
        mesAbos = new ArrayList<INavigationObserver>() ;
        att = context.obtainStyledAttributes(attrs,R.styleable.Navigation) ;
        leSwitch = (Switch) findViewById(R.id.leSwitch) ;
        leLabel = (TextView) findViewById(R.id.leLabel) ;
        leLabel.setText(att.getString(R.styleable.Navigation_menuString));
        leSwitch.setEnabled(att.getBoolean(R.styleable.Navigation_activation, false));
        leSwitch.setText("");
        leSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isPressed()){
                for (INavigationObserver obs : mesAbos) {
                    obs.stateChanged(b,getId());
            }}
        }});
    }

    public void addListener(INavigationObserver obs) {
        this.mesAbos.add(obs) ;
    }

    public void deleteListener(INavigationObserver obs) {
        this.mesAbos.remove(obs) ;
    }
}