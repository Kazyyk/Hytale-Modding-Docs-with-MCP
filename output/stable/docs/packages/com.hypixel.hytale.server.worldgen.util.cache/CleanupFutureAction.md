---
title: "CleanupFutureAction"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.cache"
fqcn: "com.hypixel.hytale.server.worldgen.util.cache.CleanupFutureAction"
api_surface: false
extends: "null"
implements: ["Runnable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "cache"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.cache`

```java
public class CleanupFutureAction implements Runnable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Cleaner` | `CLEANER` |
| `private final` | `ScheduledFuture<?>` | `future` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CleanupFutureAction(ScheduledFuture<?> future)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `run()` |
