# DefaultFluidTicker

Type: class | Package: com.hypixel.hytale.server.core.asset.type.fluid | Extends: com.hypixel.hytale.server.core.asset.type.fluid.FluidTicker

public class DefaultFluidTicker extends FluidTicker

Standard liquid fluid ticker. Implements gravity-driven downward flow with lateral spreading. Supports a `SpreadFluid` property for fluid type conversion (e.g. source water converting to flowing water), and a `Collisions` map defining what happens when this fluid encounters another (e.g. lava + water = cobblestone).

## Constants

- public static final DefaultFluidTicker INSTANCE

## JSON-Configurable Fields

- String spreadFluid
- Map<String, FluidCollisionConfig> rawCollisionMap

## Key Methods

- @Nonnull public Int2ObjectMap<FluidCollisionConfig> getCollisionMap()

## Spread Algorithm

The `spread` method first attempts downward flow: if the block below is not solid and not already filled with the spread fluid, the fluid fills downward at max level. If downward flow is blocked, the ticker computes the shortest path to a drop point using `getSpreadOffsets` (searching up to 5 blocks laterally), then spreads to adjacent cells at `fluidLevel - 1`. When spreading into another fluid type, the collision map is consulted to determine whether to place a block, play a sound, and/or suppress fluid placement.

## Inner Types

### FluidCollisionConfig (static class)


public static class FluidCollisionConfig

Defines what happens when two fluids collide: `BlockToPlace` (the block to create, e.g. cobblestone), `SoundEvent` (sound to play), and `PlaceFluid` (whether the spreading fluid is still placed). Lazily resolves block type and sound event indices.

- String blockToPlace
- String soundEvent
- boolean placeFluid

## Related Types

- FluidTicker -- base class
- Fluid -- owns this ticker

Also in this package: Accessor, AliveStatus, CachedAccessor, ConversionResult, FiniteFluidTicker, FireFluidTicker, FlammabilityConfig, Fluid, FluidCollisionConfig, FluidTicker, FluidTypePacketGenerator, SpreadOutcome

Complete API:
  protected BlockTickStrategy spread(World world, long tick, FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, Fluid fluid, int fluidId, byte fluidLevel, int worldX, int worldY, int worldZ)
  private static boolean executeCollision(World world, FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, DefaultFluidTicker.FluidCollisionConfig config, int blockX, int blockY, int blockZ)
  public boolean isSelfFluid(int selfFluidId, int otherFluidId)
  private int getSpreadFluidId(int fluidId)
  public Int2ObjectMap<DefaultFluidTicker.FluidCollisionConfig> getCollisionMap()

Fields:
public static final BuilderCodec<DefaultFluidTicker> CODEC
private static final int MAX_DROP_DISTANCE
public static final DefaultFluidTicker INSTANCE
private String spreadFluid
private int spreadFluidId
private Map<String,DefaultFluidTicker.FluidCollisionConfig> rawCollisionMap
private transient Int2ObjectMap<DefaultFluidTicker.FluidCollisionConfig> collisionMap
