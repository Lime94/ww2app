package inc.gradov.com.ww2history.chronology

import inc.gradov.com.ww2history.R
import inc.gradov.com.ww2history.chronology.model.ChronologyItemUiModel

class ChronologyData {


    val listOfDates = listOf(
            ChronologyItemUiModel(
                    dateFrom = "23 августа 1939 года",
                    title = "Пакт о ненападении",
                    images = getPaktONenapadenii(),
                    description = "Нацистская Германия и Советский Союз подписывают пакт о ненападении и секретное приложение к нему, по которому Европа разделяется на сферы влияния."
            ),
            ChronologyItemUiModel(
                    dateFrom = "1 сентября 1939 года",
                    title = "Начало войны",
                    images = getNachaloVoiny(),
                    description = "Германия вторгается в Польшу, начав Вторую мировую войну в Европе."
            ),
            ChronologyItemUiModel(
                    dateFrom = "3 сентября 1939 года",
                    title = "Союзники в войне",
                    images = getSoysnikiVoyne(),
                    description = "Выполняя свои обязательства перед Польшей, Великобритания и Франция объявляют войну Германии."
            ),
            ChronologyItemUiModel(
                    dateFrom = "17 сентября 1939 года",
                    title = "Вступление СССР",
                    images = getVtorgenieSSSRVPolshu(),
                    description = "Советский Союз вторгается в Польшу с востока."
            ),
            ChronologyItemUiModel(
                    dateFrom = "27-29 сентября 1939 года",
                    title = "Падение Варшавы",
                    images = getPadenieVarshavy(),
                    description = "27 сентября сдается Варшава. Польское правительство отправляется в изгнание через Румынию. Германия и Советский Союз делят Польшу между собой."
            ),
            ChronologyItemUiModel(
                    dateFrom = "30 ноября 1939 года",
                    dateTo = "12 марта 1940 года",
                    title = "Финская кампания",
                    images = getFinskayaKompania(),
                    description = "Советский Союз нападает на Финляндию, развязав так называемую Зимнюю войну. Финны просят о перемирии и вынуждены уступить Советскому Союзу Карельский перешеек и северный берег Ладожского озера."
            ),
            ChronologyItemUiModel(
                    dateFrom = "9 апреля 1940",
                    dateTo = "9 июня 1940 года",
                    title = "Путь на Скандинавию",
                    images = getBattleToSkandinavia(),
                    description = "Германия вторгается в Данию и Норвегию. Дания сдается в день нападения; Норвегия сопротивляется до 9 июня."
            ),
            ChronologyItemUiModel(
                    dateFrom = "10 мая",
                    dateTo = "22 июня 1940 года",
                    title = "Быстрый захват Европы",
                    images = getBystryiZahvatEurope(),
                    description = "Германия вторгается в западную Европу — Францию и нейтральные страны Бенилюкса. Люксембург оккупирован 10 мая; Нидерланды сдаются 14 мая; Бельгия — 28 мая. 22 июня Франция подписывает соглашение о перемирии, согласно которому германские войска оккупируют северную часть страны и все атлантическое побережье. В южной части Франции устанавливается коллаборационистский режим со столицей в городе Виши."
            ),
            ChronologyItemUiModel(
                    dateFrom = "10 июня 1940 года",
                    title = "Вступление Италии",
                    images = getVstyplenieItalii(),
                    description = "Италия вступает в войну. 21 июня Италия вторгается в южную Францию."
            ),
            ChronologyItemUiModel(
                    dateFrom = "28 июня 1940 года",
                    title = "Малой кровью",
                    images = getMaloyKroviy(),
                    description = "СССР принуждает Румынию уступить восточную область Бессарабии и северную половину Буковины Советской Украине."
            ),
            ChronologyItemUiModel(
                    dateFrom = "28 июня 1940 года",
                    dateTo = "6 августа 1940 года",
                    title = "Прибалтика",
                    images = getPribaltika(),
                    description = "14-18 июня Советский Союз оккупирует прибалтийские государства, 14-15 июля устраивает в каждом из них коммунистический переворот, а затем, 3-6 августа, присоединяет их в качестве Советских республик."
            ),
            ChronologyItemUiModel(
                    dateFrom = "10 июля",
                    dateTo = "31 октября 1940 года",
                    title = "Битва за Британию",
                    images = getBitvaZaBritaniu(),
                    description = "Война в воздухе против Англии, известная как Битва за Британию, кончается поражением нацистской Германии"
            ),
            ChronologyItemUiModel(
                    dateFrom = "30 августа 1940 года",
                    title = "Трансильвания",
                    images = getTransilvania(),
                    description = "Второй Венский арбитраж: Германия и Италия выносят решение разделить спорную Трансильванию между Румынией и Венгрией. Потеря северной Трансильвании приводит к тому, что румынский король Кароль II отрекается от престола в пользу своего сына Михая, а к власти приходит диктаторский режим генерала Иона Антонеску."
            ),
            ChronologyItemUiModel(
                    dateFrom = "13 сентября 1940 года",
                    title = "Война пришла в Африку",
                    images = getVoinaPrishlaVAfriku(),
                    description = "Итальянцы нападают на находящийся под контролем Британии Египет с территории управляемой ими самими Ливии"
            ),
            ChronologyItemUiModel(
                    dateFrom = "27 сентября 1940 года",
                    title = "Трехсторонний пакт",
                    images = getTrechstoronniyPakt(),
                    description = "Германия, Италия и Япония подписывают Трехсторонний пакт."
            ),
            ChronologyItemUiModel(
                    dateFrom = "Октябрь 1940 года",
                    title = "Бои в Греции",
                    images = getBoiVGrecii(),
                    description = "28 октября Италия вторгается в Грецию с территории Албании."
            ),
            ChronologyItemUiModel(
                    dateFrom = "Ноябрь 1940 года",
                    title = "Пополнение",
                    images = getPopolnenie(),
                    description = "К германской коалиции присоединяются Словакия (23 ноября), Венгрия (20 ноября) и Румыния (22 ноября)."
            ),
            ChronologyItemUiModel(
                    dateFrom = "Февраль 1941 года",
                    title = "Бои в Африке",
                    images = getBoiVAfrike(),
                    description = "Германия посылает в северную Африку свой Африканский корпус, чтобы поддержать нерешительно действующих итальянцев."
            ),
            ChronologyItemUiModel(
                    dateFrom = "1 марта 1941 года",
                    title = "Болгария",
                    images = getBolgaria(),
                    description = "Болгария присоединяется к \"Оси\"."
            ),
            ChronologyItemUiModel(
                    dateFrom = "6 апреля ",
                    dateTo = "июнь 1941 года",
                    title = "Балканы",
                    images = getBalkany(),
                    description = "Германия, Италия, Венгрия и Болгария вторгаются в Югославию и разделяют ее. 17 апреля Югославия капитулирует. Германия и Болгария нападают на Грецию, помогая итальянцам. Греция прекращает сопротивление в начале июня 1941 года."
            ),
            ChronologyItemUiModel(
                    dateFrom = "10 апреля 1941 года ",
                    title = "Хорватия",
                    images = getHorvatia(),
                    description = "Лидеры террористического движения усташей провозглашают так называемое Независимое государство Хорватия. Немедленно признанное Германией и Италией, новое государство включает в себя также Боснию и Герцеговину. Хорватия официально присоединяется к государствам \"Оси\" 15 июня 1941 года."
            ),
            ChronologyItemUiModel(
                    dateFrom = "22 июня",
                    dateTo = "ноябрь 1941 года",
                    title = "Великая Отечественная",
                    images = getVelikayaOtechestvennaya(),
                    description = "Нацистская Германия и ее союзники (за исключением Болгарии) нападают на Советский Союз. Финляндия, стремясь вернуть потерянные во время Зимней войны территории, присоединяется к \"Оси\" непосредственно перед вторжением. Немцы быстро захватывают прибалтийские государства и уже к сентябрю при поддержке присоединившихся финнов осаждают Ленинград (Санкт-Петербург). На центральном фронте германские войска в начале августа занимают Смоленск и к октябрю подходят к Москве. На юге германские и румынские войска в сентябре захватывают Киев, а в ноябре — Ростов-на-Дону."
            ),
            ChronologyItemUiModel(
                    dateFrom = "6 декабря 1941 года",
                    title = "Битва за Москву",
                    images = bitvaZaMoskvy(),
                    description = "Предпринятое Советским Союзом контрнаступление заставляет гитлеровцев в беспорядке отступить от Москвы"
            ),
            ChronologyItemUiModel(
                    dateFrom = "7 декабря 1941 года",
                    title = "Перл-Харбор",
                    images = getPerlHarbor(),
                    description = "Япония бомбит Перл-Харбор."
            ),
            ChronologyItemUiModel(
                    dateFrom = "8 декабря 1941 года",
                    title = "Вступление США",
                    images = vstuplenieSHA(),
                    description = "США объявляют войну Японии и вступают во Вторую мировую войну. Японские войска высаживаются на Филиппинах, во французском Индокитае (Вьетнам, Лаос, Камбоджа) и в британском Сингапуре. К апрелю 1942 года Филиппины, Индокитай и Сингапур оккупированы японцами."
            ),
            ChronologyItemUiModel(
                    dateFrom = "11-13 декабря 1941 года",
                    title = "Германия против США",
                    images = getGermaniaProtivSHA(),
                    description = "Нацистская Германия и ее союзники объявляют войну Соединенным Штатам."
            ),
            ChronologyItemUiModel(
                    dateFrom = "30 мая 1942 года",
                    dateTo = "май 1945 года",
                    title = "Бомбардировки Германии",
                    images = getBombardirovkaGermanii(),
                    description = "Британцы бомбят Кёльн, таким образом впервые перенеся военные действия на территорию самой Германии. В последующие три года англо-американская авиация почти полностью разрушает крупные города Германии."
            ),
            ChronologyItemUiModel(
                    dateFrom = "Июнь 1942 года ",
                    title = "Война в Тихом океане",
                    images = getVoinaVTihomOkeane(),
                    description = "Британские и американские военно-морские силы останавливают продвижение японского флота в центральной части Тихого океана возле островов Мидуэй."
            ),
            ChronologyItemUiModel(
                    dateFrom = "28 июня",
                    dateTo = "сентябрь 1942 года",
                    title = "Битва за Сталинград",
                    images = getBitvaZaStalingrad(),
                    description = "Германия и ее союзники предпринимают новое наступление в Советском Союзе. Германские войска к середине сентября пробиваются к Сталинграду (Волгограду) на Волге и вторгаются на Кавказ, предварительно захватив Крымский полуостров."
            ),
            ChronologyItemUiModel(
                    dateFrom = "август",
                    dateTo = "ноябрь 1942 года",
                    title = "Соломоновы острова",
                    images = getSolomonovyOstrova(),
                    description = "Американские войска останавливают продвижение японцев в сторону Австралии в битве на Гуадалканале (Соломоновы острова)."
            ),
            ChronologyItemUiModel(
                    dateFrom = "23-24 октября 1942 года",
                    title = "Битва в Египте",
                    images = getBitvaVEgipte(),
                    description = "Британская армия наносит поражение Германии и Италии в битве при Эль-Аламейне (Египет), принудив войска фашистского блока к беспорядочному отступлению через Ливию к восточной границе Туниса."
            ),
            ChronologyItemUiModel(
                    dateFrom = "8 ноября 1942 года",
                    title = "Алжир, Тунис, Морокко",
                    images = getAlgirTunisMoroko(),
                    description = "Американские и британские войска высаживаются в нескольких местах на побережье Алжира и Марокко во французской северной Африке. Неудачная попытка вишистской французской армии помешать вторжению позволяет Союзникам быстро достигнуть западной границы Туниса и приводит к тому, что 11 ноября Германия оккупирует южную Францию."
            ),
            ChronologyItemUiModel(
                    dateFrom = "23 ноября 1942 года ",
                    dateTo = "2 февраля 1943 года",
                    title = "Сталинградская битва",
                    images = getStaligradskayaBitva(),
                    description = "Советская армия контратакует, прорывает линии венгерских и румынских войск к северу и югу от Сталинграда и блокирует в городе германскую Шестую армию. Остатки Шестой армии, которой Гитлер запретил отступать или пытаться вырваться из окружения, капитулируют 30 января и 2 февраля 1943 года."
            ),
            ChronologyItemUiModel(
                    dateFrom = "13 мая 1943 года",
                    dateTo = "2 февраля 1943 года",
                    title = "Конец войны в Африке",
                    images = getKonecVoinyVAfrike(),
                    description = "Войска фашистского блока в Тунисе сдаются Союзникам, заканчивая этим североафриканскую кампанию"
            ),
            ChronologyItemUiModel(
                    dateFrom = "10 июля 1943 года",
                    title = "Сицилия",
                    images = getSicilia(),
                    description = "Американские и британские войска высаживаются на Сицилии. К середине августа Союзники берут Сицилию под свой контроль"
            ),
            ChronologyItemUiModel(
                    dateFrom = "5 июля 1943 года",
                    title = "Курская дуга",
                    images = getKurskayaDuga(),
                    description = "Германские войска предпринимают массированную танковую атаку под Курском. Советская армия в течение недели отражает атаку, а затем переходит в наступление."
            ),
            ChronologyItemUiModel(
                    dateFrom = "25 июля 1943 года ",
                    title = "Смещение итальянского лидера",
                    images = getSmechenieItalianskogoLidera(),
                    description = "Большой совет итальянской фашистской партии смещает Бенито Муссолини и поручает маршалу Пьетро Бадольо сформировать новое правительство"
            ),
            ChronologyItemUiModel(
                    dateFrom = "8 сентября 1943 года",
                    title = "Cнова в деле",
                    images = getSnovaVDele(),
                    description = "Новое правительство Италии безоговорочно капитулирует перед Союзниками. Германия немедленно захватывают контроль над Римом и северной Италией, установив марионеточный режим во главе с Муссолини, освобожденным из заключения германским диверсионным отрядом 12 сентября."
            ),
            ChronologyItemUiModel(
                    dateFrom = "9 сентября 1943 года",
                    title = "Битва за Неаполь",
                    images = getBitvaZaNeapol(),
                    description = "Союзные войска высаживаются на побережье Салерно возле Неаполя."
            ),
            ChronologyItemUiModel(
                    dateFrom = "6 ноября 1943 года",
                    title = "Освобождение Киева",
                    images = getOsvobogdenieKieva(),
                    description = "Советская армия освобождает Киев."
            ),
            ChronologyItemUiModel(
                    dateFrom = "22 января 1944 года",
                    title = "Схватка за Рим",
                    images = getShvatkaZaRim(),
                    description = "Союзные войска успешно высаживаются возле Анцио, чуть южнее Рима."
            ),
            ChronologyItemUiModel(
                    dateFrom = "19 марта 1944 года",
                    title = "Не так быстро, Венгрия",
                    images = getNeTakBystroVengria(),
                    description = "Предупреждая намерение Венгрии выйти из коалиции \"Оси\", Германия оккупирует Венгрию и заставляет ее правителя, адмирала Миклоша Хорти, назначить прогерманского премьер-министра."
            ),
            ChronologyItemUiModel(
                    dateFrom = "4 июня 1944 года",
                    title = "Рим освобожден",
                    images = getRimOsvobogden(),
                    description = "Союзные войска освобождают Рим. Англо-американские бомбардировщики впервые поражают цели, расположенные в восточной Германии; это продолжается шесть недель."
            ),
            ChronologyItemUiModel(
                    dateFrom = "4 июня 1944 года",
                    title = "День Д",
                    images = getDenD(),
                    description = "Британские и американские войска успешно высаживаются на побережье Нормандии (Франция), открыв Второй фронт против Германии."
            ),
            ChronologyItemUiModel(
                    dateFrom = "4 июня 1944 года",
                    title = "Молодость моя, Белоруссия",
                    images = getMolodostMoyaBelorussia(),
                    description = "Советские войска начинают массированное наступление в Белоруссии, уничтожив германскую армию группы \"Центр\", и к 1 августа направляются на запад, к Висле и Варшаве."
            ),
            ChronologyItemUiModel(
                    dateFrom = "25 июля 1944 года",
                    title = "На Париж",
                    images = getNaParis(),
                    description = "Англо-американская армия прорывается с плацдарма в Нормандии и движется на восток по направлению к Парижу."
            ),
            ChronologyItemUiModel(
                    dateFrom = "1 августа",
                    dateTo = "5 октября 1944 года",
                    title = "Армия Крайова",
                    images = getArmiaKrayova(),
                    description = "Польская антикоммунистическая Армия Крайова поднимает восстание против германского режима, пытаясь освободить Варшаву до подхода Советских войск. Продвижение советской армии приостанавливается на восточном берегу Вислы. 5 октября остатки сражавшейся в Варшаве Армии Крайовы сдаются немцам."
            ),
            ChronologyItemUiModel(
                    dateFrom = "15 августа 1944 года",
                    title = "Переправа на Рейне",
                    images = getPerepravaNaReine(),
                    description = "Союзные войска высаживаются в южной Франции недалеко от Ниццы и быстро движутся на северо-восток, к Рейну."
            ),
            ChronologyItemUiModel(
                    dateFrom = "20-25 августа 1944 года",
                    title = "Париж освобожден",
                    images = getParisOsvobogden(),
                    description = "Союзные войска достигают Парижа. 25 августа Французская Свободная армия при поддержке Союзных войск вступает в Париж. К сентябрю Союзники достигают германской границы; к декабрю практически вся Франция, большая часть Бельгии и часть южных Нидерландов освобождены."
            ),
            ChronologyItemUiModel(
                    dateFrom = "23 августа 1944 года",
                    title = "Аннотеску, Балканы, Греция",
                    images = getAntoneskuBalkanyGrecia(),
                    description = "Появление Советской армии на реке Прут побуждает румынскую оппозицию свергнуть режим Антонеску. Новое правительство заключает перемирие и незамедлительно переходит на сторону Союзников. Такой поворот румынской политики заставляет Болгарию сдаться 8 сентября, а Германию — покинуть территорию Греции, Албании и южной Югославии в октябре."
            ),
            ChronologyItemUiModel(
                    dateFrom = "29 августа",
                    dateTo = "27 октября 1944 года",
                    title = "Подавление бунта в Словакии",
                    images = getPodavlenieBuntaVSlovakii(),
                    description = "Подпольные отряды словацкого Сопротивления под руководством Словацкого национального совета, в который входят как коммунисты, так и антикоммунисты, поднимают восстание против германских властей и местного фашистского режима. 27 октября немцы захватывают город Банска Бистрица, где находится штаб восставших, и подавляют организованное сопротивление."
            ),
            ChronologyItemUiModel(
                    dateFrom = "12 сентября 1944 года",
                    title = "Конец финской войны",
                    images = getKonecFinskoyVoiny(),
                    description = "Финляндия заключает перемирие с Советским Союзом и выходит из коалиции \"Оси\"."
            ),
            ChronologyItemUiModel(
                    dateFrom = "20 октября 1944 года",
                    title = "Филлипины",
                    images = getFillipiny(),
                    description = "Американские войска высаживаются на Филиппинах."
            ),
            ChronologyItemUiModel(
                    dateFrom = "15 октября 1944 года",
                    title = "Скрещенные стрелы",
                    images = getSkrechenniyStrely(),
                    description = "Венгерская фашистская партия \"Скрещённые стрелы\" совершает прогерманский государственный переворот, чтобы помешать венгерскому правительству начать с Советским Союзом переговоры о капитуляции."
            ),
            ChronologyItemUiModel(
                    dateFrom = "16 декабря 1944 года",
                    title = "Арденская операция",
                    images = getArdenskayaOperacia(),
                    description = "Германия предпринимает на западном фронте последнее наступление, известное как Арденнское сражение, пытаясь отвоевать Бельгию и разделить силы Союзников, размещенные вдоль германской границы. К 1 января 1945 года немцы вынуждены отступить."
            ),
            ChronologyItemUiModel(
                    dateFrom = "12 января 1945 года",
                    title = "СССР освобождает восточную Европу",
                    images = getSssrOsvobogdaetVostochnuyEvropu(),
                    description = "Советская армия предпринимает новое наступление: в январе освобождает Варшаву и Краков; 13 февраля, после двухмесячной осады, захватывает Будапешт; в начале апреля выгоняет из Венгрии немцев и венгерских коллаборационистов; взяв 4 апреля Братиславу, заставляет капитулировать Словакию; 13 апреля вступает в Вену."
            ),
            ChronologyItemUiModel(
                    dateFrom = "7 марта 1945 года",
                    title = "За Рейн",
                    images = getZaRein(),
                    description = "Американские войска пересекают Рейн под Ремагеном"
            ),
            ChronologyItemUiModel(
                    dateFrom = "16 апреля 1945 года",
                    title = "На Берлин!",
                    images = getNaBerlin(),
                    description = "Советские войска переходят в решающее наступление, окружив Берлин"
            ),
            ChronologyItemUiModel(
                    dateFrom = "Апрель 1945 года",
                    title = "Свержение усташей",
                    images = getSvergenieUstashey(),
                    description = "Партизанские отряды под руководством лидера югославских коммунистов Иосипа Броз Тито захватывают Загреб и свергают режим усташей. Руководители партии усташей бегут в Италию и Австрию."
            ),
            ChronologyItemUiModel(
                    dateFrom = "30 апреля 1945 года",
                    title = "Гитлер мертв",
                    images = getHitlerMertv(),
                    description = "Гитлер совершает самоубийство"
            ),
            ChronologyItemUiModel(
                    dateFrom = "7 мая 1945 года",
                    title = "Безоговорочная капитуляция",
                    images = getBezogovorochnayaKapitulacia(),
                    description = "Германия капитулирует перед западными Союзниками."
            ),
            ChronologyItemUiModel(
                    dateFrom = "9 мая 1945 года",
                    title = "Подписание капитуляции",
                    images = getPodpisanieKapitulacii(),
                    description = "Германия капитулирует перед Советским Союзом"
            ),
            ChronologyItemUiModel(
                    dateFrom = "Май 1945 года",
                    title = "Японские воды",
                    images = getJapanVody(),
                    description = "Союзные войска захватывают Окинаву, последний остров на пути к Японскому архипелагу"
            ),
            ChronologyItemUiModel(
                    dateFrom = "6 августа 1945 года",
                    title = "Атомная война",
                    images = getAtomnayaVoina(),
                    description = "Соединенные Штаты сбрасывают атомную бомбу на Хиросиму."
            ),
            ChronologyItemUiModel(
                    dateFrom = "8 августа 1945 года",
                    title = "СССР в Японии",
                    images = getSSSRvJapan(),
                    description = "Советский Союз объявляет войну Японии и вторгается в Манчжурию."
            ),
            ChronologyItemUiModel(
                    dateFrom = "9 августа 1945 года",
                    title = "Атомное безумие",
                    images = getAtomnoyeBezumie(),
                    description = "Соединенные Штаты сбрасывают атомную бомбу на Нагасаки."
            ),
            ChronologyItemUiModel(
                    dateFrom = "2 сентября 1945 года",
                    title = "Конец",
                    images = getKonec(),
                    description = "Япония, согласившаяся на условия безоговорочной капитуляции еще 14 августа 1945 года, официально капитулирует, тем самым поставив точку во Второй мировой войне."
            )
    )

