package fr.ensma.a3.ia.testapp.composants.login;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.testapp.R;

public class Login extends FrameLayout {

    private EditText leChampText ;
    private Button leBouton ;
    private TextView leText ;

    private List<ILoginObserver> mesAbos ;
    private TypedArray att ;


    public Login(@NonNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.compo_login, this);
        mesAbos = new ArrayList<ILoginObserver>() ;
    }

    public Login(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.compo_login, this);
    }

    public Login(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.compo_login, this);
    }


}
