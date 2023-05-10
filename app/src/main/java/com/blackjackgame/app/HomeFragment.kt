package com.blackjackgame.app

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class HomeFragment:Fragment (R.layout.fragment_home){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         view.findViewById<Button>(R.id.button_black_jack)
             .setOnClickListener {
                 parentFragmentManager.commit {
                     addToBackStack(null)
                     replace<BlackJackFragment>(R.id.fragment_container_view)
                 }
             }


        view.findViewById<Button>(R.id.button_durak)
            .setOnClickListener {
                parentFragmentManager.commit{
                    addToBackStack(null)
                    replace<DurakFragment>(R.id.fragment_container_view)
                }
            }


    }
}