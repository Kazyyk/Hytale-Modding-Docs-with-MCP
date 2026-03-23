---
title: "TemporalArrayHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.TemporalArrayHolder"
api_surface: false
extends: "StringArrayHolder"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "npc"
---
**Package:** `com.hypixel.hytale.server.npc.asset.builder.holder`

```java
public class TemporalArrayHolder extends StringArrayHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `TemporalArrayValidator` | `validator` |
| `private` | `TemporalAmount[]` | `cachedTemporalArray` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `TemporalAmount[]` | `convertStringToTemporalArray(@Nullable String[] source)` |
| `public` | `void` | `readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, TemporalArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `TemporalAmount[]` | `getTemporalArray(ExecutionContext executionContext)` |
| `public` | `TemporalAmount[]` | `rawGetTemporalArray(ExecutionContext executionContext)` |
| `public` | `void` | `validate(@Nullable TemporalAmount[] value)` |
