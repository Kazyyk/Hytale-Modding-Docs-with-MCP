---
title: "OpenCustomUIInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenCustomUIInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "interaction"
  - "ui"
  - "custom-page"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class OpenCustomUIInteraction extends SimpleInstantInteraction
```

Opens a custom UI page when the interaction is triggered. The page is created via a `CustomPageSupplier` registered through the `PAGE_CODEC` map. Provides static registration helpers for simple suppliers, block-entity custom pages (with optional block entity creation).

## Static Methods

| Method | Signature |
|---|---|
| `registerCustomPageSupplier` | `static <S extends CustomPageSupplier> void registerCustomPageSupplier(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull S supplier)` |
| `registerSimple` | `static void registerSimple(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull Function<PlayerRef, CustomUIPage> supplier)` |
| `registerBlockEntityCustomPage` | `static void registerBlockEntityCustomPage(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull BlockEntityCustomPageSupplier blockSupplier)` |
| `registerBlockEntityCustomPage` | `static void registerBlockEntityCustomPage(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull BlockEntityCustomPageSupplier blockSupplier, Supplier<Holder<ChunkStore>> creator)` |

## Inner Types

- `OpenCustomUIInteraction.CustomPageSupplier` -- functional interface for creating custom UI pages
- `OpenCustomUIInteraction.BlockEntityCustomPageSupplier` -- functional interface for block-entity-based custom pages