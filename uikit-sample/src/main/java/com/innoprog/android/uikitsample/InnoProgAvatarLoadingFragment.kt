package com.innoprog.android.uikitsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.innoprog.android.uikit.ImageLoadingType
import com.innoprog.android.uikitsample.databinding.FragmentInnoProgAvatarLoadingBinding

class InnoProgAvatarLoadingFragment : Fragment() {

    private var _binding: FragmentInnoProgAvatarLoadingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInnoProgAvatarLoadingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val placeholderResId = R.id.avatar_drawable

        val imageType = ImageLoadingType.ImageNetwork("https://url_to_your_image.jpg", placeholderResId)

        binding.avatarNetwork.loadImage(imageType)

    }

}

