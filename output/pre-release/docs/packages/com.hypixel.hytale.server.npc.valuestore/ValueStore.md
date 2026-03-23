---
title: "ValueStore"
kind: "class"
package: "com.hypixel.hytale.server.npc.valuestore"
fqcn: "com.hypixel.hytale.server.npc.valuestore.ValueStore"
api_surface: true
extends: null
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "valuestore"
---

**Package:** `com.hypixel.hytale.server.npc.valuestore`

```java
public class ValueStore implements Component<EntityStore>
```

An `EntityStore` component storing ValueStore-related data on entities.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `String[]` | `stringValues` |
| `@Nonnull private final` | `int[]` | `intValues` |
| `@Nonnull private final` | `double[]` | `doubleValues` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | | `ValueStore(int stringCount, int intCount, int doubleCount)` |
| `public static` | `ComponentType<EntityStore, ValueStore>` | `getComponentType()` |
| `public` | `String` | `readString(int slot)` |
| `public` | `void` | `storeString(int slot, String value)` |
| `public` | `int` | `readInt(int slot)` |
| `public` | `void` | `storeInt(int slot, int value)` |
| `public` | `double` | `readDouble(int slot)` |
| `public` | `void` | `storeDouble(int slot, double value)` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
