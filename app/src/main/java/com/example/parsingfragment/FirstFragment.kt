package com.example.parsingfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.parsingfragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(layoutInflater)
        communicator = activity as Communicator

        binding.btnFragment1.setOnClickListener {
            Toast.makeText(context, "this page is First Fragment", Toast.LENGTH_SHORT).show()
        }

        binding.btnFragment2.setOnClickListener {
            communicator.passDataCom(binding.etNama.text.toString())
            communicator.passDataSquad(binding.etSquad.text.toString())
            communicator.passDataAngkatan(binding.etAngkatan.text.toString())
            communicator.passDataHobby(binding.etHobby.text.toString())
        }

        return binding.root
    }

}