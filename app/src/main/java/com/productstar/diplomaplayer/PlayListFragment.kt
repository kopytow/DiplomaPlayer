package com.productstar.diplomaplayer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class PlayListFragment : Fragment(R.layout.play_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val playListView = view.findViewById<RecyclerView>(R.id.play_list_view)
        playListView.adapter = PlayListAdapter()
    }

}
