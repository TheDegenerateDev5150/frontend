package navigation

import play.api.libs.json.{JsValue, Json, OWrites}
import common.Edition
import play.api.libs.json.Json.toJson

object NavLinks {

  /* NEWS */
  val science = NavLink("Science", "/science")
  val tech = NavLink("Tech", "/technology")
  val usTech = NavLink("Tech", "/us/technology")
  val politics = NavLink("UK politics", "/politics")
  val media = NavLink("Media", "/media")
  val globalDevelopment = NavLink("Global development", "/global-development")
  val australiaNews = NavLink("Australia", "/australia-news", longTitle = Some("Australia news"))
  val auPolitics = NavLink("AU politics", "/australia-news/australian-politics", longTitle = Some("Politics"))
  val auImmigration = NavLink("Immigration", "/australia-news/australian-immigration-and-asylum")
  val indigenousAustralia = NavLink("Indigenous Australia", "/australia-news/indigenous-australians")
  val usNews = NavLink("US news", "/us-news", longTitle = Some("US news"))
  val usPolitics = NavLink("US politics", "/us-news/us-politics")
  val usImmigration = NavLink("US immigration", "/us-news/usimmigration")

  val education = {
    val teachers = NavLink("Teachers", "/teacher-network")
    val universities = NavLink("Universities", "/education/universities")
    val schools = NavLink("Schools", "/education/schools")
    val students = NavLink("Students", "/education/students")
    NavLink("Education", "/education", children = List(schools, teachers, universities, students))
  }

  val society = NavLink("Society", "/society")
  val law = NavLink("Law", "/law")
  val scotland = NavLink("Scotland", "/uk/scotland")
  val wales = NavLink("Wales", "/uk/wales")
  val northernIreland = NavLink("Northern Ireland", "/uk/northernireland")
  val europe = NavLink("Europe", "/world/europe-news")
  val americas = NavLink("Americas", "/world/americas")
  val asia = NavLink("Asia", "/world/asia")
  val africa = NavLink("Africa", "/world/africa")
  val middleEast = NavLink("Middle East", "/world/middleeast")
  val economics = NavLink("Economics", "/business/economics")
  val inequality = NavLink("Inequality", "/inequality")
  val banking = NavLink("Banking", "/business/banking")
  val retail = NavLink("Retail", "/business/retail")
  val markets = NavLink("Markets", "/business/stock-markets")
  val ukraine = NavLink("Ukraine", "/world/ukraine")
  val businessToBusiness = NavLink("B2B", "/business-to-business")
  val diversityEquality = NavLink("Diversity & equality in business", "/business/diversity-and-equality")
  val smallBusiness = NavLink("Small business", "/business/us-small-business")
  val projectSyndicate = NavLink("Project Syndicate", "/business/series/project-syndicate-economists")
  val climateCrisis = NavLink("Climate crisis", "/environment/climate-crisis")
  val wildlife = NavLink("Wildlife", "/environment/wildlife")
  val energy = NavLink("Energy", "/environment/energy")
  val pollution = NavLink("Pollution", "/environment/pollution")
  val biodiversity = NavLink("Biodiversity", "/environment/biodiversity")
  val oceans = NavLink("Oceans", "/environment/oceans")
  val greatBarrierReef = NavLink("Great Barrier Reef", "/environment/great-barrier-reef")
  val property = NavLink("Property", "/money/property")
  val pensions = NavLink("Pensions", "/money/pensions")
  val savings = NavLink("Savings", "/money/savings")
  val borrowing = NavLink("Borrowing", "/money/debt")
  val careers = NavLink("Careers", "/money/work-and-careers")
  val obituaries = NavLink("Obituaries", "/obituaries")
  val greenLight = NavLink("Green light", "/environment/series/green-light")
  val ukNews = NavLink(
    "UK",
    "/uk-news",
    longTitle = Some("UK news"),
    children = List(politics, education, media, society, law, scotland, wales, northernIreland),
  )
  val world = NavLink(
    "World",
    "/world",
    longTitle = Some("World news"),
    children = List(europe, usNews, americas, asia, australiaNews, middleEast, africa, inequality, globalDevelopment),
  )
  val ukEnvironment =
    NavLink("Environment", "/environment", children = List(climateCrisis, wildlife, energy, pollution))
  val auEnvironment = ukEnvironment.copy(children =
    List(climateCrisis, energy, wildlife, biodiversity, oceans, pollution, greatBarrierReef),
  )

