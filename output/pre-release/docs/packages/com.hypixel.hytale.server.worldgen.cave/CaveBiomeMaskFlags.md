---
title: "CaveBiomeMaskFlags"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave"
fqcn: "com.hypixel.hytale.server.worldgen.cave.CaveBiomeMaskFlags"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "cave"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave`

```java
public class CaveBiomeMaskFlags
```

Bit-flag constants for cave biome masks controlling generation, population, and continuation permissions.

## Constants

| Type | Name |
|---|---|
| `Int2FlagsCondition` | `DEFAULT_ALLOW` |
| `Int2FlagsCondition` | `DEFAULT_DENY` |
| `int` | `GENERATE` |
| `int` | `POPULATE` |
| `int` | `CONTINUE` |
| `int` | `DEFAULT_RESULT` |
| `int` | `DISALLOW_ALL` |
| `int` | `ALLOW_ALL` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `boolean` | `canGenerate(int value)` |
| `public static` | `boolean` | `canPopulate(int value)` |
| `public static` | `boolean` | `canContinue(int value)` |
| `public static` | `boolean` | `test(int value, int flag)` |
