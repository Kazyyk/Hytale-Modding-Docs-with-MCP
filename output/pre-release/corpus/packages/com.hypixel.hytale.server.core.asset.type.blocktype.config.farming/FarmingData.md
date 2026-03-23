# FarmingData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.farming

public class FarmingData

## Fields

- protected Map<String, FarmingStageData[]> stages
- protected String startingStageSet
- protected String stageSetAfterHarvest
- protected String[] growthModifiers
- @Nullable protected FarmingData.SoilConfig soilConfig

## Methods

- @Nullable public Map<String, FarmingStageData[]> getStages()
- @Nullable public String getStartingStageSet()
- public String getStageSetAfterHarvest()
- public String[] getGrowthModifiers()
- @Nullable public FarmingData.SoilConfig getSoilConfig()
- @Nonnull @Override public String toString()

## Inner Types

- `FarmingData.SoilConfig`

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
