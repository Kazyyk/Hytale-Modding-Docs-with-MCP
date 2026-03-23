---
title: "FeatureOverride"
kind: "enum"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.FeatureOverride"
api_surface: false
implements:
  - "Supplier<String>"
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "npc"
  - "builder"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public enum FeatureOverride implements Supplier<String>
```

Three-state override for NPC builder features, allowing a feature to be forced on, forced off, or left at its default value.

## Enum Constants

| Constant | Description (from `get()`) |
|---|---|
| `On` | `"Feature always enabled"` |
| `Off` | `"Feature always disabled"` |
| `Default` | `"Default behaviour"` |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `String` | Returns the human-readable description of this override state. |
| `evaluate(boolean defaultValue)` | `boolean` | Resolves the override: `On` returns `true`, `Off` returns `false`, `Default` returns the provided default. |
