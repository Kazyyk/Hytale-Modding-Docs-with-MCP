# StructuralCraftingBench

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Extends: Bench

public class StructuralCraftingBench extends Bench

Bench subclass for structural block crafting with pattern-based recipes.

## Constants

- BuilderCodec<StructuralCraftingBench> CODEC

## Key Methods

- public boolean isHeaderCategory(@Nonnull String category)
- public int getCategoryIndex(@Nonnull String category)
- public boolean shouldAllowBlockGroupCycling()
- public boolean shouldAlwaysShowInventoryHints()
- public String toString()

Also in this package: Bench, BenchCategory, BenchItemCategory, BenchSlot, BenchTierLevel, BenchUpgradeRequirement, CraftingBench, DiagramCraftingBench, ExtraOutput, ProcessingBench, ProcessingSlot

Complete API:
  private void processConfig()
  public boolean isHeaderCategory(String category)
  public int getCategoryIndex(String category)
  public boolean shouldAllowBlockGroupCycling()
  public boolean shouldAlwaysShowInventoryHints()
  public String toString()

Fields:
public static final BuilderCodec<StructuralCraftingBench> CODEC
private String[] headerCategories
private ObjectOpenHashSet<String> headerCategoryMap
private String[] sortedCategories
private Object2IntMap<String> categoryToIndexMap
private boolean allowBlockGroupCycling
private boolean alwaysShowInventoryHints
