}

    fun canGiveStat(statType: Stat): Boolean {
        if (!civInfo.isCityState())
            return false
        val eraInfo = civInfo.getEra()
        if (!eraInfo.undefinedCityStateBonuses()) {
            // Defined city states in json
            for (bonus in eraInfo.getCityStateBonuses(civInfo.cityStateType, RelationshipLevel.Ally)) {
                if (bonus.stats[statType] > 0 || (bonus.isOfType(UniqueType.CityStateHappiness) && statType == Stat.Happiness))
                    return true
            }
        } else {
            // compatibility mode
            return when {
                civInfo.cityStateType == CityStateType.Mercantile && statType == Stat.Happiness -> true
                civInfo.cityStateType == CityStateType.Cultured && statType == Stat.Culture -> true
                civInfo.cityStateType == CityStateType.Maritime && statType == Stat.Food -> true
                civInfo.cityStateType == CityStateType.Religious && statType == Stat.Faith ->true
                civInfo.cityStateType == CityStateType.Religious && statType == Stat.Scientific ->true
                civInfo.cityStateType == CityStateType.Religious && statType == Stat.Production ->true
                else -> false
            }
        }

        return false
    }