    private fun getPadenieVarshavy(): List<Int>? {
        return listOf(
                R.drawable.padenie_varsavy_1,
                R.drawable.padenie_varsavy_2
        )
    }

    private fun getVtorgenieSSSRVPolshu(): List<Int>? {
        return listOf(
                R.drawable.vtorgenie_sssr_1,
                R.drawable.vtorgenie_sssr_2
        )
    }

    private fun getBattleToSkandinavia(): List<Int>? {
        return listOf(
                R.drawable.put_na_skandinaviu_2,
                R.drawable.put_na_skandinaviu_3
        )
    }

    private fun getFinskayaKompania(): List<Int>? {
        return listOf(
                R.drawable.finskaya_voina_1,
                R.drawable.finskaya_voina_2,
                R.drawable.finskaya_voina_3
        )
    }

    private fun getBystryiZahvatEurope(): List<Int>? {
        return listOf(
                R.drawable.bystri_zahvat_europe_1,
                R.drawable.bystri_zahvat_europe_2,
                R.drawable.bystri_zahvat_europe_4
        )
    }

    private fun getMaloyKroviy(): List<Int>? {
        return null
    }

    private fun getVstyplenieItalii(): List<Int>? {
        return listOf(
                R.drawable.vstuplenie_italii_1,
                R.drawable.vstuplenie_italii_2,
                R.drawable.vstuplenie_italii_3
        )
    }

