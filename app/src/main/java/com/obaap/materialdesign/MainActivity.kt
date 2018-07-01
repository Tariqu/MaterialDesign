package com.obaap.materialdesign

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;




class MainActivity : AppCompatActivity() {
    lateinit var gso:GoogleSignInOptions
    private var mGoogleSignInClient: GoogleSignInClient? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="Login Page"
        bt_google.setOnClickListener {
            gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                    .requestIdToken(getString(R.string.default_web_client_id))
                    .requestEmail()
                    .build()

        }
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var menuInflator =menuInflater
        menuInflator.inflate(R.menu.main_menu,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.New-> Toast.makeText(this@MainActivity,item!!.title,Toast.LENGTH_SHORT).show()
            R.id.about->Toast.makeText(this@MainActivity,item!!.title,Toast.LENGTH_SHORT).show()
            R.id.Open->Toast.makeText(this@MainActivity,item!!.title,Toast.LENGTH_SHORT).show()
            R.id.tarique->Toast.makeText(this@MainActivity,item!!.title,Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


}
