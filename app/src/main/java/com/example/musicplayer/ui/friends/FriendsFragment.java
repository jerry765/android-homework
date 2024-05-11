package com.example.musicplayer.ui.friends;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.example.musicplayer.R;

public class FriendsFragment extends Fragment {

    private RecyclerView recyclerView;
    private LottieAnimationView lottieAnimation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friends, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        lottieAnimation = view.findViewById(R.id.lottie_animation);

        lottieAnimation.playAnimation();

        new Handler().postDelayed(() -> {
            lottieAnimation.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
            // 在这里设置适配器和好友列表数据
        }, 5000);

        return view;
    }
}
