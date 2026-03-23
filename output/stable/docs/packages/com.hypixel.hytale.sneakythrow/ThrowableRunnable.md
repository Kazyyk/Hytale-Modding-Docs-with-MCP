---
title: "ThrowableRunnable"
kind: "interface"
package: "com.hypixel.hytale.sneakythrow"
fqcn: "com.hypixel.hytale.sneakythrow.ThrowableRunnable"
api_surface: false
extends: null
implements: ["Runnable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "sneakythrow"
  - "interface"
---

**Package:** `com.hypixel.hytale.sneakythrow`

```java
@FunctionalInterface public interface ThrowableRunnable<E> extends Runnable
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override default` | `void` | `run()` |
| `` | `void` | `runNow() throws E` |
