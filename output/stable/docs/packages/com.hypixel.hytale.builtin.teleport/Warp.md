---
title: "Warp"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport"
fqcn: "com.hypixel.hytale.builtin.teleport.Warp"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "teleport"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.teleport`

```java
public class Warp
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Codec<Warp>` | `CODEC` |
| `public static final` | `ArrayCodec<Warp>` | `ARRAY_CODEC` |
| `private` | `String` | `id` |
| `private` | `String` | `world` |
| `private` | `Transform` | `transform` |
| `private` | `String` | `creator` |
| `private` | `Instant` | `creationDate` |
| `` | `Warp` | `warp` |
| `` | `int` | `result` |
| `` | `World` | `worldInstance` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Warp()` |
| `public` | `Warp(@Nonnull Transform transform, @Nonnull String id, @Nonnull World world, @Nonnull String creator, @Nonnull Instant creationDate)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public String` | `getId()` |
| `` | `public String` | `getWorld()` |
| `public` | `Transform` | `getTransform()` |
| `` | `public String` | `getCreator()` |
| `` | `public Instant` | `getCreationDate()` |
| `public` | `boolean` | `equals(@Nullable Object o)` |
| `public` | `int` | `hashCode()` |
| `public` | `String` | `toString()` |
| `public` | `Teleport` | `toTeleport()` |
