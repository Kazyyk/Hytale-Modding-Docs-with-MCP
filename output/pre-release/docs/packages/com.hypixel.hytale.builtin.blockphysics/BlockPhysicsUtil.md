---
title: "BlockPhysicsUtil"
kind: "class"
package: "com.hypixel.hytale.builtin.blockphysics"
fqcn: "com.hypixel.hytale.builtin.blockphysics.BlockPhysicsUtil"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blockphysics"
---

**Package:** `com.hypixel.hytale.builtin.blockphysics`

```java
public class BlockPhysicsUtil
```

Utility methods for evaluating block physics support requirements, testing face support constraints, and removing unsupported blocks.

## Enum Constants

- `INVALID`
- `VALID`
- `WAITING_CHUNK`

## Constants

| Type | Name |
|---|---|
| `int` | `DOESNT_SATISFY` |
| `int` | `IGNORE` |
| `int` | `SATISFIES_SUPPORT` |
| `int` | `WAITING_CHUNK` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `BlockPhysicsUtil.Result` | `applyBlockPhysics(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<ChunkStore> chunkReference, @Nonnull BlockPhysicsSystems.CachedAccessor chunkAccessor, BlockSection blockSection, @Nonnull BlockPhysics blockPhysics, @Nonnull FluidSection fluidSection, int blockX, int blockY, int blockZ, @Nonnull BlockType blockType, int rotation, int filler)` |
| `public static` | `int` | `testBlockPhysics(@Nonnull BlockPhysicsSystems.CachedAccessor chunkAccessor, BlockSection blockSection, @Nullable BlockPhysics blockPhysics, @Nonnull FluidSection fluidSection, int blockX, int blockY, int blockZ, @Nonnull BlockType blockType, int rotation, int filler)` |
| `public static` | `boolean` | `doesSatisfyRequirements(@Nonnull BlockType blockType, Vector3i blockFillerOffset, Vector3i neighbourFillerOffset, BlockFace blockFace, BlockFace neighbourBlockFace, int neighbourBlockId, @Nonnull BlockType neighbourBlockType, int neighbourRotation, int neighbourFluidId, @Nonnull Fluid neighbourFluid, @Nonnull RequiredBlockFaceSupport requiredBlockFaceSupport)` |
| `public static` | `boolean` | `doesMatchFaceType(Vector3i fillerOffset, @Nonnull String faceType, BlockFace blockFace, @Nonnull Map<BlockFace, BlockFaceSupport[]> supporting)` |
