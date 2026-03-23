---
title: "MemoriesPageSupplier"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.page"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.page.MemoriesPageSupplier"
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
public class MemoriesPageSupplier implements OpenCustomUIInteraction.CustomPageSupplier
```

Supplier that creates a [MemoriesPage](MemoriesPage.md) when a player interacts with a memories block. Returns `null` if no target block is present in the interaction context.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CustomUIPage` | `tryCreate(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull PlayerRef playerRef, @Nonnull InteractionContext context)` |
