---
title: "ObjImportPage"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.objimport"
fqcn: "com.hypixel.hytale.builtin.buildertools.objimport.ObjImportPage"
api_surface: false
extends: "InteractiveCustomUIPage"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "obj-import"
  - "ui"
  - "page"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.objimport`

```java
public class ObjImportPage extends InteractiveCustomUIPage<ObjImportPage.PageData>
```

Full-featured UI page for importing Wavefront OBJ files as voxelized block selections. Provides file path input with an integrated file browser (asset pack mode), sizing controls (height or scale mode), block pattern with weighted random selection, fill mode (solid vs. shell), material/texture support with auto-detection, origin placement options, and axis rotation. The imported mesh is voxelized via `MeshVoxelizer`, copied to the player's clipboard as a `BlockSelection`, and the paste tool is activated.

## Constants

| Field | Type | Value | Description |
|---|---|---|---|
| `DEFAULT_BLOCK` | `String` | `"Rock_Stone"` | Default block type for voxels. |
| `DEFAULT_HEIGHT` | `int` | `20` | Default target height in blocks. |
| `MIN_HEIGHT` / `MAX_HEIGHT` | `int` | `1` / `320` | Height range bounds. |
| `MIN_SCALE` / `MAX_SCALE` | `float` | `0.01F` / `100.0F` | Scale range bounds. |

## Constructor

```java
public ObjImportPage(@Nonnull PlayerRef playerRef)
```

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(Ref, UICommandBuilder, UIEventBuilder, Store)` | `void` | Builds the import form with all controls, dropdowns, and the file browser. |
| `handleDataEvent(Ref, Store, PageData)` | `void` | Handles field changes, browse events, and the import action. |

## Inner Types

### MeshRotation (enum)

Axis remapping options for imported meshes.

| Constant | Description |
|---|---|
| `NONE` | Y-up (no transformation). |
| `Z_UP_TO_Y_UP` | Convert Z-up to Y-up. |
| `X_UP_TO_Y_UP` | Convert X-up to Y-up. |

### Origin (enum)

Placement origin for the voxelized result.

| Constant | Description |
|---|---|
| `BOTTOM_FRONT_LEFT` | Origin at bottom-front-left corner. |
| `BOTTOM_CENTER` | Origin at bottom center. |
| `CENTER` | Origin at center. |
| `TOP_CENTER` | Origin at top center. |

### PageData (class)

Codec-backed data class for all form fields, browser events, and the import trigger.

### WeightedBlock (record)

A block ID paired with a probability weight for random selection.

## See Also

- [MeshVoxelizer](MeshVoxelizer.md)
- [ObjParser](ObjParser.md)
- [ObjImportCommand](ObjImportCommand.md)
