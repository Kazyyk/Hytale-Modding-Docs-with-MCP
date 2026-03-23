---
title: "BenchBlock"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.component"
fqcn: "com.hypixel.hytale.builtin.crafting.component.BenchBlock"
api_surface: false
extends: ~
implements: 
  - "Component"
generator_version: "2.0.0"
generated_at: "2026-03-22T20:55:01Z"
tags:
  - "crafting"
  - "component"
---

**Package:** `com.hypixel.hytale.builtin.crafting.component`

```java
public class BenchBlock implements Component
```

Block component representing a crafting bench with tier level and stored upgrade items. Tracks open `BenchWindow` instances per player UUID. Provides the base block type resolution for state-based bench blocks.