  val usEnvironment =
    NavLink("Environment", "/us/environment", children = List(climateCrisis, wildlife, energy, pollution, greenLight))

  val money = NavLink("Money", "/money", children = List(property, pensions, savings, borrowing, careers))
  val ukBusiness = NavLink(
    "Business",
    "/business",
    children = List(economics, banking, money, markets, projectSyndicate, businessToBusiness, retail),
  )

  val usBusiness = NavLink(
    "Business",
    "/us/business",
    children = List(economics, diversityEquality, smallBusiness, retail),
  )

  val auBusiness = ukBusiness.copy(children = List(markets, money, projectSyndicate, retail))

  /* OPINION */
  val columnists = NavLink("Columnists", "/index/contributors")
  val auColumnists = NavLink("Columnists", "/au/index/contributors")
  val theGuardianView = NavLink("The Guardian view", "/profile/editorial")
  val cartoons = NavLink("Cartoons", "/tone/cartoons")
  val opinionVideos = NavLink("Opinion videos", "/type/video+tone/comment")
  val letters = NavLink("Letters", "/tone/letters")

  /* SPORT */

  private val footballWomenEuro2025 =
    NavLink("Euro 2025", "/football/women-s-euro-2025", Some("football/women-s-euro-2025"))
  private val footballScores = NavLink("Live scores", "/football/live", Some("football/live"))
  private val footballTables = NavLink("Tables", "/football/tables", Some("football/tables"))
  private val footballFixtures = NavLink("Fixtures", "/football/fixtures", Some("football/fixtures"))
  private val footballResults = NavLink("Results", "/football/results", Some("football/results"))
  private val footballCompetitions = NavLink("Competitions", "/football/competitions", Some("football/competitions"))
  private val footballClubs = NavLink("Clubs", "/football/teams", Some("football/teams"))

  private val soccerSchedules = footballFixtures.copy(title = "Schedules")

  val football = NavLink(
    "Football",
    "/football",
    children = List(
      footballWomenEuro2025,
      footballScores,
      footballTables,
      footballFixtures,
      footballResults,
      footballCompetitions,
      footballClubs,
    ),
  )
  val usSoccer = NavLink(
    "Soccer",
    "/us/soccer",
    children = List(
      footballScores,
      footballTables,
      soccerSchedules,
      footballResults,
      footballCompetitions,
      footballClubs,
    ),
  )
  val cricket = NavLink("Cricket", "/sport/cricket")
  val cycling = NavLink("Cycling", "/sport/cycling")
  val rugbyUnion = NavLink("Rugby union", "/sport/rugby-union")
  val formulaOne = NavLink("F1", "/sport/formulaone")
  val tennis = NavLink("Tennis", "/sport/tennis")
  val golf = NavLink("Golf", "/sport/golf")
  val boxing = NavLink("Boxing", "/sport/boxing")
  val usSports = NavLink("US sports", "/sport/us-sport")
  val racing = NavLink("Racing", "/sport/horse-racing")
  val rugbyLeague = NavLink("Rugby league", "/sport/rugbyleague")
  val AFL = NavLink("AFL", "/sport/afl")
  val NRL = NavLink("NRL", "/sport/nrl")
  val aLeague = NavLink("A-League", "/football/a-league")
  val NFL = NavLink("NFL", "/sport/nfl")
  val MLS = NavLink("MLS", "/football/mls")
  val MLB = NavLink("MLB", "/sport/mlb")
  val NBA = NavLink("NBA", "/sport/nba")
  val NHL = NavLink("NHL", "/sport/nhl")
  val WNBA = NavLink("WNBA", "/sport/wnba")

