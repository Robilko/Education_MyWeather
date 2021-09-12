package com.robivan.myweather.model

import android.os.Parcelable
import com.robivan.myweather.R
import kotlinx.android.parcel.Parcelize
import kotlin.random.Random

@Parcelize
data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = Random.nextInt(-35, 35),
    val feelsLike: Int = temperature - Random.nextInt(0, 5),
    internal val precipitation: Int = Precipitation.SUNNY.icon
) : Parcelable

fun getDefaultCity() = City(MyWeather.appContext!!.resources.getString(R.string.default_city), 55.755826, 37.617299900000035)

fun getWorldCities(): List<Weather> = listOf(
        Weather(City("Лондон", 51.5085300, -0.1257400), 1, 2, Precipitation.RAINY.icon),
        Weather(City("Токио", 35.6895000, 139.6917100), 3, 4, Precipitation.SUNNY_CLOUDY.icon),
        Weather(City("Париж", 48.8534100, 2.3488000), 5, 6, Precipitation.CLOUDY.icon),
        Weather(City("Берлин", 52.52000659999999, 13.404953999999975), 7, 8, Precipitation.RAINY_FLASH.icon),
        Weather(City("Рим", 41.9027835, 12.496365500000024), 9, 10, Precipitation.SUNNY.icon),
        Weather(City("Минск", 53.90453979999999, 27.561524400000053), 11, 12, Precipitation.SUNNY.icon),
        Weather(City("Стамбул", 41.0082376, 28.97835889999999), 13, 14, Precipitation.SUNNY.icon),
        Weather(City("Вашингтон", 38.9071923, -77.03687070000001), 15, 16, Precipitation.CLOUDY.icon),
        Weather(City("Киев", 50.4501, 30.523400000000038), 17, 18, Precipitation.CLOUDY.icon),
        Weather(City("Пекин", 39.90419989999999, 116.40739630000007), 19, 20, Precipitation.SUNNY.icon)
    )

fun getRussianCities(): List<Weather> = listOf(
        Weather(City("Москва", 55.755826, 37.617299900000035), -1, -2, Precipitation.SNOWY.icon),
        Weather(City("Санкт-Петербург", 59.9342802, 30.335098600000038), 3, 3, Precipitation.RAINY_FLASH.icon),
        Weather(City("Новосибирск", 55.00835259999999, 82.93573270000002), 5, 6, Precipitation.RAINY.icon),
        Weather(City("Екатеринбург", 56.83892609999999, 60.60570250000001), 7, 8, Precipitation.CLOUDY.icon),
        Weather(City("Нижний Новгород", 56.2965039, 43.936059), 9, 10, Precipitation.RAINY.icon),
        Weather(City("Казань", 55.8304307, 49.06608060000008), 11, 12, Precipitation.RAINY.icon),
        Weather(City("Челябинск", 55.1644419, 61.4368432), 13, 14, Precipitation.RAINY.icon),
        Weather(City("Омск", 54.9884804, 73.32423610000001), 15, 16, Precipitation.SUNNY.icon),
        Weather(City("Ростов-на-Дону", 47.2357137, 39.701505), 17, 18, Precipitation.SUNNY_CLOUDY.icon),
        Weather(City("Уфа", 54.7387621, 55.972055400000045), 19, 20, Precipitation.SUNNY.icon)
    )

