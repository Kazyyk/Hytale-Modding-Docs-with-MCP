# CraftingManager.ChestLookupResult

Type: record | Package: com.hypixel.hytale.builtin.crafting.component

protected record ChestLookupResult(List<ItemContainer> containers, List<ItemContainerState> states, List<ItemContainerState> spatialResults, List<ItemContainerState> filteredOut, Vector3d benchCenteredPos)

Record holding the results of a spatial query for item containers around a crafting bench. Used by `feedExtraResourcesSection` to locate nearby chests for material access.

## Components

- containers | List<ItemContainer> | Item containers within range.
- states | List<ItemContainerState> | Block states of matched containers.
- spatialResults | List<ItemContainerState> | All spatial query results before distance filtering.
- filteredOut | List<ItemContainerState> | Results outside the search radius.
- benchCenteredPos | Vector3d | Bench block position as a double vector.

Also in this package: BenchBlock, BenchUpgradingJob, CraftingJob, CraftingManager, InputRemovalType, ProcessingBenchBlock
