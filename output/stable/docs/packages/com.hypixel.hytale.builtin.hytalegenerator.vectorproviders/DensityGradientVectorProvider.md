---
title: "DensityGradientVectorProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.vectorproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.vectorproviders.DensityGradientVectorProvider"
api_surface: false
extends: "VectorProvider"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "vectorproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.vectorproviders`

```java
public class DensityGradientVectorProvider extends VectorProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Density` | `density` |
| `private final` | `double` | `sampleDistance` |
| `private final` | `Density.Context` | `rChildContext` |
| `private final` | `Vector3d` | `rPosition` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `process(VectorProvider.Context context, Vector3d vector_out)` |
