package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentAnaSayfaBinding;


public class AnaSayfaFragment extends Fragment {
    private FragmentAnaSayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false);
        binding.buttonSayfaA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.gecisAnaSayfaA);
        });
        binding.buttonSayfaX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.gecisAnaSayfaX);
        });


        return binding.getRoot();
    }
}