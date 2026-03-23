# BenchUpgradeRequirement

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.BenchUpgradeRequirement>

Defines the material cost and time to upgrade a bench to the next tier. Contains a `MaterialQuantity[]` input array and `timeSeconds` duration.

Also in this package: Bench, BenchCategory, BenchItemCategory, BenchSlot, BenchTierLevel, CraftingBench, DiagramCraftingBench, ExtraOutput, ProcessingBench, ProcessingSlot, StructuralCraftingBench

Complete API:
  public MaterialQuantity[] getInput()
  public float getTimeSeconds()
  public String toString()
  public com.hypixel.hytale.protocol.BenchUpgradeRequirement toPacket()

Fields:
public static final BuilderCodec<BenchUpgradeRequirement> CODEC
protected MaterialQuantity[] input
protected float timeSeconds
