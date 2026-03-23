---
title: "ItemHudUI"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.config.ItemHudUI"
api_surface: true
extends: "java.lang.Object"
implements:
  - "NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "item"
  - "ui"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item.config`

```java
public class ItemHudUI implements NetworkSerializable<com.hypixel.hytale.protocol.ItemHudUI>
```

Defines a HUD UI element associated with an item. Contains a path to the UI definition file and the display type (e.g., `Hud`).

## Fields

| Field | Type | Default | Description |
|---|---|---|---|
| `path` | `String` | -- | Path to the UI definition file |
| `type` | `ItemHudUIType` | `ItemHudUIType.Hud` | How the UI element is displayed |

## Methods

```java
public String getPath()
```

Returns the path to the UI definition file.

```java
public ItemHudUIType getType()
```

Returns the display type of this HUD UI element.

```java
@Nonnull
public com.hypixel.hytale.protocol.ItemHudUI toPacket()
```

Converts this asset to its protocol representation.

## Related Types

- `Item` -- items can define HUD UI elements
