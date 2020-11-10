package inc.gradov.com.ww2history.sections

import inc.gradov.com.ww2history.R
import inc.gradov.com.ww2history.chronology.ChronologyActivity

class ChronologyFragment : SectionFragment(){


    override fun getTitle(): String {
        return getString(R.string.chronologies_fragment_title)
    }

    override fun getDescription(): String {
        return  getString(R.string.chronologies_fragment_description)
    }

    override fun getBackgroundImageRes(): Int {
        return R.drawable.znamya_pobedy
    }

    override fun onButtonClick() {
        ChronologyActivity.newInstance(requireActivity())
    }

    companion object {
        fun newInstance() : ChronologyFragment{
            return ChronologyFragment()
        }
    }

}