package inc.gradov.com.ww2history.common

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SnapHelper

fun RecyclerView.attachSnapHelperWithListener(
        snapHelper: SnapHelper,
        onSnapPositionChangeListener: (Int) -> Unit) {
    snapHelper.attachToRecyclerView(this)
    val snapOnScrollListener = SnapOnScrollListener(snapHelper, onSnapPositionChangeListener)
    addOnScrollListener(snapOnScrollListener)
}