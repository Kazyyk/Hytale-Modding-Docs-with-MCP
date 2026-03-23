---
title: "PrefabSetAnchorInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.PrefabSetAnchorInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "prefab-editor"
  - "interaction"
  - "anchor"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor`

```java
public class PrefabSetAnchorInteraction extends SimpleInstantInteraction
```

Interaction handler for setting a prefab's anchor point. On primary or secondary click, determines the targeted block position, finds the containing prefab, selects it, and moves the anchor entity to the target position. Reports errors if no target block, no containing prefab, or no active edit session is found.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `firstRun(InteractionType, InteractionContext, CooldownHandler)` | `void` | Sets the anchor of the prefab containing the target block. |

## See Also

- [PrefabSelectionInteraction](PrefabSelectionInteraction.md)
- [PrefabEditingMetadata](PrefabEditingMetadata.md)
