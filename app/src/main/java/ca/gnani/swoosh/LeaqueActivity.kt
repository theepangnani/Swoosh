package ca.gnani.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View

class LeaqueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaque)
    }

    fun leagueNextClicked(view: View){
        val skillActivity = Intent(this,SkillActivity::class.java)
        startActivity(skillActivity)
    }
}
