# Bench

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Implements: NetworkSerializable<com.hypixel.hytale.protocol.Bench>

public abstract class Bench implements NetworkSerializable<com.hypixel.hytale.protocol.Bench>

Abstract base class for crafting bench configurations with tier levels, sound events, and interaction references.

## Constants

- ObjectCodecMapCodec<BenchType, Bench> CODEC
- BuilderCodec<Bench> BASE_CODEC
- BuilderCodec<Bench.BenchSlot> CODEC

## Key Methods

- public BenchType getType()
- public String getId()
- public String getDescriptiveLabel()
- public BenchTierLevel getTierLevel(int tierLevel)
- public BenchUpgradeRequirement getUpgradeRequirement(int tierLevel)
- public String getLocalOpenSoundEventId()
- public int getLocalOpenSoundEventIndex()
- public String getLocalCloseSoundEventId()
- public int getLocalCloseSoundEventIndex()
- public String getCompletedSoundEventId()
- public int getCompletedSoundEventIndex()
- public String getFailedSoundEventId()
- public int getFailedSoundEventIndex()
- public String getBenchUpgradeSoundEventId()
- public int getBenchUpgradeSoundEventIndex()
- public String getBenchUpgradeCompletedSoundEventId()
- public int getBenchUpgradeCompletedSoundEventIndex()
- public RootInteraction getRootInteraction()
- public com.hypixel.hytale.protocol.Bench toPacket()
- public boolean equals(Object o)
- public int hashCode()
- public String toString()
- public static void registerRootInteraction(BenchType benchType, RootInteraction interaction)
- public String getIcon()
- public boolean equals(@Nullable Object o)

Known subclasses: CraftingBench, ProcessingBench, StructuralCraftingBench

Also in this package: BenchCategory, BenchItemCategory, BenchSlot, BenchTierLevel, BenchUpgradeRequirement, CraftingBench, DiagramCraftingBench, ExtraOutput, ProcessingBench, ProcessingSlot, StructuralCraftingBench

Complete API:
  public BenchType getType()
  public String getId()
  public String getDescriptiveLabel()
  public BenchTierLevel getTierLevel(int tierLevel)
  public BenchUpgradeRequirement getUpgradeRequirement(int tierLevel)
  public String getLocalOpenSoundEventId()
  public int getLocalOpenSoundEventIndex()
  public String getLocalCloseSoundEventId()
  public int getLocalCloseSoundEventIndex()
  public String getCompletedSoundEventId()
  public int getCompletedSoundEventIndex()
  public String getFailedSoundEventId()
  public int getFailedSoundEventIndex()
  public String getBenchUpgradeSoundEventId()
  public int getBenchUpgradeSoundEventIndex()
  public String getBenchUpgradeCompletedSoundEventId()
  public int getBenchUpgradeCompletedSoundEventIndex()
  public RootInteraction getRootInteraction()
  public com.hypixel.hytale.protocol.Bench toPacket()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static void registerRootInteraction(BenchType benchType, RootInteraction interaction)

Fields:
public static final ObjectCodecMapCodec<BenchType,Bench> CODEC
public static final BuilderCodec<Bench> BASE_CODEC
protected static final Map<BenchType,RootInteraction> BENCH_INTERACTIONS
protected BenchType type
protected String id
protected String descriptiveLabel
protected BenchTierLevel[] tierLevels
protected String localOpenSoundEventId
protected transient int localOpenSoundEventIndex
protected String localCloseSoundEventId
protected transient int localCloseSoundEventIndex
protected String completedSoundEventId
protected transient int completedSoundEventIndex
protected String failedSoundEventId
protected transient int failedSoundEventIndex
protected String benchUpgradeSoundEventId
protected transient int benchUpgradeSoundEventIndex
protected String benchUpgradeCompletedSoundEventId
protected transient int benchUpgradeCompletedSoundEventIndex