  /* CULTURE */
  val film = NavLink("Film", "/film")
  val tvAndRadio = NavLink("TV & radio", "/tv-and-radio")
  val music = NavLink("Music", "/music")
  val games = NavLink("Games", "/games")
  val books = NavLink("Books", "/books")
  val artAndDesign = NavLink("Art & design", "/artanddesign")
  val stage = NavLink("Stage", "/stage")
  val classical = NavLink("Classical", "/music/classicalmusicandopera")

  /* LIFE */
  val fashion = NavLink("Fashion", "/fashion")
  val fashionAu = NavLink("Fashion", "/au/lifeandstyle/fashion")
  val theFilterUk = NavLink("The Filter", "/uk/thefilter")
  val food = NavLink("Food", "/food")
  val foodAu = NavLink("Food", "/au/food")
  val relationshipsAu = NavLink("Relationships", "/au/lifeandstyle/relationships")
  val loveAndSex = NavLink("Love & sex", "/lifeandstyle/love-and-sex")
  val family = NavLink("Family", "/lifeandstyle/family")
  val beauty = NavLink("Beauty", "/fashion/beauty")
  val cars = NavLink("Cars", "/technology/motoring")
  val home = NavLink("Home & garden", "/lifeandstyle/home-and-garden")
  val health = NavLink("Health & fitness", "/lifeandstyle/health-and-wellbeing")
  val healthAu = NavLink("Health & fitness", "/au/lifeandstyle/health-and-wellbeing")
  val healthNewsAu = NavLink("Health", "/australia-news/health")
  val women = NavLink("Women", "/lifeandstyle/women")
  val men = NavLink("Men", "/lifeandstyle/men")
  val recipes = NavLink("Recipes", "/tone/recipes")
  val travelUk = NavLink("UK", "/travel/uk")
  val travelEurope = NavLink("Europe", "/travel/europe")
  val travelUs = NavLink("US", "/travel/usa")
  val travelAustralasia = NavLink("Australasia", "/travel/australasia")
  val travelAsia = NavLink("Asia", "/travel/asia")
  val ukTravel = NavLink("Travel", "/travel", children = List(travelUk, travelEurope, travelUs))
  val usTravel = ukTravel.copy(children = List(travelUs, travelEurope, travelUk))
  val auTravel = ukTravel.copy(children = List(travelAustralasia, travelAsia, travelUk, travelEurope, travelUs))
  val usWellness = NavLink("Wellness", "/us/wellness")

