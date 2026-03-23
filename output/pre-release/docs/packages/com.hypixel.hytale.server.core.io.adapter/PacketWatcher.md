---
title: "PacketWatcher"
kind: "interface"
package: "com.hypixel.hytale.server.core.io.adapter"
fqcn: "com.hypixel.hytale.server.core.io.adapter.PacketWatcher"
api_surface: false
extends: null
implements: ["BiConsumer"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "io"
  - "adapter"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.io.adapter`

```java
@FunctionalInterface public interface PacketWatcher extends BiConsumer
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `accept(PacketHandler var1, Packet var2)` |
