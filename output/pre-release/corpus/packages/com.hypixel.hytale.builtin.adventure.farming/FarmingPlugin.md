# FarmingPlugin

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: JavaPlugin

public class FarmingPlugin extends JavaPlugin

The main plugin class for the farming system. Registers all farming-related components, interactions, codec types, growth modifiers, farming stage data types, and ECS systems with the server plugin framework.

On setup, this plugin:
- Registers asset stores for `GrowthModifierAsset` (path `Farming/Modifiers`) and FarmingCoopAsset (path `Farming/Coops`)
- Registers interactions: `HarvestCrop`, `FertilizeSoil`, `ChangeFarmingStage`, `UseWateringCan`, `UseCoop`, `UseCaptureCrate`
- Registers growth modifier codecs: `Fertilizer`, `LightLevel`, `Water`
- Registers farming stage data codecs: `BlockType`, `BlockState`, `Prefab`, `Spread`
- Registers spread growth behaviour codec: `Directional`
- Registers `ChunkStore` components: TilledSoilBlock, FarmingBlock, FarmingBlockState, CoopBlock
- Registers `EntityStore` component: CoopResidentComponent
- Registers ECS systems: FarmingSystems.OnSoilAdded, FarmingSystems.OnFarmBlockAdded, FarmingSystems.Ticking, FarmingSystems.MigrateFarming, FarmingSystems.OnCoopAdded, FarmingSystems.CoopResidentEntitySystem, FarmingSystems.CoopResidentTicking
- Listens for `ChunkPreLoadProcessEvent` to prevent spread on newly generated chunks

## Fields

- protected static FarmingPlugin instance
- private ComponentType<ChunkStore, TilledSoilBlock> tiledSoilBlockComponentType
- private ComponentType<ChunkStore, FarmingBlock> farmingBlockComponentType
- private ComponentType<ChunkStore, FarmingBlockState> farmingBlockStateComponentType
- private ComponentType<ChunkStore, CoopBlock> coopBlockStateComponentType
- private ComponentType<EntityStore, CoopResidentComponent> coopResidentComponentType

## Methods

- public static FarmingPlugin get()
- public FarmingPlugin(@Nonnull JavaPluginInit init)
- protected void setup()
- public ComponentType<ChunkStore, TilledSoilBlock> getTiledSoilBlockComponentType()
- public ComponentType<ChunkStore, FarmingBlock> getFarmingBlockComponentType()
- public ComponentType<ChunkStore, FarmingBlockState> getFarmingBlockStateComponentType()
- public ComponentType<ChunkStore, CoopBlock> getCoopBlockStateComponentType()
- public ComponentType<EntityStore, CoopResidentComponent> getCoopResidentComponentType()

## Related Types

- FarmingSystems -- ECS systems registered by this plugin
- FarmingUtil -- utility methods for farming tick logic and harvesting
