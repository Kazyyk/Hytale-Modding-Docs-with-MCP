---
title: "BrushData"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.BrushData"
api_surface: true
extends: null
implements:
  - "NetworkSerializable<BuilderToolBrushData>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "buildertool"
  - "brush"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.buildertool.config`

```java
public class BrushData implements NetworkSerializable<BuilderToolBrushData>
```

Configuration data for builder tool brushes. Defines shape parameters (width, height, thickness, capped), spatial transforms (origin, rotation axis/angle, mirror axis), material selection with favorites, and mask filters (block, above, below, adjacent, neighbor, custom commands). Contains an inner `Values` class that holds resolved runtime brush values.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `DEFAULT_WIDTH` | `5` |
| `public static final` | `int` | `DEFAULT_HEIGHT` | `5` |
| `public static final` | `BrushData` | `DEFAULT` | |
| `public static final` | `int` | `DEFAULT_FAVORITE_MATERIALS_CAPACITY` | `5` |
| `public static final` | `BuilderCodec<BrushData>` | `CODEC` | |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `IntArg` | `getWidth()` |
| `public` | `IntArg` | `getHeight()` |
| `public` | `IntArg` | `getThickness()` |
| `public` | `BoolArg` | `getCapped()` |
| `public` | `BrushShapeArg` | `getShape()` |
| `public` | `BrushOriginArg` | `getOrigin()` |
| `public` | `BoolArg` | `getOriginRotation()` |
| `public` | `BrushAxisArg` | `getRotationAxis()` |
| `public` | `BrushRotationArg` | `getRotationAngle()` |
| `public` | `BrushAxisArg` | `getMirrorAxis()` |
| `public` | `BlockArg` | `getMaterial()` |
| `public` | `BlockArg[]` | `getFavoriteMaterials()` |
| `public` | `MaskArg` | `getMask()` |
| `public` | `MaskArg` | `getMaskAbove()` |
| `public` | `MaskArg` | `getMaskNot()` |
| `public` | `MaskArg` | `getMaskBelow()` |
| `public` | `MaskArg` | `getMaskAdjacent()` |
| `public` | `MaskArg` | `getMaskNeighbor()` |
| `public` | `StringArg[]` | `getMaskCommands()` |
| `public` | `BoolArg` | `getUseMaskCommands()` |
| `public` | `BoolArg` | `getInvertMask()` |
| `public` | `void` | `updateArgValue(BrushData.Values brush, String id, String value)` |
| `public` | `BuilderToolBrushData` | `toPacket()` |

## Inner Types

| Type | Kind | Description |
|---|---|---|
| `BrushData.Values` | class | Resolved runtime brush parameter values with codec support |
