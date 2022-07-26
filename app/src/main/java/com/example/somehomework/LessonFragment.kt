package com.example.somehomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.somehomework.databinding.FragmentLessonBinding

class LessonFragment() : Fragment() {

    lateinit var binding: FragmentLessonBinding
    private var list = arrayListOf<LessonModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLessonBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = LessonAdapter(list)
        binding.recyclerLesson.adapter = adapter
    }

    private fun loadData() {
        list.add(
            LessonModel(
                "https://fsd.multiurok.ru/html/2020/04/06/s_5e8b45a0534f6/img0.jpg",
                "Кыргыз тили",
                R.color.teal_200
            )
        )
        list.add(
            LessonModel(
                "https://detectivebookshop.ru/image/1021471875.jpg",
                "Англ яз",
                R.color.purple_700
            )
        )
        list.add(
            LessonModel(
                "http://cdn.eksmo.ru/v2/ASE000000000725008/COVER/cover3d1.jpg",
                "Физика",
                R.color.purple_200
            )
        )
        list.add(
            LessonModel(
                "https://cv6.litres.ru/pub/c/pdf-kniga/cover_max1500/57440869-vladimir-borisovich-zaharov-biologiya-57440869.jpg",
                "Биология",
                android.R.color.darker_gray
            )
        )
        list.add(
            LessonModel(
                "https://mklguo.ru/800/600/https/cdn1.ozone.ru/s3/multimedia-w/6008224376.jpg",
                "Математика",
                R.color.purple_700
            )
        )
        list.add(
            LessonModel(
                "https://kitep.edu.gov.kg/pages/685/1.jpg",
                "История кырг",
                R.color.teal_700
            )
        )
        list.add(
            LessonModel(
                "https://ruslania.com/pictures/books_photos/26/262090/o.jpg",
                "Литература",
                android.R.color.holo_orange_light
            )
        )
        list.add(
            LessonModel(
                "https://bookree.org/loader/img.php?dir=75018b4d35c94bac3133ec49b439bf3f&file=0.png",
                "Геометрия",
                R.color.black
            )
        )
        list.add(
            LessonModel(
                "https://rabochaya-tetrad-uchebnik.com/russkiy_yazyk/russkiy_yazyk_3_klass_uchebnik_ramzaeva_chastj_1/1.jpg",
                "Русс яз",
                android.R.color.holo_red_light
            )
        )

        list.add(
            LessonModel(
                "https://detectivebookshop.ru/image/1014796840.jpg",
                "География",
                android.R.color.holo_green_dark
            )
        )
        list.add(
            LessonModel(
                "https://my-clothing-shop.ru/pictures/1018934309.jpg",
                "Химия",
                R.color.purple_500
            )
        )
        list.add(
            LessonModel(
                "https://moya-kniga.ru/upload/iblock/f83/f83c4ebc1d70eb23702444acdc8eafbc.jpg",
                "Черчение",
                android.R.color.holo_blue_light
            )
        )
        list.add(
            LessonModel(
                "https://www.roslit.ru/upload/iblock/34d/34d5e5b849744deaef207ed11a9f64fd.jpg",
                "Музыка",
                android.R.color.holo_red_dark
                )
        )
        list.add(
            LessonModel(
                "https://static.anumis.ru/global/images/photos/0166/huge/1086631.jpg",
                "История мира",
                android.R.color.holo_orange_dark
            )
        )
        list.add(
            LessonModel(
                "https://cv5.litres.ru/pub/c/audiokniga/cover_max1500/66445058-evgeniya-vladimirovna-basova-izo-66445058.jpg",
                "ИЗО",
                R.color.black
            )
        )
    }
}