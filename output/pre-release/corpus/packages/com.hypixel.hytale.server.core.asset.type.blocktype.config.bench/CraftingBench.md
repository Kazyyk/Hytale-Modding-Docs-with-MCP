# CraftingBench

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Extends: Bench

public class CraftingBench extends Bench

Concrete bench implementation for standard recipe-based crafting with grid dimensions and category filtering.

## Constants

- BuilderCodec<CraftingBench> CODEC
- BuilderCodec<CraftingBench.BenchCategory> CODEC
- BuilderCodec<CraftingBench.BenchItemCategory> CODEC

## Key Methods

- public CraftingBench.BenchCategory[] getCategories()
- public boolean equals(@Nullable Object o)
- public int hashCode()
- public String getId()
- public String getName()
- public String getIcon()
- public CraftingBench.BenchItemCategory[] getItemCategories()
- public String toString()
- public String getDiagram()
- public int getSlots()
- public boolean isSpecialSlot()

Known subclasses: DiagramCraftingBench

Also in this package: Bench, BenchCategory, BenchItemCategory, BenchSlot, BenchTierLevel, BenchUpgradeRequirement, DiagramCraftingBench, ExtraOutput, ProcessingBench, ProcessingSlot, StructuralCraftingBench

Complete API:
  public CraftingBench.BenchCategory[] getCategories()
  public boolean equals(Object o)
  public int hashCode()

Fields:
public static final BuilderCodec<CraftingBench> CODEC
protected CraftingBench.BenchCategory[] categories
