package com.example.myfragments5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.myfragments5.databinding.FragmentFifthBinding
import com.example.myfragments5.databinding.FragmentFirstBinding
import com.example.myfragments5.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    val args:SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_second, container, false)

        val message=args.message
        val Name=view.findViewById<TextView>(R.id.nameon2fragment)
        Name.text=message
        return view
    }
}

