---
title: "TimeoutCondition"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.removal"
fqcn: "com.hypixel.hytale.builtin.instances.removal.TimeoutCondition"
api_surface: false
extends: ~
implements: 
  - "RemovalCondition"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "instances"
---

**Package:** `com.hypixel.hytale.builtin.instances.removal`

```java
public class TimeoutCondition implements RemovalCondition
```

Implementation of `RemovalCondition`.

## Constructors

| Constructor | Description |
|---|---|
| `TimeoutCondition()` | Creates a new TimeoutCondition instance. |
| `TimeoutCondition(double timeoutSeconds)` | Creates a new TimeoutCondition instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getTimeoutSeconds()` | `double` | public method. |
| `shouldRemoveWorld(@Nonnull Store<ChunkStore> store)` | `boolean` | public method. |
