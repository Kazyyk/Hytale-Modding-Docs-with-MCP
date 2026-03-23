# FireFluidTicker

Type: class | Package: com.hypixel.hytale.server.core.asset.type.fluid | Extends: com.hypixel.hytale.server.core.asset.type.fluid.FluidTicker

public class FireFluidTicker extends FluidTicker

Fire propagation fluid ticker. Fire spreads to all 6 adjacent blocks (not just lateral) if the neighbor block matches a flammability tag pattern. Fire increases its own level each tick up to the fluid's max level. When the level reaches the block's `burnLevel` threshold, a random check against `burnChance` determines whether the block burns (replacing it with a `resultingBlock` and playing an optional sound). Fire can occupy solid blocks (`canOccupySolidBlocks` returns true).

## Constants

- public static final FireFluidTicker INSTANCE

## JSON-Configurable Fields

- String spreadFluid
- FlammabilityConfig[] rawFlammabilityConfigs

## Key Methods

- @Nonnull public List<FlammabilityConfig> getSortedFlammabilityConfigs()
- @Override public boolean canOccupySolidBlocks()

## Inner Types

### FlammabilityConfig (static class)


public static class FlammabilityConfig

Defines flammability for blocks matching a tag pattern.

- String tagPatternId
- int priority
- byte burnLevel
- float burnChance
- String resultingBlock
- String soundEvent

## Related Types

- FluidTicker -- base class
- Fluid -- owns this ticker

Also in this package: Accessor, AliveStatus, CachedAccessor, ConversionResult, DefaultFluidTicker, FiniteFluidTicker, FlammabilityConfig, Fluid, FluidCollisionConfig, FluidTicker, FluidTypePacketGenerator, SpreadOutcome

Complete API:
  protected FluidTicker.AliveStatus isAlive(FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, Fluid fluid, int fluidId, byte fluidLevel, int worldX, int worldY, int worldZ)
  protected BlockTickStrategy spread(World world, long tick, FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, Fluid fluid, int fluidId, byte fluidLevel, int worldX, int worldY, int worldZ)
  private FireFluidTicker.FlammabilityConfig getFlammabilityForBlock(BlockType block)
  public boolean canOccupySolidBlocks()
  private boolean tryBurn(World world, FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, FireFluidTicker.FlammabilityConfig config, int blockX, int blockY, int blockZ)
  public boolean isSelfFluid(int selfFluidId, int otherFluidId)
  private int getSpreadFluidId(int fluidId)
  public List<FireFluidTicker.FlammabilityConfig> getSortedFlammabilityConfigs()

Fields:
public static final BuilderCodec<FireFluidTicker> CODEC
public static final FireFluidTicker INSTANCE
private static final Vector3i[] OFFSETS
private String spreadFluid
private int spreadFluidId
private FireFluidTicker.FlammabilityConfig[] rawFlammabilityConfigs
private transient List<FireFluidTicker.FlammabilityConfig> sortedFlammabilityConfigs
