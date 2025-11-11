package com.example.hw5

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class ResultFragment : Fragment(R.layout.fragment_result) {
    private val vm: WorkViewModel by activityViewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val status = view.findViewById<TextView>(R.id.ResultTXT)
        vm.status.observe(viewLifecycleOwner) { status.text = it }
    }
}