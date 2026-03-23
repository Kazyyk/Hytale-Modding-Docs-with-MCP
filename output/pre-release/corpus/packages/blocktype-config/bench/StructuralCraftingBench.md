# StructuralCraftingBench

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Extends: Bench

Structural crafting bench for building/construction recipes. Contains sorted category lists, header categories (for UI grouping), and flags for inventory hints and block group cycling.

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
