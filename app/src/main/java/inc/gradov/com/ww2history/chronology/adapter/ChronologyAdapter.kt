package inc.gradov.com.ww2history.chronology.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.TextView
import inc.gradov.com.ww2history.R
import inc.gradov.com.ww2history.chronology.model.ChronologyItemUiModel
import inc.gradov.com.ww2history.chronology.views.ImageRecyclerFrameLayout

class ChronologyAdapter : RecyclerView.Adapter<ChronologyAdapter.Holder>() {

    lateinit var list: List<ChronologyItemUiModel>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.cronology_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(viewHolder: Holder, position: Int) {
        viewHolder.apply {
            val item: ChronologyItemUiModel = list[position]
            dateFrom.text = item.dateFrom + " " + " " + item.dateTo
            title.text = item.title
            description.text = item.description

            val listImages = list[position].images
            imgRecycler.sumbitList(listImages)
        }
    }

    fun submitList(list: List<ChronologyItemUiModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var dateFrom: TextView = itemView.findViewById(R.id.datesFromTo)
        var title: TextView = itemView.findViewById(R.id.title)
        var imgRecycler: ImageRecyclerFrameLayout = itemView.findViewById(R.id.images_recycler)
        var description: TextView = itemView.findViewById(R.id.description)
    }
}




