package inc.gradov.com.ww2history.common

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SnapHelper


class SnapOnScrollListener(
        private val snapHelper: SnapHelper,
        var onSnapPositionChangeListener: (Int) -> Unit
) : RecyclerView.OnScrollListener() {

    private var snapPosition = RecyclerView.NO_POSITION

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        val snapPosition = snapHelper.findTargetSnapPosition(recyclerView.layoutManager, dx, dy)
        if(snapPosition != 0){
            val snapPositionChanged = this.snapPosition != snapPosition
            if (snapPositionChanged) {
                onSnapPositionChangeListener.invoke(snapPosition)
                this.snapPosition = snapPosition
            }
        }

    }
}