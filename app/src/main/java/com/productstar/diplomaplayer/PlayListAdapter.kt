package com.productstar.diplomaplayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlayListAdapter : RecyclerView.Adapter<TrackViewHolder>() {

    private val items = IntArray(30) { it }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackViewHolder {
        return TrackViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: TrackViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class TrackViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    //private val preview = view.findViewById<TextView>(R.id.preview)
    private val duration = view.findViewById<TextView>(R.id.song_duration)
    private val singer = view.findViewById<TextView>(R.id.singer)
    private val track = view.findViewById<TextView>(R.id.track)
    private val state = view.findViewById<ImageView>(R.id.state)

    fun bind(value: Int) {
        if (value % 2 == 0) {
            state.setImageResource(R.drawable.pause_small)
        } else {
            state.setImageResource(R.drawable.play_small)
        }
        val text = value.toString()
        track.text = text
        singer.text = text
        duration.text = text
    }

}