    private fun getPribaltika(): List<Int>? {
        return listOf(
                R.drawable.pribaltika_1,
                R.drawable.pribaltika_2,
                R.drawable.pribaltika_3,
                R.drawable.pribaltika_4
        )
    }

    private fun getBitvaZaBritaniu(): List<Int>? {
        return listOf(
                R.drawable.bitva_za_britaniu_2,
                R.drawable.bitva_za_britaniu_3,
                R.drawable.bitva_za_britaniu_4,
                R.drawable.bitva_za_britaniu_5
        )
    }

    private fun getTrechstoronniyPakt(): List<Int>? {
        return listOf(
                R.drawable.trehstoronniy_pakt_1,
                R.drawable.trehstoronniy_pakt_3
        )
    }

    private fun getTransilvania(): List<Int>? {
        return null
    }

    private fun getPopolnenie(): List<Int>? {
        return null
    }

    private fun getBoiVGrecii(): List<Int>? {
        return listOf(
                R.drawable.boi_v_grecii_1,
                R.drawable.boi_v_grecii_2,
                R.drawable.boi_v_grecii_3
        )
    }

    private fun getBolgaria(): List<Int>? {
        return listOf(
                R.drawable.bolgaria_1
        )
    }

    private fun getHorvatia(): List<Int>? {
        return listOf(
                R.drawable.chorvatia_1,
                R.drawable.chorvatia_2,
                R.drawable.chorvatia_3
        )
    }

