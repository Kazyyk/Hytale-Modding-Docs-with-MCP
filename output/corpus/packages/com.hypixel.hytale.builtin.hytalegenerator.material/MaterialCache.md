# MaterialCache

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.material

public class MaterialCache

## Fields

- @Nonnull private final ConcurrentHashMap<Integer, SolidMaterial> hashToSolidMap
- @Nonnull private final ConcurrentHashMap<Integer, FluidMaterial> hashToFluidMap
- @Nonnull private final ConcurrentHashMap<Integer, Material> hashToMaterialMap
- @Nullable public final SolidMaterial EMPTY_AIR
- @Nullable public final SolidMaterial ROCK_STONE
- @Nullable public final SolidMaterial SOIL_GRASS
- @Nullable public final SolidMaterial SOIL_DIRT
- @Nullable public final SolidMaterial SOIL_MUD
- @Nullable public final SolidMaterial SOIL_NEEDLES
- @Nullable public final SolidMaterial SOIL_GRAVEL
- @Nullable public final SolidMaterial ROCK_QUARTZITE
- @Nullable public final SolidMaterial ROCK_MARBLE
- @Nullable public final SolidMaterial ROCK_SHALE
- @Nullable public final SolidMaterial FLUID_WATER
- @Nullable public final SolidMaterial BEDROCK
- @Nullable public final FluidMaterial UNKNOWN_FLUID
- @Nullable public final FluidMaterial EMPTY_FLUID
- @Nonnull public final Material EMPTY

## Methods

- @Nonnull public Material getMaterial(@Nonnull SolidMaterial solidMaterial, @Nonnull FluidMaterial fluidMaterial)
- @Nullable public FluidMaterial getFluidMaterial(@Nonnull String fluidString)
- @Nullable public FluidMaterial getFluidMaterial(int fluidId, byte level)
- @Nonnull private FluidMaterial getOrRegisterFluid(int fluidId, byte level)
- @Nullable public SolidMaterial getSolidMaterial(@Nonnull String solidString, @Nonnull RotationTuple rotation)
- @Nullable public SolidMaterial getSolidMaterial(@Nonnull String solidString)
- @Nonnull public SolidMaterial getSolidMaterialRotatedY(@Nonnull SolidMaterial solidMaterial, @Nonnull Rotation rotation)
- @Nullable public SolidMaterial getSolidMaterial(int blockId, int support, int rotation, int filler, @Nullable Holder<ChunkStore> holder)
