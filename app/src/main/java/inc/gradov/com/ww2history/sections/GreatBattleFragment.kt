package inc.gradov.com.ww2history.sections

import inc.gradov.com.ww2history.R
import inc.gradov.com.ww2history.greatbattle.GreatBattleActivity

class GreatBattleFragment : SectionFragment() {

    override fun getTitle(): String {
        return getString(R.string.great_battle_fragment_title)
    }

    override fun getDescription(): String {
        return getString(R.string.great_battle_fragment_desciption)
    }

    override fun getBackgroundImageRes(): Int {
        return R.drawable.seven_november
    }

    override fun onButtonClick() {
        GreatBattleActivity.newInstance(requireActivity())
    }

    companion object {
        fun newInstance(): GreatBattleFragment {
            return GreatBattleFragment()
        }
    }
}