    private fun getVoinaPrishlaVAfriku(): List<Int>? {
        return listOf(
                R.drawable.voina_prishla_v_afriku_1,
                R.drawable.voina_prishla_v_afriku_2
        )
    }

    private fun getBoiVAfrike(): List<Int>? {
        return null
    }

    private fun getBalkany(): List<Int>? {
        return listOf(
                R.drawable.balkany_1,
                R.drawable.balkany_2
        )
    }

    private fun getVelikayaOtechestvennaya(): List<Int>? {
        return listOf(
                R.drawable.velikaya_otechesvennaya_1,
                R.drawable.velikaya_otechesvennaya_2,
                R.drawable.velikaya_otechesvennaya_3,
                R.drawable.velikaya_otechesvennaya_4
        )
    }

    private fun bitvaZaMoskvy(): List<Int>? {
        return listOf(
                R.drawable.bitva_za_moskvy_1,
                R.drawable.bitva_za_moskvy_2,
                R.drawable.bitva_za_moskvy_3,
                R.drawable.bitva_za_moskvy_5,
                R.drawable.bitva_za_moskvy_6,
                R.drawable.bitva_za_moskvy_7,
                R.drawable.bitva_za_moskvy_8
        )
    }

    private fun getPerlHarbor(): List<Int>? {
        return listOf(
                R.drawable.perl_harbor_1,
                R.drawable.perl_harbor_2,
                R.drawable.perl_harbor_3,
                R.drawable.perl_harbor_4,
                R.drawable.perl_harbor_5
        )
    }

