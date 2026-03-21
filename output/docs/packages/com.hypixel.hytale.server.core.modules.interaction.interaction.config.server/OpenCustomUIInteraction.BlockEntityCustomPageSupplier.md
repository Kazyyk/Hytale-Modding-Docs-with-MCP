---
title: "OpenCustomUIInteraction.BlockEntityCustomPageSupplier"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenCustomUIInteraction.BlockEntityCustomPageSupplier"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "ui"
  - "functional-interface"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
@FunctionalInterface
public interface OpenCustomUIInteraction.BlockEntityCustomPageSupplier
```

Functional interface for creating a `CustomUIPage` from a `PlayerRef` and a block entity reference. Used with `OpenCustomUIInteraction.registerBlockEntityCustomPage`.

## Methods

```java
CustomUIPage tryCreate(@Nonnull PlayerRef var1, @Nonnull Ref<ChunkStore> var2)
```

Creates a custom UI page for the given player and block entity reference, or returns `null` if the page cannot be created.

## See Also

- [OpenCustomUIInteraction](OpenCustomUIInteraction.md)
