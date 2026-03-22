---
title: "MemoriesUnlockedPageSuplier"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.page"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.page.MemoriesUnlockedPageSuplier"
api_surface: false
extends: null
implements:
  - "OpenCustomUIInteraction.CustomPageSupplier"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "memories"
  - "interaction"
  - "supplier"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories.page`

```java
public class MemoriesUnlockedPageSuplier implements OpenCustomUIInteraction.CustomPageSupplier
```

Supplier that creates a [MemoriesUnlockedPage](MemoriesUnlockedPage.md) when a player interacts with a memories block. Returns `null` if no target block is present in the interaction context. Note: the class name contains a typo in the original source (`Suplier` instead of `Supplier`).

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CustomUIPage` | `tryCreate(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull PlayerRef playerRef, @Nonnull InteractionContext context)` |
