package com.example.parsingfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.parsingfragment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    var tvNama: String? = ""
    var tvSquad: String? = ""
    var tvAngkatan: String? = ""
    var tvHobby: String? = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tvNama = arguments?.getString("nama")
        binding.tvNama.text = tvNama
        tvSquad = arguments?.getString("squad")
        binding.tvSquad.text = tvSquad
        tvAngkatan = arguments?.getString("angkatan")
        binding.tvAngkatan.text = tvAngkatan
        tvHobby = arguments?.getString("hobby")
        binding.tvHobby.text = tvHobby

    }
}