---
title: "MaterialSet"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.MaterialSet"
api_surface: false
extends: ~
implements: ["Predicate<Material>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator`

```java
public class MaterialSet implements Predicate<Material>
```

Predicate-based set of materials using hash codes, supporting inclusive and exclusive matching modes.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `test(@Nullable Material value)` |
| `public` | `boolean` | `test(int hashMaterialIds)` |
