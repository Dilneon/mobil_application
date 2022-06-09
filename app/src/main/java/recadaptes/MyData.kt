package recadaptes

import com.example.kalimullin_danil231.R

data class feel(val image:Int, val name_feel:String)
class MyFeel{val list = arrayListOf(feel(R.drawable.calm_img,""),
feel(R.drawable.relax_img, "расслабленный"),
feel(R.drawable.focus_img, "соредоточенным"),
feel(R.drawable.focus_img, "взволнованный")
    )}
data class state(val title:String, val text_state:String, val image_state: Int)

class MyState ()
{
    val state_list = arrayListOf(state("Заголовок статьи", "краткое описание",R.drawable.image_state_1))

}

