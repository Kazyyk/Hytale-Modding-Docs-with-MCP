---
title: "CancellableEcsEvent"
kind: "class"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.CancellableEcsEvent"
api_surface: true
extends: "EcsEvent"
implements: ["ICancellableEcsEvent"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class CancellableEcsEvent extends EcsEvent implements ICancellableEcsEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `boolean` | `cancelled` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public final` | `boolean` | `isCancelled()` |
| `@Override public final` | `void` | `setCancelled(boolean cancelled)` |
