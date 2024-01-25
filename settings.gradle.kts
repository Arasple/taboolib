rootProject.name = "TabooLib"

fun importModules() {
    include("module:module-empty")
    include("module:module-ai")
    include("module:module-nms")
    include("module:module-nms-util")
    include("module:module-chat")
    include("module:module-lang")
    include("module:module-effect")
    include("module:module-kether")
    include("module:module-metrics")
    include("module:module-database")
    include("module:module-database-core")
    include("module:module-database-shaded")
    include("module:module-database-mongodb")
    include("module:module-porticus")
    include("module:module-navigation")
    include("module:module-ui", "module:module-ui-legacy")
    include("module:module-ui-receptacle")
    include("module:module-configuration", "module:module-configuration-shaded", "module:module-configuration-legacy")
}

fun importPlatforms() {
    include("platform:platform-bukkit", "platform:platform-bungee")
    include("platform:platform-velocity")
    include("platform:platform-application")
}

fun importExtensions() {
    // 临时位置，未来会被移出标准模块
    include("expansion:expansion-command-helper")
    include("expansion:expansion-player-database")
    include("expansion:expansion-persistent-container")
    include("expansion:expansion-persistent-container-object")
    include("expansion:expansion-alkaid-redis")
    include("expansion:expansion-geek-tool")
    include("expansion:expansion-lang-tools")
    include("expansion:expansion-ioc")
    include("expansion:expansion-application-console")
    include("expansion:expansion-player-fake-op")
    include("expansion:expansion-submit-chain")
    // 从 common-5 中移除
    include("expansion:expansion-javascript")
}

//include("common", "common-5", "common-env", "common-impl", "common-platform-api", "common-util", "common-test")

//importModules()
//importPlatforms()
//importExtensions()

include("common", "common-env", "common-util", "common-5", "common-reflex", "common-platform-api")