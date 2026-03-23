# CraftingManager.CraftingJob

Type: class | Package: com.hypixel.hytale.builtin.crafting.component

private static class CraftingJob

Inner class of CraftingManager that tracks a single queued crafting operation. Stores the recipe, quantity, timing, input container, and removed items for potential refund on cancellation.

## Fields

- window | CraftingWindow | The UI window associated with this job.
- transactionId | int | Client transaction identifier.
- recipe | CraftingRecipe | The recipe being crafted.
- quantity | int | Total items to craft.
- timeSeconds | float | Time per item (may be reduced by bench tier).
- inputItemContainer | ItemContainer | Source container for input removal.
- inputRemovalType | InputRemovalType | NORMAL or ORDERED removal strategy.
- removedItems | Int2ObjectMap<List<ItemStack>> | Items removed per quantity index, for refund.
- quantityStarted | int | Number of items whose inputs have been consumed.
- quantityCompleted | int | Number of items whose outputs have been given.
- timeSecondsCompleted | float | Elapsed time for the current item.

Also in this package: BenchBlock, BenchUpgradingJob, ChestLookupResult, CraftingManager, InputRemovalType, ProcessingBenchBlock

Complete API:
  public String toString()

Fields:
private final CraftingWindow window
private final int transactionId
private final CraftingRecipe recipe
private final int quantity
private final float timeSeconds
private final ItemContainer inputItemContainer
private final CraftingManager.InputRemovalType inputRemovalType
private final Int2ObjectMap<List<ItemStack>> removedItems
private int quantityStarted
private int quantityCompleted
private float timeSecondsCompleted
