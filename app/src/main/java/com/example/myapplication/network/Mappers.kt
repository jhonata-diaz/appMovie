package com.calyr.framework.network

import com.example.myapplication.database.MovieEntity
import com.example.myapplication.domain.Movie


fun MovieRemote.toMovie(id: Int) : Movie {
    return Movie(
        id = id,
        title = title,
        description = description,
        posterPath = posterPath
    )
}



