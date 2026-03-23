# FiniteFluidTicker

Type: class | Package: com.hypixel.hytale.server.core.asset.type.fluid | Extends: com.hypixel.hytale.server.core.asset.type.fluid.FluidTicker

public class FiniteFluidTicker extends FluidTicker

Volume-conserving finite fluid ticker. Unlike `DefaultFluidTicker`, this ticker preserves total fluid volume: when fluid spreads sideways, it drains from the topmost block in the column. Supports both orthogonal and diagonal offsets, with 16 pre-shuffled random offset permutations for natural-looking spread patterns. The `isAlive` check always returns `ALIVE` (finite fluids do not demote on their own).

## Constants

- private static final int MAX_DROP_DISTANCE
- private static final int RANDOM_VARIANTS

## Spread Algorithm

1. **Downward**: Attempts to move fluid from the top of the column into the block below. Transfer amount is capped by `maxFluidLevel - bottomFluidLevel`.
2. **Sideways**: If downward spread fails, iterates through orthogonal and diagonal offsets (using a hash+tick-selected random permutation). For each direction, checks for a downhill path and spreads 1 level per offset cell. Each level spread decrements the source.
3. **Drain**: After spreading, drains the transferred amount from the topmost block in the column by walking upward to find the top.

## Inner Types

### SpreadOutcome (private enum)


private static enum SpreadOutcome { SUCCESS, UNLOADED_CHUNK; }

## Related Types

- FluidTicker -- base class
- Fluid -- owns this ticker

Also in this package: Accessor, AliveStatus, CachedAccessor, ConversionResult, DefaultFluidTicker, FireFluidTicker, FlammabilityConfig, Fluid, FluidCollisionConfig, FluidTicker, FluidTypePacketGenerator, SpreadOutcome

Complete API:
  protected FluidTicker.AliveStatus isAlive(FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, Fluid fluid, int fluidId, byte fluidLevel, int worldX, int worldY, int worldZ)
  protected BlockTickStrategy spread(World world, long tick, FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, Fluid fluid, int fluidId, byte fluidLevel, int worldX, int worldY, int worldZ)
  private boolean spreadDownwards(FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, FluidSection belowFluidSection, BlockSection belowBlockSection, int worldX, int worldY, int worldZ, Fluid fluid, int fluidId, byte fluidLevel, int bottomFluidId, byte bottomFluidLevel)
  private BlockTickStrategy spreadSideways(long tick, FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, int worldX, int worldY, int worldZ, Fluid fluid, int fluidId, byte fluidLevel)
  private FiniteFluidTicker.SpreadOutcome spreadToOffset(FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, Vector2i offset, int worldX, int worldY, int worldZ, Fluid fluid, int fluidId, byte fluidLevel)
  private boolean drainFromTopBlock(FluidTicker.Accessor accessor, FluidSection fluidSection, BlockSection blockSection, int worldX, int worldY, int worldZ, Fluid fluid, int fluidId, byte drainLevels)
  private int getTopY(FluidTicker.Accessor accessor, FluidSection fluidSection, int worldX, int worldY, int worldZ, Fluid fluid, int fluidId)
  private static boolean isOffsetConnected(FluidTicker.Accessor accessor, BlockSection blockSection, Vector2i offset, int worldX, int worldY, int worldZ)

Fields:
public static BuilderCodec<FiniteFluidTicker> CODEC
private static final Vector2i[] DIAG_OFFSETS
private static final int MAX_DROP_DISTANCE
private static final List<List<Vector2i[]>> OFFSETS_LISTS
private static final int RANDOM_VARIANTS
