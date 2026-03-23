---
title: "IPacketReceiver"
kind: "interface"
package: "com.hypixel.hytale.server.core.receiver"
fqcn: "com.hypixel.hytale.server.core.receiver.IPacketReceiver"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "server"
  - "core"
  - "receiver"
---

**Package:** `com.hypixel.hytale.server.core.receiver`

```java
public interface IPacketReceiver
```

Utility type in the `receiver` subsystem.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `write` | `void` | `ToClientPacket var1` |
| `writeNoCache` | `void` | `ToClientPacket var1` |
