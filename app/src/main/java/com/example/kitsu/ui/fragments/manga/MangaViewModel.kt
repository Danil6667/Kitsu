package com.excample.kitsu.ui.fragments.manga

import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.kitsu.base.BaseViewModel
import com.excample.kitsu.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(private val repository: MangaRepository) : BaseViewModel() {

    fun getManga() = repository.getManga().cachedIn(viewModelScope)
}