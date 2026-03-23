---
title: "PacketFilter"
kind: "interface"
package: "com.hypixel.hytale.server.core.io.adapter"
fqcn: "com.hypixel.hytale.server.core.io.adapter.PacketFilter"
api_surface: false
extends: null
implements: ["BiPredicate"]
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
public interface PacketFilter extends BiPredicate
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `boolean` | `test(PacketHandler var1, Packet var2)` |
