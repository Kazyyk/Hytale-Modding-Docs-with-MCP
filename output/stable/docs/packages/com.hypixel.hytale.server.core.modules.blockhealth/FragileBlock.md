---
title: "FragileBlock"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.blockhealth"
fqcn: "com.hypixel.hytale.server.core.modules.blockhealth.FragileBlock"
api_surface: false
extends: null
implements:
  - "Cloneable"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blockhealth"
  - "fragile"
---

**Package:** `com.hypixel.hytale.server.core.modules.blockhealth`

```java
public class FragileBlock implements Cloneable
```

Tracks the remaining fragility duration for a block, in seconds. Used by `BlockHealthModule` to mark recently placed blocks as temporarily fragile. The duration is decremented each tick until it reaches zero, at which point the entry is removed.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `float` | `durationSeconds` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float` | `getDurationSeconds()` |
| `public` | `void` | `setDurationSeconds(float durationSeconds)` |
| `public` | `void` | `deserialize(@Nonnull ByteBuf buf, byte version)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Nonnull protected` | `FragileBlock` | `clone()` |