  val todaysPaper = NavLink(
    "Today's paper",
    "/theguardian",
    children = List(
      NavLink("Obituaries", "/obituaries"),
      NavLink("G2", "/theguardian/g2"),
      NavLink("Journal", "/theguardian/journal"),
      NavLink("Saturday", "/theguardian/saturday"),
    ),
  )
  val insideTheGuardian = NavLink("Inside the Guardian", "https://www.theguardian.com/insidetheguardian")
  val weekly = NavLink("Guardian Weekly", "https://www.theguardian.com/weekly")
  val digitalNewspaperArchive = NavLink("Digital Archive", "https://theguardian.newspapers.com")
  val crosswords = NavLink(
    "Crosswords",
    "/crosswords",
    children = List(
      NavLink("Blog", "/crosswords/crossword-blog"),
      NavLink("Quick", "/crosswords/series/quick"),
      NavLink("Sunday quick", "/crosswords/series/sunday-quick"),
      NavLink("Quick cryptic", "/crosswords/series/quick-cryptic"),
      NavLink("Quiptic", "/crosswords/series/quiptic"),
      NavLink("Cryptic", "/crosswords/series/cryptic"),
      NavLink("Prize", "/crosswords/series/prize"),
      NavLink("Genius", "/crosswords/series/genius"),
      NavLink("Weekend", "/crosswords/series/weekend-crossword"),
      NavLink("Special", "/crosswords/series/special"),
    ),
  )
  val wordiply = NavLink(
    "Wordiply",
    "https://www.wordiply.com",
  )
  val corrections = NavLink("Corrections", "/theguardian/series/corrections-and-clarifications")
  val video = NavLink("Video", "/video")
  val podcasts = NavLink("Podcasts", "/podcasts")
  val podcastsAU = NavLink("Podcasts", "/au/podcasts")
  val pictures = NavLink("Pictures", "/inpictures")
  val newsletters = NavLink("Newsletters", "/email-newsletters")
  val jobs = NavLink("Search jobs", "https://jobs.theguardian.com")
  val apps =
    NavLink("The Guardian app", "https://app.adjust.com/16xt6hai")
  val auWeekend = NavLink(
    "Australia Weekend",
    "/info/ng-interactive/2021/mar/17/make-sense-of-the-week-with-australia-weekend?INTCMP=header_au_weekend",
  )
  val printShop = NavLink("Guardian Print Shop", "/artanddesign/series/gnm-print-sales")
  val auEvents = NavLink("Events", "/guardian-live-australia")
  val holidays = NavLink("Holidays", "https://holidays.theguardian.com")
  val ukPatrons = NavLink("Patrons", "https://patrons.theguardian.com/?INTCMP=header_patrons")
  val guardianLive =
    NavLink("Live events", "https://www.theguardian.com/guardian-live-events?INTCMP=live_uk_header_dropdown")
  val guardianLicensing = NavLink("Guardian Licensing", s"https://licensing.theguardian.com/")
  val jobsRecruiter = NavLink(
    "Hire with Guardian Jobs",
    "https://recruiters.theguardian.com/?utm_source=gdnwb&utm_medium=navbar&utm_campaign=Guardian_Navbar_Recruiters&CMP_TU=trdmkt&CMP_BUNIT=jobs",
  )
  val aboutUs = NavLink("About Us", "/about")
  val tips = NavLink("Tips", "https://www.theguardian.com/tips")

  // News Pillar
  val ukNewsPillar = NavLink(
    "News",
    "/",
    longTitle = Some("Headlines"),
    iconName = Some("home"),
    List(
      ukNews,
      usPolitics,
      world,
      climateCrisis,
      middleEast,
      ukraine,
      football,
      newsletters,
      ukBusiness,
      ukEnvironment,
      politics,
      science,
      tech,
      globalDevelopment,
      obituaries,
    ),
  )
  val auNewsPillar = ukNewsPillar.copy(
    children = List(
      australiaNews,
      world,
      auPolitics,
      auEnvironment,
      climateCrisis,
      indigenousAustralia,
      auImmigration,
      media,
      auBusiness,
      healthNewsAu,
      science,
      tech,
      podcastsAU,
      newsletters,
    ),
  )
  val usNewsPillar = ukNewsPillar.copy(children =
    List(
      usNews,
      usPolitics,
      world,
      climateCrisis,
      middleEast,
      ukraine,
      usImmigration,
      usSoccer,
      usBusiness,
      usEnvironment,
      usTech,
      science,
      newsletters,
      usWellness,
    ),
  )
  val intNewsPillar = ukNewsPillar.copy(
    children = List(
      world,
      usPolitics,
      ukNews,
      climateCrisis,
      middleEast,
      ukraine,
      ukEnvironment,
      science,
      globalDevelopment,
      football,
      tech,
      ukBusiness,
      obituaries,
    ),
  )
  val eurNewsPillar = ukNewsPillar.copy(
    children = List(
      world,
      ukNews,
      climateCrisis,
      ukraine,
      ukEnvironment,
      science,
      globalDevelopment,
      football,
      tech,
      ukBusiness,
      obituaries,
    ),
  )