    private fun vstuplenieSHA(): List<Int>? {
        return listOf(
                R.drawable.vstuplenie_ssha_1
        )
    }

    private fun getGermaniaProtivSHA(): List<Int>? {
        return null
    }

    private fun getBombardirovkaGermanii(): List<Int>? {
        return listOf(
                R.drawable.bombardirovki_germanii_1,
                R.drawable.bombardirovki_germanii_2
        )
    }

    private fun getVoinaVTihomOkeane(): List<Int>? {
        return listOf(
                R.drawable.voina_v_tihom_okeane_1,
                R.drawable.voina_v_tihom_okeane_2
        )
    }

    private fun getBitvaZaStalingrad(): List<Int>? {
        return listOf(
                R.drawable.bitva_za_stalingrad_1,
                R.drawable.bitva_za_stalingrad_2
        )
    }

    private fun getBitvaVEgipte(): List<Int>? {
        return listOf(
                R.drawable.bitva_v_egipte_1,
                R.drawable.bitva_v_egipte_2
        )
    }

    private fun getSolomonovyOstrova(): List<Int>? {
        return null
    }

    private fun getStaligradskayaBitva(): List<Int>? {
        return listOf(
                R.drawable.stalingradkaya_bitva_2,
                R.drawable.stalingradkaya_bitva_3,
                R.drawable.stalingradkaya_bitva_4,
                R.drawable.stalingradkaya_bitva_5,
                R.drawable.stalingradkaya_bitva_6
        )
    }

