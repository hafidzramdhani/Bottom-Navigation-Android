package com.example.application;

import android.annotation.Nullable;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class AplikasiFragment extends Fragment {

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_aplikasi, container, false);
	}

}
