package com.ducgao.spoyer_sdk

import com.ducgao.spoyer_sdk.model.Country

object CountriesHelper {
    fun getCountry(code: String): Country {
        return data.find { c -> c.code.equals(code, true) } ?: Country("", "World", nameRu = "мир")
    }
}

private val data: List<Country> = listOf(
    Country(code = "ad", nameEn = "Andorra", nameRu = "Андорра"),
    Country(code = "ae", nameEn = "United Arab Emirates", nameRu = "Объединенные Арабские Эмираты"),
    Country(code = "af", nameEn = "Afghanistan", nameRu = "Афганистан"),
    Country(code = "ag", nameEn = "Antigua and Barbuda", nameRu = "Антигуа и Барбуда"),
    Country(code = "ai", nameEn = "Anguilla", nameRu = "Ангилья"),
    Country(code = "al", nameEn = "Albania", nameRu = "Албания"),
    Country(code = "am", nameEn = "Armenia", nameRu = "Армения"),
    Country(code = "ao", nameEn = "Angola", nameRu = "Ангола"),
    Country(code = "aq", nameEn = "Antarctica", nameRu = "Антарктида"),
    Country(code = "ar", nameEn = "Argentina", nameRu = "Аргентина"),
    Country(code = "as", nameEn = "American Samoa", nameRu = "Американское Самоа"),
    Country(code = "at", nameEn = "Austria", nameRu = "Австрия"),
    Country(code = "au", nameEn = "Australia", nameRu = "Австралия"),
    Country(code = "aw", nameEn = "Aruba", nameRu = "Аруба"),
    Country(code = "az", nameEn = "Azerbaijan", nameRu = "Азербайджан"),
    Country(code = "ba", nameEn = "Bosnia & Herzegovina", nameRu = "Босния и Герцеговина"),
    Country(code = "bb", nameEn = "Barbados", nameRu = "Барбадос"),
    Country(code = "bd", nameEn = "Bangladesh", nameRu = "Бангладеш"),
    Country(code = "be", nameEn = "Belgium", nameRu = "Бельгия"),
    Country(code = "bf", nameEn = "Burkina Faso", nameRu = "Буркина-Фасо"),
    Country(code = "bg", nameEn = "Bulgaria", nameRu = "Болгария"),
    Country(code = "bh", nameEn = "Bahrain", nameRu = "Бахрейн"),
    Country(code = "bi", nameEn = "Burundi", nameRu = "Бурунди"),
    Country(code = "bj", nameEn = "Benin", nameRu = "Бенин"),
    Country(code = "bl", nameEn = "St. Barths", nameRu = "Сен-Бартс"),
    Country(code = "bm", nameEn = "Bermuda", nameRu = "Бермуды"),
    Country(code = "bn", nameEn = "Brunei", nameRu = "Бруней"),
    Country(code = "bo", nameEn = "Bolivia", nameRu = "Боливия"),
    Country(code = "bq", nameEn = "Caribbean Netherlands", nameRu = "Карибские Нидерланды"),
    Country(code = "br", nameEn = "Brazil", nameRu = "Бразилия"),
    Country(code = "bs", nameEn = "Bahamas", nameRu = "Багамы"),
    Country(code = "bt", nameEn = "Bhutan", nameRu = "Бутан"),
    Country(code = "bv", nameEn = "Bouvet Island", nameRu = "Остров Буве"),
    Country(code = "bw", nameEn = "Botswana", nameRu = "Ботсвана"),
    Country(code = "by", nameEn = "Belarus", nameRu = "Беларусь"),
    Country(code = "bz", nameEn = "Belize", nameRu = "Белиз"),
    Country(code = "ca", nameEn = "Canada", nameRu = "Канада"),
    Country(code = "cc", nameEn = "Cocos Islands", nameRu = "Кокосовые острова"),
    Country(code = "cd", nameEn = "Congo - Kinshasa", nameRu = "Конго - Киншаса"),
    Country(
        code = "cf",
        nameEn = "Central African Republic",
        nameRu = "Центрально-Африканская Республика"
    ),
    Country(code = "cg", nameEn = "Congo - Brazzaville", nameRu = "Конго - Браззавиль"),
    Country(code = "ch", nameEn = "Switzerland", nameRu = "Швейцария"),
    Country(code = "ck", nameEn = "Cook Islands", nameRu = "Острова Кука"),
    Country(code = "cl", nameEn = "Chile", nameRu = "Чили"),
    Country(code = "cm", nameEn = "Cameroon", nameRu = "Камерун"),
    Country(code = "cn", nameEn = "China", nameRu = "Китай"),
    Country(code = "co", nameEn = "Colombia", nameRu = "Колумбия"),
    Country(code = "cr", nameEn = "Costa Rica", nameRu = "Коста-Рика"),
    Country(code = "cu", nameEn = "Cuba", nameRu = "Куба"),
    Country(code = "cv", nameEn = "Cape Verde", nameRu = "Кабо-Верде"),
    Country(code = "cx", nameEn = "Christmas Island", nameRu = "Остров Рождества"),
    Country(code = "cy", nameEn = "Cyprus", nameRu = "Кипр"),
    Country(code = "cz", nameEn = "Czech Republic", nameRu = "Республика Чехия"),
    Country(code = "de", nameEn = "Germany", nameRu = "Германия"),
    Country(code = "dj", nameEn = "Djibouti", nameRu = "Джибути"),
    Country(code = "dk", nameEn = "Denmark", nameRu = "Дания"),
    Country(code = "dm", nameEn = "Dominica", nameRu = "Доминика"),
    Country(code = "do", nameEn = "Dominican Republic", nameRu = "Доминиканская Республика"),
    Country(code = "dz", nameEn = "Algeria", nameRu = "Алжир"),
    Country(code = "ec", nameEn = "Ecuador", nameRu = "Эквадор"),
    Country(code = "ee", nameEn = "Estonia", nameRu = "Эстония"),
    Country(code = "eg", nameEn = "Egypt", nameRu = "Египет"),
    Country(code = "eh", nameEn = "Western Sahara", nameRu = "Западная Сахара"),
    Country(code = "er", nameEn = "Eritrea", nameRu = "Эритрея"),
    Country(code = "es", nameEn = "Spain", nameRu = "Испания"),
    Country(code = "et", nameEn = "Ethiopia", nameRu = "Эфиопия"),
    Country(code = "fi", nameEn = "Finland", nameRu = "Финляндия"),
    Country(code = "fj", nameEn = "Fiji", nameRu = "Фиджи"),
    Country(code = "fk", nameEn = "Falkland Islands", nameRu = "Фолклендские острова"),
    Country(code = "fm", nameEn = "Micronesia", nameRu = "Микронезия"),
    Country(code = "fo", nameEn = "Faroe Islands", nameRu = "Фарерские острова"),
    Country(code = "fr", nameEn = "France", nameRu = "Франция"),
    Country(code = "ga", nameEn = "Gabon", nameRu = "Габон"),
    Country(code = "gb", nameEn = "Great Britain", nameRu = "Великобритания"),
    Country(code = "gd", nameEn = "Grenada", nameRu = "Гренада"),
    Country(code = "ge", nameEn = "Georgia", nameRu = "Грузия"),
    Country(code = "gf", nameEn = "French Guiana", nameRu = "Французская Гвиана"),
    Country(code = "gg", nameEn = "Guernsey", nameRu = "Гернси"),
    Country(code = "gh", nameEn = "Ghana", nameRu = "Гана"),
    Country(code = "gi", nameEn = "Gibraltar", nameRu = "Гибралтар"),
    Country(code = "gl", nameEn = "Greenland", nameRu = "Гренландия"),
    Country(code = "gm", nameEn = "Gambia", nameRu = "Гамбия"),
    Country(code = "gn", nameEn = "Guinea", nameRu = "Гвинея"),
    Country(code = "gp", nameEn = "Guadeloupe", nameRu = "Гваделупа"),
    Country(code = "gq", nameEn = "Equatorial Guinea", nameRu = "Экваториальная Гвинея"),
    Country(code = "gr", nameEn = "Greece", nameRu = "Греция"),
    Country(
        code = "gs",
        nameEn = "South Georgia & South Sandwich Islands",
        nameRu = "Южная Георгия и Южные Сандвичевы острова"
    ),
    Country(code = "gt", nameEn = "Guatemala", nameRu = "Гватемала"),
    Country(code = "gu", nameEn = "Guam", nameRu = "Гуам"),
    Country(code = "gw", nameEn = "Guinea-Bissau", nameRu = "Гвинея-Бисау"),
    Country(code = "gy", nameEn = "Guyana", nameRu = "Гайана"),
    Country(code = "hk", nameEn = "Hong Kong SAR China", nameRu = "Гонконг (САР Китай)"),
    Country(code = "hm", nameEn = "Heard & McDonald Islands", nameRu = "Острова Херд и Макдональд"),
    Country(code = "hn", nameEn = "Honduras", nameRu = "Гондурас"),
    Country(code = "hr", nameEn = "Croatia", nameRu = "Хорватия"),
    Country(code = "ht", nameEn = "Haiti", nameRu = "Гаити"),
    Country(code = "hu", nameEn = "Hungary", nameRu = "Венгрия"),
    Country(code = "id", nameEn = "Indonesia", nameRu = "Индонезия"),
    Country(code = "ie", nameEn = "Ireland", nameRu = "Ирландия"),
    Country(code = "il", nameEn = "Israel", nameRu = "Израиль"),
    Country(code = "im", nameEn = "Isle of Man", nameRu = "Остров Мэн"),
    Country(code = "in", nameEn = "India", nameRu = "Индия"),
    Country(
        code = "io",
        nameEn = "British Indian Ocean Territory",
        nameRu = "Британская территория Индийского океана"
    ),
    Country(code = "iq", nameEn = "Iraq", nameRu = "Ирак"),
    Country(code = "ir", nameEn = "Iran", nameRu = "Иран"),
    Country(code = "is", nameEn = "Iceland", nameRu = "Исландия"),
    Country(code = "it", nameEn = "Italy", nameRu = "Италия"),
    Country(code = "je", nameEn = "Jersey", nameRu = "Джерси"),
    Country(code = "jm", nameEn = "Jamaica", nameRu = "Ямайка"),
    Country(code = "jo", nameEn = "Jordan", nameRu = "Иордания"),
    Country(code = "jp", nameEn = "Japan", nameRu = "Япония"),
    Country(code = "ke", nameEn = "Kenya", nameRu = "Кения"),
    Country(code = "kg", nameEn = "Kyrgyzstan", nameRu = "Кыргызстан"),
    Country(code = "kh", nameEn = "Cambodia", nameRu = "Камбоджа"),
    Country(code = "ki", nameEn = "Kiribati", nameRu = "Кирибати"),
    Country(code = "km", nameEn = "Comoros", nameRu = "Коморские острова"),
    Country(code = "kn", nameEn = "Saint Kitts and Nevis", nameRu = "Сент-Китс и Невис"),
    Country(code = "kp", nameEn = "North Korea", nameRu = "Северная Корея"),
    Country(code = "kr", nameEn = "South Korea", nameRu = "Южная Корея"),
    Country(code = "kw", nameEn = "Kuwait", nameRu = "Кувейт"),
    Country(code = "ky", nameEn = "Cayman Islands", nameRu = "Каймановы острова"),
    Country(code = "kz", nameEn = "Kazakhstan", nameRu = "Казахстан"),
    Country(code = "la", nameEn = "Laos", nameRu = "Лаос"),
    Country(code = "lb", nameEn = "Lebanon", nameRu = "Ливан"),
    Country(code = "lc", nameEn = "Saint Lucia", nameRu = "Санкт-Люсия"),
    Country(code = "li", nameEn = "Liechtenstein", nameRu = "Лихтенштейн"),
    Country(code = "lk", nameEn = "Sri Lanka", nameRu = "Шри-Ланка"),
    Country(code = "lr", nameEn = "Liberia", nameRu = "Либерия"),
    Country(code = "ls", nameEn = "Lesotho", nameRu = "Лесото"),
    Country(code = "lt", nameEn = "Lithuania", nameRu = "Литва"),
    Country(code = "lu", nameEn = "Luxembourg", nameRu = "Люксембург"),
    Country(code = "lv", nameEn = "Latvia", nameRu = "Латвия"),
    Country(code = "ly", nameEn = "Libya", nameRu = "Ливия"),
    Country(code = "ma", nameEn = "Morocco", nameRu = "Марокко"),
    Country(code = "mc", nameEn = "Monaco", nameRu = "Монако"),
    Country(code = "md", nameEn = "Moldova", nameRu = "Молдова"),
    Country(code = "me", nameEn = "Montenegro", nameRu = "Черногория"),
    Country(code = "mf", nameEn = "Saint Martin", nameRu = "Сен-Мартен"),
    Country(code = "mg", nameEn = "Madagascar", nameRu = "Мадагаскар"),
    Country(code = "mh", nameEn = "Marshall Islands", nameRu = "Маршалловы острова"),
    Country(code = "mk", nameEn = "Macedonia", nameRu = "Македония"),
    Country(code = "ml", nameEn = "Mali", nameRu = "Мали"),
    Country(code = "mm", nameEn = "Myanmar (Burma)", nameRu = "Мьянма (Бирма)"),
    Country(code = "mn", nameEn = "Mongolia", nameRu = "Монголия"),
    Country(code = "mo", nameEn = "Macau SAR China", nameRu = "Макао САР Китай"),
    Country(
        code = "mp",
        nameEn = "Northern Mariana Islands",
        nameRu = "Северные Марианские острова"
    ),
    Country(code = "mq", nameEn = "Martinique", nameRu = "Мартиника"),
    Country(code = "mr", nameEn = "Mauritania", nameRu = "Мавритания"),
    Country(code = "ms", nameEn = "Montserrat", nameRu = "Монсеррат"),
    Country(code = "mt", nameEn = "Malta", nameRu = "Мальта"),
    Country(code = "mu", nameEn = "Mauritius", nameRu = "Маврикий"),
    Country(code = "mv", nameEn = "Maldives", nameRu = "Мальдивы"),
    Country(code = "mw", nameEn = "Malawi", nameRu = "Малави"),
    Country(code = "mx", nameEn = "Mexico", nameRu = "Мексика"),
    Country(code = "my", nameEn = "Malaysia", nameRu = "Малайзия"),
    Country(code = "mz", nameEn = "Mozambique", nameRu = "Мозамбик"),
    Country(code = "na", nameEn = "Namibia", nameRu = "Намибия"),
    Country(code = "nc", nameEn = "New Caledonia", nameRu = "Новая Каледония"),
    Country(code = "ne", nameEn = "Niger", nameRu = "Нигер"),
    Country(code = "nf", nameEn = "Norfolk Island", nameRu = "Остров Норфолк"),
    Country(code = "ng", nameEn = "Nigeria", nameRu = "Нигерия"),
    Country(code = "ni", nameEn = "Nicaragua", nameRu = "Никарагуа"),
    Country(code = "nl", nameEn = "Netherlands", nameRu = "Нидерланды"),
    Country(code = "no", nameEn = "Norway", nameRu = "Норвегия"),
    Country(code = "np", nameEn = "Nepal", nameRu = "Непал"),
    Country(code = "nr", nameEn = "Nauru", nameRu = "Науру"),
    Country(code = "nu", nameEn = "Niue", nameRu = "Ниуэ"),
    Country(code = "nz", nameEn = "New Zealand", nameRu = "Новая Зеландия"),
    Country(code = "om", nameEn = "Oman", nameRu = "Оман"),
    Country(code = "pa", nameEn = "Panama", nameRu = "Панама"),
    Country(code = "pe", nameEn = "Peru", nameRu = "Перу"),
    Country(code = "pf", nameEn = "French Polynesia", nameRu = "Французская Полинезия"),
    Country(code = "pg", nameEn = "Papua New Guinea", nameRu = "Папуа - Новая Гвинея"),
    Country(code = "ph", nameEn = "Philippines", nameRu = "Филиппины"),
    Country(code = "pk", nameEn = "Pakistan", nameRu = "Пакистан"),
    Country(code = "pl", nameEn = "Poland", nameRu = "Польша"),
    Country(code = "pm", nameEn = "Saint Pierre and Miquelon", nameRu = "Сен-Пьер и Микелон"),
    Country(code = "pn", nameEn = "Pitcairn Islands", nameRu = "Острова Питкэрн"),
    Country(code = "pr", nameEn = "Puerto Rico", nameRu = "Пуэрто-Рико"),
    Country(code = "ps", nameEn = "Palestinian Territories", nameRu = "территории Палестины"),
    Country(code = "pt", nameEn = "Portugal", nameRu = "Португалия"),
    Country(code = "pw", nameEn = "Palau", nameRu = "Палау"),
    Country(code = "py", nameEn = "Paraguay", nameRu = "Парагвай"),
    Country(code = "qa", nameEn = "Qatar", nameRu = "Катар"),
    Country(code = "ro", nameEn = "Romania", nameRu = "Румыния"),
    Country(code = "rs", nameEn = "Serbia", nameRu = "Сербия"),
    Country(code = "ru", nameEn = "Russia", nameRu = "Россия"),
    Country(code = "rw", nameEn = "Rwanda", nameRu = "Руанда"),
    Country(code = "sa", nameEn = "Saudi Arabia", nameRu = "Саудовская Аравия"),
    Country(code = "sb", nameEn = "Solomon Islands", nameRu = "Соломоновы острова"),
    Country(code = "sc", nameEn = "Seychelles", nameRu = "Сейшельские острова"),
    Country(code = "sd", nameEn = "Sudan", nameRu = "Судан"),
    Country(code = "se", nameEn = "Sweden", nameRu = "Швеция"),
    Country(code = "sg", nameEn = "Singapore", nameRu = "Сингапур"),
    Country(code = "sh", nameEn = "Saint Helena", nameRu = "Остров Святой Елены"),
    Country(code = "si", nameEn = "Slovenia", nameRu = "Словения"),
    Country(code = "sj", nameEn = "Svalbard and Jan Mayen", nameRu = "Шпицберген и Ян Майен"),
    Country(code = "sk", nameEn = "Slovakia", nameRu = "Словакия"),
    Country(code = "sl", nameEn = "Sierra Leone", nameRu = "Сьерра-Леоне"),
    Country(code = "sm", nameEn = "San Marino", nameRu = "Сан-Марино"),
    Country(code = "sn", nameEn = "Senegal", nameRu = "Сенегал"),
    Country(code = "so", nameEn = "Somalia", nameRu = "Сомали"),
    Country(code = "sr", nameEn = "Suriname", nameRu = "Суринам"),
    Country(code = "ss", nameEn = "South Sudan", nameRu = "Южный Судан"),
    Country(code = "sv", nameEn = "El Salvador", nameRu = "Сальвадор"),
    Country(code = "sx", nameEn = "Sint Maarten", nameRu = "Синт-Мартен"),
    Country(code = "sy", nameEn = "Syria", nameRu = "Сирия"),
    Country(code = "sz", nameEn = "Swaziland", nameRu = "Свазиленд"),
    Country(code = "tc", nameEn = "Turks and Caicos Islands", nameRu = "Острова Теркс и Кайкос"),
    Country(code = "td", nameEn = "Chad", nameRu = "Чад"),
    Country(
        code = "tf",
        nameEn = "French Southern Territories",
        nameRu = "Южные Французские Территории"
    ),
    Country(code = "tg", nameEn = "Togo", nameRu = "Того"),
    Country(code = "th", nameEn = "Thailand", nameRu = "Таиланд"),
    Country(code = "tj", nameEn = "Tajikistan", nameRu = "Таджикистан"),
    Country(code = "tk", nameEn = "Tokelau", nameRu = "Токелау"),
    Country(code = "tl", nameEn = "Timor-Leste", nameRu = "Тимор-Лешти"),
    Country(code = "tm", nameEn = "Turkmenistan", nameRu = "Туркменистан"),
    Country(code = "tn", nameEn = "Tunisia", nameRu = "Тунис"),
    Country(code = "to", nameEn = "Tonga", nameRu = "Тонга"),
    Country(code = "tr", nameEn = "Turkey", nameRu = "Турция"),
    Country(code = "tt", nameEn = "Trinidad and Tobago", nameRu = "Тринидад и Тобаго"),
    Country(code = "tv", nameEn = "Tuvalu", nameRu = "Тувалу"),
    Country(code = "tw", nameEn = "Taiwan", nameRu = "Тайвань"),
    Country(code = "tz", nameEn = "Tanzania", nameRu = "Танзания"),
    Country(code = "ua", nameEn = "Ukraine", nameRu = "Украина"),
    Country(code = "ug", nameEn = "Uganda", nameRu = "Уганда"),
    Country(code = "um", nameEn = "U.S. Outlying Islands", nameRu = "Внешние острова США"),
    Country(code = "us", nameEn = "USA", nameRu = "США"),
    Country(code = "uy", nameEn = "Uruguay", nameRu = "Уругвай"),
    Country(code = "uz", nameEn = "Uzbekistan", nameRu = "Узбекистан"),
    Country(code = "va", nameEn = "Vatican City", nameRu = "Ватикан"),
    Country(code = "vc", nameEn = "St. Vincent & Grenadines", nameRu = "Сент-Винсент и Гренадины"),
    Country(code = "ve", nameEn = "Venezuela", nameRu = "Венесуэла"),
    Country(
        code = "vg",
        nameEn = "British Virgin Islands",
        nameRu = "Британские Виргинские острова"
    ),
    Country(code = "vi", nameEn = "U.S. Virgin Islands", nameRu = "Виргинские острова США"),
    Country(code = "vn", nameEn = "Vietnam", nameRu = "Вьетнам"),
    Country(code = "vu", nameEn = "Vanuatu", nameRu = "Вануату"),
    Country(code = "wf", nameEn = "Wallis and Futuna", nameRu = "Уоллис и Футуна"),
    Country(code = "ws", nameEn = "Samoa", nameRu = "Самоа"),
    Country(code = "ye", nameEn = "Yemen", nameRu = "Йемен"),
    Country(code = "yt", nameEn = "Mayotte", nameRu = "Майотта"),
    Country(code = "za", nameEn = "South Africa", nameRu = "Южная Африка"),
    Country(code = "zm", nameEn = "Zambia", nameRu = "Замбия"),
    Country(code = "zw", nameEn = "Zimbabwe", nameRu = "Зимбабве")
)