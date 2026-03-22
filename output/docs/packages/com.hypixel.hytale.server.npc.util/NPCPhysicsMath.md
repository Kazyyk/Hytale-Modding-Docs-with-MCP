---
title: "NPCPhysicsMath"
kind: "enum"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.NPCPhysicsMath"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class NPCPhysicsMath
```

Comprehensive static utility class for NPC physics calculations. Includes vector math (dot products, projections, rejections), view cone tests, line-sphere intersections, swept sphere collision, block height queries, heading/pitch computations, acceleration with drag, and coordinate space transformations.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `boolean` | `near(Vector3d v, Vector3d w)` |
| `public static` | `boolean` | `near(Vector3d v, Vector3d w, double epsilonLength)` |
| `public static` | `boolean` | `near(double v, double w)` |
| `public static` | `boolean` | `near(double v, double w, double epsilonLength)` |
| `public static` | `float` | `headingFromDirection(double x, double z, float def)` |
| `public static` | `float` | `pitchFromDirection(double x, double y, double z, float def)` |
| `public static` | `Vector3d` | `getViewDirection(Vector3f lookDirection, Vector3d outDirection)` |
| `public static` | `double` | `cosAngleBetweenVectors(Vector3d v, Vector3d w)` |
| `public static` | `double` | `cosAngleBetweenVectors(Vector3d v, double vLen, Vector3d w, double wLen)` |
| `public static` | `double` | `cosAngleBetweenUnitVectors(Vector3d v, Vector3d w)` |
| `public static` | `void` | `realignVector(Vector3d v, Vector3d w, double cosine, Vector3d result)` |
| `public static` | `void` | `realignVector(Vector3d v, double vLen, Vector3d w, double wLen, double cosine, Vector3d result)` |
| `public static` | `void` | `realignUnitVector(Vector3d v, Vector3d w, double cosine, Vector3d result)` |
| `public static` | `boolean` | `realignVectorReturnDirection( Vector3d v, double vLen, Vector3d w, double wLen, double cosine, Vector3d result )` |
| `public static` | `Vector3d` | `createOrthogonalvector(Vector3d in, Vector3d out)` |
| `public static` | `boolean` | `inViewSector(double xViewer, double zViewer, float heading, float coneAngle, double xObject, double zObject)` |
| `public static` | `boolean` | `isInViewCone( double xViewer, double yViewer, double zViewer, double xViewDirection, double yViewDirection, double zViewDirection, float cosConeHalfAngle, double xObject, double yObject,` |
| `public static` | `boolean` | `isInViewCone( double xViewDirection, double yViewDirection, double zViewDirection, float cosConeHalfAngle, double xObject, double yObject, double zObject )` |
| `public static` | `boolean` | `isInViewCone(Vector3d viewer, Vector3d viewDirection, float cosConeHalfAngle, Vector3d object)` |
| `public static` | `boolean` | `isInViewCone( Vector3d viewer, Vector3d viewDirection, float cosConeHalfAngle, Vector3d object, Vector3d componentSelector )` |
