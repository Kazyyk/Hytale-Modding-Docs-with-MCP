---
title: "ValueStoreValidator"
kind: "class"
package: "com.hypixel.hytale.server.npc.valuestore"
fqcn: "com.hypixel.hytale.server.npc.valuestore.ValueStoreValidator"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "valuestore"
---

**Package:** `com.hypixel.hytale.server.npc.valuestore`

```java
public class ValueStoreValidator
```

Provides ValueStoreValidator functionality within the valuestore subsystem.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private final` | `EnumMap<ValueStore.Type, HashMap<String, List<ValueStoreValidator.ValueUsage>>>` | `usages` | `new EnumMap<>(ValueStore.Type.class)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `registerValueUsage(@Nonnull ValueStoreValidator.ValueUsage usage)` |
| `public` | `boolean` | `validate(@Nonnull List<String> errors)` |
| `private` | `boolean` | `validateType(@Nonnull ValueStore.Type type, @Nonnull List<String> errors)` |
