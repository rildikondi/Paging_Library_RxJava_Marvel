package com.akondi.paginglibrxjava.model.api.paging

import androidx.paging.DataSource
import com.akondi.paginglibrxjava.model.api.MarvelApi
import com.akondi.paginglibrxjava.model.api.entity.Character
import io.reactivex.disposables.CompositeDisposable

class CharactersDataSourceFactory(
    private val compositeDisposable: CompositeDisposable,
    private val marvelApi: MarvelApi
) : DataSource.Factory<Int, Character>() {

    override fun create(): DataSource<Int, Character> {
        return CharactersDataSource(marvelApi, compositeDisposable)
    }
}