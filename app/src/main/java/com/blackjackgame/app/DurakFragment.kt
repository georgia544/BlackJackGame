package com.blackjackgame.app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class DurakFragment:Fragment(R.layout.fragment_durak) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.menu_fragment).setOnClickListener {
            DurakGameMenuDialog().show(parentFragmentManager, null)

        }
    }
}