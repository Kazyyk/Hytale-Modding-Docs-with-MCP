# FireFluidTicker.FlammabilityConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.fluid | Extends: java.lang.Object

public static class FireFluidTicker.FlammabilityConfig

Inner class of `FireFluidTicker` that defines flammability behavior per tag pattern. Specifies which blocks (matched by `TagPattern`) can catch fire, with configurable ignite chance, burn duration, and burn chance. Used in the fire spreading simulation.

## Related Types

- `FireFluidTicker` -- parent class that uses this configuration
- `TagPattern` -- pattern matching for block tags

Also in this package: Accessor, AliveStatus, CachedAccessor, ConversionResult, DefaultFluidTicker, FiniteFluidTicker, FireFluidTicker, Fluid, FluidCollisionConfig, FluidTicker, FluidTypePacketGenerator, SpreadOutcome

Complete API:
  public TagPattern getTagPattern()
  public int getPriority()
  public byte getBurnLevel()
  public float getBurnChance()
  public int getResultingBlockIndex()
  public String getResultingState()
  public int getSoundEventIndex()

Fields:
public static final BuilderCodec<FireFluidTicker.FlammabilityConfig> CODEC
private String tagPatternId
private transient TagPattern tagPattern
private int priority
private byte burnLevel
private float burnChance
private String resultingBlock
private String resultingState
private int resultingBlockIndex
private String soundEvent
private int soundEventIndex
