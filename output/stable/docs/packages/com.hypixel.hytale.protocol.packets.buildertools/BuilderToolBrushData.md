---
title: "BuilderToolBrushData"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolBrushData"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "protocol"
  - "buildertools"
  - "struct"
---

**Package:** `com.hypixel.hytale.protocol.packets.buildertools`

```java
public class BuilderToolBrushData
```

Complete brush configuration data containing dimensions, shape, origin, rotation, mirroring, material, favorite materials, and multiple mask types. Used by `BuilderToolState` to define brush parameters.

## Fields

| Field | Type |
|---|---|
| `width` | `BuilderToolIntArg` |
| `height` | `BuilderToolIntArg` |
| `thickness` | `BuilderToolIntArg` |
| `capped` | `BuilderToolBoolArg` |
| `shape` | `BuilderToolBrushShapeArg` |
| `origin` | `BuilderToolBrushOriginArg` |
| `originRotation` | `BuilderToolBoolArg` |
| `rotationAxis` | `BuilderToolBrushAxisArg` |
| `rotationAngle` | `BuilderToolRotationArg` |
| `mirrorAxis` | `BuilderToolBrushAxisArg` |
| `material` | `BuilderToolBlockArg` |
| `favoriteMaterials` | `BuilderToolBlockArg[]` |
| `mask` | `BuilderToolMaskArg` |
| `maskAbove` | `BuilderToolMaskArg` |
| `maskNot` | `BuilderToolMaskArg` |
| `maskBelow` | `BuilderToolMaskArg` |
| `maskAdjacent` | `BuilderToolMaskArg` |
| `maskNeighbor` | `BuilderToolMaskArg` |
| `maskCommands` | `BuilderToolStringArg[]` |
| `useMaskCommands` | `BuilderToolBoolArg` |
| `invertMask` | `BuilderToolBoolArg` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolBrushData` | Reads this struct from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this struct to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `clone()` | `BuilderToolBrushData` | Creates a shallow copy |
