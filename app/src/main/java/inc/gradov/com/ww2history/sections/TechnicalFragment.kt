package inc.gradov.com.ww2history.sections

import inc.gradov.com.ww2history.R
import inc.gradov.com.ww2history.common.WebViewBaseActivity

class TechnicalFragment : SectionFragment(){

    override fun getTitle(): String {
        return getString(R.string.technical_fragment_title)
    }

    override fun getDescription(): String {
        return getString(R.string.tehnical_fragment_description)
    }

    override fun getBackgroundImageRes(): Int {
       return R.drawable.tank_t34
    }

    companion object {
        fun newInstance() : TechnicalFragment{
            return TechnicalFragment()
        }
    }

    override fun onButtonClick() {
        WebViewBaseActivity.newInstance(requireActivity())
    }
}