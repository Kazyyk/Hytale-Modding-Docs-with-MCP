---
title: "PortalRemovalCondition"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.integrations"
fqcn: "com.hypixel.hytale.builtin.portals.integrations.PortalRemovalCondition"
api_surface: false
extends: null
implements: ["RemovalCondition"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "integrations"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.integrations`

```java
public class PortalRemovalCondition implements RemovalCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<PortalRemovalCondition>` | `CODEC` |
| `private final` | `WorldEmptyCondition` | `worldEmptyCondition` |
| `private` | `TimeoutCondition` | `timeLimitCondition` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `double` | `getTimeLimitSeconds()` |
| `private` | `void` | `setTimeLimitSeconds(double timeLimitSeconds)` |
| `public` | `double` | `getElapsedSeconds(World world)` |
| `public` | `double` | `getRemainingSeconds(World world)` |
| `public static` | `void` | `setRemainingSeconds(World world, double seconds)` |
| `@Override public` | `boolean` | `shouldRemoveWorld(Store<ChunkStore> store)` |
