---
title: "IWorldPacketHandler"
kind: "interface"
package: "com.hypixel.hytale.server.core.io.handlers"
fqcn: "com.hypixel.hytale.server.core.io.handlers.IWorldPacketHandler"
api_surface: false
extends: "Packet>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "io"
  - "handlers"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.io.handlers`

```java
public interface IWorldPacketHandler<T extends Packet>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `handle(@Nonnull T var1, @Nonnull PlayerRef var2, @Nonnull Ref<EntityStore> var3, @Nonnull World var4, @Nonnull Store<EntityStore> var5)` |
