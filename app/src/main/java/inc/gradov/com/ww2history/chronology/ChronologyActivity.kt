package inc.gradov.com.ww2history.chronology

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import inc.gradov.com.ww2history.R
import inc.gradov.com.ww2history.chronology.adapter.ChronologyAdapter
import inc.gradov.com.ww2history.chronology.model.ChronologyItemUiModel
import kotlinx.android.synthetic.main.activity_with_recycler.*

class ChronologyActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_recycler)
        setSupportActionBar(toolbar)
        recycler.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        Handler().post {
            val list = getList()
            val adapter = ChronologyAdapter()
            recycler.adapter = adapter
            adapter.submitList(list)
        }
    }

    private fun getList(): List<ChronologyItemUiModel> {
        return ChronologyData().listOfDates
    }

    companion object {
        fun newInstance(activity: Activity) {
            val intent = Intent(activity, ChronologyActivity::class.java)
            activity.startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
