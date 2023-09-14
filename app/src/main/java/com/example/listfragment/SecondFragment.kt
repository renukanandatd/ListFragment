package com.example.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class SecondFragment : Fragment() {
    lateinit var imageView:ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view:View= inflater.inflate(R.layout.fragment_second, container, false)

        imageView=view.findViewById(R.id.imageView)

        val position=arguments?.getInt("position",0)

        when(position){
            0->imageView.setImageResource(R.drawable.berlinn)
           // 1->imageView.setImageResource(R.drawable.berlin)
            //2->imageView.setImageResource(R.drawable.tokyo)
            //3->imageView.setImageResource(R.drawable.rome)
            //4->imageView.setImageResource(R.drawable.amsterdam)
        }
        // Inflate the layout for this fragment
        return view
    }
}