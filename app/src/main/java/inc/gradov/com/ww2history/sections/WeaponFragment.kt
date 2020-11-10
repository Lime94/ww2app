package inc.gradov.com.ww2history.sections

import inc.gradov.com.ww2history.R
import inc.gradov.com.ww2history.common.WebViewBaseActivity

class WeaponFragment: SectionFragment(){

    override fun getTitle(): String {
        return getString(R.string.weapon_fragment_title)
    }

    override fun getDescription(): String {
        return getString(R.string.weapon_fragment_description)
    }

    override fun getBackgroundImageRes(): Int {
        return R.drawable.snipers
    }

    override fun onButtonClick() {
        WebViewBaseActivity.newInstance(requireActivity())
    }

    companion object {
        fun newInstance() : WeaponFragment{
            return WeaponFragment()
        }
    }

}