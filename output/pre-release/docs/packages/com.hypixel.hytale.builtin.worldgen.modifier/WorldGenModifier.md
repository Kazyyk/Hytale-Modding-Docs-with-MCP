---
title: "WorldGenModifier"
kind: "class"
package: "com.hypixel.hytale.builtin.worldgen.modifier"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.WorldGenModifier"
api_surface: false
extends: "java.lang.Object"
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, WorldGenModifier>>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "modifier"
---

**Package:** `com.hypixel.hytale.builtin.worldgen.modifier`

```java
public class WorldGenModifier implements JsonAssetWithMap<String, DefaultAssetMap<String, WorldGenModifier>>
```

Asset type for data-driven modifications to world-gen-v1 assets. Contains a priority, target configuration, and a map of event types to operations.
