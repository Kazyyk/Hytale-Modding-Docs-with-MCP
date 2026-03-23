# Bench

Type: abstract class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.Bench>

Abstract base for all bench types (crafting stations). Contains bench ID, descriptive label, tier levels, and sound event IDs for open/close/complete/fail/upgrade actions. Uses `ObjectCodecMapCodec` with `BenchType` discriminator for polymorphic deserialization. Inner class `BenchSlot` defines an icon for a bench slot.

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
