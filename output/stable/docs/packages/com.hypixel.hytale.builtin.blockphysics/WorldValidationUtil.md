---
title: "WorldValidationUtil"
kind: "class"
package: "com.hypixel.hytale.builtin.blockphysics"
fqcn: "com.hypixel.hytale.builtin.blockphysics.WorldValidationUtil"
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
public class WorldValidationUtil
```

Provides block validation consumers for checking unknown block types and components during world/prefab validation.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `IPrefabBuffer.RawBlockConsumer<Void>` | `blockValidator(@Nonnull StringBuilder sb, @Nonnull Set<ValidationOption> options)` |
| `public static` | `IPrefabBuffer.RawBlockConsumer<Void>` | `blockValidator(int offsetX, int offsetY, int offsetZ, @Nonnull StringBuilder sb, @Nonnull Set<ValidationOption> options)` |
