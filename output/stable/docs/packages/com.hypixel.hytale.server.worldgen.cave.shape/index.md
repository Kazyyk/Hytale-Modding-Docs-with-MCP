---
title: "com.hypixel.hytale.server.worldgen.cave.shape"
kind: "package"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "shape"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape`

Geometric shape definitions for procedural cave generation. Each shape determines which blocks to carve, provides anchor points for child node attachment, and handles chunk population with block/fluid replacement and cover placement.

## Types

| Type | Kind | Description |
|---|---|---|
| [CaveNodeShape](CaveNodeShape.md) | interface | Core interface defining the geometry contract for cave node shapes. |
| [AbstractCaveNodeShape](AbstractCaveNodeShape.md) | class | Base implementation with standard populate-chunk algorithm. |
| [CaveNodeShapeEnum](CaveNodeShapeEnum.md) | enum | Enumeration of shape types: PIPE, CYLINDER, PREFAB, EMPTY_LINE, ELLIPSOID, DISTORTED. |
| [CaveNodeShapeUtils](CaveNodeShapeUtils.md) | class | Shared geometric utilities: anchor projections, radius inheritance, cover logic. |
| [CylinderCaveNodeShape](CylinderCaveNodeShape.md) | class | Cylindrical tunnel with interpolated start/middle/end radii. |
| [DistortedCaveNodeShape](DistortedCaveNodeShape.md) | class | Noise-distorted cave profile with independent floor/ceiling scaling. |
| [EllipsoidCaveNodeShape](EllipsoidCaveNodeShape.md) | class | Axis-aligned ellipsoidal chamber with independent XYZ radii. |
| [EmptyLineCaveNodeShape](EmptyLineCaveNodeShape.md) | class | Invisible line connector with no block carving. |
| [PipeCaveNodeShape](PipeCaveNodeShape.md) | class | Tubular pipe shape with start/middle/end radii. |
| [PrefabCaveNodeShape](PrefabCaveNodeShape.md) | class | Shape defined by a placed prefab structure with rotation. |
| [TetrahedronCaveNodeShape](TetrahedronCaveNodeShape.md) | class | Tetrahedral cave node shape. |
