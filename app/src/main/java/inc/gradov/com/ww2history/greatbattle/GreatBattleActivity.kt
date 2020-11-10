package inc.gradov.com.ww2history.greatbattle

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import inc.gradov.com.ww2history.R

class GreatBattleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_recycler)
    }

    companion object {
        fun newInstance(activity: Activity) {
            val intent = Intent(activity, GreatBattleActivity::class.java)
            activity.startActivity(intent)
        }
    }
}
