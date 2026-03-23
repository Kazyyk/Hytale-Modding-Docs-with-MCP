---
title: "OpenCustomUIInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenCustomUIInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "ui"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class OpenCustomUIInteraction extends SimpleInstantInteraction
```

Opens a custom UI page for the player. The page is created by a registered `CustomPageSupplier` selected via codec configuration. Only opens the page if the player does not already have a custom page open.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Page` | `CustomPageSupplier` (via `CodecMapCodec`) | Yes (inherited) | -- | The registered page supplier that creates the custom UI page. |

## Static Methods

```java
public static <S extends OpenCustomUIInteraction.CustomPageSupplier> void registerCustomPageSupplier(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull S supplier)
```

Registers a custom page supplier with the given ID in the codec registry.

```java
public static void registerSimple(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull Function<PlayerRef, CustomUIPage> supplier)
```

Convenience method to register a simple supplier that only requires a `PlayerRef`.

```java
@Deprecated
public static <T extends BlockState> void registerBlockCustomPage(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull Class<T> stateClass, @Nonnull OpenCustomUIInteraction.BlockCustomPageSupplier<T> blockSupplier)
```

**Deprecated.** Registers a block-state-based custom page supplier. Resolves the target block's state and creates a page from it.

```java
public static void registerBlockEntityCustomPage(@Nonnull PluginBase plugin, Class<?> tClass, String id, @Nonnull OpenCustomUIInteraction.BlockEntityCustomPageSupplier blockSupplier)
```

Registers a block-entity-based custom page supplier. Resolves the block entity ref from the target block.

## Methods

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Gets the player's `PageManager`, checks no custom page is open, creates the page via the supplier, and opens it.

## Inner Interfaces

- [BlockCustomPageSupplier](OpenCustomUIInteraction.BlockCustomPageSupplier.md) -- creates pages from block states (deprecated)
- [BlockEntityCustomPageSupplier](OpenCustomUIInteraction.BlockEntityCustomPageSupplier.md) -- creates pages from block entity refs
- [CustomPageSupplier](OpenCustomUIInteraction.CustomPageSupplier.md) -- general-purpose page creation interface

## See Also

- `PageManager` -- manages open pages for a player
- `CustomUIPage` -- the page object displayed to the player
