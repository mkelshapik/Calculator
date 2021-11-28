package com.shapovalov.calculator.ui.main

import Calculator
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.shapovalov.calculator.R

class MainFragment : Fragment() {

    val resultTextView: AppCompatTextView by lazy {
        requireView().findViewById(R.id.result_text_view)
    }
    var expression = ""
        set(value) {
            field = value
            resultTextView.text = value
        }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.calculator_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<AppCompatButton>(R.id.ac_button).setOnClickListener {
            expression = ""
        }
        view.findViewById<AppCompatButton>(R.id.plus_minus_button).setOnClickListener {
            expression = "-$expression"
        }
//        view.findViewById<AppCompatButton>(R.id.percent_button).setOnClickListener {
//            expression = "-$expression"
//        }
        view.findViewById<AppCompatButton>(R.id.division_button).setOnClickListener {
            expression = "$expression/"
        }
        view.findViewById<AppCompatButton>(R.id.seven_button).setOnClickListener {
            expression = "${expression}7"
        }
        view.findViewById<AppCompatButton>(R.id.eight_button).setOnClickListener {
            expression = "${expression}8"
        }
        view.findViewById<AppCompatButton>(R.id.nine_button).setOnClickListener {
            expression = "${expression}9"
        }
        view.findViewById<AppCompatButton>(R.id.multiply_button).setOnClickListener {
            expression = "${expression}*"
        }
        view.findViewById<AppCompatButton>(R.id.four_button).setOnClickListener {
            expression = "${expression}4"
        }
        view.findViewById<AppCompatButton>(R.id.five_button).setOnClickListener {
            expression = "${expression}5"
        }
        view.findViewById<AppCompatButton>(R.id.six_button).setOnClickListener {
            expression = "${expression}6"
        }
        view.findViewById<AppCompatButton>(R.id.minus_button).setOnClickListener {
            expression = "${expression}-"
        }
        view.findViewById<AppCompatButton>(R.id.one_button).setOnClickListener {
            expression = "${expression}1"
        }
        view.findViewById<AppCompatButton>(R.id.two_button).setOnClickListener {
            expression = "${expression}2"
        }
        view.findViewById<AppCompatButton>(R.id.three_button).setOnClickListener {
            expression = "${expression}3"
        }
        view.findViewById<AppCompatButton>(R.id.plus_button).setOnClickListener {
            expression = "${expression}+"
        }
        view.findViewById<AppCompatButton>(R.id.zero_button).setOnClickListener {
            expression = "${expression}0"
        }
        view.findViewById<AppCompatButton>(R.id.point_button).setOnClickListener {
            expression = "${expression}."
        }
        view.findViewById<AppCompatButton>(R.id.result_button).setOnClickListener {
            expression = Calculator.evaluate(expression).toString()
        }
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}