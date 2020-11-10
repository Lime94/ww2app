package inc.gradov.com.ww2history.sections

import android.os.Bundle
import inc.gradov.com.ww2history.R
import inc.gradov.com.ww2history.common.WebViewBaseActivity


class PeopleFragment : SectionFragment() {


    override fun getTitle(): String {
       return getString(R.string.people_fragment_title)
    }

    override fun getDescription(): String {
       return getString(R.string.people_fragment_description)
    }

    override fun getBackgroundImageRes(): Int {
        return R.drawable.hitler
    }

    override fun onButtonClick() {
        WebViewBaseActivity.newInstance(requireActivity())
    }

    companion object {
        fun newInstance() : PeopleFragment{
            return PeopleFragment()
        }
    }
}