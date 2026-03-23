---
title: "EventHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.worldgen.modifier"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.EventHandler"
api_surface: false
extends: "java.lang.Object"
implements:
  - "AutoCloseable"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "modifier"
---

**Package:** `com.hypixel.hytale.builtin.worldgen.modifier`

```java
public final class EventHandler implements AutoCloseable
```

Manages world-gen modification events. Collects WorldGenModifiers matching a given root, sorts by priority, and dispatches modify events to matching operations.
