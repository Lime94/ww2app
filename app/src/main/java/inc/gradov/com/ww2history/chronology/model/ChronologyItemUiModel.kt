package inc.gradov.com.ww2history.chronology.model

data class ChronologyItemUiModel(
        val dateFrom: String,
        val dateTo: String? = "",
        val title: String,
        val images: List<Int>? = null,
        val description: String
)