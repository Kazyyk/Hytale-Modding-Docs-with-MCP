---
title: "PrefabSelectionInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.PrefabSelectionInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "prefab-editor"
  - "interaction"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor`

```java
public class PrefabSelectionInteraction extends SimpleInstantInteraction
```

Interaction handler for the prefab selection tool. On primary click, ray-traces from the player to find a target block or entity within a prefab bounding box and selects that prefab. On secondary click, selects the nearest prefab by horizontal distance to the player. Reports errors if the player is not in an edit session or no prefab is found at the target.

## Constants

| Field | Type | Value | Description |
|---|---|---|---|
| `ENTITY_TARGET_RADIUS` | `float` | `50.0F` | Maximum entity targeting distance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `firstRun(InteractionType, InteractionContext, CooldownHandler)` | `void` | Handles primary (ray-trace) and secondary (nearest) selection. |

## See Also

- [PrefabEditSession](PrefabEditSession.md)
- `PrefabSetAnchorInteraction`