    private fun getAlgirTunisMoroko(): List<Int>? {
        return null
    }

    private fun getKonecVoinyVAfrike(): List<Int>? {
        return null
    }

    private fun getSicilia(): List<Int>? {
        return listOf(
                R.drawable.sicilia_2,
                R.drawable.sicilia_3,
                R.drawable.sicilia_4
        )
    }

    private fun getKurskayaDuga(): List<Int>? {
        return listOf(
                R.drawable.kurskaya_duga_1,
                R.drawable.kurskaya_duga_2,
                R.drawable.kurskaya_duga_3,
                R.drawable.kurskaya_duga_4,
                R.drawable.kurskaya_duga_5
        )
    }

    private fun getSmechenieItalianskogoLidera(): List<Int>? {
        return listOf(
                R.drawable.smechenie_italianca_1
        )
    }


    private fun getSnovaVDele(): List<Int>? {
        return listOf(
                R.drawable.snova_v_dele_1,
                R.drawable.snova_v_dele_2,
                R.drawable.snova_v_dele_3
        )
    }

    private fun getBitvaZaNeapol(): List<Int>? {
        return listOf(
                R.drawable.bitva_za_neapol_1,
                R.drawable.bitva_za_neapol_2,
                R.drawable.bitva_za_neapol_3
        )
    }


