package com.excample.kitsu.ui.fragments.manga.detailManga

import com.example.kitsu.base.BaseViewModel
import com.excample.kitsu.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaDetailViewModel @Inject constructor(private val repository: MangaRepository) :
    BaseViewModel() {

        fun getSingleManga(id: Int) = repository.getSingleManga(id)
}