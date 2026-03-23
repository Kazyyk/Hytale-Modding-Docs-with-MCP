---
title: "com.hypixel.hytale.server.core.prefab.selection.standard"
kind: "package"
package: "com.hypixel.hytale.server.core.prefab.selection.standard"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "prefab"
  - "selection"
  - "blocks"
  - "editor"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.standard`

The standard selection package provides the core block selection data structure used by the prefab and editor systems. [BlockSelection](BlockSelection.md) is a thread-safe container for blocks, fluids, and entities within a world region, supporting copy, paste, rotation, flip, and placement operations. [FeedbackConsumer](FeedbackConsumer.md) is a callback interface for progress reporting during block placement.

All types in this package are internal (not part of the public API surface).

## Internal Types

| Type | Kind | Description |
|---|---|---|
| [BlockSelection](BlockSelection.md) | class | Thread-safe container for block, fluid, and entity selections with transformation and placement support. |
| [FeedbackConsumer](FeedbackConsumer.md) | interface | Functional callback for placement progress feedback. |

## Internal Types -- BlockSelection Inner Types

| Type | Kind | Description |
|---|---|---|
| [BlockSelection.BlockHolder](BlockSelection.md#blockholder) | record | Stores a block's ID, rotation, filler, support value, and state holder. |
| [BlockSelection.FluidHolder](BlockSelection.md#fluidholder) | record | Stores a fluid's ID and level. |
| [BlockSelection.BlockIterator](BlockSelection.md#blockiterator) | interface | Functional interface for block iteration. |
| [BlockSelection.FluidIterator](BlockSelection.md#fluiditerator) | interface | Functional interface for fluid iteration. |
| [BlockSelection.BlockComparingIterator](BlockSelection.md#blockcomparingiterator) | interface | Functional interface for block comparison predicates. |
| [BlockSelection.FallbackMode](BlockSelection.md#fallbackmode) | enum | Controls unmatched block behavior (`PASS_THOUGH`, `COPY`). |
