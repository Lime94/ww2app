package inc.gradov.com.ww2history.sections

import inc.gradov.com.ww2history.R
import inc.gradov.com.ww2history.common.WebViewBaseActivity

class FeatFragment : SectionFragment() {

    override fun getTitle(): String {
       return getString(R.string.feat_fragment_title)
    }

    override fun getDescription(): String {
        return getString(R.string.feat_fragment_description)
    }

    override fun getBackgroundImageRes(): Int {
        return R.drawable.soldat
    }

    override fun onButtonClick() {
        WebViewBaseActivity.newInstance(requireActivity())
    }

    companion object {
        fun newInstance() : FeatFragment{
            return FeatFragment()
        }
    }
}