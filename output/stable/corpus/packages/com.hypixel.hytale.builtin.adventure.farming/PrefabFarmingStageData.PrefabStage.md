# PrefabFarmingStageData.PrefabStage

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.stages | Implements: IWeightedElement

public static class PrefabFarmingStageData.PrefabStage implements IWeightedElement

A weighted entry in the PrefabFarmingStageData prefab selection map. Each entry has a weight (for random selection) and a path to a prefab asset file.

## Fields

- protected int weight
- protected String path

## Methods

- public double getWeight()
- @Nonnull public Path getResolvedPath()
