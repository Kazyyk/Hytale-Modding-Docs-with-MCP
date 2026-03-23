---
title: "PrefabEditorCreationContext"
kind: "interface"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.PrefabEditorCreationContext"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "prefab-editor"
  - "context"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor`

```java
public interface PrefabEditorCreationContext
```

Provides the parameters needed to create a prefab editing session. Implemented by `PrefabEditorCreationSettings` after processing user input.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getEditor()` | `Player` | Returns the player initiating the session. |
| `getEditorRef()` | `PlayerRef` | Returns the player ref for the editor. |
| `getPrefabPaths()` | `List<Path>` | Returns resolved paths to prefab files. |
| `getBlocksBetweenEachPrefab()` | `int` | Spacing between pasted prefabs. |
| `getPasteLevelGoal()` | `int` | Target Y level for pasting. |
| `loadChildPrefabs()` | `boolean` | Whether to recursively load child prefabs. |
| `shouldLoadEntities()` | `boolean` | Whether to load entities from prefab files. |
| `getStackingAxis()` | `PrefabStackingAxis` | Axis along which prefabs are stacked. |
| `getWorldGenType()` | `WorldGenType` | Type of world generation for the editor world. |
| `getBlocksAboveSurface()` | `int` | Blocks of air above the surface. |
| `getAlignment()` | `PrefabAlignment` | Alignment method for prefab placement. |
| `getPrefabRootDirectory()` | `PrefabRootDirectory` | Root directory for resolving prefab paths. |
| `isWorldTickingEnabled()` | `boolean` | Whether the editor world should tick. |
| `getRowSplitMode()` | `PrefabRowSplitMode` | How prefabs are split into rows. |
| `getUnprocessedPrefabPaths()` | `List<String>` | Raw user-entered path strings. |
| `getEnvironment()` | `String` | Environment asset ID for the editor world. |
| `getGrassTint()` | `String` | Hex color for grass tint. |

## See Also

- [PrefabEditorCreationSettings](PrefabEditorCreationSettings.md)
