# GrowthModifierAsset

Type: abstract class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.farming | Extends: java.lang.Object | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, GrowthModifierAsset>>

Asset-registered growth modifier for farming. Each modifier has a `modifier` multiplier (double) and a `getCurrentGrowthMultiplier()` method that subclasses can override for context-sensitive growth rates (e.g., based on adjacent blocks or light level).
