# BenchTierLevel

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.BenchTierLevel>

Defines a bench tier upgrade level. Contains an `upgradeRequirement`, `craftingTimeReductionModifier` (0.0-1.0), `extraInputSlot` count, and `extraOutputSlot` count.

Also in this package: Bench, BenchCategory, BenchItemCategory, BenchSlot, BenchUpgradeRequirement, CraftingBench, DiagramCraftingBench, ExtraOutput, ProcessingBench, ProcessingSlot, StructuralCraftingBench

Complete API:
  public float getCraftingTimeReductionModifier()
  public BenchUpgradeRequirement getUpgradeRequirement()
  public int getExtraInputSlot()
  public int getExtraOutputSlot()
  public com.hypixel.hytale.protocol.BenchTierLevel toPacket()

Fields:
public static final BuilderCodec<BenchTierLevel> CODEC
protected BenchUpgradeRequirement upgradeRequirement
protected float craftingTimeReductionModifier
protected int extraInputSlot
protected int extraOutputSlot
