---
title: "IPacketHandler"
kind: "interface"
package: "com.hypixel.hytale.server.core.io.handlers"
fqcn: "com.hypixel.hytale.server.core.io.handlers.IPacketHandler"
api_surface: false
extends: ~
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
public interface IPacketHandler
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `registerHandler(int var1, @Nonnull Consumer<ToServerPacket> var2)` |
| `` | `void` | `registerNoOpHandlers(int... var1)` |
| `@Nonnull` | `PlayerRef` | `getPlayerRef()` |
| `@Nonnull` | `String` | `getIdentifier()` |
