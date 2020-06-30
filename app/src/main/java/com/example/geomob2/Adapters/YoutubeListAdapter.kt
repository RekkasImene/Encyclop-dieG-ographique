package com.example.geomob2


import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.geomob2.Model.Item
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import java.text.SimpleDateFormat

class YoutubeListAdapter (
    val videoss : List<Item>
) :RecyclerView.Adapter<YoutubeListAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var pubVideo: YouTubePlayerView

        init {

            pubVideo =  itemView.findViewById(R.id.youtube)



        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.youtube_activity, viewGroup, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return videoss.size
    }


    override fun onBindViewHolder(holder: YoutubeListAdapter.ViewHolder, position: Int) {

        val curr = videoss[position]


        /******************loader la video*********************/


        holder.pubVideo.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer)
            {

                youTubePlayer.cueVideo(curr.id.videoId, 0f)

            }
        })
    }
}