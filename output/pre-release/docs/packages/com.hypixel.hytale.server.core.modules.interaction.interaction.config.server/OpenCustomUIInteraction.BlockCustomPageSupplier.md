---
title: "OpenCustomUIInteraction.BlockCustomPageSupplier"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenCustomUIInteraction.BlockCustomPageSupplier"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "ui"
  - "functional-interface"
  - "deprecated"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
@FunctionalInterface
public interface OpenCustomUIInteraction.BlockCustomPageSupplier<T extends BlockState>
```

**Deprecated (via registration method).** Functional interface for creating a `CustomUIPage` from a `PlayerRef` and a typed `BlockState`. Used with `OpenCustomUIInteraction.registerBlockCustomPage`.

## Methods

```java
CustomUIPage tryCreate(@Nonnull PlayerRef var1, @Nonnull T var2)
```

Creates a custom UI page for the given player and block state, or returns `null` if the page cannot be created.

## See Also

- [OpenCustomUIInteraction](OpenCustomUIInteraction.md)
