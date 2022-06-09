package com.example.kalimullin_danil231.ui.listen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.kalimullin_danil231.R


class ListenFragment : Fragment() {



    // This property is only valid between onCreateView and
    // onDestroyView.


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_listen, container, false)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()

    }
}