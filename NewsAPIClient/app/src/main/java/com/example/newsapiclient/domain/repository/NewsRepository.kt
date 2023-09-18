package com.example.newsapiclient.domain.repository

import androidx.lifecycle.LiveData
import com.example.newsapiclient.data.model.APIResponse
import com.example.newsapiclient.data.model.Article
import com.example.newsapiclient.data.util.Resource
import kotlinx.coroutines.flow.Flow


interface NewsRepository {
    suspend fun getNewsHeadlines():Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery:String): Resource<APIResponse>
    suspend fun saveNews(article:Article)
    suspend fun deleteNews(article:Article)
    fun getSavedNews(): Flow<List<Article>>
}