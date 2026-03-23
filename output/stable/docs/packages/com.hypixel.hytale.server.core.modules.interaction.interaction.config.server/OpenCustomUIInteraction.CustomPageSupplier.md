---
title: "OpenCustomUIInteraction.CustomPageSupplier"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenCustomUIInteraction.CustomPageSupplier"
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
public interface OpenCustomUIInteraction.CustomPageSupplier
```

General-purpose functional interface for creating a `CustomUIPage`. Receives the entity reference, component accessor, player reference, and interaction context.

## Methods

```java
@Nullable
CustomUIPage tryCreate(@Nonnull Ref<EntityStore> var1, @Nonnull ComponentAccessor<EntityStore> var2, @Nonnull PlayerRef var3, @Nonnull InteractionContext var4)
```

Creates a custom UI page, or returns `null` if the page cannot be created for the given context.

## See Also

- [OpenCustomUIInteraction](OpenCustomUIInteraction.md)