    private fun getOsvobogdenieKieva(): List<Int>? {
        return listOf(
                R.drawable.osvobogdenie_kieva_1
        )
    }

    private fun getShvatkaZaRim(): List<Int>? {
        return listOf(
                R.drawable.shvatka_za_rim_1,
                R.drawable.shvatka_za_rim_2,
                R.drawable.shvatka_za_rim_3,
                R.drawable.shvatka_za_rim_4
        )
    }

    private fun getNeTakBystroVengria(): List<Int>? {
        return null
    }

    private fun getRimOsvobogden(): List<Int>? {
        return listOf(
                R.drawable.rim_osvobogden_1
        )
    }

    private fun getDenD(): List<Int>? {
        return listOf(
                R.drawable.den_d_1,
                R.drawable.den_d_2,
                R.drawable.den_d_3,
                R.drawable.den_d_5,
                R.drawable.den_d_7
        )
    }

    private fun getMolodostMoyaBelorussia(): List<Int>? {
        return listOf(
                R.drawable.molodost_moya_1,
                R.drawable.molodost_moya_2,
                R.drawable.molodost_moya_3,
                R.drawable.molodost_moya_4
        )
    }

    private fun getNaParis(): List<Int>? {
        return listOf(
                R.drawable.na_paris_1,
                R.drawable.na_paris_3,
                R.drawable.na_paris_4,
                R.drawable.na_paris_5
        )
    }

    private fun getArmiaKrayova(): List<Int>? {
        return listOf(

        )
    }

