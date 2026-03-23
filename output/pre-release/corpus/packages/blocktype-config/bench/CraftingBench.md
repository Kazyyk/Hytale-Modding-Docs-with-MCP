# CraftingBench

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Extends: Bench

Standard crafting bench with categorized recipe lists. Contains an array of `BenchCategory` objects, each with an ID, name, icon, and nested `BenchItemCategory` entries defining slot counts and diagrams.

Known subclasses: DiagramCraftingBench

Also in this package: Bench, BenchCategory, BenchItemCategory, BenchSlot, BenchTierLevel, BenchUpgradeRequirement, DiagramCraftingBench, ExtraOutput, ProcessingBench, ProcessingSlot, StructuralCraftingBench

Complete API:
  public CraftingBench.BenchCategory[] getCategories()
  public boolean equals(Object o)
  public int hashCode()

Fields:
public static final BuilderCodec<CraftingBench> CODEC
protected CraftingBench.BenchCategory[] categories
