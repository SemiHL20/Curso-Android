package com.example.yoga30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.yoga30days.R

data class Yoga(
    @DrawableRes val asanaImg: Int,
    @StringRes val yogaDay: Int,
    @StringRes val asanaName: Int,
    @StringRes val asanaDesc: Int,
    @StringRes val asanaBenef: Int,
    @StringRes val asanaNotFor: Int
)

val yogaList = listOf(
    Yoga(
        asanaImg = R.drawable.sukhasana1,
        yogaDay = R.string.day1,
        asanaName = R.string.name_asana1,
        asanaDesc = R.string.desc_asana1,
        asanaBenef = R.string.benefits_asana1,
        asanaNotFor = R.string.notfor_asana1
    ),
    Yoga(
        asanaImg = R.drawable.tadasana2,
        yogaDay = R.string.day2,
        asanaName = R.string.name_asana2,
        asanaDesc = R.string.desc_asana2,
        asanaBenef = R.string.benefits_asana2,
        asanaNotFor = R.string.notfor_asana2
    ),
    Yoga(
        asanaImg = R.drawable.balasana3,
        yogaDay = R.string.day3,
        asanaName = R.string.name_asana3,
        asanaDesc = R.string.desc_asana3,
        asanaBenef = R.string.benefits_asana3,
        asanaNotFor = R.string.notfor_asana3
    ),
    Yoga(
        asanaImg = R.drawable.dwi_pada_pitham4,
        yogaDay = R.string.day4,
        asanaName = R.string.name_asana4,
        asanaDesc = R.string.desc_asana4,
        asanaBenef = R.string.benefits_asana4,
        asanaNotFor = R.string.notfor_asana4
    ),
    Yoga(
        asanaImg = R.drawable.bidalasana5,
        yogaDay = R.string.day5,
        asanaName = R.string.name_asana5,
        asanaDesc = R.string.desc_asana5,
        asanaBenef = R.string.benefits_asana5,
        asanaNotFor = R.string.notfor_asana5
    ),
    Yoga(
        asanaImg = R.drawable.marjaryasana6,
        yogaDay = R.string.day6,
        asanaName = R.string.name_asana6,
        asanaDesc = R.string.desc_asana6,
        asanaBenef = R.string.benefits_asana6,
        asanaNotFor = R.string.notfor_asana6
    ),
    Yoga(
        asanaImg = R.drawable.adho_mukha_svanasana7,
        yogaDay = R.string.day7,
        asanaName = R.string.name_asana7,
        asanaDesc = R.string.desc_asana7,
        asanaBenef = R.string.benefits_asana7,
        asanaNotFor = R.string.notfor_asana7
    ),
    Yoga(
        asanaImg = R.drawable.bhujangasana8,
        yogaDay = R.string.day8,
        asanaName = R.string.name_asana8,
        asanaDesc = R.string.desc_asana8,
        asanaBenef = R.string.benefits_asana8,
        asanaNotFor = R.string.notfor_asana8
    ),
    Yoga(
        asanaImg = R.drawable.utkatasana9,
        yogaDay = R.string.day9,
        asanaName = R.string.name_asana9,
        asanaDesc = R.string.desc_asana9,
        asanaBenef = R.string.benefits_asana9,
        asanaNotFor = R.string.notfor_asana9
    ),
    Yoga(
        asanaImg = R.drawable.uttanasana10,
        yogaDay = R.string.day10,
        asanaName = R.string.name_asana10,
        asanaDesc = R.string.desc_asana10,
        asanaBenef = R.string.benefits_asana10,
        asanaNotFor = R.string.notfor_asana10
    ),
    Yoga(
        asanaImg = R.drawable.vrikshasana11,
        yogaDay = R.string.day11,
        asanaName = R.string.name_asana11,
        asanaDesc = R.string.desc_asana11,
        asanaBenef = R.string.benefits_asana11,
        asanaNotFor = R.string.notfor_asana11
    ),
    Yoga(
        asanaImg = R.drawable.utthita_trikonasana12,
        yogaDay = R.string.day12,
        asanaName = R.string.name_asana12,
        asanaDesc = R.string.desc_asana12,
        asanaBenef = R.string.benefits_asana12,
        asanaNotFor = R.string.notfor_asana12
    ),
    Yoga(
        asanaImg = R.drawable.phalakasana13,
        yogaDay = R.string.day13,
        asanaName = R.string.name_asana13,
        asanaDesc = R.string.desc_asana13,
        asanaBenef = R.string.benefits_asana13,
        asanaNotFor = R.string.notfor_asana13
    ),
    Yoga(
        asanaImg = R.drawable.chaturanga14,
        yogaDay = R.string.day14,
        asanaName = R.string.name_asana14,
        asanaDesc = R.string.desc_asana14,
        asanaBenef = R.string.benefits_asana14,
        asanaNotFor = R.string.notfor_asana14
    ),
)
