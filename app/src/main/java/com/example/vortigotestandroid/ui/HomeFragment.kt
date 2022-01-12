package com.example.vortigotestandroid.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.vortigotestandroid.R
import com.squareup.picasso.Picasso

// TODO: Popular a UI com as informações recuperadas do serviço

class HomeFragment : Fragment() {

    private lateinit var viewModel : HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Initialize a ViewModel
        viewModel = ViewModelProvider(this).get(
            HomeViewModel::class.java
        )
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.githubUser.observe(viewLifecycleOwner) {
            view.findViewById<TextView>(R.id.tv_name).text = it.name
            view.findViewById<TextView>(R.id.tv_login).text = it.login
            view.findViewById<TextView>(R.id.tv_following).text = it.following.toString()
            view.findViewById<TextView>(R.id.tv_followers).text = it.followers.toString()
            view.findViewById<TextView>(R.id.tv_publicRepos).text = it.publicRepos.toString()
//            Glide.with(this).load(it.avatarURL).into(view.findViewById(R.id.image));
            Picasso.get().load(it.avatarURL).into(view.findViewById<ImageView>(R.id.tv_avatar));
        }
    }

}
