package com.unciv.logic.civilization

enum class CityStateType(val color: String = "", val icon: String) {
    Cultured("#8b60ff", "OtherIcons/Cultured"),
    Maritime("#38ff70", "OtherIcons/Maritime"),
    Mercantile("#ffd800", "OtherIcons/Mercantile"),
    Militaristic("#ff0000", "OtherIcons/Militaristic"),
    Religious("#FFFFFF", "OtherIcons/Religious")
    Scientific("#77acfc", "OtherIcons/Scientific")
    Industrial("#FFA500", "OtherIcons/Industrial")
}

enum class CityStatePersonality {
    Friendly,
    Neutral,
    Hostile,
    Irrational,
    Gullible
}
