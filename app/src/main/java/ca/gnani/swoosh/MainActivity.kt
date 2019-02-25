package ca.gnani.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //R --> Resources
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener{
            val leagueIntent = Intent(this, LeaqueActivity::class.java)
            startActivity(leagueIntent)

            //Two types of Intents: Explicit (Send instruction our own implementation) and Implicit (Send instruction to Android System, Android system will find the class or module to complete the action)

            //Context 

        }
    }
}
