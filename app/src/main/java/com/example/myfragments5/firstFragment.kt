package com.example.myfragments5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.findFragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myfragments5.databinding.FragmentFirstBinding
import com.example.myfragments5.databinding.FragmentSecondBinding

class firstFragment : Fragment() {
    private lateinit var Name:EditText
    private lateinit var button:Button
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        Name=view.findViewById(R.id.nameonsecfragment)
//        button=view.findViewById(R.id.button)
//        button.setOnClickListener {
//            val name=Name.text.toString()
//            val action = firstFragmentDirections.actionFirstFragmentToSecondFragment(name)
//
//            findNavController().navigate(action)
//        }
//    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Name=view.findViewById<EditText>(R.id.editname)
        button=view.findViewById<Button>(R.id.button)
        val message=Name.text.toString()
        button.setOnClickListener {
            val action=firstFragmentDirections.actionFirstFragmentToSecondFragment(message)
            Navigation.findNavController(view).navigate(action)
        }
    }






}