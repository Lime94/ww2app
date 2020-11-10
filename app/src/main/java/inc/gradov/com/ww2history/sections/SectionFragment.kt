package inc.gradov.com.ww2history.sections

import android.opengl.Visibility
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import inc.gradov.com.ww2history.R

abstract class SectionFragment : Fragment() {


    private lateinit var backGroundImageView: ImageView
    private lateinit var shadowFilterView: ImageView
    private lateinit var titleView: TextView
    private lateinit var descriptionView: TextView
    private lateinit var button: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.section_fragment, container, false)
        backGroundImageView = rootView.findViewById(R.id.background_image)
        shadowFilterView = rootView.findViewById(R.id.shadow_filter_image)
        titleView = rootView.findViewById(R.id.txt_title)
        descriptionView = rootView.findViewById(R.id.txt_description)
        button = rootView.findViewById(R.id.btn)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backGroundImageView.setImageResource(getBackgroundImageRes())
        descriptionView.text = getDescription()
        titleView.text = getTitle()
        button.setOnClickListener { onButtonClick() }

    }

    abstract fun getTitle(): String

    abstract fun getDescription(): String

    abstract fun getBackgroundImageRes(): Int

    abstract fun onButtonClick()
}