    private fun getParisOsvobogden(): List<Int>? {
        return listOf(
                R.drawable.paris_osvobogden_1,
                R.drawable.paris_osvobogden_2
        )
    }

    private fun getAntoneskuBalkanyGrecia(): List<Int>? {
        return listOf(
                R.drawable.antonesky_1
        )
    }

    private fun getPodavlenieBuntaVSlovakii(): List<Int>? {
        return listOf(
                R.drawable.podavlenie_v_slovakii_1
        )
    }

    private fun getPerepravaNaReine(): List<Int>? {
        return null
    }

    private fun getKonecFinskoyVoiny(): List<Int>? {
        return listOf(
                R.drawable.konec_finskoy_voiny_1,
                R.drawable.konec_finskoy_voiny_3,
                R.drawable.konec_finskoy_voiny_4
        )
    }

    private fun getFillipiny(): List<Int>? {
        return listOf(
                R.drawable.philipinnes_1
        )
    }

    private fun getSkrechenniyStrely(): List<Int>? {
        return listOf(
                R.drawable.skrechennye_strely_1
        )
    }

    private fun getArdenskayaOperacia(): List<Int>? {
        return listOf(
                R.drawable.ardenskaya_operacia_1,
                R.drawable.ardenskaya_operacia_2,
                R.drawable.ardenskaya_operacia_3
        )
    }

    private fun getSssrOsvobogdaetVostochnuyEvropu(): List<Int>? {
        return listOf(
                R.drawable.sssr_osbogdaet_vostochnuy_europu_1,
                R.drawable.sssr_osbogdaet_vostochnuy_europu_2,
                R.drawable.sssr_osbogdaet_vostochnuy_europu_3,
                R.drawable.sssr_osbogdaet_vostochnuy_europu_4,
                R.drawable.sssr_osbogdaet_vostochnuy_europu_5,
                R.drawable.sssr_osbogdaet_vostochnuy_europu_6
        )
    }

    private fun getZaRein(): List<Int>? {
        return listOf(
                R.drawable.za_rein_1,
                R.drawable.za_rein_2,
                R.drawable.za_rein_3
        )
    }

    private fun getNaBerlin(): List<Int>? {
        return listOf(
                R.drawable.na_berlin_1,
                R.drawable.na_berlin_2,
                R.drawable.na_berlin_3
        )
    }

    private fun getSvergenieUstashey(): List<Int>? {
        return null
    }

    private fun getHitlerMertv(): List<Int>? {
        return listOf(
                R.drawable.hitler_mertv_1,
                R.drawable.hitler_mertv_2,
                R.drawable.hitler_mertv_3
        )
    }

    private fun getBezogovorochnayaKapitulacia(): List<Int>? {
        return null
    }

    private fun getPodpisanieKapitulacii(): List<Int>? {
        return listOf(
                R.drawable.podpisanie_kapitulacii_1,
                R.drawable.podpisanie_kapitulacii_2,
                R.drawable.podpisanie_kapitulacii_3,
                R.drawable.podpisanie_kapitulacii_4
        )
    }

    private fun getJapanVody(): List<Int>? {
        return listOf(
                R.drawable.japan_vody_1,
                R.drawable.japan_vody_3
        )
    }

    private fun getAtomnayaVoina(): List<Int>? {
        return listOf(
                R.drawable.atomnaya_voina_1,
                R.drawable.atomnaya_voina_2,
                R.drawable.atomnaya_voina_3
        )
    }

    private fun getSSSRvJapan(): List<Int>? {
        return listOf(
                R.drawable.sssr_v_japonii_1,
                R.drawable.sssr_v_japonii_2,
                R.drawable.sssr_v_japonii_3
        )
    }

    private fun getAtomnoyeBezumie(): List<Int>? {
        return listOf(
                R.drawable.atomnoye_bezumie_1,
                R.drawable.atomnoye_bezumie_3,
                R.drawable.atomnoye_bezumie_4
        )
    }

    private fun getKonec(): List<Int>? {
        return listOf(
                R.drawable.konec_1,
                R.drawable.konec_2
        )
    }

    private fun getPaktONenapadenii(): List<Int> {
        return listOf(
                R.drawable.pakt1,
                R.drawable.pakt2,
                R.drawable.pakt3
        )
    }

    private fun getNachaloVoiny(): List<Int> {
        return listOf(
                R.drawable.nachalo_voiny
        )
    }

    private fun getSoysnikiVoyne(): List<Int> {
        return listOf(
                R.drawable.soysnikivvoyne1,
                R.drawable.soysnikivvoyne2,
                R.drawable.soysnikivvoyne3
        )
    }
}