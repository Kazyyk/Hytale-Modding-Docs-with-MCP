---
title: "BlockMask"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.BlockMask"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator`

```java
public class BlockMask
```

Configures material-based placement rules that control which blocks can be placed and which existing blocks can be replaced.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `canPlace(@Nonnull Material material)` |
| `public` | `boolean` | `canPlace(int materialHash)` |
| `public` | `boolean` | `canReplace(@Nonnull Material source, @Nonnull Material destination)` |
| `public` | `boolean` | `canReplace(int sourceHash, int destinationHash)` |
| `public` | `void` | `setSkippedBlocks(@Nonnull MaterialSet materialSet)` |
| `public` | `void` | `putBlockMaskEntry(@Nonnull MaterialSet source, @Nonnull MaterialSet destination)` |
| `public` | `void` | `setDefaultMask(@Nonnull MaterialSet materialSet)` |