  // Opinion Pillar
  val ukOpinionPillar = NavLink(
    "Opinion",
    "/commentisfree",
    longTitle = Some("Opinion home"),
    iconName = Some("home"),
    List(
      theGuardianView,
      columnists,
      cartoons,
      opinionVideos,
      letters,
    ),
  )
  val auOpinionPillar = ukOpinionPillar.copy(
    children = List(
      auColumnists,
      cartoons,
      theGuardianView.copy(title = "Editorials"),
      letters,
    ),
  )
  val usOpinionPillar = ukOpinionPillar.copy(
    children = List(
      theGuardianView,
      columnists,
      letters,
      opinionVideos,
      cartoons,
    ),
  )
  val intOpinionPillar = ukOpinionPillar.copy(
    children = List(
      theGuardianView,
      columnists,
      cartoons,
      opinionVideos,
      letters,
    ),
  )
  val eurOpinionPillar = ukOpinionPillar.copy(
    children = List(
      theGuardianView,
      columnists,
      cartoons,
      opinionVideos,
      letters,
    ),
  )

  // Sport Pillar
  val ukSportPillar = NavLink(
    "Sport",
    "/sport",
    longTitle = Some("Sport home"),
    iconName = Some("home"),
    List(
      football,
      cricket,
      rugbyUnion,
      tennis,
      cycling,
      formulaOne,
      golf,
      boxing,
      rugbyLeague,
      racing,
      usSports,
    ),
  )
  val auSportPillar = ukSportPillar.copy(
    children = List(
      football,
      AFL,
      NRL,
      aLeague,
      cricket,
      rugbyUnion,
      tennis,
      cycling,
      formulaOne,
    ),
  )
  val usSportPillar = ukSportPillar.copy(
    children = List(
      usSoccer,
      NFL,
      tennis,
      MLB,
      MLS,
      NBA,
      WNBA,
      NHL,
      formulaOne,
      golf,
    ),
  )
  val intSportPillar = ukSportPillar.copy(
    children = List(
      football,
      cricket,
      rugbyUnion,
      tennis,
      cycling,
      formulaOne,
      golf,
      usSports,
    ),
  )
  val eurSportPillar = ukSportPillar.copy(
    children = List(
      football,
      cricket,
      rugbyUnion,
      tennis,
      cycling,
      formulaOne,
      golf,
      usSports,
    ),
  )

  // Culture Pillar
  val ukCulturePillar = NavLink(
    "Culture",
    "/culture",
    longTitle = Some("Culture home"),
    iconName = Some("home"),
    List(
      film,
      music,
      tvAndRadio,
      books,
      artAndDesign,
      stage,
      games,
      classical,
    ),
  )
  val auCulturePillar = ukCulturePillar.copy(
    children = List(
      film,
      music,
      books,
      tvAndRadio,
      artAndDesign,
      stage,
      games,
      classical,
    ),
  )
  val usCulturePillar = ukCulturePillar.copy(
    children = List(
      film,
      books,
      music,
      artAndDesign,
      tvAndRadio,
      stage,
      classical,
      games,
    ),
  )
  val intCulturePillar = ukCulturePillar.copy(
    children = List(
      books,
      music,
      tvAndRadio,
      artAndDesign,
      film,
      games,
      classical,
      stage,
    ),
  )
  val eurCulturePillar = ukCulturePillar.copy(
    children = List(
      books,
      music,
      tvAndRadio,
      artAndDesign,
      film,
      games,
      classical,
      stage,
    ),
  )

