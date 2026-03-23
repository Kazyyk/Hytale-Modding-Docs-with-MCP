# FarmingData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.farming | Extends: java.lang.Object

Configuration for farmable blocks. Contains a map of stage sets (named arrays of `FarmingStageData`), a starting stage set name, an optional stage set after harvest, growth modifier asset references, and an optional `SoilConfig` for soil transformation. Inner class `SoilConfig` defines the target block type and lifetime range for soil conversion.

Also in this package: FarmingStageData, GrowthModifierAsset, SoilConfig

Complete API:
  public Map<String,FarmingStageData[]> getStages()
  public String getStartingStageSet()
  public String getStageSetAfterHarvest()
  public String[] getGrowthModifiers()
  public FarmingData.SoilConfig getSoilConfig()
  public String toString()

Fields:
public static Codec<FarmingData> CODEC
protected Map<String,FarmingStageData[]> stages
protected String startingStageSet
protected String stageSetAfterHarvest
protected String[] growthModifiers
protected FarmingData.SoilConfig soilConfig
