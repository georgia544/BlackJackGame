package com.blackjackgame.app

import android.content.res.Resources
import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.commit

class DurakGameMenuDialog : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dialog_durak, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val durakGame:DurakGame=DurakGameMock()

        val backButton:Button = view.findViewById(R.id.back_button)
        backButton.setOnClickListener {
            dismiss()
        }

        val endGameButton:Button = view.findViewById(R.id.end_game_button)
        endGameButton.setOnClickListener {
            dismiss()
            parentFragmentManager.popBackStack()
        }

        val newGameButton:Button=view.findViewById(R.id.new_game_button)
        newGameButton.setOnClickListener{
            durakGame.startGame()
        }

    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            250.dp.toInt(),
            300.dp.toInt()
        )
        dialog?.window?.setBackgroundDrawable(null)
    }



}

val Number.dp
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    )