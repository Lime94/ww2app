package inc.gradov.com.ww2history.chronology.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import inc.gradov.com.ww2history.R


class ImagesAdapter constructor(
        private val listImagesRes: List<Int>
) : RecyclerView.Adapter<ImagesAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.image_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return listImagesRes.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        //TODO: Try load acync
        val image = listImagesRes[position]
        holder.imageView.setImageResource(image)
//        Glide.with(holder.imageView.context)
//                .asDrawable()
//                .load(listImagesRes[position])
//                .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
//                .into(holder.imageView)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.chronology_image)
    }
}