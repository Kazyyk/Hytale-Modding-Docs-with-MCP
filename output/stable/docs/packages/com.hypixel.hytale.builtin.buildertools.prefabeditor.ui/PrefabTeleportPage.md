---
title: "PrefabTeleportPage"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor.ui"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.ui.PrefabTeleportPage"
api_surface: false
extends: "InteractiveCustomUIPage"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "prefab-editor"
  - "ui"
  - "page"
  - "teleport"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor.ui`

```java
public class PrefabTeleportPage extends InteractiveCustomUIPage<PrefabTeleportPage.PageData>
```

Custom UI page for teleporting a player to a loaded prefab within a prefab edit session. Lists all loaded prefabs with fuzzy search filtering. On selection, calculates the center of the prefab bounding box, queries the chunk heightmap for a safe Y coordinate, and teleports the player above the prefab.

## Fields

| Field | Type | Description |
|---|---|---|
| `prefabEditSession` | `PrefabEditSession` | The active edit session to browse prefabs from. |
| `searchQuery` | `String` | Current search filter. |

## Constructor

```java
public PrefabTeleportPage(@Nonnull PlayerRef playerRef, @Nonnull PrefabEditSession prefabEditSession)
```

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(Ref<EntityStore>, UICommandBuilder, UIEventBuilder, Store<EntityStore>)` | `void` | Builds the teleport page with search input and prefab list. |
| `handleDataEvent(Ref<EntityStore>, Store<EntityStore>, PageData)` | `void` | Handles search query updates and prefab selection. On selection, teleports the player to the prefab center. |

### PageData (class)

Codec-backed data class with `searchQuery` and `prefabUuid` fields.

## See Also

- [PrefabEditorExitConfirmPage](PrefabEditorExitConfirmPage.md)
- [PrefabEditorLoadSettingsPage](PrefabEditorLoadSettingsPage.md)
