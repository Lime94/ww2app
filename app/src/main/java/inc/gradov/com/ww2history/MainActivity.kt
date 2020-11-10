package inc.gradov.com.ww2history

import android.support.v7.app.AppCompatActivity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import me.relex.circleindicator.CircleIndicator
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import inc.gradov.com.ww2history.sections.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnTouchListener {

    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null

    private lateinit var toolbar: Toolbar
    private lateinit var viewPager: ViewPager
    private lateinit var handler: Handler
    private var currentPage = 0
    private var delay = 5000L
    private val fragmentList = listOf(
            ChronologyFragment.newInstance(),
            GreatBattleFragment.newInstance(),
            PeopleFragment.newInstance(),
            FeatFragment.newInstance(),
            TechnicalFragment.newInstance(),
            WeaponFragment.newInstance()
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.container)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        handler = Handler()
        container.setOnTouchListener(this)
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
        viewPager.adapter = mSectionsPagerAdapter
        val indicator = findViewById<CircleIndicator>(R.id.indicator)
        indicator.setViewPager(viewPager)


        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {
                currentPage = position
                handler.removeCallbacks(runnable)
                handler.postDelayed(runnable, delay)
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })

    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {

        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                handler.removeCallbacks(runnable)
            }
            MotionEvent.ACTION_UP -> {
                handler.postDelayed(runnable, delay)
            }
        }
        return false
    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnable, delay)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }


        override fun getCount(): Int {
            return fragmentList.count()
        }
    }

    private var runnable: Runnable = object : Runnable {
        override fun run() {
            if (mSectionsPagerAdapter?.count === currentPage) {
                currentPage = 0
            } else {
                currentPage++
            }
            viewPager.setCurrentItem(currentPage, true)
            handler.postDelayed(this, delay)
        }
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable)
    }
}
