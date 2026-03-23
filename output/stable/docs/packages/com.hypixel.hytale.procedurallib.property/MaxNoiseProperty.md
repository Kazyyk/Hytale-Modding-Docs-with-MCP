---
title: "MaxNoiseProperty"
kind: "class"
package: "com.hypixel.hytale.procedurallib.property"
fqcn: "com.hypixel.hytale.procedurallib.property.MaxNoiseProperty"
api_surface: false
extends: ~
implements: ["NoiseProperty"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedurallib"
  - "property"
---

**Package:** `com.hypixel.hytale.procedurallib.property`

```java
public class MaxNoiseProperty implements NoiseProperty
```

Noise property that returns the maximum value from two child noise sources.

## Constants

| Type | Name |
|---|---|
| `double` | `MAX_EPSILON` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `NoiseProperty[]` | `getNoiseProperties()` |
| `public` | `double` | `get(int seed, double x, double y)` |
| `public` | `double` | `get(int seed, double x, double y, double z)` |
| `public` | `String` | `toString()` |