  // Lifestyle Pillar
  val ukLifestylePillar = NavLink(
    "Lifestyle",
    "/lifeandstyle",
    longTitle = Some("Lifestyle home"),
    iconName = Some("home"),
    List(
      theFilterUk,
      fashion,
      food,
      recipes,
      ukTravel,
      health,
      women,
      men,
      loveAndSex,
      beauty,
      home,
      money,
      cars,
    ),
  )
  val auLifestylePillar = ukLifestylePillar.copy(
    children = List(
      auTravel,
      foodAu,
      relationshipsAu,
      fashionAu,
      healthAu,
      loveAndSex,
      family,
      home,
    ),
  )
  val usLifestylePillar = ukLifestylePillar.copy(
    children = List(
      usWellness,
      fashion,
      food,
      recipes,
      loveAndSex,
      home,
      health,
      family,
      usTravel,
      money,
    ),
  )
  val intLifestylePillar = ukLifestylePillar.copy(
    children = List(
      fashion,
      food,
      recipes,
      loveAndSex,
      health,
      home,
      women,
      men,
      family,
      ukTravel,
      money,
    ),
  )
  val eurLifestylePillar = ukLifestylePillar.copy(
    children = List(
      fashion,
      food,
      recipes,
      loveAndSex,
      health,
      home,
      women,
      men,
      family,
      ukTravel,
      money,
    ),
  )

  val ukOtherLinks = List(
    apps,
    video,
    podcasts,
    pictures,
    newsletters,
    todaysPaper,
    insideTheGuardian,
    weekly.copy(url = s"${weekly.url}?INTCMP=gdnwb_mawns_editorial_gweekly_GW_TopNav_UK"),
    crosswords,
    wordiply,
    corrections,
    tips,
  )
  val auOtherLinks = List(
    apps,
    video,
    podcastsAU,
    pictures,
    newsletters,
    insideTheGuardian,
    weekly.copy(url = s"${weekly.url}?INTCMP=gdnwb_mawns_editorial_gweekly_GW_TopNav_Aus"),
    crosswords,
    wordiply,
    corrections,
    tips,
  )
  val usOtherLinks = List(
    apps,
    video,
    podcasts,
    pictures,
    insideTheGuardian,
    weekly.copy(url = s"${weekly.url}?INTCMP=gdnwb_mawns_editorial_gweekly_GW_TopNav_US"),
    crosswords,
    wordiply,
    corrections,
    tips,
  )
  val intOtherLinks = List(
    apps,
    video,
    podcasts,
    pictures,
    newsletters,
    todaysPaper,
    insideTheGuardian,
    weekly.copy(url = s"${weekly.url}?INTCMP=gdnwb_mawns_editorial_gweekly_GW_TopNav_Int"),
    crosswords,
    wordiply,
    corrections,
    tips,
  )
  val eurOtherLinks = List(
    apps,
    video,
    podcasts,
    pictures,
    newsletters,
    todaysPaper,
    insideTheGuardian,
    weekly.copy(url = s"${weekly.url}?INTCMP=gdnwb_mawns_editorial_gweekly_GW_TopNav_Int"),
    crosswords,
    wordiply,
    corrections,
    tips,
  )

  val ukBrandExtensions = List(
    jobs,
    jobsRecruiter,
    holidays.copy(url = holidays.url + "?INTCMP=holidays_uk_web_newheader"),
    guardianLive,
    aboutUs,
    digitalNewspaperArchive,
    printShop,
    ukPatrons,
    guardianLicensing,
  )
  val auBrandExtensions = List(
    auEvents,
    digitalNewspaperArchive,
    auWeekend,
    guardianLicensing,
    aboutUs,
  )
  val usBrandExtensions = List(
    jobs,
    digitalNewspaperArchive,
    guardianLicensing,
    aboutUs,
  )
  val intBrandExtensions = List(
    jobs,
    holidays.copy(url = holidays.url + "?INTCMP=holidays_int_web_newheader"),
    digitalNewspaperArchive,
    guardianLicensing,
    aboutUs,
  )
  val eurBrandExtensions = List(
    jobs,
    holidays.copy(url = holidays.url + "?INTCMP=holidays_int_web_newheader"),
    digitalNewspaperArchive,
    guardianLicensing,
    aboutUs,
  )

