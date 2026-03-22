---
title: "FutureUtils"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.FutureUtils"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator`

```java
public class FutureUtils
```

Utility for combining a list of CompletableFutures into a single all-of future.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `CompletableFuture<Void>` | `allOf(@Nonnull List<CompletableFuture<T>> tasks)` |
