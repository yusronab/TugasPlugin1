package com.example.parsingfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.parsingfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Communicator {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setFragment(FirstFragment())

    }
    private fun setFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,fragment)
            .commit()
    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("nama", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle

        transaction.replace(R.id.fragmentContainer, secondFragment)
        transaction.commit()
    }

    override fun passDataSquad(editTextInputSquad: String) {
        val bundle = Bundle()
        bundle.putString("squad", editTextInputSquad)
        val transaction = this.supportFragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle

        transaction.add(R.id.fragmentContainer, secondFragment)
        transaction.commit()
    }

    override fun passDataAngkatan(editTextInputAngkatan: String) {
        val bundle = Bundle()
        bundle.putString("angkatan", editTextInputAngkatan)
        val transaction = this.supportFragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle

        transaction.add(R.id.fragmentContainer, secondFragment)
        transaction.commit()
    }

    override fun passDataHobby(editTextInputHobby: String) {
        val bundle = Bundle()
        bundle.putString("hobby", editTextInputHobby)
        val transaction = this.supportFragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle

        transaction.add(R.id.fragmentContainer, secondFragment)
        transaction.commit()
    }
}