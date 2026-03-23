---
title: "WeightedMap"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.WeightedMap"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T20:55:01Z"
tags:
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator`

```java
public class WeightedMap
```

Generic weighted random selection map. Stores elements with associated weights and provides `pick(Random)` for weighted random selection. Supports immutability via `makeImmutable()` and iteration via `forEach(BiConsumer)`.
