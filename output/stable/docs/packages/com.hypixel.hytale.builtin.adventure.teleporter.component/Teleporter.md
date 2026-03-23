---
title: "Teleporter"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.teleporter.component"
fqcn: "com.hypixel.hytale.builtin.adventure.teleporter.component.Teleporter"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "teleporter"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.teleporter.component`

```java
public class Teleporter implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<Teleporter>` | `CODEC` |
| `public static final` | `String` | `ACTIVATE_STATE` |
| `public static final` | `String` | `INACTIVE_STATE` |
| `private` | `UUID` | `worldUuid` |
| `private` | `Transform` | `transform` |
| `private` | `byte` | `relativeMask` |
| `private` | `String` | `warp` |
| `private` | `String` | `ownedWarp` |
| `private` | `boolean` | `isCustomName` |
| `private` | `String` | `warpNameWordListKey` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore,Teleporter>` | `getComponentType()` |
| `@Nullable public` | `UUID` | `getWorldUuid()` |
| `public` | `void` | `setWorldUuid(UUID worldUuid)` |
| `@Nullable public` | `Transform` | `getTransform()` |
| `public` | `void` | `setTransform(Transform transform)` |
| `public` | `byte` | `getRelativeMask()` |
| `public` | `void` | `setRelativeMask(byte relativeMask)` |
| `@Nullable public` | `String` | `getWarp()` |
| `public` | `void` | `setWarp(String warp)` |
| `@Nullable public` | `String` | `getOwnedWarp()` |
| `public` | `void` | `setOwnedWarp(String ownedWarp)` |
| `public` | `boolean` | `hasOwnedWarp()` |
| `public` | `void` | `setWarpNameWordListKey(String warpNameWordListKey)` |
| `public` | `boolean` | `isCustomName()` |
| `public` | `void` | `setIsCustomName(boolean customName)` |
| `@Nullable public` | `String` | `getWarpNameWordListKey()` |
| `@Nullable public` | `WordList` | `getWarpNameWordList()` |
| `public` | `boolean` | `isValid()` |
| `@Nonnull @Override public` | `Component<ChunkStore>` | `clone()` |
| `@Nullable public` | `Teleport` | `toTeleport(Vector3d currentPosition, Vector3f currentRotation, Vector3i blockPosition)` |
