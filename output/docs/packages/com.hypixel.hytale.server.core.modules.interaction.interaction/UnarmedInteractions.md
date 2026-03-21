---
title: "UnarmedInteractions"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.UnarmedInteractions"
api_surface: false
implements: "JsonAssetWithMap<String, DefaultAssetMap<String, UnarmedInteractions>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "asset"
  - "unarmed"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction`

```java
public class UnarmedInteractions implements JsonAssetWithMap<String, DefaultAssetMap<String, UnarmedInteractions>>
```

JSON asset defining unarmed (empty-hand) interactions mapped by `InteractionType`. Loaded from asset files with a default ID of `"Empty"`. Automatically includes a `SwapFrom` interaction (`ChangeActiveSlotInteraction.DEFAULT_ROOT`) if not specified.

## Key Methods

| Method | Return Type | Description |
|---|---|---|
| `getAssetMap()` | `DefaultAssetMap<String, UnarmedInteractions>` | Returns the global asset map for unarmed interactions |
| `getId()` | `String` | Returns the asset ID |
| `getInteractions()` | `Map<InteractionType, String>` | Returns the interaction type to root interaction ID mapping |

## Fields

| Field | Type | Description |
|---|---|---|
| `id` | `String` | Asset identifier |
| `interactions` | `Map<InteractionType, String>` | Mapping from interaction type to root interaction ID |
| `data` | `AssetExtraInfo.Data` | Asset metadata |
