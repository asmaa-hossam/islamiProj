package com.example.testfragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.testfragment.R

class fragmenttasbeeh :Fragment() {
    lateinit var tasbeehcounter: TextView
    lateinit var textZekr: TextView
    var counter:Int=0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tasbeeh_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        initViews()
    }

    private fun initViews() {
        tasbeehcounter = requireView().findViewById(R.id.tasbeeh_counter)
        textZekr = requireView().findViewById(R.id.zekr_name)

        textZekr.setOnClickListener {
            counter++
            tasbeehcounter.setText(counter.toString())
        }
    }
}
