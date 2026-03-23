---
title: "MinecartComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.minecart"
fqcn: "com.hypixel.hytale.builtin.mounts.minecart.MinecartComponent"
api_surface: false
extends: ~
implements: ['Component']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builtin"
  - "mounts"
  - "minecart"
---

**Package:** `com.hypixel.hytale.builtin.mounts.minecart`

```java
public class MinecartComponent implements Component<EntityStore>
```

ECS component stored in `EntityStore`. Serialized via `BuilderCodec`.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, MinecartComponent>` | Accessor method. |
| `getNumberOfHits()` | `int` | Accessor method. |
| `setNumberOfHits(int numberOfHits)` | `void` | Mutator method. |
| `getLastHit()` | `Instant` | Accessor method. |
| `setLastHit(Instant lastHit)` | `void` | Mutator method. |
| `getSourceItem()` | `String` | Accessor method. |
| `setSourceItem(String sourceItem)` | `void` | Mutator method. |