  // Tertiary Navigation
  // NOTE: content with tags from this list will have the navigation set to the tag in this list, rather than its
  // section tag. e.g. Content in technology section with world/europe-news will appear in the world section in
  // the navigation. The workaround for this is to add the section to this list,as has been done with CiF and education
  val tagPages = List(
    "us/soccer",
    "us-news/us-elections-2024",
    "australia-news/australian-politics",
    "australia-news/australian-immigration-and-asylum",
    "australia-news/indigenous-australians",
    "uk/scotland",
    "uk/wales",
    "uk/northernireland",
    "world/europe-news",
    "world/americas",
    "world/asia",
    "world/africa",
    "world/middleeast",
    "business/economics",
    "business/banking",
    "business/retail",
    "business/stock-markets",
    "business/eurozone",
    "business/diversity-and-equality",
    "business/us-small-business",
    "environment/climate-change",
    "environment/climate-crisis",
    "environment/wildlife",
    "environment/energy",
    "environment/pollution",
    "money/property",
    "money/pensions",
    "money/savings",
    "money/debt",
    "money/work-and-careers",
    "tone/cartoons",
    "type/cartoon",
    "profile/editorial",
    "au/index/contributors",
    "index/contributors",
    "commentisfree/series/comment-is-free-weekly",
    "sport/rugby-union",
    "sport/cricket",
    "sport/tennis",
    "sport/cycling",
    "sport/golf",
    "sport/us-sport",
    "sport/horse-racing",
    "sport/rugbyleague",
    "sport/boxing",
    "sport/formulaone",
    "sport/nfl",
    "sport/mlb",
    "football/mls",
    "sport/nba",
    "sport/wnba",
    "sport/nhl",
    "sport/afl",
    "football/a-league",
    "sport/nrl",
    "music/classicalmusicandopera",
    "food",
    "tone/recipes",
    "lifeandstyle/health-and-wellbeing",
    "lifeandstyle/family",
    "lifeandstyle/home-and-garden",
    "lifeandstyle/love-and-sex",
    "au/lifeandstyle/fashion",
    "au/lifeandstyle/food-and-drink",
    "au/lifeandstyle/relationships",
    "au/lifeandstyle/health-and-wellbeing",
    "travel/uk",
    "travel/europe",
    "travel/usa",
    "travel/skiing",
    "travel/australasia",
    "travel/asia",
    "theguardian",
    "observer",
    "football/live",
    "football/tables",
    "football/competitions",
    "football/results",
    "football/fixtures",
    "crosswords/crossword-blog",
    "crosswords/series/crossword-editor-update",
    "crosswords/series/quick",
    "crosswords/series/cryptic",
    "crosswords/series/prize",
    "crosswords/series/quick-cryptic",
    "crosswords/series/weekend-crossword",
    "crosswords/series/quiptic",
    "crosswords/series/genius",
    "crosswords/series/sunday-quick",
    "crosswords/series/special",
    "fashion/beauty",
    "technology/motoring",
    // these last two are here to ensure that content in education and CiF always appear as such in the navigation
    // even if they also have a tag from this list
    "commentisfree/commentisfree",
    "education/education",
  )

}

case class EditionNavLinks(
    newsPillar: NavLink,
    opinionPillar: NavLink,
    sportPillar: NavLink,
    culturePillar: NavLink,
    lifestylePillar: NavLink,
    otherLinks: List[NavLink],
    brandExtensions: List[NavLink],
)

object NavigationData {
  implicit val navlinkWrites: OWrites[NavLink] = Json.writes[NavLink]
  implicit val editionNavLinksWrites: OWrites[EditionNavLinks] = Json.writes[EditionNavLinks]

  val nav: JsValue = toJson(
    (Edition.allEditions
      .map(e => e.networkFrontId -> toJson(e.navigationLinks)) :+ "tagPages" -> toJson(NavLinks.tagPages)).toMap,
  )
}
