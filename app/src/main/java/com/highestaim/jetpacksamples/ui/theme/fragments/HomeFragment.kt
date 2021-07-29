package com.highestaim.jetpacksamples.ui.theme.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import com.highestaim.jetpacksamples.ListView

class HomeFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View  = ComposeView(requireContext()).apply {
            setContent {
                ListView()
            }
        }

}