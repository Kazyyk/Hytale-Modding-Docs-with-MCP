---
title: "CraftingManager.CraftingJob"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.component"
fqcn: "com.hypixel.hytale.builtin.crafting.component.CraftingManager.CraftingJob"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "crafting"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.crafting.component`

```java
private static class CraftingJob
```

Inner class of [CraftingManager](CraftingManager.md) that tracks a single queued crafting operation. Stores the recipe, quantity, timing, input container, and removed items for potential refund on cancellation.

## Fields

| Field | Type | Description |
|---|---|---|
| `window` | `CraftingWindow` | The UI window associated with this job. |
| `transactionId` | `int` | Client transaction identifier. |
| `recipe` | `CraftingRecipe` | The recipe being crafted. |
| `quantity` | `int` | Total items to craft. |
| `timeSeconds` | `float` | Time per item (may be reduced by bench tier). |
| `inputItemContainer` | `ItemContainer` | Source container for input removal. |
| `inputRemovalType` | `InputRemovalType` | NORMAL or ORDERED removal strategy. |
| `removedItems` | `Int2ObjectMap<List<ItemStack>>` | Items removed per quantity index, for refund. |
| `quantityStarted` | `int` | Number of items whose inputs have been consumed. |
| `quantityCompleted` | `int` | Number of items whose outputs have been given. |
| `timeSecondsCompleted` | `float` | Elapsed time for the current item. |
