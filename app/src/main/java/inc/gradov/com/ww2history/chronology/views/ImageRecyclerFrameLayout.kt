package inc.gradov.com.ww2history.chronology.views

import android.content.Context
import android.support.v7.widget.PagerSnapHelper
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import inc.gradov.com.ww2history.R
import inc.gradov.com.ww2history.chronology.adapter.ImagesAdapter
import inc.gradov.com.ww2history.common.attachSnapHelperWithListener

class ImageRecyclerFrameLayout
@JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val snapHelper = PagerSnapHelper()
    private var recycler: RecyclerView
    private var counter: TextView
    private var totalCount: Int = 0

    init {
        val view = View.inflate(context, R.layout.layout_chronology_recycler, this)
        recycler = view.findViewById(R.id.recycler_images)
        counter = view.findViewById(R.id.tv_counter)
        recycler.attachSnapHelperWithListener(snapHelper) { currPosition ->
            counter.text = "$currPosition / $totalCount"
        }
    }

    fun sumbitList(drawbles: List<Int>?) {

        totalCount = drawbles?.size ?: 0

        if (drawbles != null && drawbles.isNotEmpty()) {

            recycler.adapter = ImagesAdapter(drawbles!!)
            visibility = View.VISIBLE

            if (drawbles.size > 1) {

                counter.visibility = View.VISIBLE
                counter.text = "1 / ${drawbles.count()}"

            } else {
                counter.visibility = View.GONE
            }
        } else {
            counter.visibility = View.GONE
            visibility = View.GONE
        }
    }
}