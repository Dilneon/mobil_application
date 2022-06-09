package com.example.kalimullin_danil231.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.kalimullin_danil231.R
import com.example.kalimullin_danil231.databinding.FragmentHomeBinding
import recadaptes.FeelRecycler
import recadaptes.MyFeel

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false )
        val feel_recycler : RecyclerView = root.findViewById(R.id.feel_rec)
        feel_recycler.adapter=FeelRecycler(requireContext(), MyFeel().list)


        return root
    }


}